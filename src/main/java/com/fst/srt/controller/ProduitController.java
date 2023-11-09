package com.fst.srt.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fst.srt.entities.Category;
import static com.fst.srt.Demo1Application.categories;
@Controller
@RequestMapping("/produit")
public class ProduitController {
@GetMapping("detail") //sert à l'affichage
    //@ResponseBody
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
		
		
		
			model.addAttribute("categories",categories);
			
		return "data.html";
		
		
	}
@GetMapping("/informat")
public String information()
{
	return "inf.html";
	}

@PostMapping("/informat")
public String ajouter(@RequestParam("id") int id, @RequestParam("nom")String nom, 
		@RequestParam("description") String description)
{
	Category c=new Category(id,nom,description);
	categories.add(c);
	return "redirect:detail";
	
}
}


