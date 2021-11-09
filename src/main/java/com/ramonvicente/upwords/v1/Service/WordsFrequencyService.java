package com.ramonvicente.upwords.v1.service;

import com.ramonvicente.upwords.v1.model.ResearchEntry;

import org.springframework.stereotype.Service;

@Service
public class WordsFrequencyService {

  public long frequencyOfWords(ResearchEntry researchEntry) {
    var allWords = researchEntry.findAllWords();

    return allWords.stream()
      .filter(word -> word.equals(researchEntry.getKeyWord()))
      .count();
  }
  
}
