package com.in.out.tree;

import jakarta.validation.constraints.NotNull;

import jakarta.validation.constraints.NotBlank;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;

public record CadArvore(
		@NotNull
		@NotBlank
		String nomeArvore, 
		@NotNull
		@NotBlank
		String nomeCientifico, 
		@NotNull
		@DecimalMin(value = "0.01")
		@DecimalMax(value = "200")
		float larguraTronco, 
		@NotNull
		@DecimalMin(value = "0.01")
		@DecimalMax(value = "200")
		float altura,
		@NotNull
		@Digits(fraction = 10, integer = 3)
		float longitude, 
		@NotNull
		@Digits(fraction = 10, integer = 3)
		float latitude) {

}
