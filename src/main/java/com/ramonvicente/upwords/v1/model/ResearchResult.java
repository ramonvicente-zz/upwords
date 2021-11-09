package com.ramonvicente.upwords.v1.model;

import java.util.List;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResearchResult {
  
  @NotNull
  private long wordsFrequency;
  @NotNull
  private List<String> similarWords;

  public ResearchResult(long wordsFrequency, List<String> similarWords) {
    this.wordsFrequency = wordsFrequency;
    this.similarWords = similarWords;
  }
  
}
