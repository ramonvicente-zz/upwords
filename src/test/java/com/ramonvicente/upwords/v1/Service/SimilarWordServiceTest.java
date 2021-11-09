package com.ramonvicente.upwords.v1.Service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import com.ramonvicente.upwords.v1.Model.Notepad;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SimilarWordServiceTest {

  private SimilarWordService similarWordService;

  @Test
  void shouldReturnTheSimilarityOfWords() {
    similarWordService = new SimilarWordService();
    var notepad = new Notepad("Word Words Wor word", "Word");
    assertEquals(Arrays.asList("Words", "Wor", "word"), 
      similarWordService.findAllSimilarWords(notepad));
  }
  
}
