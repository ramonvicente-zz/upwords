package com.ramonvicente.upwords.v1.controller;

import javax.validation.Valid;

import com.ramonvicente.upwords.v1.model.ResearchEntry;
import com.ramonvicente.upwords.v1.model.ResearchResult;
import com.ramonvicente.upwords.v1.service.SimilarWordService;
import com.ramonvicente.upwords.v1.service.WordsFrequencyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/research")
public class ResearchController {
  
  @Autowired
  private WordsFrequencyService wordsFrequencyService;
  @Autowired
  private SimilarWordService similarWordService;
  
  @PostMapping(path = "/findInfos")
  public ResearchResult findFrequencyOfWords(@Valid @RequestBody ResearchEntry request) {
    var frequencyOfWords = this.wordsFrequencyService.frequencyOfWords(request);
    var similarWords = this.similarWordService.findAllSimilarWords(request);

    return new ResearchResult(frequencyOfWords, similarWords);
  }
}
