package com.dipo.ratingsdataservice.resources;

import com.dipo.ratingsdataservice.models.Rating;
import org.springframework.web.bind.annotation.*;

@RestController("/ratingsdata")
public class RatingsResource {

    @GetMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){
        return new Rating(movieId, 4);
    }
}
