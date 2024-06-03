// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OgrenciDers.proto

package com.bilgeadam.grpc;

/**
 * Protobuf type {@code OgrenciDersUpdateAddRequest}
 */
public  final class OgrenciDersUpdateAddRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:OgrenciDersUpdateAddRequest)
    OgrenciDersUpdateAddRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OgrenciDersUpdateAddRequest.newBuilder() to construct.
  private OgrenciDersUpdateAddRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OgrenciDersUpdateAddRequest() {
    id_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OgrenciDersUpdateAddRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.bilgeadam.grpc.Ogrenci.Builder subBuilder = null;
            if (ogrenci_ != null) {
              subBuilder = ogrenci_.toBuilder();
            }
            ogrenci_ = input.readMessage(com.bilgeadam.grpc.Ogrenci.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(ogrenci_);
              ogrenci_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            id_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.bilgeadam.grpc.OgrenciDersOuterClass.internal_static_OgrenciDersUpdateAddRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.bilgeadam.grpc.OgrenciDersOuterClass.internal_static_OgrenciDersUpdateAddRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.bilgeadam.grpc.OgrenciDersUpdateAddRequest.class, com.bilgeadam.grpc.OgrenciDersUpdateAddRequest.Builder.class);
  }

  public static final int OGRENCI_FIELD_NUMBER = 1;
  private com.bilgeadam.grpc.Ogrenci ogrenci_;
  /**
   * <code>.Ogrenci ogrenci = 1;</code>
   */
  public boolean hasOgrenci() {
    return ogrenci_ != null;
  }
  /**
   * <code>.Ogrenci ogrenci = 1;</code>
   */
  public com.bilgeadam.grpc.Ogrenci getOgrenci() {
    return ogrenci_ == null ? com.bilgeadam.grpc.Ogrenci.getDefaultInstance() : ogrenci_;
  }
  /**
   * <code>.Ogrenci ogrenci = 1;</code>
   */
  public com.bilgeadam.grpc.OgrenciOrBuilder getOgrenciOrBuilder() {
    return getOgrenci();
  }

  public static final int ID_FIELD_NUMBER = 2;
  private int id_;
  /**
   * <code>int32 id = 2;</code>
   */
  public int getId() {
    return id_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (ogrenci_ != null) {
      output.writeMessage(1, getOgrenci());
    }
    if (id_ != 0) {
      output.writeInt32(2, id_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ogrenci_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getOgrenci());
    }
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, id_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.bilgeadam.grpc.OgrenciDersUpdateAddRequest)) {
      return super.equals(obj);
    }
    com.bilgeadam.grpc.OgrenciDersUpdateAddRequest other = (com.bilgeadam.grpc.OgrenciDersUpdateAddRequest) obj;

    boolean result = true;
    result = result && (hasOgrenci() == other.hasOgrenci());
    if (hasOgrenci()) {
      result = result && getOgrenci()
          .equals(other.getOgrenci());
    }
    result = result && (getId()
        == other.getId());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasOgrenci()) {
      hash = (37 * hash) + OGRENCI_FIELD_NUMBER;
      hash = (53 * hash) + getOgrenci().hashCode();
    }
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.bilgeadam.grpc.OgrenciDersUpdateAddRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bilgeadam.grpc.OgrenciDersUpdateAddRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bilgeadam.grpc.OgrenciDersUpdateAddRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bilgeadam.grpc.OgrenciDersUpdateAddRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bilgeadam.grpc.OgrenciDersUpdateAddRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bilgeadam.grpc.OgrenciDersUpdateAddRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bilgeadam.grpc.OgrenciDersUpdateAddRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bilgeadam.grpc.OgrenciDersUpdateAddRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bilgeadam.grpc.OgrenciDersUpdateAddRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.bilgeadam.grpc.OgrenciDersUpdateAddRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bilgeadam.grpc.OgrenciDersUpdateAddRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bilgeadam.grpc.OgrenciDersUpdateAddRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.bilgeadam.grpc.OgrenciDersUpdateAddRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code OgrenciDersUpdateAddRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:OgrenciDersUpdateAddRequest)
      com.bilgeadam.grpc.OgrenciDersUpdateAddRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.bilgeadam.grpc.OgrenciDersOuterClass.internal_static_OgrenciDersUpdateAddRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.bilgeadam.grpc.OgrenciDersOuterClass.internal_static_OgrenciDersUpdateAddRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.bilgeadam.grpc.OgrenciDersUpdateAddRequest.class, com.bilgeadam.grpc.OgrenciDersUpdateAddRequest.Builder.class);
    }

    // Construct using com.bilgeadam.grpc.OgrenciDersUpdateAddRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (ogrenciBuilder_ == null) {
        ogrenci_ = null;
      } else {
        ogrenci_ = null;
        ogrenciBuilder_ = null;
      }
      id_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.bilgeadam.grpc.OgrenciDersOuterClass.internal_static_OgrenciDersUpdateAddRequest_descriptor;
    }

    @java.lang.Override
    public com.bilgeadam.grpc.OgrenciDersUpdateAddRequest getDefaultInstanceForType() {
      return com.bilgeadam.grpc.OgrenciDersUpdateAddRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.bilgeadam.grpc.OgrenciDersUpdateAddRequest build() {
      com.bilgeadam.grpc.OgrenciDersUpdateAddRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.bilgeadam.grpc.OgrenciDersUpdateAddRequest buildPartial() {
      com.bilgeadam.grpc.OgrenciDersUpdateAddRequest result = new com.bilgeadam.grpc.OgrenciDersUpdateAddRequest(this);
      if (ogrenciBuilder_ == null) {
        result.ogrenci_ = ogrenci_;
      } else {
        result.ogrenci_ = ogrenciBuilder_.build();
      }
      result.id_ = id_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.bilgeadam.grpc.OgrenciDersUpdateAddRequest) {
        return mergeFrom((com.bilgeadam.grpc.OgrenciDersUpdateAddRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.bilgeadam.grpc.OgrenciDersUpdateAddRequest other) {
      if (other == com.bilgeadam.grpc.OgrenciDersUpdateAddRequest.getDefaultInstance()) return this;
      if (other.hasOgrenci()) {
        mergeOgrenci(other.getOgrenci());
      }
      if (other.getId() != 0) {
        setId(other.getId());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.bilgeadam.grpc.OgrenciDersUpdateAddRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.bilgeadam.grpc.OgrenciDersUpdateAddRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.bilgeadam.grpc.Ogrenci ogrenci_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.bilgeadam.grpc.Ogrenci, com.bilgeadam.grpc.Ogrenci.Builder, com.bilgeadam.grpc.OgrenciOrBuilder> ogrenciBuilder_;
    /**
     * <code>.Ogrenci ogrenci = 1;</code>
     */
    public boolean hasOgrenci() {
      return ogrenciBuilder_ != null || ogrenci_ != null;
    }
    /**
     * <code>.Ogrenci ogrenci = 1;</code>
     */
    public com.bilgeadam.grpc.Ogrenci getOgrenci() {
      if (ogrenciBuilder_ == null) {
        return ogrenci_ == null ? com.bilgeadam.grpc.Ogrenci.getDefaultInstance() : ogrenci_;
      } else {
        return ogrenciBuilder_.getMessage();
      }
    }
    /**
     * <code>.Ogrenci ogrenci = 1;</code>
     */
    public Builder setOgrenci(com.bilgeadam.grpc.Ogrenci value) {
      if (ogrenciBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ogrenci_ = value;
        onChanged();
      } else {
        ogrenciBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Ogrenci ogrenci = 1;</code>
     */
    public Builder setOgrenci(
        com.bilgeadam.grpc.Ogrenci.Builder builderForValue) {
      if (ogrenciBuilder_ == null) {
        ogrenci_ = builderForValue.build();
        onChanged();
      } else {
        ogrenciBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Ogrenci ogrenci = 1;</code>
     */
    public Builder mergeOgrenci(com.bilgeadam.grpc.Ogrenci value) {
      if (ogrenciBuilder_ == null) {
        if (ogrenci_ != null) {
          ogrenci_ =
            com.bilgeadam.grpc.Ogrenci.newBuilder(ogrenci_).mergeFrom(value).buildPartial();
        } else {
          ogrenci_ = value;
        }
        onChanged();
      } else {
        ogrenciBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Ogrenci ogrenci = 1;</code>
     */
    public Builder clearOgrenci() {
      if (ogrenciBuilder_ == null) {
        ogrenci_ = null;
        onChanged();
      } else {
        ogrenci_ = null;
        ogrenciBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Ogrenci ogrenci = 1;</code>
     */
    public com.bilgeadam.grpc.Ogrenci.Builder getOgrenciBuilder() {
      
      onChanged();
      return getOgrenciFieldBuilder().getBuilder();
    }
    /**
     * <code>.Ogrenci ogrenci = 1;</code>
     */
    public com.bilgeadam.grpc.OgrenciOrBuilder getOgrenciOrBuilder() {
      if (ogrenciBuilder_ != null) {
        return ogrenciBuilder_.getMessageOrBuilder();
      } else {
        return ogrenci_ == null ?
            com.bilgeadam.grpc.Ogrenci.getDefaultInstance() : ogrenci_;
      }
    }
    /**
     * <code>.Ogrenci ogrenci = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.bilgeadam.grpc.Ogrenci, com.bilgeadam.grpc.Ogrenci.Builder, com.bilgeadam.grpc.OgrenciOrBuilder> 
        getOgrenciFieldBuilder() {
      if (ogrenciBuilder_ == null) {
        ogrenciBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.bilgeadam.grpc.Ogrenci, com.bilgeadam.grpc.Ogrenci.Builder, com.bilgeadam.grpc.OgrenciOrBuilder>(
                getOgrenci(),
                getParentForChildren(),
                isClean());
        ogrenci_ = null;
      }
      return ogrenciBuilder_;
    }

    private int id_ ;
    /**
     * <code>int32 id = 2;</code>
     */
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 2;</code>
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 2;</code>
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:OgrenciDersUpdateAddRequest)
  }

  // @@protoc_insertion_point(class_scope:OgrenciDersUpdateAddRequest)
  private static final com.bilgeadam.grpc.OgrenciDersUpdateAddRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.bilgeadam.grpc.OgrenciDersUpdateAddRequest();
  }

  public static com.bilgeadam.grpc.OgrenciDersUpdateAddRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OgrenciDersUpdateAddRequest>
      PARSER = new com.google.protobuf.AbstractParser<OgrenciDersUpdateAddRequest>() {
    @java.lang.Override
    public OgrenciDersUpdateAddRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OgrenciDersUpdateAddRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OgrenciDersUpdateAddRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OgrenciDersUpdateAddRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.bilgeadam.grpc.OgrenciDersUpdateAddRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

