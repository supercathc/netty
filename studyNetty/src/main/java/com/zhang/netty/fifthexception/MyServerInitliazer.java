package com.zhang.netty.fifthexception;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import io.netty.handler.stream.ChunkedWriteHandler;


/**
 * Created by Administrator on 2019/2/23.
 */
public class MyServerInitliazer extends ChannelInitializer<SocketChannel>{
    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline p  =ch.pipeline();
        p.addLast(new HttpServerCodec());
        p.addLast(new ChunkedWriteHandler());
        //分组发送的http 组成一个
        p.addLast(new HttpObjectAggregator(8192));
        p.addLast(new WebSocketServerProtocolHandler("/ws"));
        p.addLast(new WebSocketHandler());
    }
}
