package com.fst.srt;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fst.srt.entities.Category;

@SpringBootApplication
public class Demo1Application {
	public static List<Category> categories = new ArrayList<>();
	public static void main(String[] args) {
		
	
		Category c1=new Category(1,"phones","vente_smartphones");
		Category c2=new Category(2,"refrigerateurs","vente_refrigérateurs");
		Category c3 = new Category(3,"machine","machine_a_laver_semi");
		categories.add(c1);
		categories.add(c2);
		categories.add(c3);
		
		SpringApplication.run(Demo1Application.class, args);
	}

}
