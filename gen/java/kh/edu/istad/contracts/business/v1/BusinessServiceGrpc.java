package kh.edu.istad.contracts.business.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class BusinessServiceGrpc {

  private BusinessServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "business.v1.BusinessService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<kh.edu.istad.contracts.business.v1.RegisterBusinessRequest,
      kh.edu.istad.contracts.business.v1.RegisterBusinessResponse> getRegisterBusinessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterBusiness",
      requestType = kh.edu.istad.contracts.business.v1.RegisterBusinessRequest.class,
      responseType = kh.edu.istad.contracts.business.v1.RegisterBusinessResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kh.edu.istad.contracts.business.v1.RegisterBusinessRequest,
      kh.edu.istad.contracts.business.v1.RegisterBusinessResponse> getRegisterBusinessMethod() {
    io.grpc.MethodDescriptor<kh.edu.istad.contracts.business.v1.RegisterBusinessRequest, kh.edu.istad.contracts.business.v1.RegisterBusinessResponse> getRegisterBusinessMethod;
    if ((getRegisterBusinessMethod = BusinessServiceGrpc.getRegisterBusinessMethod) == null) {
      synchronized (BusinessServiceGrpc.class) {
        if ((getRegisterBusinessMethod = BusinessServiceGrpc.getRegisterBusinessMethod) == null) {
          BusinessServiceGrpc.getRegisterBusinessMethod = getRegisterBusinessMethod =
              io.grpc.MethodDescriptor.<kh.edu.istad.contracts.business.v1.RegisterBusinessRequest, kh.edu.istad.contracts.business.v1.RegisterBusinessResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterBusiness"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kh.edu.istad.contracts.business.v1.RegisterBusinessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kh.edu.istad.contracts.business.v1.RegisterBusinessResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BusinessServiceMethodDescriptorSupplier("RegisterBusiness"))
              .build();
        }
      }
    }
    return getRegisterBusinessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kh.edu.istad.contracts.business.v1.ValidateBusinessRequest,
      kh.edu.istad.contracts.business.v1.ValidateBusinessResponse> getValidateBusinessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateBusiness",
      requestType = kh.edu.istad.contracts.business.v1.ValidateBusinessRequest.class,
      responseType = kh.edu.istad.contracts.business.v1.ValidateBusinessResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kh.edu.istad.contracts.business.v1.ValidateBusinessRequest,
      kh.edu.istad.contracts.business.v1.ValidateBusinessResponse> getValidateBusinessMethod() {
    io.grpc.MethodDescriptor<kh.edu.istad.contracts.business.v1.ValidateBusinessRequest, kh.edu.istad.contracts.business.v1.ValidateBusinessResponse> getValidateBusinessMethod;
    if ((getValidateBusinessMethod = BusinessServiceGrpc.getValidateBusinessMethod) == null) {
      synchronized (BusinessServiceGrpc.class) {
        if ((getValidateBusinessMethod = BusinessServiceGrpc.getValidateBusinessMethod) == null) {
          BusinessServiceGrpc.getValidateBusinessMethod = getValidateBusinessMethod =
              io.grpc.MethodDescriptor.<kh.edu.istad.contracts.business.v1.ValidateBusinessRequest, kh.edu.istad.contracts.business.v1.ValidateBusinessResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateBusiness"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kh.edu.istad.contracts.business.v1.ValidateBusinessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kh.edu.istad.contracts.business.v1.ValidateBusinessResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BusinessServiceMethodDescriptorSupplier("ValidateBusiness"))
              .build();
        }
      }
    }
    return getValidateBusinessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kh.edu.istad.contracts.business.v1.ReviewOrderRequest,
      kh.edu.istad.contracts.business.v1.ReviewOrderResponse> getReviewOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReviewOrder",
      requestType = kh.edu.istad.contracts.business.v1.ReviewOrderRequest.class,
      responseType = kh.edu.istad.contracts.business.v1.ReviewOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kh.edu.istad.contracts.business.v1.ReviewOrderRequest,
      kh.edu.istad.contracts.business.v1.ReviewOrderResponse> getReviewOrderMethod() {
    io.grpc.MethodDescriptor<kh.edu.istad.contracts.business.v1.ReviewOrderRequest, kh.edu.istad.contracts.business.v1.ReviewOrderResponse> getReviewOrderMethod;
    if ((getReviewOrderMethod = BusinessServiceGrpc.getReviewOrderMethod) == null) {
      synchronized (BusinessServiceGrpc.class) {
        if ((getReviewOrderMethod = BusinessServiceGrpc.getReviewOrderMethod) == null) {
          BusinessServiceGrpc.getReviewOrderMethod = getReviewOrderMethod =
              io.grpc.MethodDescriptor.<kh.edu.istad.contracts.business.v1.ReviewOrderRequest, kh.edu.istad.contracts.business.v1.ReviewOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReviewOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kh.edu.istad.contracts.business.v1.ReviewOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kh.edu.istad.contracts.business.v1.ReviewOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BusinessServiceMethodDescriptorSupplier("ReviewOrder"))
              .build();
        }
      }
    }
    return getReviewOrderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BusinessServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BusinessServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BusinessServiceStub>() {
        @java.lang.Override
        public BusinessServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BusinessServiceStub(channel, callOptions);
        }
      };
    return BusinessServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static BusinessServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BusinessServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BusinessServiceBlockingV2Stub>() {
        @java.lang.Override
        public BusinessServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BusinessServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return BusinessServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BusinessServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BusinessServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BusinessServiceBlockingStub>() {
        @java.lang.Override
        public BusinessServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BusinessServiceBlockingStub(channel, callOptions);
        }
      };
    return BusinessServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BusinessServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BusinessServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BusinessServiceFutureStub>() {
        @java.lang.Override
        public BusinessServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BusinessServiceFutureStub(channel, callOptions);
        }
      };
    return BusinessServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void registerBusiness(kh.edu.istad.contracts.business.v1.RegisterBusinessRequest request,
        io.grpc.stub.StreamObserver<kh.edu.istad.contracts.business.v1.RegisterBusinessResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterBusinessMethod(), responseObserver);
    }

    /**
     */
    default void validateBusiness(kh.edu.istad.contracts.business.v1.ValidateBusinessRequest request,
        io.grpc.stub.StreamObserver<kh.edu.istad.contracts.business.v1.ValidateBusinessResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateBusinessMethod(), responseObserver);
    }

    /**
     */
    default void reviewOrder(kh.edu.istad.contracts.business.v1.ReviewOrderRequest request,
        io.grpc.stub.StreamObserver<kh.edu.istad.contracts.business.v1.ReviewOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReviewOrderMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BusinessService.
   */
  public static abstract class BusinessServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BusinessServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BusinessService.
   */
  public static final class BusinessServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BusinessServiceStub> {
    private BusinessServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BusinessServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BusinessServiceStub(channel, callOptions);
    }

    /**
     */
    public void registerBusiness(kh.edu.istad.contracts.business.v1.RegisterBusinessRequest request,
        io.grpc.stub.StreamObserver<kh.edu.istad.contracts.business.v1.RegisterBusinessResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterBusinessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void validateBusiness(kh.edu.istad.contracts.business.v1.ValidateBusinessRequest request,
        io.grpc.stub.StreamObserver<kh.edu.istad.contracts.business.v1.ValidateBusinessResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateBusinessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void reviewOrder(kh.edu.istad.contracts.business.v1.ReviewOrderRequest request,
        io.grpc.stub.StreamObserver<kh.edu.istad.contracts.business.v1.ReviewOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReviewOrderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BusinessService.
   */
  public static final class BusinessServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<BusinessServiceBlockingV2Stub> {
    private BusinessServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BusinessServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BusinessServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public kh.edu.istad.contracts.business.v1.RegisterBusinessResponse registerBusiness(kh.edu.istad.contracts.business.v1.RegisterBusinessRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRegisterBusinessMethod(), getCallOptions(), request);
    }

    /**
     */
    public kh.edu.istad.contracts.business.v1.ValidateBusinessResponse validateBusiness(kh.edu.istad.contracts.business.v1.ValidateBusinessRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getValidateBusinessMethod(), getCallOptions(), request);
    }

    /**
     */
    public kh.edu.istad.contracts.business.v1.ReviewOrderResponse reviewOrder(kh.edu.istad.contracts.business.v1.ReviewOrderRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getReviewOrderMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service BusinessService.
   */
  public static final class BusinessServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BusinessServiceBlockingStub> {
    private BusinessServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BusinessServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BusinessServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public kh.edu.istad.contracts.business.v1.RegisterBusinessResponse registerBusiness(kh.edu.istad.contracts.business.v1.RegisterBusinessRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterBusinessMethod(), getCallOptions(), request);
    }

    /**
     */
    public kh.edu.istad.contracts.business.v1.ValidateBusinessResponse validateBusiness(kh.edu.istad.contracts.business.v1.ValidateBusinessRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateBusinessMethod(), getCallOptions(), request);
    }

    /**
     */
    public kh.edu.istad.contracts.business.v1.ReviewOrderResponse reviewOrder(kh.edu.istad.contracts.business.v1.ReviewOrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReviewOrderMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BusinessService.
   */
  public static final class BusinessServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BusinessServiceFutureStub> {
    private BusinessServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BusinessServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BusinessServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kh.edu.istad.contracts.business.v1.RegisterBusinessResponse> registerBusiness(
        kh.edu.istad.contracts.business.v1.RegisterBusinessRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterBusinessMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kh.edu.istad.contracts.business.v1.ValidateBusinessResponse> validateBusiness(
        kh.edu.istad.contracts.business.v1.ValidateBusinessRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateBusinessMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kh.edu.istad.contracts.business.v1.ReviewOrderResponse> reviewOrder(
        kh.edu.istad.contracts.business.v1.ReviewOrderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReviewOrderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_BUSINESS = 0;
  private static final int METHODID_VALIDATE_BUSINESS = 1;
  private static final int METHODID_REVIEW_ORDER = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_BUSINESS:
          serviceImpl.registerBusiness((kh.edu.istad.contracts.business.v1.RegisterBusinessRequest) request,
              (io.grpc.stub.StreamObserver<kh.edu.istad.contracts.business.v1.RegisterBusinessResponse>) responseObserver);
          break;
        case METHODID_VALIDATE_BUSINESS:
          serviceImpl.validateBusiness((kh.edu.istad.contracts.business.v1.ValidateBusinessRequest) request,
              (io.grpc.stub.StreamObserver<kh.edu.istad.contracts.business.v1.ValidateBusinessResponse>) responseObserver);
          break;
        case METHODID_REVIEW_ORDER:
          serviceImpl.reviewOrder((kh.edu.istad.contracts.business.v1.ReviewOrderRequest) request,
              (io.grpc.stub.StreamObserver<kh.edu.istad.contracts.business.v1.ReviewOrderResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getRegisterBusinessMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              kh.edu.istad.contracts.business.v1.RegisterBusinessRequest,
              kh.edu.istad.contracts.business.v1.RegisterBusinessResponse>(
                service, METHODID_REGISTER_BUSINESS)))
        .addMethod(
          getValidateBusinessMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              kh.edu.istad.contracts.business.v1.ValidateBusinessRequest,
              kh.edu.istad.contracts.business.v1.ValidateBusinessResponse>(
                service, METHODID_VALIDATE_BUSINESS)))
        .addMethod(
          getReviewOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              kh.edu.istad.contracts.business.v1.ReviewOrderRequest,
              kh.edu.istad.contracts.business.v1.ReviewOrderResponse>(
                service, METHODID_REVIEW_ORDER)))
        .build();
  }

  private static abstract class BusinessServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BusinessServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return kh.edu.istad.contracts.business.v1.BusinessOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BusinessService");
    }
  }

  private static final class BusinessServiceFileDescriptorSupplier
      extends BusinessServiceBaseDescriptorSupplier {
    BusinessServiceFileDescriptorSupplier() {}
  }

  private static final class BusinessServiceMethodDescriptorSupplier
      extends BusinessServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BusinessServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BusinessServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BusinessServiceFileDescriptorSupplier())
              .addMethod(getRegisterBusinessMethod())
              .addMethod(getValidateBusinessMethod())
              .addMethod(getReviewOrderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
