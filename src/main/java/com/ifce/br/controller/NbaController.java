package com.ifce.br.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ifce.br.model.Nba;
import com.ifce.br.service.NbaService;

@Controller
public class NbaController {
	
	@Autowired
	private NbaService nbaService;
	
	@GetMapping("/olaMundo")
	public String olaMundo() {
		return "ola-mundo";
	}
	
	@GetMapping("nba/formulario")
	public ModelAndView formulario() {
		ModelAndView mv = new ModelAndView("formulario");
		mv.addObject("nba", new Nba());
		return mv;
	}
	
	@RequestMapping("/nba/salvar")
	public ModelAndView salvar(Nba nba) {
		nbaService.cadastrarNba(nba);
		
		ModelAndView mv = new ModelAndView("redirect:/nba/listar");
		return mv;
	}
	
	@GetMapping("/nba/listar")
	public ModelAndView listarNba() {
		List<Nba> nbas = nbaService.listarNba();
		
		ModelAndView mv = new ModelAndView("listagem-nba");
		
		mv.addObject("listaNba", nbas);
		
		return mv;
	}
	
	@GetMapping("/nba/excluir/{codigo}")
	public ModelAndView excluirNba(@PathVariable Long codigo) {
		nbaService.excluirNba(codigo);
		
		ModelAndView mv = new ModelAndView("redirect:/nba/listar");
		
		return mv;
	}
	
	@RequestMapping("/nba/atualizar/{codigo}")
	public ModelAndView atualizarNba(@PathVariable Long codigo) {
		Optional<Nba> nba = nbaService.atualizarNba(codigo);
		
		ModelAndView mv = new ModelAndView("formulario");
		mv.addObject("nba", nba);
		
		return mv;
		
	}
	
}
