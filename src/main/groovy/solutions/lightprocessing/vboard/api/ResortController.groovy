package solutions.lightprocessing.vboard.api

import org.springframework.stereotype.Controller

import javax.ws.rs.GET
import javax.ws.rs.Path

@Controller
@Path('api/resort')
class ResortController {
    @GET
    String getAll() {
        'all resorts'
    }
}
