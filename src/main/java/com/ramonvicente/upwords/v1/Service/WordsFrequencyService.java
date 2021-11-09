package com.ramonvicente.upwords.v1.Service;

import java.util.Arrays;

import com.ramonvicente.upwords.v1.Model.Notepad;

import org.springframework.stereotype.Service;

@Service
public class WordsFrequencyService {

  public long frequencyOfWords(Notepad notepad) {
    var allWords = Arrays.asList(notepad.getNote().split("\\W+"));

    return allWords.stream()
      .filter(word -> word.equals(notepad.getKeyWord()))
      .count();
  }
  
}
