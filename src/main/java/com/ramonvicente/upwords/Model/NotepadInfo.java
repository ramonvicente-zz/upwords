package com.ramonvicente.upwords.Model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class NotepadInfo {
  
  private long wordsFrequency;

  public NotepadInfo(long wordsFrequency) {
    this.wordsFrequency = wordsFrequency;
  }
  
}
