package com.example.Journal_OwlNote.repo;

//import com.example.Journal_OwlNote.Model.JournalResponse;
import com.example.Journal_OwlNote.Model.Response;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepsonseRepository extends JpaRepository<Response, Long> {
}
