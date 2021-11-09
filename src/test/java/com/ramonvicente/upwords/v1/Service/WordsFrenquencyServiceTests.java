package com.ramonvicente.upwords.v1.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.ramonvicente.upwords.v1.model.ResearchEntry;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WordsFrenquencyServiceTests {

	@Autowired
	private WordsFrequencyService wordsFrequencyService;

	@Test
	void shouldReturnTheFrequencyOfTheGivenWord() {
		ResearchEntry researchEntry = new ResearchEntry("Word Words Wor word", "Word");
		var frequencyOfWords = wordsFrequencyService.frequencyOfWords(researchEntry);
		
		assertEquals(1, frequencyOfWords);
	}

	@Test
	void shouldReturnZeroWhenResearchEntryHasEmptyKeyWord() {
		ResearchEntry researchEntry = new ResearchEntry("Word Words Wor word", "");
		var frequencyOfWords = wordsFrequencyService.frequencyOfWords(researchEntry);

		assertEquals(0, frequencyOfWords);
	}

	@Test
	void shouldReturnZeroWhenResearchEntryHasBlankKeyWord() {
		ResearchEntry researchEntry = new ResearchEntry("Word Words Wor word", " ");
		var frequencyOfWords = wordsFrequencyService.frequencyOfWords(researchEntry);

		assertEquals(0, frequencyOfWords);
	}

	@Test
	void shouldReturnZeroWhenResearchEntryHasNullKeyWord() {
		ResearchEntry researchEntry = new ResearchEntry("Word Words Wor word", null);
		var frequencyOfWords = wordsFrequencyService.frequencyOfWords(researchEntry);

		assertEquals(0, frequencyOfWords);
	}

	@Test
	void shouldReturnZeroWhenResearchEntryHasNullText() {
		ResearchEntry researchEntry = new ResearchEntry(null, "keyWord");
		var frequencyOfWords = wordsFrequencyService.frequencyOfWords(researchEntry);
		
		assertEquals(0, frequencyOfWords);
	}

	@Test
	void shouldReturnZeroWhenResearchEntryHasEmptyText() {
		ResearchEntry researchEntry = new ResearchEntry("", "keyWord");
		var frequencyOfWords = wordsFrequencyService.frequencyOfWords(researchEntry);
		
		assertEquals(0, frequencyOfWords);
	}

	@Test
	void shouldReturnZeroWhenResearchEntryHasBlankText() {
		ResearchEntry researchEntry = new ResearchEntry(" ", "keyWord");
		var frequencyOfWords = wordsFrequencyService.frequencyOfWords(researchEntry);
		
		assertEquals(0, frequencyOfWords);
	}

}
