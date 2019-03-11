package com.zhang.netty.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: Student.proto")
public final class StudentServiceGrpc {

  private StudentServiceGrpc() {}

  public static final String SERVICE_NAME = "com.zhang.proto.StudentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.zhang.netty.proto.MyRequest,
      com.zhang.netty.proto.MyResponse> getGetRealNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRealName",
      requestType = com.zhang.netty.proto.MyRequest.class,
      responseType = com.zhang.netty.proto.MyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zhang.netty.proto.MyRequest,
      com.zhang.netty.proto.MyResponse> getGetRealNameMethod() {
    io.grpc.MethodDescriptor<com.zhang.netty.proto.MyRequest, com.zhang.netty.proto.MyResponse> getGetRealNameMethod;
    if ((getGetRealNameMethod = StudentServiceGrpc.getGetRealNameMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getGetRealNameMethod = StudentServiceGrpc.getGetRealNameMethod) == null) {
          StudentServiceGrpc.getGetRealNameMethod = getGetRealNameMethod = 
              io.grpc.MethodDescriptor.<com.zhang.netty.proto.MyRequest, com.zhang.netty.proto.MyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.zhang.proto.StudentService", "GetRealName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zhang.netty.proto.MyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zhang.netty.proto.MyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("GetRealName"))
                  .build();
          }
        }
     }
     return getGetRealNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zhang.netty.proto.StudentRequest,
      com.zhang.netty.proto.StudentResponse> getGetStudentSByAgeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStudentSByAge",
      requestType = com.zhang.netty.proto.StudentRequest.class,
      responseType = com.zhang.netty.proto.StudentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.zhang.netty.proto.StudentRequest,
      com.zhang.netty.proto.StudentResponse> getGetStudentSByAgeMethod() {
    io.grpc.MethodDescriptor<com.zhang.netty.proto.StudentRequest, com.zhang.netty.proto.StudentResponse> getGetStudentSByAgeMethod;
    if ((getGetStudentSByAgeMethod = StudentServiceGrpc.getGetStudentSByAgeMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getGetStudentSByAgeMethod = StudentServiceGrpc.getGetStudentSByAgeMethod) == null) {
          StudentServiceGrpc.getGetStudentSByAgeMethod = getGetStudentSByAgeMethod = 
              io.grpc.MethodDescriptor.<com.zhang.netty.proto.StudentRequest, com.zhang.netty.proto.StudentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.zhang.proto.StudentService", "GetStudentSByAge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zhang.netty.proto.StudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zhang.netty.proto.StudentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("GetStudentSByAge"))
                  .build();
          }
        }
     }
     return getGetStudentSByAgeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zhang.netty.proto.StudentRequest,
      com.zhang.netty.proto.StudentResponseList> getGetStudentWrapperByAgesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStudentWrapperByAges",
      requestType = com.zhang.netty.proto.StudentRequest.class,
      responseType = com.zhang.netty.proto.StudentResponseList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.zhang.netty.proto.StudentRequest,
      com.zhang.netty.proto.StudentResponseList> getGetStudentWrapperByAgesMethod() {
    io.grpc.MethodDescriptor<com.zhang.netty.proto.StudentRequest, com.zhang.netty.proto.StudentResponseList> getGetStudentWrapperByAgesMethod;
    if ((getGetStudentWrapperByAgesMethod = StudentServiceGrpc.getGetStudentWrapperByAgesMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getGetStudentWrapperByAgesMethod = StudentServiceGrpc.getGetStudentWrapperByAgesMethod) == null) {
          StudentServiceGrpc.getGetStudentWrapperByAgesMethod = getGetStudentWrapperByAgesMethod = 
              io.grpc.MethodDescriptor.<com.zhang.netty.proto.StudentRequest, com.zhang.netty.proto.StudentResponseList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.zhang.proto.StudentService", "GetStudentWrapperByAges"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zhang.netty.proto.StudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zhang.netty.proto.StudentResponseList.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("GetStudentWrapperByAges"))
                  .build();
          }
        }
     }
     return getGetStudentWrapperByAgesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zhang.netty.proto.MyRequest,
      com.zhang.netty.proto.MyResponse> getGetStudentsBySomeAgeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStudentsBySomeAge",
      requestType = com.zhang.netty.proto.MyRequest.class,
      responseType = com.zhang.netty.proto.MyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.zhang.netty.proto.MyRequest,
      com.zhang.netty.proto.MyResponse> getGetStudentsBySomeAgeMethod() {
    io.grpc.MethodDescriptor<com.zhang.netty.proto.MyRequest, com.zhang.netty.proto.MyResponse> getGetStudentsBySomeAgeMethod;
    if ((getGetStudentsBySomeAgeMethod = StudentServiceGrpc.getGetStudentsBySomeAgeMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getGetStudentsBySomeAgeMethod = StudentServiceGrpc.getGetStudentsBySomeAgeMethod) == null) {
          StudentServiceGrpc.getGetStudentsBySomeAgeMethod = getGetStudentsBySomeAgeMethod = 
              io.grpc.MethodDescriptor.<com.zhang.netty.proto.MyRequest, com.zhang.netty.proto.MyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.zhang.proto.StudentService", "GetStudentsBySomeAge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zhang.netty.proto.MyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zhang.netty.proto.MyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("GetStudentsBySomeAge"))
                  .build();
          }
        }
     }
     return getGetStudentsBySomeAgeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StudentServiceStub newStub(io.grpc.Channel channel) {
    return new StudentServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StudentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StudentServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StudentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StudentServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class StudentServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getRealName(com.zhang.netty.proto.MyRequest request,
        io.grpc.stub.StreamObserver<com.zhang.netty.proto.MyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRealNameMethod(), responseObserver);
    }

    /**
     */
    public void getStudentSByAge(com.zhang.netty.proto.StudentRequest request,
        io.grpc.stub.StreamObserver<com.zhang.netty.proto.StudentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStudentSByAgeMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.zhang.netty.proto.StudentRequest> getStudentWrapperByAges(
        io.grpc.stub.StreamObserver<com.zhang.netty.proto.StudentResponseList> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetStudentWrapperByAgesMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.zhang.netty.proto.MyRequest> getStudentsBySomeAge(
        io.grpc.stub.StreamObserver<com.zhang.netty.proto.MyResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetStudentsBySomeAgeMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetRealNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.zhang.netty.proto.MyRequest,
                com.zhang.netty.proto.MyResponse>(
                  this, METHODID_GET_REAL_NAME)))
          .addMethod(
            getGetStudentSByAgeMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.zhang.netty.proto.StudentRequest,
                com.zhang.netty.proto.StudentResponse>(
                  this, METHODID_GET_STUDENT_SBY_AGE)))
          .addMethod(
            getGetStudentWrapperByAgesMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.zhang.netty.proto.StudentRequest,
                com.zhang.netty.proto.StudentResponseList>(
                  this, METHODID_GET_STUDENT_WRAPPER_BY_AGES)))
          .addMethod(
            getGetStudentsBySomeAgeMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.zhang.netty.proto.MyRequest,
                com.zhang.netty.proto.MyResponse>(
                  this, METHODID_GET_STUDENTS_BY_SOME_AGE)))
          .build();
    }
  }

  /**
   */
  public static final class StudentServiceStub extends io.grpc.stub.AbstractStub<StudentServiceStub> {
    private StudentServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected StudentServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentServiceStub(channel, callOptions);
    }

    /**
     */
    public void getRealName(com.zhang.netty.proto.MyRequest request,
        io.grpc.stub.StreamObserver<com.zhang.netty.proto.MyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRealNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStudentSByAge(com.zhang.netty.proto.StudentRequest request,
        io.grpc.stub.StreamObserver<com.zhang.netty.proto.StudentResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetStudentSByAgeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.zhang.netty.proto.StudentRequest> getStudentWrapperByAges(
        io.grpc.stub.StreamObserver<com.zhang.netty.proto.StudentResponseList> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getGetStudentWrapperByAgesMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.zhang.netty.proto.MyRequest> getStudentsBySomeAge(
        io.grpc.stub.StreamObserver<com.zhang.netty.proto.MyResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getGetStudentsBySomeAgeMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class StudentServiceBlockingStub extends io.grpc.stub.AbstractStub<StudentServiceBlockingStub> {
    private StudentServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected StudentServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.zhang.netty.proto.MyResponse getRealName(com.zhang.netty.proto.MyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRealNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.zhang.netty.proto.StudentResponse> getStudentSByAge(
        com.zhang.netty.proto.StudentRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetStudentSByAgeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StudentServiceFutureStub extends io.grpc.stub.AbstractStub<StudentServiceFutureStub> {
    private StudentServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected StudentServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zhang.netty.proto.MyResponse> getRealName(
        com.zhang.netty.proto.MyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRealNameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_REAL_NAME = 0;
  private static final int METHODID_GET_STUDENT_SBY_AGE = 1;
  private static final int METHODID_GET_STUDENT_WRAPPER_BY_AGES = 2;
  private static final int METHODID_GET_STUDENTS_BY_SOME_AGE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StudentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StudentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_REAL_NAME:
          serviceImpl.getRealName((com.zhang.netty.proto.MyRequest) request,
              (io.grpc.stub.StreamObserver<com.zhang.netty.proto.MyResponse>) responseObserver);
          break;
        case METHODID_GET_STUDENT_SBY_AGE:
          serviceImpl.getStudentSByAge((com.zhang.netty.proto.StudentRequest) request,
              (io.grpc.stub.StreamObserver<com.zhang.netty.proto.StudentResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_STUDENT_WRAPPER_BY_AGES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getStudentWrapperByAges(
              (io.grpc.stub.StreamObserver<com.zhang.netty.proto.StudentResponseList>) responseObserver);
        case METHODID_GET_STUDENTS_BY_SOME_AGE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getStudentsBySomeAge(
              (io.grpc.stub.StreamObserver<com.zhang.netty.proto.MyResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class StudentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StudentServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.zhang.netty.proto.Student.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StudentService");
    }
  }

  private static final class StudentServiceFileDescriptorSupplier
      extends StudentServiceBaseDescriptorSupplier {
    StudentServiceFileDescriptorSupplier() {}
  }

  private static final class StudentServiceMethodDescriptorSupplier
      extends StudentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StudentServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (StudentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StudentServiceFileDescriptorSupplier())
              .addMethod(getGetRealNameMethod())
              .addMethod(getGetStudentSByAgeMethod())
              .addMethod(getGetStudentWrapperByAgesMethod())
              .addMethod(getGetStudentsBySomeAgeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
