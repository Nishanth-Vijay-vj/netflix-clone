package com.netflix.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity @Data
public class Movie {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String posterPath; // To store image URL
    private String category;   // Action, Trending, etc.
}
