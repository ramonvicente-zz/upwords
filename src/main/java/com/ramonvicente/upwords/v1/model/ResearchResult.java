package com.ramonvicente.upwords.v1.model;

import java.util.List;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
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
