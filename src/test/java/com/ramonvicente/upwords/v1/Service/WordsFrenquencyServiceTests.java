package com.ramonvicente.upwords.v1.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.ramonvicente.upwords.v1.model.ResearchEntry;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WordsFrenquencyServiceTests {

	private WordsFrequencyService wordsFrequencyService;

	@Test
	void shouldReturnTheFrequencyOfTheGivenWord() {
		wordsFrequencyService = new WordsFrequencyService();
		ResearchEntry researchEntry = new ResearchEntry("Word Words Wor word", "Word");
		
		assertEquals(1, wordsFrequencyService.frequencyOfWords(researchEntry));
	}

}
