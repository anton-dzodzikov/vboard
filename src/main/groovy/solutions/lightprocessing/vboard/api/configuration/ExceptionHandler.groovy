package solutions.lightprocessing.vboard.api.configuration

import solutions.lightprocessing.vboard.api.response.ServiceResponse

import javax.ws.rs.core.Response
import javax.ws.rs.ext.ExceptionMapper

import static javax.ws.rs.core.MediaType.APPLICATION_JSON
import static javax.ws.rs.core.Response.Status.BAD_REQUEST
import static solutions.lightprocessing.vboard.api.response.ResponseStatus.ERROR

class ExceptionHandler implements ExceptionMapper<Exception> {
    @Override
    Response toResponse(Exception e) {
        Response.status(BAD_REQUEST)
                .entity(new ServiceResponse(ERROR, "${e.class.simpleName}: ${e.message}".toString()))
                .type(APPLICATION_JSON)
                .build()
    }
}
