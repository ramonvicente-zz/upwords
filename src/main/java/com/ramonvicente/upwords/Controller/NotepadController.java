package com.ramonvicente.upwords.Controller;

import javax.validation.Valid;

import com.ramonvicente.upwords.Model.Notepad;
import com.ramonvicente.upwords.Service.WordsFrequencyService;

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
  
  @PostMapping(path = "/frequency")
  public long findFrequencyOfWords(@Valid @RequestBody Notepad request) {
    return this.wordsFrequencyService.frequencyOfWords(request);
  }
}
