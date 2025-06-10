package com.ariabank.ariabankback.dto.converter;



import com.ariabank.ariabankback.dto.ProductoDTO;
import com.ariabank.ariabankback.entities.Cliente;
import com.ariabank.ariabankback.entities.Producto;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.stereotype.Component;



@Component
@RequiredArgsConstructor
public class ProductoDTOConverter {
	
	private final ModelMapper modelMapper;
	
	
	@PostConstruct
	public void init() {
		modelMapper.addMappings(new PropertyMap<Producto, ProductoDTO>() {

			@Override
			protected void configure() {
				map().setCategoria(source.getNombre());
			}
		});
	}
	
	public ProductoDTO convertToDto(Producto producto) {
		return modelMapper.map(producto, ProductoDTO.class);
		
	}

}
