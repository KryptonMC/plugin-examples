package org.kryptonmc.example;

import com.google.inject.Inject;
import org.apache.logging.log4j.Logger;
import org.kryptonmc.api.Server;
import org.kryptonmc.api.event.Listener;
import org.kryptonmc.api.event.server.ServerStartEvent;
import org.kryptonmc.api.plugin.annotation.Plugin;

// See https://wiki.kryptonmc.org/api/getting-started
@Plugin(
        id = "my-plugin",
        name = "MyPlugin",
        version = "1.0",
        description = "My first ever plugin created for Krypton"
)
public final class MyPlugin {

    private final Server server;
    private final Logger logger;

    @Inject
    public MyPlugin(final Server server, final Logger logger) {
        this.server = server;
        this.logger = logger;
    }

    @Listener
    public void onStart(final ServerStartEvent event) {
        logger.info("Hello there! This is my first plugin!");
    }
}
