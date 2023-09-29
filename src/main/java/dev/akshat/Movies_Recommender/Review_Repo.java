package dev.akshat.Movies_Recommender;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Review_Repo extends MongoRepository<Review , ObjectId> {

}
