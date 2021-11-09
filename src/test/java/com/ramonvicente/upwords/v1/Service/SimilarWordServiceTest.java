package com.ramonvicente.upwords.v1.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import com.ramonvicente.upwords.v1.model.ResearchEntry;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SimilarWordServiceTest {

  @Autowired
  private SimilarWordService similarWordService;

  @Test
  void shouldReturnTheSimilarityOfWords() {
    var researchEntry = new ResearchEntry("Word Words Wor word", "Word");
    var similarWords = similarWordService.findAllSimilarWords(researchEntry);
    var expectedResult = Arrays.asList("Words", "Wor", "word");
    
    assertEquals(expectedResult, similarWords);
  }

  @Test
  void shouldReturnEmptyListWhenKeyWordHasMoreThanOneLevenshteinDistance() {
    var researchEntry = new ResearchEntry("Word Words Wor word", "Worden");
    var similarWords = similarWordService.findAllSimilarWords(researchEntry);
    var expectedResult = Arrays.asList();
    
    assertEquals(expectedResult, similarWords);
  }

  @Test
  void shouldReturnEmptyListWhenTextIsNull() {
    var researchEntry = new ResearchEntry(null, "Worden");
    var similarWords = similarWordService.findAllSimilarWords(researchEntry);
    var expectedResult = Arrays.asList();
    
    assertEquals(expectedResult, similarWords);
  }
  
}
