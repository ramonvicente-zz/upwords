package com.ramonvicente.upwords.Service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.ramonvicente.upwords.Model.Notepad;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WordsFrenquencyServiceTests {

	private WordsFrequencyService wordsFrequencyService;

	@Test
	void shouldReturnTheFrequencyOfTheGivenWord() {
		wordsFrequencyService = new WordsFrequencyService();
		Notepad notepad = new Notepad("Word Words Wor word", "Word");
		assertEquals(1, wordsFrequencyService.frequencyOfWords(notepad));
	}

}
