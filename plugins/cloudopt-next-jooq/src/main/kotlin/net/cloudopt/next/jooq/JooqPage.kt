/*
 * Copyright 2017-2021 Cloudopt
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.cloudopt.next.jooq

import java.io.Serializable

data class JooqPage(
    val count: Int = 0,
    val page: Int = 0,
    val totalPage: Int = 0,
    val totalRow: Long = 0,
    val firstPage: Boolean = true,
    val lastPage: Boolean = true,
    var list: MutableList<*> = mutableListOf<Any>()
) : Serializable
