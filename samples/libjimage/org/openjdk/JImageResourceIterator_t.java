// Generated by jextract

package org.openjdk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*JImageResourceIterator_t)(struct JImageFile* jimage,int (*visitor)(struct JImageFile*,char*,char*,char*,char*,char*,void*),void* arg);
 * }
 */
public interface JImageResourceIterator_t {

    void apply(java.lang.foreign.MemorySegment jimage, java.lang.foreign.MemorySegment visitor, java.lang.foreign.MemorySegment arg);
    static MemorySegment allocate(JImageResourceIterator_t fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$3.const$5, fi, constants$3.const$3, scope);
    }
    static JImageResourceIterator_t ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _jimage, java.lang.foreign.MemorySegment _visitor, java.lang.foreign.MemorySegment _arg) -> {
            try {
                constants$4.const$0.invokeExact(symbol, _jimage, _visitor, _arg);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


