package com.example.Journal_OwlNote.Controller;
import com.example.Journal_OwlNote.Model.Response;
import com.example.Journal_OwlNote.repo.RepsonseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("journalResponse")
@CrossOrigin(origins = {"http://localhost:8100"})
public class ResponseController {


    private RepsonseRepository journalRepo;

    @Autowired
    public ResponseController(RepsonseRepository journalRepo){
        this.journalRepo = journalRepo;
    }

    @GetMapping("/response")
    public List<Response> journalresponse(){ return journalRepo.findAll();}

    @GetMapping("/responses/{id}")
    public List<Response> getbyId(@PathVariable long id){ return journalRepo.findAll();}

    @PostMapping("/responses")
    public Response post(@RequestBody Response response) { return journalRepo.save(response); }

   // public List<JournalResponse> postJournalResponse(){ return journalRepo.findAll();}

    @DeleteMapping("/delete")
    public @ResponseBody ResponseEntity<String> delete() {
        return new ResponseEntity<String>("DELETE Response", HttpStatus.OK);
    }
}
