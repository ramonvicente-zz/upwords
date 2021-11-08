package com.ramonvicente.upwords.Service;

import java.util.List;

import com.ramonvicente.upwords.Model.Notepad;

import org.springframework.stereotype.Service;

@Service
public class WordsFrequencyService {

  public long frequencyOfWords(Notepad notepad) {
    List<String> allWords = notepad.getAllWords();

    return allWords.stream()
      .filter(word -> word.equals(notepad.getKeyWord()))
      .count();
  }
  
}
