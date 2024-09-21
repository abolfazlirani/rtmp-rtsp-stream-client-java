/*
 * Copyright (C) 2021 pedroSG94.
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
 */

package com.abolfazlirani.rtmp.rtmp.message

import com.abolfazlirani.rtmp.rtmp.chunk.ChunkStreamId
import com.abolfazlirani.rtmp.rtmp.chunk.ChunkType
import com.abolfazlirani.rtmp.utils.readUInt32
import com.abolfazlirani.rtmp.utils.writeUInt32
import java.io.ByteArrayOutputStream
import java.io.InputStream

/**
 * Created by pedro on 21/04/21.
 */
class Abort(private var chunkStreamId: Int = 0):
    RtmpMessage(BasicHeader(ChunkType.TYPE_0, ChunkStreamId.PROTOCOL_CONTROL.mark)) {

  override fun readBody(input: InputStream) {
    chunkStreamId = input.readUInt32()
  }

  override fun storeBody(): ByteArray {
    val byteArrayOutputStream = ByteArrayOutputStream()
    byteArrayOutputStream.writeUInt32(chunkStreamId)
    return byteArrayOutputStream.toByteArray()
  }

  override fun getType(): MessageType = MessageType.ABORT

  override fun getSize(): Int = 4

  override fun toString(): String {
    return "Abort(chunkStreamId=$chunkStreamId)"
  }
}