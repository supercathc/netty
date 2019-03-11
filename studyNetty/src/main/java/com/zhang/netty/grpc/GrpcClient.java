package com.zhang.netty.grpc;

import com.zhang.netty.proto.StudentRequest;
import com.zhang.netty.proto.StudentResponse;
import com.zhang.netty.proto.StudentResponseList;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Administrator on 2019/3/10.
 */
public class GrpcClient {

    /**
     * onNext	服务端推送消息	void
     onCompleted	服务端推送EOF	void
     onError	服务端推送错误信息	void
     *
     */

    public static void main(String[] args) throws InterruptedException {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost",8899).usePlaintext().build();
        StudentServiceGrpc.StudentServiceStub studentServiceStub = StudentServiceGrpc.newStub(managedChannel);
        StreamObserver<StudentRequest> requestStreamObserver= studentServiceStub.getStudentWrapperByAges(new StreamObserver<StudentResponseList>() {

            @Override
            public void onNext(StudentResponseList value) {

                List<StudentResponse> list = value.getStudentResponseList();
                list.forEach((x) -> System.out.println(x.getAge()+"   "+x.getCity()+"   "+x.getName()));
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                System.out.println("onCompleted");
            }
        });

        Stream.of(1, 2, 3, 4).map(n-> StudentRequest.newBuilder().setAge(n).build());

        requestStreamObserver.onCompleted();

        Thread.sleep(100000);
            /*Iterator<StudentResponse> response = blockingStub.getStudentSByAge(StudentRequest.newBuilder().setAge(18).build());
            for(;response.hasNext();){
                StudentResponse s = response.next();
                System.out.println(s.getAge()+" :" +s.getName()+" : "+s.getCity());
            }*/

    }
}
