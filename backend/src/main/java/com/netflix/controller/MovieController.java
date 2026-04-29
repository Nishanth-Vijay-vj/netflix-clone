package com.netflix.controller;
import com.netflix.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController @RequestMapping("/api/movies")
@CrossOrigin(origins = "http://13.235.241.23:30080") 
public class MovieController {
    @Autowired private MovieRepository repo;

    @GetMapping
    public List<Movie> getAll() { return repo.findAll(); }

    @GetMapping("/category/{cat}")
    public List<Movie> getByCat(@PathVariable String cat) { 
        return repo.findByCategory(cat); 
    }
}
