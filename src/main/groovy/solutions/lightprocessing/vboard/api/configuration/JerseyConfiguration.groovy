package solutions.lightprocessing.vboard.api.configuration

import org.glassfish.jersey.server.ResourceConfig
import org.springframework.context.annotation.Configuration
import solutions.lightprocessing.vboard.api.ResortController

@Configuration
class JerseyConfiguration extends ResourceConfig {
    JerseyConfiguration() {
        register(ResortController.class)
    }
}
