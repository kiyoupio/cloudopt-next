package net.cloudopt.next.web

import io.vertx.core.Launcher

object NextLauncher {

    @JvmStatic
    fun main(args: Array<String>) {
        val inputs: Array<String> = arrayOf("run", "--redeploy=**/*.class", "--launcher-class=${args[0]}")
        Launcher().dispatch(inputs)
    }

}