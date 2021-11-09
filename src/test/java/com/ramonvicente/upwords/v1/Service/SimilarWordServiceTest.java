package com.ramonvicente.upwords.v1.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import com.ramonvicente.upwords.v1.model.ResearchEntry;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SimilarWordServiceTest {

  private SimilarWordService similarWordService;

  @Test
  void shouldReturnTheSimilarityOfWords() {
    similarWordService = new SimilarWordService();
    var researchEntry = new ResearchEntry("Word Words Wor word", "Word");
    
    assertEquals(Arrays.asList("Words", "Wor", "word"), 
      similarWordService.findAllSimilarWords(researchEntry));
  }
  
}
