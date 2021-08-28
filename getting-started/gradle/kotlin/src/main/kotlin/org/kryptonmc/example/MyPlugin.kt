package org.kryptonmc.example

import com.google.inject.Inject
import org.apache.logging.log4j.Logger
import org.kryptonmc.api.Server
import org.kryptonmc.api.event.Listener
import org.kryptonmc.api.event.server.ServerStartEvent
import org.kryptonmc.api.plugin.annotation.Plugin

// See https://wiki.kryptonmc.org/api/getting-started
@Plugin(
    "my-plugin",
    "MyPlugin",
    "1.0",
    "My first ever plugin created for Krypton"
)
class MyPlugin @Inject constructor(
    val server: Server,
    val logger: Logger
) {

    @Listener
    fun onStart(event: ServerStartEvent) {
        logger.info("Hello there! This is my first plugin!")
    }
}
