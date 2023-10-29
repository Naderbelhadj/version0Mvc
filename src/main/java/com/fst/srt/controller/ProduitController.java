package com.fst.srt.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/produit")
public class ProduitController {
@RequestMapping("/detail")
	public String info(Model model)
	{
	
	String professeur="Nader Belhadj";
	String classe= "Srt en ligne";
	int number =22222222;
	model.addAttribute("prof", professeur);
	model.addAttribute("cl",classe);
	model.addAttribute("num",number);
	
	List <String>names= new ArrayList<>();
	names.add("monta");
	names.add("hatem");
	names.add("malek");
	
	model.addAttribute("noms",names);
		return "data.html";
		
		
	}
@RequestMapping("/informat")
public String information()
{
	return "inf.html";
	}
	
}
