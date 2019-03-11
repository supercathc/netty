package com.zhang.netty.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;

/**
 * Created by Administrator on 2019/3/10.
 */
public class GrpcServer {
    private Server server;
    public static void main(String[] args) throws Exception {
        GrpcServer server = new GrpcServer();
        server.start();
        server.awaitTermination();
    }

    private void start()throws  Exception{
        this.server = ServerBuilder.forPort(8899).addService(new StudentServiceImpl()).build().start();
        System.out.println("服务器启动");

        Runtime.getRuntime().addShutdownHook(new Thread(() ->{
            System.out.println("关闭jvm");
            GrpcServer.this.stop();
        }));
        System.out.println("执行到这里");
    }

    private void stop(){
        if(null !=this.server){
            this.server.shutdown();
        }
    }

    private void awaitTermination(){
        if(null != this.server){
            try {
                this.server.awaitTermination();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
