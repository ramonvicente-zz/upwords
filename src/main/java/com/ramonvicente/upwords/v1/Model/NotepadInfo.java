package com.ramonvicente.upwords.v1.Model;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotepadInfo {
  
  @NotNull
  private long wordsFrequency;
  @NotNull
  private List<String> similarWords;

  public NotepadInfo(long wordsFrequency, List<String> similarWords) {
    this.wordsFrequency = wordsFrequency;
    this.similarWords = similarWords;
  }
  
}
