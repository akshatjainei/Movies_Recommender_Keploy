package dev.akshat.Movies_Recommender;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private Movie_Repo movie_repository;
    public List<Movie> AllMovies(){
        return movie_repository.findAll();
    }
    public Optional<Movie> singleMovieById(String imdbId){
        return movie_repository.findMovieByimdbId(imdbId);
    }
}
