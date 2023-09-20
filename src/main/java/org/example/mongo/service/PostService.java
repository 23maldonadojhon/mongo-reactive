package org.example.mongo.service;

import io.quarkus.mongodb.reactive.ReactiveMongoClient;
import io.quarkus.mongodb.reactive.ReactiveMongoCollection;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.bson.Document;
import org.example.mongo.model.Post;
import org.example.mongo.repository.PostRepository;


@ApplicationScoped
public class PostService {


    @Inject
    PostRepository postRepository;


    public Uni<Post> add(Post post){
        return postRepository.save(post);
    }

    /*
    @Inject
    ReactiveMongoClient reactiveMongoClient;

    public void add(Post post){

        Document document = new Document();

        document.append("id",post.id())
                .append("name",post.name());



    }


    private ReactiveMongoCollection<Document> getCollection() {
        return reactiveMongoClient.getDatabase("post_database").getCollection("post");
    }
     */

}
