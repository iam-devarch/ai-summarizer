package com.devarch.aisummarizer.service;

import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.Map;

@Service
public class HuggingFaceSummarizationService {

    private static final String API_URL = "https://api-inference.huggingface.co/models/facebook/bart-large-cnn";
    private static final String API_KEY = "replace-token";  // Replace with your actual key

    public String summarizeText(String text) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + API_KEY);
        headers.setContentType(MediaType.APPLICATION_JSON);

        Map<String, String> requestBody = Collections.singletonMap("inputs", text);
        HttpEntity<Map<String, String>> entity = new HttpEntity<>(requestBody, headers);

        ResponseEntity<String> response = restTemplate.exchange(API_URL, HttpMethod.POST, entity, String.class);
        return response.getBody(); // The API returns a JSON response; further parsing may be needed
    }
}
