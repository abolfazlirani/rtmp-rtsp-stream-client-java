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

package com.abolfazlirani.rtmp.rtmp.message.shared

import com.abolfazlirani.rtmp.rtmp.chunk.ChunkStreamId
import com.abolfazlirani.rtmp.rtmp.chunk.ChunkType
import com.abolfazlirani.rtmp.rtmp.message.BasicHeader
import com.abolfazlirani.rtmp.rtmp.message.RtmpMessage
import java.io.InputStream

/**
 * Created by pedro on 21/04/21.
 */
abstract class SharedObject: RtmpMessage(BasicHeader(ChunkType.TYPE_0, ChunkStreamId.PROTOCOL_CONTROL.mark)) {
  override fun readBody(input: InputStream) {
    TODO("Not yet implemented")
  }

  override fun storeBody(): ByteArray {
    TODO("Not yet implemented")
  }

  override fun getSize(): Int {
    TODO("Not yet implemented")
  }
}