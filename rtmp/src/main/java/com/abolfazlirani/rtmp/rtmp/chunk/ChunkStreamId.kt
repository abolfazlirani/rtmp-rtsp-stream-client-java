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

package com.abolfazlirani.rtmp.rtmp.chunk

/**
 * Created by pedro on 21/04/21.
 */
enum class ChunkStreamId(val mark: Int) {
  PROTOCOL_CONTROL(0x02),
  OVER_CONNECTION(0x03),
  OVER_CONNECTION2(0x04),
  OVER_STREAM(0x05),
  VIDEO(0x06),
  AUDIO(0x07)
}