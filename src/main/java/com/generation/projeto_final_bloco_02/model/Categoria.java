package com.generation.projeto_final_bloco_02.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O campo 'nome da categoria' é obrigatório")
	@Size(min = 3, max = 100, message = "O atributo 'nome da categoria' deve conter no mínimo 03 e no máximo 100 caracteres!")
	private String nome;

	@NotBlank(message = "O campo 'Descrição' é obrigatório")
	@Size(min = 10, max = 500, message = "O atributo 'descrição' deve conter no mínimo 10 e no máximo 500 caracteres!")
	private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
