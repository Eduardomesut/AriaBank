package com.ariabank.ariabankback.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Builder
@Data @NoArgsConstructor @AllArgsConstructor
@Entity
public class Producto {

	@Id
	@GeneratedValue
	private Long id;
	
	private String nombre;
	
	private float precio;
	
	private String imagen;
	
	
	@ManyToOne
	@JoinColumn(name="categoria_id")
	private Categoria categoria;
	
}
