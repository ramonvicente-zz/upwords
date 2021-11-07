package com.ramonvicente.upwords.Model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Notepad {
  
  private String note;

  public Notepad(String note) {
    this.note = note;
  }
  
}
