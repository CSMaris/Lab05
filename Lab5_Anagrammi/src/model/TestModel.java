package model;

import java.util.List;

public class TestModel {

	public static void main(String[] args) {
		
		Model model=new Model();
		
		 List<String> listaV=model.getAnagrammiValidi("cane");
		 List<String> listaI=model.getAnagrammiInvalidi("cane");
		 
		 System.out.println(listaV);
		 System.out.println("\n");
		 System.out.println(listaI);
		 
		

	}

}
