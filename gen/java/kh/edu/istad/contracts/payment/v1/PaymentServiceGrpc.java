package kh.edu.istad.contracts.payment.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class PaymentServiceGrpc {

  private PaymentServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "payment.v1.PaymentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<kh.edu.istad.contracts.payment.v1.CreatePaymentRequest,
      kh.edu.istad.contracts.payment.v1.CreatePaymentResponse> getCreatePaymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePayment",
      requestType = kh.edu.istad.contracts.payment.v1.CreatePaymentRequest.class,
      responseType = kh.edu.istad.contracts.payment.v1.CreatePaymentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kh.edu.istad.contracts.payment.v1.CreatePaymentRequest,
      kh.edu.istad.contracts.payment.v1.CreatePaymentResponse> getCreatePaymentMethod() {
    io.grpc.MethodDescriptor<kh.edu.istad.contracts.payment.v1.CreatePaymentRequest, kh.edu.istad.contracts.payment.v1.CreatePaymentResponse> getCreatePaymentMethod;
    if ((getCreatePaymentMethod = PaymentServiceGrpc.getCreatePaymentMethod) == null) {
      synchronized (PaymentServiceGrpc.class) {
        if ((getCreatePaymentMethod = PaymentServiceGrpc.getCreatePaymentMethod) == null) {
          PaymentServiceGrpc.getCreatePaymentMethod = getCreatePaymentMethod =
              io.grpc.MethodDescriptor.<kh.edu.istad.contracts.payment.v1.CreatePaymentRequest, kh.edu.istad.contracts.payment.v1.CreatePaymentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePayment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kh.edu.istad.contracts.payment.v1.CreatePaymentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kh.edu.istad.contracts.payment.v1.CreatePaymentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PaymentServiceMethodDescriptorSupplier("CreatePayment"))
              .build();
        }
      }
    }
    return getCreatePaymentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kh.edu.istad.contracts.payment.v1.GetPaymentRequest,
      kh.edu.istad.contracts.payment.v1.GetPaymentResponse> getGetPaymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPayment",
      requestType = kh.edu.istad.contracts.payment.v1.GetPaymentRequest.class,
      responseType = kh.edu.istad.contracts.payment.v1.GetPaymentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kh.edu.istad.contracts.payment.v1.GetPaymentRequest,
      kh.edu.istad.contracts.payment.v1.GetPaymentResponse> getGetPaymentMethod() {
    io.grpc.MethodDescriptor<kh.edu.istad.contracts.payment.v1.GetPaymentRequest, kh.edu.istad.contracts.payment.v1.GetPaymentResponse> getGetPaymentMethod;
    if ((getGetPaymentMethod = PaymentServiceGrpc.getGetPaymentMethod) == null) {
      synchronized (PaymentServiceGrpc.class) {
        if ((getGetPaymentMethod = PaymentServiceGrpc.getGetPaymentMethod) == null) {
          PaymentServiceGrpc.getGetPaymentMethod = getGetPaymentMethod =
              io.grpc.MethodDescriptor.<kh.edu.istad.contracts.payment.v1.GetPaymentRequest, kh.edu.istad.contracts.payment.v1.GetPaymentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPayment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kh.edu.istad.contracts.payment.v1.GetPaymentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kh.edu.istad.contracts.payment.v1.GetPaymentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PaymentServiceMethodDescriptorSupplier("GetPayment"))
              .build();
        }
      }
    }
    return getGetPaymentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kh.edu.istad.contracts.payment.v1.UpdatePaymentStatusRequest,
      kh.edu.istad.contracts.payment.v1.UpdatePaymentStatusResponse> getUpdatePaymentStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePaymentStatus",
      requestType = kh.edu.istad.contracts.payment.v1.UpdatePaymentStatusRequest.class,
      responseType = kh.edu.istad.contracts.payment.v1.UpdatePaymentStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kh.edu.istad.contracts.payment.v1.UpdatePaymentStatusRequest,
      kh.edu.istad.contracts.payment.v1.UpdatePaymentStatusResponse> getUpdatePaymentStatusMethod() {
    io.grpc.MethodDescriptor<kh.edu.istad.contracts.payment.v1.UpdatePaymentStatusRequest, kh.edu.istad.contracts.payment.v1.UpdatePaymentStatusResponse> getUpdatePaymentStatusMethod;
    if ((getUpdatePaymentStatusMethod = PaymentServiceGrpc.getUpdatePaymentStatusMethod) == null) {
      synchronized (PaymentServiceGrpc.class) {
        if ((getUpdatePaymentStatusMethod = PaymentServiceGrpc.getUpdatePaymentStatusMethod) == null) {
          PaymentServiceGrpc.getUpdatePaymentStatusMethod = getUpdatePaymentStatusMethod =
              io.grpc.MethodDescriptor.<kh.edu.istad.contracts.payment.v1.UpdatePaymentStatusRequest, kh.edu.istad.contracts.payment.v1.UpdatePaymentStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePaymentStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kh.edu.istad.contracts.payment.v1.UpdatePaymentStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kh.edu.istad.contracts.payment.v1.UpdatePaymentStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PaymentServiceMethodDescriptorSupplier("UpdatePaymentStatus"))
              .build();
        }
      }
    }
    return getUpdatePaymentStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PaymentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PaymentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PaymentServiceStub>() {
        @java.lang.Override
        public PaymentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PaymentServiceStub(channel, callOptions);
        }
      };
    return PaymentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static PaymentServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PaymentServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PaymentServiceBlockingV2Stub>() {
        @java.lang.Override
        public PaymentServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PaymentServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return PaymentServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PaymentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PaymentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PaymentServiceBlockingStub>() {
        @java.lang.Override
        public PaymentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PaymentServiceBlockingStub(channel, callOptions);
        }
      };
    return PaymentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PaymentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PaymentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PaymentServiceFutureStub>() {
        @java.lang.Override
        public PaymentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PaymentServiceFutureStub(channel, callOptions);
        }
      };
    return PaymentServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createPayment(kh.edu.istad.contracts.payment.v1.CreatePaymentRequest request,
        io.grpc.stub.StreamObserver<kh.edu.istad.contracts.payment.v1.CreatePaymentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePaymentMethod(), responseObserver);
    }

    /**
     */
    default void getPayment(kh.edu.istad.contracts.payment.v1.GetPaymentRequest request,
        io.grpc.stub.StreamObserver<kh.edu.istad.contracts.payment.v1.GetPaymentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPaymentMethod(), responseObserver);
    }

    /**
     */
    default void updatePaymentStatus(kh.edu.istad.contracts.payment.v1.UpdatePaymentStatusRequest request,
        io.grpc.stub.StreamObserver<kh.edu.istad.contracts.payment.v1.UpdatePaymentStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePaymentStatusMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PaymentService.
   */
  public static abstract class PaymentServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PaymentServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PaymentService.
   */
  public static final class PaymentServiceStub
      extends io.grpc.stub.AbstractAsyncStub<PaymentServiceStub> {
    private PaymentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PaymentServiceStub(channel, callOptions);
    }

    /**
     */
    public void createPayment(kh.edu.istad.contracts.payment.v1.CreatePaymentRequest request,
        io.grpc.stub.StreamObserver<kh.edu.istad.contracts.payment.v1.CreatePaymentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePaymentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPayment(kh.edu.istad.contracts.payment.v1.GetPaymentRequest request,
        io.grpc.stub.StreamObserver<kh.edu.istad.contracts.payment.v1.GetPaymentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPaymentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePaymentStatus(kh.edu.istad.contracts.payment.v1.UpdatePaymentStatusRequest request,
        io.grpc.stub.StreamObserver<kh.edu.istad.contracts.payment.v1.UpdatePaymentStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePaymentStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PaymentService.
   */
  public static final class PaymentServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<PaymentServiceBlockingV2Stub> {
    private PaymentServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PaymentServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public kh.edu.istad.contracts.payment.v1.CreatePaymentResponse createPayment(kh.edu.istad.contracts.payment.v1.CreatePaymentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreatePaymentMethod(), getCallOptions(), request);
    }

    /**
     */
    public kh.edu.istad.contracts.payment.v1.GetPaymentResponse getPayment(kh.edu.istad.contracts.payment.v1.GetPaymentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetPaymentMethod(), getCallOptions(), request);
    }

    /**
     */
    public kh.edu.istad.contracts.payment.v1.UpdatePaymentStatusResponse updatePaymentStatus(kh.edu.istad.contracts.payment.v1.UpdatePaymentStatusRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpdatePaymentStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service PaymentService.
   */
  public static final class PaymentServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PaymentServiceBlockingStub> {
    private PaymentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PaymentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public kh.edu.istad.contracts.payment.v1.CreatePaymentResponse createPayment(kh.edu.istad.contracts.payment.v1.CreatePaymentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePaymentMethod(), getCallOptions(), request);
    }

    /**
     */
    public kh.edu.istad.contracts.payment.v1.GetPaymentResponse getPayment(kh.edu.istad.contracts.payment.v1.GetPaymentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPaymentMethod(), getCallOptions(), request);
    }

    /**
     */
    public kh.edu.istad.contracts.payment.v1.UpdatePaymentStatusResponse updatePaymentStatus(kh.edu.istad.contracts.payment.v1.UpdatePaymentStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePaymentStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PaymentService.
   */
  public static final class PaymentServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<PaymentServiceFutureStub> {
    private PaymentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PaymentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kh.edu.istad.contracts.payment.v1.CreatePaymentResponse> createPayment(
        kh.edu.istad.contracts.payment.v1.CreatePaymentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePaymentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kh.edu.istad.contracts.payment.v1.GetPaymentResponse> getPayment(
        kh.edu.istad.contracts.payment.v1.GetPaymentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPaymentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kh.edu.istad.contracts.payment.v1.UpdatePaymentStatusResponse> updatePaymentStatus(
        kh.edu.istad.contracts.payment.v1.UpdatePaymentStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePaymentStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PAYMENT = 0;
  private static final int METHODID_GET_PAYMENT = 1;
  private static final int METHODID_UPDATE_PAYMENT_STATUS = 2;

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
        case METHODID_CREATE_PAYMENT:
          serviceImpl.createPayment((kh.edu.istad.contracts.payment.v1.CreatePaymentRequest) request,
              (io.grpc.stub.StreamObserver<kh.edu.istad.contracts.payment.v1.CreatePaymentResponse>) responseObserver);
          break;
        case METHODID_GET_PAYMENT:
          serviceImpl.getPayment((kh.edu.istad.contracts.payment.v1.GetPaymentRequest) request,
              (io.grpc.stub.StreamObserver<kh.edu.istad.contracts.payment.v1.GetPaymentResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PAYMENT_STATUS:
          serviceImpl.updatePaymentStatus((kh.edu.istad.contracts.payment.v1.UpdatePaymentStatusRequest) request,
              (io.grpc.stub.StreamObserver<kh.edu.istad.contracts.payment.v1.UpdatePaymentStatusResponse>) responseObserver);
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
          getCreatePaymentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              kh.edu.istad.contracts.payment.v1.CreatePaymentRequest,
              kh.edu.istad.contracts.payment.v1.CreatePaymentResponse>(
                service, METHODID_CREATE_PAYMENT)))
        .addMethod(
          getGetPaymentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              kh.edu.istad.contracts.payment.v1.GetPaymentRequest,
              kh.edu.istad.contracts.payment.v1.GetPaymentResponse>(
                service, METHODID_GET_PAYMENT)))
        .addMethod(
          getUpdatePaymentStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              kh.edu.istad.contracts.payment.v1.UpdatePaymentStatusRequest,
              kh.edu.istad.contracts.payment.v1.UpdatePaymentStatusResponse>(
                service, METHODID_UPDATE_PAYMENT_STATUS)))
        .build();
  }

  private static abstract class PaymentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PaymentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return kh.edu.istad.contracts.payment.v1.PaymentOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PaymentService");
    }
  }

  private static final class PaymentServiceFileDescriptorSupplier
      extends PaymentServiceBaseDescriptorSupplier {
    PaymentServiceFileDescriptorSupplier() {}
  }

  private static final class PaymentServiceMethodDescriptorSupplier
      extends PaymentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PaymentServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PaymentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PaymentServiceFileDescriptorSupplier())
              .addMethod(getCreatePaymentMethod())
              .addMethod(getGetPaymentMethod())
              .addMethod(getUpdatePaymentStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
