// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OgrenciDers.proto

package com.bilgeadam.grpc;

/**
 * Protobuf type {@code OgrenciListResponse}
 */
public  final class OgrenciListResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:OgrenciListResponse)
    OgrenciListResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OgrenciListResponse.newBuilder() to construct.
  private OgrenciListResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OgrenciListResponse() {
    ogrenci_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OgrenciListResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              ogrenci_ = new java.util.ArrayList<com.bilgeadam.grpc.Ogrenci>();
              mutable_bitField0_ |= 0x00000001;
            }
            ogrenci_.add(
                input.readMessage(com.bilgeadam.grpc.Ogrenci.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        ogrenci_ = java.util.Collections.unmodifiableList(ogrenci_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.bilgeadam.grpc.OgrenciDersOuterClass.internal_static_OgrenciListResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.bilgeadam.grpc.OgrenciDersOuterClass.internal_static_OgrenciListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.bilgeadam.grpc.OgrenciListResponse.class, com.bilgeadam.grpc.OgrenciListResponse.Builder.class);
  }

  public static final int OGRENCI_FIELD_NUMBER = 1;
  private java.util.List<com.bilgeadam.grpc.Ogrenci> ogrenci_;
  /**
   * <code>repeated .Ogrenci ogrenci = 1;</code>
   */
  public java.util.List<com.bilgeadam.grpc.Ogrenci> getOgrenciList() {
    return ogrenci_;
  }
  /**
   * <code>repeated .Ogrenci ogrenci = 1;</code>
   */
  public java.util.List<? extends com.bilgeadam.grpc.OgrenciOrBuilder> 
      getOgrenciOrBuilderList() {
    return ogrenci_;
  }
  /**
   * <code>repeated .Ogrenci ogrenci = 1;</code>
   */
  public int getOgrenciCount() {
    return ogrenci_.size();
  }
  /**
   * <code>repeated .Ogrenci ogrenci = 1;</code>
   */
  public com.bilgeadam.grpc.Ogrenci getOgrenci(int index) {
    return ogrenci_.get(index);
  }
  /**
   * <code>repeated .Ogrenci ogrenci = 1;</code>
   */
  public com.bilgeadam.grpc.OgrenciOrBuilder getOgrenciOrBuilder(
      int index) {
    return ogrenci_.get(index);
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
    for (int i = 0; i < ogrenci_.size(); i++) {
      output.writeMessage(1, ogrenci_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < ogrenci_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, ogrenci_.get(i));
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
    if (!(obj instanceof com.bilgeadam.grpc.OgrenciListResponse)) {
      return super.equals(obj);
    }
    com.bilgeadam.grpc.OgrenciListResponse other = (com.bilgeadam.grpc.OgrenciListResponse) obj;

    boolean result = true;
    result = result && getOgrenciList()
        .equals(other.getOgrenciList());
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
    if (getOgrenciCount() > 0) {
      hash = (37 * hash) + OGRENCI_FIELD_NUMBER;
      hash = (53 * hash) + getOgrenciList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.bilgeadam.grpc.OgrenciListResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bilgeadam.grpc.OgrenciListResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bilgeadam.grpc.OgrenciListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bilgeadam.grpc.OgrenciListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bilgeadam.grpc.OgrenciListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bilgeadam.grpc.OgrenciListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bilgeadam.grpc.OgrenciListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bilgeadam.grpc.OgrenciListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bilgeadam.grpc.OgrenciListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.bilgeadam.grpc.OgrenciListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bilgeadam.grpc.OgrenciListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bilgeadam.grpc.OgrenciListResponse parseFrom(
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
  public static Builder newBuilder(com.bilgeadam.grpc.OgrenciListResponse prototype) {
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
   * Protobuf type {@code OgrenciListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:OgrenciListResponse)
      com.bilgeadam.grpc.OgrenciListResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.bilgeadam.grpc.OgrenciDersOuterClass.internal_static_OgrenciListResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.bilgeadam.grpc.OgrenciDersOuterClass.internal_static_OgrenciListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.bilgeadam.grpc.OgrenciListResponse.class, com.bilgeadam.grpc.OgrenciListResponse.Builder.class);
    }

    // Construct using com.bilgeadam.grpc.OgrenciListResponse.newBuilder()
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
        getOgrenciFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (ogrenciBuilder_ == null) {
        ogrenci_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        ogrenciBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.bilgeadam.grpc.OgrenciDersOuterClass.internal_static_OgrenciListResponse_descriptor;
    }

    @java.lang.Override
    public com.bilgeadam.grpc.OgrenciListResponse getDefaultInstanceForType() {
      return com.bilgeadam.grpc.OgrenciListResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.bilgeadam.grpc.OgrenciListResponse build() {
      com.bilgeadam.grpc.OgrenciListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.bilgeadam.grpc.OgrenciListResponse buildPartial() {
      com.bilgeadam.grpc.OgrenciListResponse result = new com.bilgeadam.grpc.OgrenciListResponse(this);
      int from_bitField0_ = bitField0_;
      if (ogrenciBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          ogrenci_ = java.util.Collections.unmodifiableList(ogrenci_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.ogrenci_ = ogrenci_;
      } else {
        result.ogrenci_ = ogrenciBuilder_.build();
      }
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
      if (other instanceof com.bilgeadam.grpc.OgrenciListResponse) {
        return mergeFrom((com.bilgeadam.grpc.OgrenciListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.bilgeadam.grpc.OgrenciListResponse other) {
      if (other == com.bilgeadam.grpc.OgrenciListResponse.getDefaultInstance()) return this;
      if (ogrenciBuilder_ == null) {
        if (!other.ogrenci_.isEmpty()) {
          if (ogrenci_.isEmpty()) {
            ogrenci_ = other.ogrenci_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOgrenciIsMutable();
            ogrenci_.addAll(other.ogrenci_);
          }
          onChanged();
        }
      } else {
        if (!other.ogrenci_.isEmpty()) {
          if (ogrenciBuilder_.isEmpty()) {
            ogrenciBuilder_.dispose();
            ogrenciBuilder_ = null;
            ogrenci_ = other.ogrenci_;
            bitField0_ = (bitField0_ & ~0x00000001);
            ogrenciBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOgrenciFieldBuilder() : null;
          } else {
            ogrenciBuilder_.addAllMessages(other.ogrenci_);
          }
        }
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
      com.bilgeadam.grpc.OgrenciListResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.bilgeadam.grpc.OgrenciListResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.bilgeadam.grpc.Ogrenci> ogrenci_ =
      java.util.Collections.emptyList();
    private void ensureOgrenciIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        ogrenci_ = new java.util.ArrayList<com.bilgeadam.grpc.Ogrenci>(ogrenci_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.bilgeadam.grpc.Ogrenci, com.bilgeadam.grpc.Ogrenci.Builder, com.bilgeadam.grpc.OgrenciOrBuilder> ogrenciBuilder_;

    /**
     * <code>repeated .Ogrenci ogrenci = 1;</code>
     */
    public java.util.List<com.bilgeadam.grpc.Ogrenci> getOgrenciList() {
      if (ogrenciBuilder_ == null) {
        return java.util.Collections.unmodifiableList(ogrenci_);
      } else {
        return ogrenciBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Ogrenci ogrenci = 1;</code>
     */
    public int getOgrenciCount() {
      if (ogrenciBuilder_ == null) {
        return ogrenci_.size();
      } else {
        return ogrenciBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Ogrenci ogrenci = 1;</code>
     */
    public com.bilgeadam.grpc.Ogrenci getOgrenci(int index) {
      if (ogrenciBuilder_ == null) {
        return ogrenci_.get(index);
      } else {
        return ogrenciBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Ogrenci ogrenci = 1;</code>
     */
    public Builder setOgrenci(
        int index, com.bilgeadam.grpc.Ogrenci value) {
      if (ogrenciBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOgrenciIsMutable();
        ogrenci_.set(index, value);
        onChanged();
      } else {
        ogrenciBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Ogrenci ogrenci = 1;</code>
     */
    public Builder setOgrenci(
        int index, com.bilgeadam.grpc.Ogrenci.Builder builderForValue) {
      if (ogrenciBuilder_ == null) {
        ensureOgrenciIsMutable();
        ogrenci_.set(index, builderForValue.build());
        onChanged();
      } else {
        ogrenciBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Ogrenci ogrenci = 1;</code>
     */
    public Builder addOgrenci(com.bilgeadam.grpc.Ogrenci value) {
      if (ogrenciBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOgrenciIsMutable();
        ogrenci_.add(value);
        onChanged();
      } else {
        ogrenciBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Ogrenci ogrenci = 1;</code>
     */
    public Builder addOgrenci(
        int index, com.bilgeadam.grpc.Ogrenci value) {
      if (ogrenciBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOgrenciIsMutable();
        ogrenci_.add(index, value);
        onChanged();
      } else {
        ogrenciBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Ogrenci ogrenci = 1;</code>
     */
    public Builder addOgrenci(
        com.bilgeadam.grpc.Ogrenci.Builder builderForValue) {
      if (ogrenciBuilder_ == null) {
        ensureOgrenciIsMutable();
        ogrenci_.add(builderForValue.build());
        onChanged();
      } else {
        ogrenciBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Ogrenci ogrenci = 1;</code>
     */
    public Builder addOgrenci(
        int index, com.bilgeadam.grpc.Ogrenci.Builder builderForValue) {
      if (ogrenciBuilder_ == null) {
        ensureOgrenciIsMutable();
        ogrenci_.add(index, builderForValue.build());
        onChanged();
      } else {
        ogrenciBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Ogrenci ogrenci = 1;</code>
     */
    public Builder addAllOgrenci(
        java.lang.Iterable<? extends com.bilgeadam.grpc.Ogrenci> values) {
      if (ogrenciBuilder_ == null) {
        ensureOgrenciIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, ogrenci_);
        onChanged();
      } else {
        ogrenciBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Ogrenci ogrenci = 1;</code>
     */
    public Builder clearOgrenci() {
      if (ogrenciBuilder_ == null) {
        ogrenci_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        ogrenciBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Ogrenci ogrenci = 1;</code>
     */
    public Builder removeOgrenci(int index) {
      if (ogrenciBuilder_ == null) {
        ensureOgrenciIsMutable();
        ogrenci_.remove(index);
        onChanged();
      } else {
        ogrenciBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Ogrenci ogrenci = 1;</code>
     */
    public com.bilgeadam.grpc.Ogrenci.Builder getOgrenciBuilder(
        int index) {
      return getOgrenciFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Ogrenci ogrenci = 1;</code>
     */
    public com.bilgeadam.grpc.OgrenciOrBuilder getOgrenciOrBuilder(
        int index) {
      if (ogrenciBuilder_ == null) {
        return ogrenci_.get(index);  } else {
        return ogrenciBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Ogrenci ogrenci = 1;</code>
     */
    public java.util.List<? extends com.bilgeadam.grpc.OgrenciOrBuilder> 
         getOgrenciOrBuilderList() {
      if (ogrenciBuilder_ != null) {
        return ogrenciBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(ogrenci_);
      }
    }
    /**
     * <code>repeated .Ogrenci ogrenci = 1;</code>
     */
    public com.bilgeadam.grpc.Ogrenci.Builder addOgrenciBuilder() {
      return getOgrenciFieldBuilder().addBuilder(
          com.bilgeadam.grpc.Ogrenci.getDefaultInstance());
    }
    /**
     * <code>repeated .Ogrenci ogrenci = 1;</code>
     */
    public com.bilgeadam.grpc.Ogrenci.Builder addOgrenciBuilder(
        int index) {
      return getOgrenciFieldBuilder().addBuilder(
          index, com.bilgeadam.grpc.Ogrenci.getDefaultInstance());
    }
    /**
     * <code>repeated .Ogrenci ogrenci = 1;</code>
     */
    public java.util.List<com.bilgeadam.grpc.Ogrenci.Builder> 
         getOgrenciBuilderList() {
      return getOgrenciFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.bilgeadam.grpc.Ogrenci, com.bilgeadam.grpc.Ogrenci.Builder, com.bilgeadam.grpc.OgrenciOrBuilder> 
        getOgrenciFieldBuilder() {
      if (ogrenciBuilder_ == null) {
        ogrenciBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.bilgeadam.grpc.Ogrenci, com.bilgeadam.grpc.Ogrenci.Builder, com.bilgeadam.grpc.OgrenciOrBuilder>(
                ogrenci_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        ogrenci_ = null;
      }
      return ogrenciBuilder_;
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


    // @@protoc_insertion_point(builder_scope:OgrenciListResponse)
  }

  // @@protoc_insertion_point(class_scope:OgrenciListResponse)
  private static final com.bilgeadam.grpc.OgrenciListResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.bilgeadam.grpc.OgrenciListResponse();
  }

  public static com.bilgeadam.grpc.OgrenciListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OgrenciListResponse>
      PARSER = new com.google.protobuf.AbstractParser<OgrenciListResponse>() {
    @java.lang.Override
    public OgrenciListResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OgrenciListResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OgrenciListResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OgrenciListResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.bilgeadam.grpc.OgrenciListResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

