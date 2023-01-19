package com.mballem.curso.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller	
public class HomeController {

	@GetMapping ("/") //Referencia o que temos no contexto da nossa aplicação;
	public String Home() {
		return "/home"; //Nome da página Index da aplicação;
	}
}
