package kh.edu.istad.contracts.customer.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class CustomerServiceGrpc {

  private CustomerServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "customer.v1.CustomerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<kh.edu.istad.contracts.customer.v1.CreateCustomerRequest,
      kh.edu.istad.contracts.customer.v1.CreateCustomerResponse> getCreateCustomerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCustomer",
      requestType = kh.edu.istad.contracts.customer.v1.CreateCustomerRequest.class,
      responseType = kh.edu.istad.contracts.customer.v1.CreateCustomerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kh.edu.istad.contracts.customer.v1.CreateCustomerRequest,
      kh.edu.istad.contracts.customer.v1.CreateCustomerResponse> getCreateCustomerMethod() {
    io.grpc.MethodDescriptor<kh.edu.istad.contracts.customer.v1.CreateCustomerRequest, kh.edu.istad.contracts.customer.v1.CreateCustomerResponse> getCreateCustomerMethod;
    if ((getCreateCustomerMethod = CustomerServiceGrpc.getCreateCustomerMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getCreateCustomerMethod = CustomerServiceGrpc.getCreateCustomerMethod) == null) {
          CustomerServiceGrpc.getCreateCustomerMethod = getCreateCustomerMethod =
              io.grpc.MethodDescriptor.<kh.edu.istad.contracts.customer.v1.CreateCustomerRequest, kh.edu.istad.contracts.customer.v1.CreateCustomerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCustomer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kh.edu.istad.contracts.customer.v1.CreateCustomerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kh.edu.istad.contracts.customer.v1.CreateCustomerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("CreateCustomer"))
              .build();
        }
      }
    }
    return getCreateCustomerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kh.edu.istad.contracts.customer.v1.GetCustomerRequest,
      kh.edu.istad.contracts.customer.v1.GetCustomerResponse> getGetCustomerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCustomer",
      requestType = kh.edu.istad.contracts.customer.v1.GetCustomerRequest.class,
      responseType = kh.edu.istad.contracts.customer.v1.GetCustomerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kh.edu.istad.contracts.customer.v1.GetCustomerRequest,
      kh.edu.istad.contracts.customer.v1.GetCustomerResponse> getGetCustomerMethod() {
    io.grpc.MethodDescriptor<kh.edu.istad.contracts.customer.v1.GetCustomerRequest, kh.edu.istad.contracts.customer.v1.GetCustomerResponse> getGetCustomerMethod;
    if ((getGetCustomerMethod = CustomerServiceGrpc.getGetCustomerMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getGetCustomerMethod = CustomerServiceGrpc.getGetCustomerMethod) == null) {
          CustomerServiceGrpc.getGetCustomerMethod = getGetCustomerMethod =
              io.grpc.MethodDescriptor.<kh.edu.istad.contracts.customer.v1.GetCustomerRequest, kh.edu.istad.contracts.customer.v1.GetCustomerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCustomer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kh.edu.istad.contracts.customer.v1.GetCustomerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kh.edu.istad.contracts.customer.v1.GetCustomerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("GetCustomer"))
              .build();
        }
      }
    }
    return getGetCustomerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kh.edu.istad.contracts.customer.v1.UpdateCustomerRequest,
      kh.edu.istad.contracts.customer.v1.UpdateCustomerResponse> getUpdateCustomerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCustomer",
      requestType = kh.edu.istad.contracts.customer.v1.UpdateCustomerRequest.class,
      responseType = kh.edu.istad.contracts.customer.v1.UpdateCustomerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kh.edu.istad.contracts.customer.v1.UpdateCustomerRequest,
      kh.edu.istad.contracts.customer.v1.UpdateCustomerResponse> getUpdateCustomerMethod() {
    io.grpc.MethodDescriptor<kh.edu.istad.contracts.customer.v1.UpdateCustomerRequest, kh.edu.istad.contracts.customer.v1.UpdateCustomerResponse> getUpdateCustomerMethod;
    if ((getUpdateCustomerMethod = CustomerServiceGrpc.getUpdateCustomerMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getUpdateCustomerMethod = CustomerServiceGrpc.getUpdateCustomerMethod) == null) {
          CustomerServiceGrpc.getUpdateCustomerMethod = getUpdateCustomerMethod =
              io.grpc.MethodDescriptor.<kh.edu.istad.contracts.customer.v1.UpdateCustomerRequest, kh.edu.istad.contracts.customer.v1.UpdateCustomerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCustomer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kh.edu.istad.contracts.customer.v1.UpdateCustomerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kh.edu.istad.contracts.customer.v1.UpdateCustomerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("UpdateCustomer"))
              .build();
        }
      }
    }
    return getUpdateCustomerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kh.edu.istad.contracts.customer.v1.DeleteCustomerRequest,
      kh.edu.istad.contracts.customer.v1.DeleteCustomerResponse> getDeleteCustomerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCustomer",
      requestType = kh.edu.istad.contracts.customer.v1.DeleteCustomerRequest.class,
      responseType = kh.edu.istad.contracts.customer.v1.DeleteCustomerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kh.edu.istad.contracts.customer.v1.DeleteCustomerRequest,
      kh.edu.istad.contracts.customer.v1.DeleteCustomerResponse> getDeleteCustomerMethod() {
    io.grpc.MethodDescriptor<kh.edu.istad.contracts.customer.v1.DeleteCustomerRequest, kh.edu.istad.contracts.customer.v1.DeleteCustomerResponse> getDeleteCustomerMethod;
    if ((getDeleteCustomerMethod = CustomerServiceGrpc.getDeleteCustomerMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getDeleteCustomerMethod = CustomerServiceGrpc.getDeleteCustomerMethod) == null) {
          CustomerServiceGrpc.getDeleteCustomerMethod = getDeleteCustomerMethod =
              io.grpc.MethodDescriptor.<kh.edu.istad.contracts.customer.v1.DeleteCustomerRequest, kh.edu.istad.contracts.customer.v1.DeleteCustomerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCustomer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kh.edu.istad.contracts.customer.v1.DeleteCustomerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kh.edu.istad.contracts.customer.v1.DeleteCustomerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("DeleteCustomer"))
              .build();
        }
      }
    }
    return getDeleteCustomerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kh.edu.istad.contracts.customer.v1.ListCustomersRequest,
      kh.edu.istad.contracts.customer.v1.ListCustomersResponse> getListCustomersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCustomers",
      requestType = kh.edu.istad.contracts.customer.v1.ListCustomersRequest.class,
      responseType = kh.edu.istad.contracts.customer.v1.ListCustomersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kh.edu.istad.contracts.customer.v1.ListCustomersRequest,
      kh.edu.istad.contracts.customer.v1.ListCustomersResponse> getListCustomersMethod() {
    io.grpc.MethodDescriptor<kh.edu.istad.contracts.customer.v1.ListCustomersRequest, kh.edu.istad.contracts.customer.v1.ListCustomersResponse> getListCustomersMethod;
    if ((getListCustomersMethod = CustomerServiceGrpc.getListCustomersMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getListCustomersMethod = CustomerServiceGrpc.getListCustomersMethod) == null) {
          CustomerServiceGrpc.getListCustomersMethod = getListCustomersMethod =
              io.grpc.MethodDescriptor.<kh.edu.istad.contracts.customer.v1.ListCustomersRequest, kh.edu.istad.contracts.customer.v1.ListCustomersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCustomers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kh.edu.istad.contracts.customer.v1.ListCustomersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kh.edu.istad.contracts.customer.v1.ListCustomersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("ListCustomers"))
              .build();
        }
      }
    }
    return getListCustomersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kh.edu.istad.contracts.customer.v1.QueryCustomersRequest,
      kh.edu.istad.contracts.customer.v1.QueryCustomersResponse> getQueryCustomersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryCustomers",
      requestType = kh.edu.istad.contracts.customer.v1.QueryCustomersRequest.class,
      responseType = kh.edu.istad.contracts.customer.v1.QueryCustomersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kh.edu.istad.contracts.customer.v1.QueryCustomersRequest,
      kh.edu.istad.contracts.customer.v1.QueryCustomersResponse> getQueryCustomersMethod() {
    io.grpc.MethodDescriptor<kh.edu.istad.contracts.customer.v1.QueryCustomersRequest, kh.edu.istad.contracts.customer.v1.QueryCustomersResponse> getQueryCustomersMethod;
    if ((getQueryCustomersMethod = CustomerServiceGrpc.getQueryCustomersMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getQueryCustomersMethod = CustomerServiceGrpc.getQueryCustomersMethod) == null) {
          CustomerServiceGrpc.getQueryCustomersMethod = getQueryCustomersMethod =
              io.grpc.MethodDescriptor.<kh.edu.istad.contracts.customer.v1.QueryCustomersRequest, kh.edu.istad.contracts.customer.v1.QueryCustomersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryCustomers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kh.edu.istad.contracts.customer.v1.QueryCustomersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kh.edu.istad.contracts.customer.v1.QueryCustomersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("QueryCustomers"))
              .build();
        }
      }
    }
    return getQueryCustomersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kh.edu.istad.contracts.customer.v1.AssignCustomerSegmentRequest,
      kh.edu.istad.contracts.customer.v1.AssignCustomerSegmentResponse> getAssignCustomerSegmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignCustomerSegment",
      requestType = kh.edu.istad.contracts.customer.v1.AssignCustomerSegmentRequest.class,
      responseType = kh.edu.istad.contracts.customer.v1.AssignCustomerSegmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kh.edu.istad.contracts.customer.v1.AssignCustomerSegmentRequest,
      kh.edu.istad.contracts.customer.v1.AssignCustomerSegmentResponse> getAssignCustomerSegmentMethod() {
    io.grpc.MethodDescriptor<kh.edu.istad.contracts.customer.v1.AssignCustomerSegmentRequest, kh.edu.istad.contracts.customer.v1.AssignCustomerSegmentResponse> getAssignCustomerSegmentMethod;
    if ((getAssignCustomerSegmentMethod = CustomerServiceGrpc.getAssignCustomerSegmentMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getAssignCustomerSegmentMethod = CustomerServiceGrpc.getAssignCustomerSegmentMethod) == null) {
          CustomerServiceGrpc.getAssignCustomerSegmentMethod = getAssignCustomerSegmentMethod =
              io.grpc.MethodDescriptor.<kh.edu.istad.contracts.customer.v1.AssignCustomerSegmentRequest, kh.edu.istad.contracts.customer.v1.AssignCustomerSegmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignCustomerSegment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kh.edu.istad.contracts.customer.v1.AssignCustomerSegmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kh.edu.istad.contracts.customer.v1.AssignCustomerSegmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("AssignCustomerSegment"))
              .build();
        }
      }
    }
    return getAssignCustomerSegmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kh.edu.istad.contracts.customer.v1.GetCustomerStatisticsRequest,
      kh.edu.istad.contracts.customer.v1.GetCustomerStatisticsResponse> getGetCustomerStatisticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCustomerStatistics",
      requestType = kh.edu.istad.contracts.customer.v1.GetCustomerStatisticsRequest.class,
      responseType = kh.edu.istad.contracts.customer.v1.GetCustomerStatisticsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kh.edu.istad.contracts.customer.v1.GetCustomerStatisticsRequest,
      kh.edu.istad.contracts.customer.v1.GetCustomerStatisticsResponse> getGetCustomerStatisticsMethod() {
    io.grpc.MethodDescriptor<kh.edu.istad.contracts.customer.v1.GetCustomerStatisticsRequest, kh.edu.istad.contracts.customer.v1.GetCustomerStatisticsResponse> getGetCustomerStatisticsMethod;
    if ((getGetCustomerStatisticsMethod = CustomerServiceGrpc.getGetCustomerStatisticsMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getGetCustomerStatisticsMethod = CustomerServiceGrpc.getGetCustomerStatisticsMethod) == null) {
          CustomerServiceGrpc.getGetCustomerStatisticsMethod = getGetCustomerStatisticsMethod =
              io.grpc.MethodDescriptor.<kh.edu.istad.contracts.customer.v1.GetCustomerStatisticsRequest, kh.edu.istad.contracts.customer.v1.GetCustomerStatisticsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCustomerStatistics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kh.edu.istad.contracts.customer.v1.GetCustomerStatisticsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kh.edu.istad.contracts.customer.v1.GetCustomerStatisticsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("GetCustomerStatistics"))
              .build();
        }
      }
    }
    return getGetCustomerStatisticsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kh.edu.istad.contracts.customer.v1.ValidateCustomerRequest,
      kh.edu.istad.contracts.customer.v1.ValidateCustomerResponse> getValidateCustomerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateCustomer",
      requestType = kh.edu.istad.contracts.customer.v1.ValidateCustomerRequest.class,
      responseType = kh.edu.istad.contracts.customer.v1.ValidateCustomerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kh.edu.istad.contracts.customer.v1.ValidateCustomerRequest,
      kh.edu.istad.contracts.customer.v1.ValidateCustomerResponse> getValidateCustomerMethod() {
    io.grpc.MethodDescriptor<kh.edu.istad.contracts.customer.v1.ValidateCustomerRequest, kh.edu.istad.contracts.customer.v1.ValidateCustomerResponse> getValidateCustomerMethod;
    if ((getValidateCustomerMethod = CustomerServiceGrpc.getValidateCustomerMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getValidateCustomerMethod = CustomerServiceGrpc.getValidateCustomerMethod) == null) {
          CustomerServiceGrpc.getValidateCustomerMethod = getValidateCustomerMethod =
              io.grpc.MethodDescriptor.<kh.edu.istad.contracts.customer.v1.ValidateCustomerRequest, kh.edu.istad.contracts.customer.v1.ValidateCustomerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateCustomer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kh.edu.istad.contracts.customer.v1.ValidateCustomerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kh.edu.istad.contracts.customer.v1.ValidateCustomerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("ValidateCustomer"))
              .build();
        }
      }
    }
    return getValidateCustomerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerServiceStub>() {
        @java.lang.Override
        public CustomerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerServiceStub(channel, callOptions);
        }
      };
    return CustomerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static CustomerServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerServiceBlockingV2Stub>() {
        @java.lang.Override
        public CustomerServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return CustomerServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerServiceBlockingStub>() {
        @java.lang.Override
        public CustomerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerServiceBlockingStub(channel, callOptions);
        }
      };
    return CustomerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerServiceFutureStub>() {
        @java.lang.Override
        public CustomerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerServiceFutureStub(channel, callOptions);
        }
      };
    return CustomerServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createCustomer(kh.edu.istad.contracts.customer.v1.CreateCustomerRequest request,
        io.grpc.stub.StreamObserver<kh.edu.istad.contracts.customer.v1.CreateCustomerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCustomerMethod(), responseObserver);
    }

    /**
     */
    default void getCustomer(kh.edu.istad.contracts.customer.v1.GetCustomerRequest request,
        io.grpc.stub.StreamObserver<kh.edu.istad.contracts.customer.v1.GetCustomerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCustomerMethod(), responseObserver);
    }

    /**
     */
    default void updateCustomer(kh.edu.istad.contracts.customer.v1.UpdateCustomerRequest request,
        io.grpc.stub.StreamObserver<kh.edu.istad.contracts.customer.v1.UpdateCustomerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCustomerMethod(), responseObserver);
    }

    /**
     */
    default void deleteCustomer(kh.edu.istad.contracts.customer.v1.DeleteCustomerRequest request,
        io.grpc.stub.StreamObserver<kh.edu.istad.contracts.customer.v1.DeleteCustomerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCustomerMethod(), responseObserver);
    }

    /**
     */
    default void listCustomers(kh.edu.istad.contracts.customer.v1.ListCustomersRequest request,
        io.grpc.stub.StreamObserver<kh.edu.istad.contracts.customer.v1.ListCustomersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCustomersMethod(), responseObserver);
    }

    /**
     */
    default void queryCustomers(kh.edu.istad.contracts.customer.v1.QueryCustomersRequest request,
        io.grpc.stub.StreamObserver<kh.edu.istad.contracts.customer.v1.QueryCustomersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryCustomersMethod(), responseObserver);
    }

    /**
     */
    default void assignCustomerSegment(kh.edu.istad.contracts.customer.v1.AssignCustomerSegmentRequest request,
        io.grpc.stub.StreamObserver<kh.edu.istad.contracts.customer.v1.AssignCustomerSegmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignCustomerSegmentMethod(), responseObserver);
    }

    /**
     */
    default void getCustomerStatistics(kh.edu.istad.contracts.customer.v1.GetCustomerStatisticsRequest request,
        io.grpc.stub.StreamObserver<kh.edu.istad.contracts.customer.v1.GetCustomerStatisticsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCustomerStatisticsMethod(), responseObserver);
    }

    /**
     */
    default void validateCustomer(kh.edu.istad.contracts.customer.v1.ValidateCustomerRequest request,
        io.grpc.stub.StreamObserver<kh.edu.istad.contracts.customer.v1.ValidateCustomerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateCustomerMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CustomerService.
   */
  public static abstract class CustomerServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CustomerServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CustomerService.
   */
  public static final class CustomerServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CustomerServiceStub> {
    private CustomerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerServiceStub(channel, callOptions);
    }

    /**
     */
    public void createCustomer(kh.edu.istad.contracts.customer.v1.CreateCustomerRequest request,
        io.grpc.stub.StreamObserver<kh.edu.istad.contracts.customer.v1.CreateCustomerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCustomerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCustomer(kh.edu.istad.contracts.customer.v1.GetCustomerRequest request,
        io.grpc.stub.StreamObserver<kh.edu.istad.contracts.customer.v1.GetCustomerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCustomerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCustomer(kh.edu.istad.contracts.customer.v1.UpdateCustomerRequest request,
        io.grpc.stub.StreamObserver<kh.edu.istad.contracts.customer.v1.UpdateCustomerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCustomerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCustomer(kh.edu.istad.contracts.customer.v1.DeleteCustomerRequest request,
        io.grpc.stub.StreamObserver<kh.edu.istad.contracts.customer.v1.DeleteCustomerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCustomerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listCustomers(kh.edu.istad.contracts.customer.v1.ListCustomersRequest request,
        io.grpc.stub.StreamObserver<kh.edu.istad.contracts.customer.v1.ListCustomersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCustomersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryCustomers(kh.edu.istad.contracts.customer.v1.QueryCustomersRequest request,
        io.grpc.stub.StreamObserver<kh.edu.istad.contracts.customer.v1.QueryCustomersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryCustomersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void assignCustomerSegment(kh.edu.istad.contracts.customer.v1.AssignCustomerSegmentRequest request,
        io.grpc.stub.StreamObserver<kh.edu.istad.contracts.customer.v1.AssignCustomerSegmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignCustomerSegmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCustomerStatistics(kh.edu.istad.contracts.customer.v1.GetCustomerStatisticsRequest request,
        io.grpc.stub.StreamObserver<kh.edu.istad.contracts.customer.v1.GetCustomerStatisticsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCustomerStatisticsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void validateCustomer(kh.edu.istad.contracts.customer.v1.ValidateCustomerRequest request,
        io.grpc.stub.StreamObserver<kh.edu.istad.contracts.customer.v1.ValidateCustomerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateCustomerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CustomerService.
   */
  public static final class CustomerServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<CustomerServiceBlockingV2Stub> {
    private CustomerServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public kh.edu.istad.contracts.customer.v1.CreateCustomerResponse createCustomer(kh.edu.istad.contracts.customer.v1.CreateCustomerRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateCustomerMethod(), getCallOptions(), request);
    }

    /**
     */
    public kh.edu.istad.contracts.customer.v1.GetCustomerResponse getCustomer(kh.edu.istad.contracts.customer.v1.GetCustomerRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetCustomerMethod(), getCallOptions(), request);
    }

    /**
     */
    public kh.edu.istad.contracts.customer.v1.UpdateCustomerResponse updateCustomer(kh.edu.istad.contracts.customer.v1.UpdateCustomerRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpdateCustomerMethod(), getCallOptions(), request);
    }

    /**
     */
    public kh.edu.istad.contracts.customer.v1.DeleteCustomerResponse deleteCustomer(kh.edu.istad.contracts.customer.v1.DeleteCustomerRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteCustomerMethod(), getCallOptions(), request);
    }

    /**
     */
    public kh.edu.istad.contracts.customer.v1.ListCustomersResponse listCustomers(kh.edu.istad.contracts.customer.v1.ListCustomersRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListCustomersMethod(), getCallOptions(), request);
    }

    /**
     */
    public kh.edu.istad.contracts.customer.v1.QueryCustomersResponse queryCustomers(kh.edu.istad.contracts.customer.v1.QueryCustomersRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getQueryCustomersMethod(), getCallOptions(), request);
    }

    /**
     */
    public kh.edu.istad.contracts.customer.v1.AssignCustomerSegmentResponse assignCustomerSegment(kh.edu.istad.contracts.customer.v1.AssignCustomerSegmentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getAssignCustomerSegmentMethod(), getCallOptions(), request);
    }

    /**
     */
    public kh.edu.istad.contracts.customer.v1.GetCustomerStatisticsResponse getCustomerStatistics(kh.edu.istad.contracts.customer.v1.GetCustomerStatisticsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetCustomerStatisticsMethod(), getCallOptions(), request);
    }

    /**
     */
    public kh.edu.istad.contracts.customer.v1.ValidateCustomerResponse validateCustomer(kh.edu.istad.contracts.customer.v1.ValidateCustomerRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getValidateCustomerMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service CustomerService.
   */
  public static final class CustomerServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CustomerServiceBlockingStub> {
    private CustomerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public kh.edu.istad.contracts.customer.v1.CreateCustomerResponse createCustomer(kh.edu.istad.contracts.customer.v1.CreateCustomerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCustomerMethod(), getCallOptions(), request);
    }

    /**
     */
    public kh.edu.istad.contracts.customer.v1.GetCustomerResponse getCustomer(kh.edu.istad.contracts.customer.v1.GetCustomerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCustomerMethod(), getCallOptions(), request);
    }

    /**
     */
    public kh.edu.istad.contracts.customer.v1.UpdateCustomerResponse updateCustomer(kh.edu.istad.contracts.customer.v1.UpdateCustomerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCustomerMethod(), getCallOptions(), request);
    }

    /**
     */
    public kh.edu.istad.contracts.customer.v1.DeleteCustomerResponse deleteCustomer(kh.edu.istad.contracts.customer.v1.DeleteCustomerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCustomerMethod(), getCallOptions(), request);
    }

    /**
     */
    public kh.edu.istad.contracts.customer.v1.ListCustomersResponse listCustomers(kh.edu.istad.contracts.customer.v1.ListCustomersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCustomersMethod(), getCallOptions(), request);
    }

    /**
     */
    public kh.edu.istad.contracts.customer.v1.QueryCustomersResponse queryCustomers(kh.edu.istad.contracts.customer.v1.QueryCustomersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryCustomersMethod(), getCallOptions(), request);
    }

    /**
     */
    public kh.edu.istad.contracts.customer.v1.AssignCustomerSegmentResponse assignCustomerSegment(kh.edu.istad.contracts.customer.v1.AssignCustomerSegmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignCustomerSegmentMethod(), getCallOptions(), request);
    }

    /**
     */
    public kh.edu.istad.contracts.customer.v1.GetCustomerStatisticsResponse getCustomerStatistics(kh.edu.istad.contracts.customer.v1.GetCustomerStatisticsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCustomerStatisticsMethod(), getCallOptions(), request);
    }

    /**
     */
    public kh.edu.istad.contracts.customer.v1.ValidateCustomerResponse validateCustomer(kh.edu.istad.contracts.customer.v1.ValidateCustomerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateCustomerMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CustomerService.
   */
  public static final class CustomerServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CustomerServiceFutureStub> {
    private CustomerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kh.edu.istad.contracts.customer.v1.CreateCustomerResponse> createCustomer(
        kh.edu.istad.contracts.customer.v1.CreateCustomerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCustomerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kh.edu.istad.contracts.customer.v1.GetCustomerResponse> getCustomer(
        kh.edu.istad.contracts.customer.v1.GetCustomerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCustomerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kh.edu.istad.contracts.customer.v1.UpdateCustomerResponse> updateCustomer(
        kh.edu.istad.contracts.customer.v1.UpdateCustomerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCustomerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kh.edu.istad.contracts.customer.v1.DeleteCustomerResponse> deleteCustomer(
        kh.edu.istad.contracts.customer.v1.DeleteCustomerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCustomerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kh.edu.istad.contracts.customer.v1.ListCustomersResponse> listCustomers(
        kh.edu.istad.contracts.customer.v1.ListCustomersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCustomersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kh.edu.istad.contracts.customer.v1.QueryCustomersResponse> queryCustomers(
        kh.edu.istad.contracts.customer.v1.QueryCustomersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryCustomersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kh.edu.istad.contracts.customer.v1.AssignCustomerSegmentResponse> assignCustomerSegment(
        kh.edu.istad.contracts.customer.v1.AssignCustomerSegmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignCustomerSegmentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kh.edu.istad.contracts.customer.v1.GetCustomerStatisticsResponse> getCustomerStatistics(
        kh.edu.istad.contracts.customer.v1.GetCustomerStatisticsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCustomerStatisticsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kh.edu.istad.contracts.customer.v1.ValidateCustomerResponse> validateCustomer(
        kh.edu.istad.contracts.customer.v1.ValidateCustomerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateCustomerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CUSTOMER = 0;
  private static final int METHODID_GET_CUSTOMER = 1;
  private static final int METHODID_UPDATE_CUSTOMER = 2;
  private static final int METHODID_DELETE_CUSTOMER = 3;
  private static final int METHODID_LIST_CUSTOMERS = 4;
  private static final int METHODID_QUERY_CUSTOMERS = 5;
  private static final int METHODID_ASSIGN_CUSTOMER_SEGMENT = 6;
  private static final int METHODID_GET_CUSTOMER_STATISTICS = 7;
  private static final int METHODID_VALIDATE_CUSTOMER = 8;

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
        case METHODID_CREATE_CUSTOMER:
          serviceImpl.createCustomer((kh.edu.istad.contracts.customer.v1.CreateCustomerRequest) request,
              (io.grpc.stub.StreamObserver<kh.edu.istad.contracts.customer.v1.CreateCustomerResponse>) responseObserver);
          break;
        case METHODID_GET_CUSTOMER:
          serviceImpl.getCustomer((kh.edu.istad.contracts.customer.v1.GetCustomerRequest) request,
              (io.grpc.stub.StreamObserver<kh.edu.istad.contracts.customer.v1.GetCustomerResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CUSTOMER:
          serviceImpl.updateCustomer((kh.edu.istad.contracts.customer.v1.UpdateCustomerRequest) request,
              (io.grpc.stub.StreamObserver<kh.edu.istad.contracts.customer.v1.UpdateCustomerResponse>) responseObserver);
          break;
        case METHODID_DELETE_CUSTOMER:
          serviceImpl.deleteCustomer((kh.edu.istad.contracts.customer.v1.DeleteCustomerRequest) request,
              (io.grpc.stub.StreamObserver<kh.edu.istad.contracts.customer.v1.DeleteCustomerResponse>) responseObserver);
          break;
        case METHODID_LIST_CUSTOMERS:
          serviceImpl.listCustomers((kh.edu.istad.contracts.customer.v1.ListCustomersRequest) request,
              (io.grpc.stub.StreamObserver<kh.edu.istad.contracts.customer.v1.ListCustomersResponse>) responseObserver);
          break;
        case METHODID_QUERY_CUSTOMERS:
          serviceImpl.queryCustomers((kh.edu.istad.contracts.customer.v1.QueryCustomersRequest) request,
              (io.grpc.stub.StreamObserver<kh.edu.istad.contracts.customer.v1.QueryCustomersResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_CUSTOMER_SEGMENT:
          serviceImpl.assignCustomerSegment((kh.edu.istad.contracts.customer.v1.AssignCustomerSegmentRequest) request,
              (io.grpc.stub.StreamObserver<kh.edu.istad.contracts.customer.v1.AssignCustomerSegmentResponse>) responseObserver);
          break;
        case METHODID_GET_CUSTOMER_STATISTICS:
          serviceImpl.getCustomerStatistics((kh.edu.istad.contracts.customer.v1.GetCustomerStatisticsRequest) request,
              (io.grpc.stub.StreamObserver<kh.edu.istad.contracts.customer.v1.GetCustomerStatisticsResponse>) responseObserver);
          break;
        case METHODID_VALIDATE_CUSTOMER:
          serviceImpl.validateCustomer((kh.edu.istad.contracts.customer.v1.ValidateCustomerRequest) request,
              (io.grpc.stub.StreamObserver<kh.edu.istad.contracts.customer.v1.ValidateCustomerResponse>) responseObserver);
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
          getCreateCustomerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              kh.edu.istad.contracts.customer.v1.CreateCustomerRequest,
              kh.edu.istad.contracts.customer.v1.CreateCustomerResponse>(
                service, METHODID_CREATE_CUSTOMER)))
        .addMethod(
          getGetCustomerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              kh.edu.istad.contracts.customer.v1.GetCustomerRequest,
              kh.edu.istad.contracts.customer.v1.GetCustomerResponse>(
                service, METHODID_GET_CUSTOMER)))
        .addMethod(
          getUpdateCustomerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              kh.edu.istad.contracts.customer.v1.UpdateCustomerRequest,
              kh.edu.istad.contracts.customer.v1.UpdateCustomerResponse>(
                service, METHODID_UPDATE_CUSTOMER)))
        .addMethod(
          getDeleteCustomerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              kh.edu.istad.contracts.customer.v1.DeleteCustomerRequest,
              kh.edu.istad.contracts.customer.v1.DeleteCustomerResponse>(
                service, METHODID_DELETE_CUSTOMER)))
        .addMethod(
          getListCustomersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              kh.edu.istad.contracts.customer.v1.ListCustomersRequest,
              kh.edu.istad.contracts.customer.v1.ListCustomersResponse>(
                service, METHODID_LIST_CUSTOMERS)))
        .addMethod(
          getQueryCustomersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              kh.edu.istad.contracts.customer.v1.QueryCustomersRequest,
              kh.edu.istad.contracts.customer.v1.QueryCustomersResponse>(
                service, METHODID_QUERY_CUSTOMERS)))
        .addMethod(
          getAssignCustomerSegmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              kh.edu.istad.contracts.customer.v1.AssignCustomerSegmentRequest,
              kh.edu.istad.contracts.customer.v1.AssignCustomerSegmentResponse>(
                service, METHODID_ASSIGN_CUSTOMER_SEGMENT)))
        .addMethod(
          getGetCustomerStatisticsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              kh.edu.istad.contracts.customer.v1.GetCustomerStatisticsRequest,
              kh.edu.istad.contracts.customer.v1.GetCustomerStatisticsResponse>(
                service, METHODID_GET_CUSTOMER_STATISTICS)))
        .addMethod(
          getValidateCustomerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              kh.edu.istad.contracts.customer.v1.ValidateCustomerRequest,
              kh.edu.istad.contracts.customer.v1.ValidateCustomerResponse>(
                service, METHODID_VALIDATE_CUSTOMER)))
        .build();
  }

  private static abstract class CustomerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return kh.edu.istad.contracts.customer.v1.CustomerOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CustomerService");
    }
  }

  private static final class CustomerServiceFileDescriptorSupplier
      extends CustomerServiceBaseDescriptorSupplier {
    CustomerServiceFileDescriptorSupplier() {}
  }

  private static final class CustomerServiceMethodDescriptorSupplier
      extends CustomerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CustomerServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CustomerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomerServiceFileDescriptorSupplier())
              .addMethod(getCreateCustomerMethod())
              .addMethod(getGetCustomerMethod())
              .addMethod(getUpdateCustomerMethod())
              .addMethod(getDeleteCustomerMethod())
              .addMethod(getListCustomersMethod())
              .addMethod(getQueryCustomersMethod())
              .addMethod(getAssignCustomerSegmentMethod())
              .addMethod(getGetCustomerStatisticsMethod())
              .addMethod(getValidateCustomerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
