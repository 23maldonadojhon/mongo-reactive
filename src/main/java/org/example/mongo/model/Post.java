package org.example.mongo.model;

import io.quarkus.mongodb.panache.common.MongoEntity;

@MongoEntity(collection="post",database ="post_database")
public record Post(
        Long id,
        String name
) {}
