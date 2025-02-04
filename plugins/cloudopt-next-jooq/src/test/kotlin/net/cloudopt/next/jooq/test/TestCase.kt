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
package net.cloudopt.next.jooq.test

import net.cloudopt.next.health.HealthChecksManager
import net.cloudopt.next.jooq.DBHealthIndicator
import net.cloudopt.next.jooq.JooqPlugin
import net.cloudopt.next.web.NextServer
import net.cloudopt.next.health.HealthChecksPlugin


/*
 * @author: Cloudopt
 * @Time: 2018/1/9
 * @Description: Test Case
 */

fun main() {
    NextServer.addPlugin(JooqPlugin())
    HealthChecksManager.register("db", DBHealthIndicator())
    NextServer.addPlugin(HealthChecksPlugin())
    NextServer.run()
}

//class TestCase {
//
//    @Test
//    fun testConnection() {
//        var plugin = JooqPlugin()
//        plugin.start()
//
//    }
//
//}