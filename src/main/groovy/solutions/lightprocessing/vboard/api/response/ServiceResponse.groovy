package solutions.lightprocessing.vboard.api.response

class ServiceResponse {
    ResponseStatus status = ResponseStatus.SUCCESS // default response status
    Object body

    ServiceResponse(Object body) {
        this.body = body
    }

    ServiceResponse(ResponseStatus status, Object body) {
        this.status = status
        this.body = body
    }
}
