// automatically generated by the FlatBuffers compiler, do not modify

package org.nd4j.graph;

import java.nio.*;
import java.lang.*;
import java.nio.ByteOrder;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class FlatDropRequest extends Table {
  public static FlatDropRequest getRootAsFlatDropRequest(ByteBuffer _bb) { return getRootAsFlatDropRequest(_bb, new FlatDropRequest()); }
  public static FlatDropRequest getRootAsFlatDropRequest(ByteBuffer _bb, FlatDropRequest obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public FlatDropRequest __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public long id() { int o = __offset(4); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }

  public static int createFlatDropRequest(FlatBufferBuilder builder,
      long id) {
    builder.startObject(1);
    FlatDropRequest.addId(builder, id);
    return FlatDropRequest.endFlatDropRequest(builder);
  }

  public static void startFlatDropRequest(FlatBufferBuilder builder) { builder.startObject(1); }
  public static void addId(FlatBufferBuilder builder, long id) { builder.addLong(0, id, 0L); }
  public static int endFlatDropRequest(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

