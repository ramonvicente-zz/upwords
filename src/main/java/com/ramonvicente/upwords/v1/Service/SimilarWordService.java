package com.ramonvicente.upwords.v1.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.ramonvicente.upwords.v1.model.ResearchEntry;

import org.springframework.stereotype.Service;
import org.apache.commons.text.similarity.LevenshteinDistance;

@Service
public class SimilarWordService {
  
  public List<String> findAllSimilarWords(ResearchEntry researchEntry) {
    if( researchEntry.getText() == null)
      return Arrays.asList();

    var distance = new LevenshteinDistance();

    return researchEntry.findAllWords()
      .stream()
      .filter(word -> distance.apply(word, researchEntry.getKeyWord()) == 1)
      .collect(Collectors.toList());
  }
}
