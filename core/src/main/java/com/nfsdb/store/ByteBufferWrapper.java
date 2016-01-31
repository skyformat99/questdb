/*******************************************************************************
 *  _  _ ___ ___     _ _
 * | \| | __/ __| __| | |__
 * | .` | _|\__ \/ _` | '_ \
 * |_|\_|_| |___/\__,_|_.__/
 *
 * Copyright (c) 2014-2016. The NFSdb project and its contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package com.nfsdb.store;

import com.nfsdb.misc.ByteBuffers;

import java.nio.MappedByteBuffer;

class ByteBufferWrapper {
    private final long offset;
    private MappedByteBuffer byteBuffer;

    public ByteBufferWrapper(long offset, MappedByteBuffer byteBuffer) {
        this.offset = offset;
        this.byteBuffer = byteBuffer;
    }

    public MappedByteBuffer getByteBuffer() {
        return byteBuffer;
    }

    public long getOffset() {
        return offset;
    }

    public void release() {
        byteBuffer = ByteBuffers.release(byteBuffer);
    }
}
