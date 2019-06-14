package com.think.letter.config;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {
	
	@NotBlank
	@Length(max = 1)
	private Character fillCharacter;

	public Character getFillCharacter() {
		return fillCharacter;
	}

	public void setFillCharacter(Character fillCharacter) {
		this.fillCharacter = fillCharacter;
	}
}
