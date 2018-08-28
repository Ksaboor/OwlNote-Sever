package com.example.Journal_OwlNote.repo;

import com.example.Journal_OwlNote.Model.Response;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@DataJpaTest
public class JournalRepsonseRepositoryTest {

    @Autowired
    private RepsonseRepository Repository;

    @Test
    public void findByName_thenReturn() {
        String text = "alex";

        // given
        Response journalResponse = new Response(text);
        Repository.save(journalResponse);

        // when
        Response dbJournalResponse = Repository.findById(journalResponse.getId()).get();

        // then
        assertThat(dbJournalResponse.getResponse()).isEqualTo(text);
    }
}