package com.think.letter.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Letter implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	private Character character;

	private Collection<String> letterGrid = new ArrayList<>();
	
	public Letter(final Character character, final Collection<String> letterGrid) {
		this.character = character;
		this.letterGrid = letterGrid;
	}

	public Collection<String> getLetterGrid() {
		return letterGrid;
	}

	public void setLetterGrid(Collection<String> letterGrid) {
		this.letterGrid = letterGrid;
	}
	
	public Character getCharacter() {
		return character;
	}

	@JsonIgnore
	public Integer getSize() {
		return this.letterGrid.size();
	}
	
	@Override
	public String toString() {
		return letterGrid.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((character == null) ? 0 : character.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Letter other = (Letter) obj;
		if (character == null) {
			if (other.character != null)
				return false;
		} else if (!character.equals(other.character))
			return false;
		return true;
	}
	
}
