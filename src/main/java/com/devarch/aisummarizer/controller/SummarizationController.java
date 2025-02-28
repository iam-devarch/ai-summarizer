package com.devarch.aisummarizer.controller;

import com.devarch.aisummarizer.service.HuggingFaceSummarizationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/summarize")
public class SummarizationController {

    private final HuggingFaceSummarizationService summarizationService;

    public SummarizationController(HuggingFaceSummarizationService summarizationService) {
        this.summarizationService = summarizationService;
    }

    @PostMapping
    public ResponseEntity<String> summarize(@RequestBody Map<String, String> request) {
        String text = request.get("text");
        String summary = summarizationService.summarizeText(text);
        return ResponseEntity.ok(summary);
    }
}