package com.tp2_neoris.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RespuestaDto {
	
	private int codigo;
	private String mensaje;
	private Object data;
}
