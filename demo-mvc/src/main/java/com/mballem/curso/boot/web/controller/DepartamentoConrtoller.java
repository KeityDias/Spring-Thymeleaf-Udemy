package com.mballem.curso.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/departamentos")
public class DepartamentoConrtoller {
	
	/**
	 * 
	 * @return /departamento para o diretório templates e
	 * /cadastro para a página;
	 * -Esses caminhos estão sendo referênciados na classe home.html também;
	 */
	@GetMapping("/cadastrar")
	public String cadastrar() {
	return "/departamento/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar () {
		return "/departamento/lista";
	}

}
