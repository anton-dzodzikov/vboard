package solutions.lightprocessing.vboard.api

import org.springframework.stereotype.Controller
import solutions.lightprocessing.vboard.api.response.ServiceResponse

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Controller
@Path('api/resorts')
class ResortController {
    @GET
    @Path('/')
    @Produces(MediaType.APPLICATION_JSON)
    ServiceResponse getAll() {
        [ 'all resorts' ]
    }
}
