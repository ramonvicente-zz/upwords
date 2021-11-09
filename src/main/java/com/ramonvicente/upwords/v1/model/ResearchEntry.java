package com.ramonvicente.upwords.v1.model;

import java.util.Arrays;
import java.util.List;

import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ResearchEntry {
  
  @NotBlank(message = "text field can't be blank, empty or null. " + 
      "Please provide a valid string text.")
  private String text;
  @NotBlank(message = "keyWorkd field can't be blank, or null. " +
      "Please provide a valid string word")
  private String keyWord;

  public ResearchEntry(String text, String keyWord) {
    this.text = text;
    this.keyWord = keyWord;
  }
  
  public List<String> findAllWords() {
    return Arrays.asList(this.text.split("\\W+"));
  }
  
}
