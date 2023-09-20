package org.example.mongo.resource;


import io.smallrye.mutiny.Uni;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.example.mongo.model.Post;
import org.example.mongo.service.PostService;
import org.jboss.resteasy.reactive.ResponseStatus;

@Path("/comments")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PostResource {

    @Inject
    PostService postService;


    @POST
    public Uni<Response> add(Post post){

        Uni<Post> response = postService.add(post);

        return response.map(item->
                Response.status(Response.Status.CREATED).entity(item).build()
            );
    }


}
