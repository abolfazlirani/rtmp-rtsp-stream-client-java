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

package com.abolfazlirani.rtmp.rtmp.message.command

import com.abolfazlirani.rtmp.rtmp.message.BasicHeader
import com.abolfazlirani.rtmp.rtmp.message.RtmpMessage

/**
 * Created by pedro on 8/04/21.
 *
 * Represent packets like connect, createStream, play, pause...
 * Can be encoded using AMF0 or AMF3
 *
 * TODO use amf3 or amf0 depend of getType method
 */
abstract class Command(var name: String = "", var commandId: Int, private val timeStamp: Int, private val streamId: Int = 0, basicHeader: BasicHeader): RtmpMessage(basicHeader) {

  protected var bodySize = 0

  init {
    header.messageLength = bodySize
    header.timeStamp = timeStamp
    header.messageStreamId = streamId
  }

  abstract fun getStreamId(): Int
  abstract fun getDescription(): String
  abstract fun getCode(): String

  override fun getSize(): Int = bodySize
}