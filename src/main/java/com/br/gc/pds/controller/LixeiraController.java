package com.br.gc.pds.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.br.gc.pds.model.Lixeiras.Lixeira;
import com.br.gc.pds.model.RotaEntity;
import com.br.gc.pds.model.Rotas.Rota;
import com.br.gc.pds.net.Proxy;

@Controller
public class LixeiraController {
	
	@RequestMapping("/listarLixeiras")
	public String listarLixeiras(Model model){
		Proxy proxy = new Proxy();
		List<Lixeira> lixeiras = proxy.buscarLixeira();
		for(Lixeira l : lixeiras){
			System.out.println(l.getLocalizacao());
			System.out.println(l.getPeso());
			System.out.println(l.getStatusCapacidade());
			System.out.println(l.getStatusColeta());
		}
		model.addAttribute("lixeiras",lixeiras);
		return "lixeira/listarLixeiras";
	}
	
	@RequestMapping("/calcularRota")
	public String calcularRota(Model model){
		Proxy proxy = new Proxy();
		List<Rota> listaRota = proxy.calcularRota();	
		model.addAttribute("listaRota",listaRota);
		return"rota/listarRota";
	}
}
