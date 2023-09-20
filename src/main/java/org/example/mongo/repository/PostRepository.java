package org.example.mongo.repository;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import io.quarkus.mongodb.panache.reactive.ReactivePanacheMongoRepository;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import org.example.mongo.model.Post;

@ApplicationScoped
public class PostRepository implements ReactivePanacheMongoRepository<Post> {

    public Uni<Post> save(Post post){
        return persist(post);
    }
}
