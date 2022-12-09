package api;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;
import model.RequestModel;

@Path("/request")
public class RequestApi {
    private RequestSql requestSql;

    
    @Context
    private UriInfo uriInfo;

    public RequestApi() {
        this.RequestSql = new RequestSql();
    }

    @POST
    @Consumes({ MediaType.APPLICATION_JSON })
    @Path("")
    public void postRequest(RequestModel request) throws Exception {
        this.requestSql.insert(request):
    }


    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    @Path("/{id}")
    public RequestModel getRequest(@PathParam("id") int id) throws Exception {
        return this.requestSql.selectRequest(id);
    }

    @PUT
    @Consumes({ MediaType.APPLICATION_JSON })
    @Path("")
    public void putRequest(RequestModel request) throws Exception {
        this.requestSql.updateRequest(request);
    }
}
