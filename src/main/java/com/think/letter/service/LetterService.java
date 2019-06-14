package com.think.letter.service;

import java.util.Collection;

import com.think.letter.domain.Letter;
import com.think.letter.exception.LetterException;

public interface LetterService {

	Collection<Letter> generateLetters(final String input, final int size) throws LetterException;

}
