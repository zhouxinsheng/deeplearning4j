// automatically generated by the FlatBuffers compiler, do not modify

package org.nd4j.graph;

import java.nio.*;
import java.lang.*;
import java.nio.ByteOrder;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class IntPair extends Table {
  public static IntPair getRootAsIntPair(ByteBuffer _bb) { return getRootAsIntPair(_bb, new IntPair()); }
  public static IntPair getRootAsIntPair(ByteBuffer _bb, IntPair obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public IntPair __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int first() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int second() { int o = __offset(6); return o != 0 ? bb.getInt(o + bb_pos) : 0; }

  public static int createIntPair(FlatBufferBuilder builder,
      int first,
      int second) {
    builder.startObject(2);
    IntPair.addSecond(builder, second);
    IntPair.addFirst(builder, first);
    return IntPair.endIntPair(builder);
  }

  public static void startIntPair(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addFirst(FlatBufferBuilder builder, int first) { builder.addInt(0, first, 0); }
  public static void addSecond(FlatBufferBuilder builder, int second) { builder.addInt(1, second, 0); }
  public static int endIntPair(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

