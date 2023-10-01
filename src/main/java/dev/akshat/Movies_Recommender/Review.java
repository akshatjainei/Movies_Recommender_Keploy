package dev.akshat.Movies_Recommender;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
@Data
@NoArgsConstructor
public class Review {
    @Id
    private ObjectId id;
    private String body;

    public Review(ObjectId id, String body) {
        this.id = id;
        this.body = body;
    }

    public Review(String body) {
        this.body = body;
    }
}
