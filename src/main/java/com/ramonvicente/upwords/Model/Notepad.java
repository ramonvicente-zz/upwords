package com.ramonvicente.upwords.Model;

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
  
}
