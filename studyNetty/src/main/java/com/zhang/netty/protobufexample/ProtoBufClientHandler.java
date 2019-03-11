package com.zhang.netty.protobufexample;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.Random;

/**
 * Created by Administrator on 2019/2/25.
 */
public class ProtoBufClientHandler extends SimpleChannelInboundHandler<DataInfo.MyMessage> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, DataInfo.MyMessage msg) throws Exception {

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
       int randomInt = new Random().nextInt(3);
       DataInfo.MyMessage  myMessage= null;
       if(randomInt == 0){
             myMessage = DataInfo.MyMessage.newBuilder().setDataType(DataInfo.MyMessage.DataType.StudnetType)
                    .setStudent(DataInfo.Student.newBuilder().setName("浅井茶茶").setAge(18).setAddress("Japan").build()).build();
        }else if(randomInt == 1){
             myMessage = DataInfo.MyMessage.newBuilder().setDataType(DataInfo.MyMessage.DataType.DogType)
                    .setDog(DataInfo.Dog.newBuilder().setName("伯恩山").setAge(2).build()).build();
        }else{
             myMessage = DataInfo.MyMessage.newBuilder().setDataType(DataInfo.MyMessage.DataType.CatType)
                    .setCat(DataInfo.Cat.newBuilder().setCity("西伯利亚").setName("花花").build()).build();
        }

        ctx.channel().writeAndFlush(myMessage);

    }
}
