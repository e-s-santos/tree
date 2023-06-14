package com.in.out.tree.controler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in.out.tree.CadArvore;

import jakarta.validation.Valid;
import repository.ArvoreRepo;
import repository.CadArvoreDb;

@RestController
@RequestMapping("/api/arvore")
public class Arvore {
	private ArvoreRepo arvoreRepo;
	@PostMapping
	public ResponseEntity arvore(@RequestBody @Valid CadArvore arvore) {
		System.out.println("- "+arvore.nomeArvore());
		
		CadArvoreDb cadAr = new CadArvoreDb(arvore);
		arvoreRepo.save(cadAr);
		return ResponseEntity.ok("inserido na base") ;
	}
	
	@GetMapping
	public ResponseEntity getArvore() {		
		return null;		
	}
}
