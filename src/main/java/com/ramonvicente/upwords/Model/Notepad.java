package com.ramonvicente.upwords.Model;

import java.util.Arrays;
import java.util.List;

public class Notepad {

  private String note;
  private String keyWord;

  public Notepad(String note, String keyWord) {
    this.note = note;
    this.keyWord = keyWord;
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

  public List<String> getAllWords() {
    return Arrays.asList(note.split("\\W+"));
  }
  
}
