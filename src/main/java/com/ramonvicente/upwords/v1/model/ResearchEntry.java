package com.ramonvicente.upwords.v1.model;

import java.util.Arrays;
import java.util.List;

import javax.validation.constraints.NotNull;

public class ResearchEntry {
  
  @NotNull
  private String note;
  @NotNull
  private String keyWord;

  public ResearchEntry(String note, String keyWord) {
    this.note = note;
    this.keyWord = keyWord;
  }

  public ResearchEntry() {
  }

  public String getNote() {
    return this.note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public String getKeyWord() {
    return this.keyWord;
  }

  public void setKeyWord(String keyWord) {
    this.keyWord = keyWord;
  }

  public List<String> findAllWords() {
    return Arrays.asList(this.note.split("\\W+"));
  }
  
}
