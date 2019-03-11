package com.zhang.netty.grpc;

import com.zhang.netty.proto.*;
import io.grpc.stub.StreamObserver;

/**
 * Created by Administrator on 2019/3/10.
 */
public class StudentServiceImpl extends StudentServiceGrpc.StudentServiceImplBase{
    @Override
    public void getRealName(MyRequest request, StreamObserver<MyResponse> responseObserver) {
        System.out.println("接收到客户端信息"+request.getUsername());
        responseObserver.onNext(MyResponse.newBuilder().setRealname("芳芳").build());
        responseObserver.onCompleted();
    }

    @Override
    public void getStudentSByAge(StudentRequest request, StreamObserver<StudentResponse> responseObserver) {
        System.out.println("接收到信息"+request.getAge());
        for(int x =0 ;x<100;x++) {
            responseObserver.onNext(StudentResponse.newBuilder().setName(" fangfang"+x).setAge(18).setCity("sda").build());
        }
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<StudentRequest> getStudentWrapperByAges(StreamObserver<StudentResponseList> responseObserver) {
        return  new StreamObserver<StudentRequest>() {
            @Override
            public void onNext(StudentRequest value) {
                System.out.println("接收到客户端的消息"+value.getAge());
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                StudentResponse response = StudentResponse.newBuilder().setAge(18).setCity("beijing").setName("fangang").build();
                StudentResponse respons2e = StudentResponse.newBuilder().setAge(18).setCity("bxxczg").setName("fsadsaangang").build();
                StudentResponseList list = StudentResponseList.newBuilder().addStudentResponse(0,respons2e).build();
                responseObserver.onNext(list);
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<MyRequest> getStudentsBySomeAge(StreamObserver<MyResponse> responseObserver) {
        return new StreamObserver<MyRequest>() {
            @Override
            public void onNext(MyRequest value) {
                System.out.println("来自客户端的问候"+value.getUsername());
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {

                ;
            }
        };


    }
}


