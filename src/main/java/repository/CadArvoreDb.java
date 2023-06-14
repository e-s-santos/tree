package repository;

import com.in.out.tree.CadArvore;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="arvore")
@Entity(name="CadArvore")
@Getter //Gera os metodos getters 
@NoArgsConstructor //Constructor default sem argumentos 
@AllArgsConstructor  //Consructor para receber todos os dados 
@EqualsAndHashCode(of="id")
public class CadArvoreDb{
	
	public CadArvoreDb(@Valid CadArvore arvore) {
		this.nomeArvore = arvore.nomeArvore();
		this.nomeCientifico = arvore.nomeCientifico();
		this.larguraTronco = arvore.larguraTronco();
		this.altura = arvore.altura();
		this.longitude = arvore.longitude();
		this.latitude = arvore.latitude();
	}
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	private String nomeArvore;
	private String nomeCientifico;
	private	float larguraTronco;
	private float altura;
	private float longitude;
	private float latitude;
	@Enumerated
	private String statusArvore;

		
		
	
}
