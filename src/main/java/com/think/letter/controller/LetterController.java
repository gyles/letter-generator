package com.think.letter.controller;

import java.net.URISyntaxException;
import java.util.Collection;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.think.letter.domain.Letter;
import com.think.letter.resource.LetterResource;
import com.think.letter.service.LetterService;

@RestController
@RequestMapping("/api")
public class LetterController {
	
	private final LetterService letterService;
	
	public LetterController(final LetterService letterService) {
		this.letterService = letterService;
	}
	
	@GetMapping("/letters/{letters}")
    public ResponseEntity<Collection<Letter>> getAllSubmissions(@PathVariable String letters, 
    		@RequestParam("size") Integer size) {
        return ResponseEntity.ok().body(letterService.generateLetters(letters, size));
    }
	
	@PostMapping("/letters")
    public ResponseEntity<Collection<Letter>> createSubmission(@Valid @RequestBody LetterResource resource) throws URISyntaxException {
		return ResponseEntity.ok().body(letterService.generateLetters(resource.getLetters(), resource.getSize()));
    }
    

}
