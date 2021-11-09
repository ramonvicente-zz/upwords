package com.ramonvicente.upwords.v1.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ramonvicente.upwords.v1.model.ResearchEntry;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
public class ResearchControllerTests {

	@Autowired
  private MockMvc mockMvc;

  @Test
	void shouldReturnOkWhenPassAValidInfo() throws Exception {
		var researchEntry = new ResearchEntry("Word Word Word word", "Word");

		mockMvc.perform( MockMvcRequestBuilders
			.post("/api/v1/research/findInfos")
			.contentType(MediaType.APPLICATION_JSON)
			.content(new ObjectMapper().writeValueAsString(researchEntry)))
			.andExpectAll(status().isOk());
	}
}
