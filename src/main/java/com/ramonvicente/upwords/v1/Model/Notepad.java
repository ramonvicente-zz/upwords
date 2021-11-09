package com.ramonvicente.upwords.v1.Model;

import java.util.Arrays;
import java.util.List;

import javax.validation.constraints.NotNull;

public class Notepad {
  
  @NotNull
  private String note;
  @NotNull
  private String keyWord;

  public Notepad(String note, String keyWord) {
    this.note = note;
    this.keyWord = keyWord;
  }

  public Notepad() {
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
