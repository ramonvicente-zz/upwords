package com.ramonvicente.upwords.v1.Controller;

import javax.validation.Valid;

import com.ramonvicente.upwords.v1.Model.Notepad;
import com.ramonvicente.upwords.v1.Model.NotepadInfo;
import com.ramonvicente.upwords.v1.Service.SimilarWordService;
import com.ramonvicente.upwords.v1.Service.WordsFrequencyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/notepad")
public class NotepadController {
  
  @Autowired
  private WordsFrequencyService wordsFrequencyService;
  @Autowired
  private SimilarWordService similarWordService;
  
  @PostMapping(path = "/findInfos")
  public NotepadInfo findFrequencyOfWords(@Valid @RequestBody Notepad request) {
    var frequencyOfWords = this.wordsFrequencyService.frequencyOfWords(request);
    var similarWords = this.similarWordService.findAllSimilarWords(request);
    return new NotepadInfo(frequencyOfWords, similarWords);
  }
}
