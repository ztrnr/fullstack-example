package exceptions;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class JerseyExceptionMapper implements ExceptionMapper<CustomException>{
    @Override
    public Response toResponse(CustomException e) {
        return Response.status(e.getStatusCode()).entity(e.getMessage()).type(MediaType.TEXT_PLAIN).build();
    }
}
