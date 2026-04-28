package com.netflix.model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    // Add this line to fix the compilation error
    List<Movie> findByCategory(String category);
}
