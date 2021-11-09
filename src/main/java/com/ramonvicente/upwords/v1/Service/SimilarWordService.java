package com.ramonvicente.upwords.v1.Service;

import java.util.List;
import java.util.stream.Collectors;

import com.ramonvicente.upwords.v1.Model.Notepad;

import org.springframework.stereotype.Service;
import org.apache.commons.text.similarity.LevenshteinDistance;

@Service
public class SimilarWordService {
  
  public List<String> findAllSimilarWords(Notepad request) {
    var distance = new LevenshteinDistance();
    return request.findAllWords()
      .stream()
      .filter(word -> distance.apply(word, request.getKeyWord()) == 1)
      .collect(Collectors.toList());
  }
}
