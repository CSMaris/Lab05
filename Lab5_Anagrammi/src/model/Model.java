package model;

import java.util.ArrayList;
import java.util.List;

public class Model {
	private DAO dao;
	private Ricorsione ricorsione;
	private List<String> listaValide;
	private List<String> listaInvalide;
	
	public Model() {
		dao=new DAO();
		ricorsione=new Ricorsione();
		listaValide=new ArrayList<>();
		listaInvalide=new ArrayList<>();
	}
	
	public void AnagrammiV(String str)
	{
		List<Word> lista=ricorsione.anagramma(str);
		for(Word w:lista)
		{
			if(dao.verificaValidita(w.getValue()))
				listaValide.add(w.getValue());
		}
	}
	
	public void AnagrammiI(String str)
	{
		List<Word> lista=ricorsione.anagramma(str);
		for(Word w:lista)
		{
			if(!dao.verificaValidita(w.getValue()))
				listaInvalide.add(w.getValue());
		}
	}
	
	
	
	public List<String> getAnagrammiValidi(String str)
	{
		listaValide.clear();
		this.AnagrammiV(str);
		return listaValide;
	}
	
	public List<String> getAnagrammiInvalidi(String str)
	{
		listaInvalide.clear();
		this.AnagrammiI(str);
		return listaInvalide;
	}
	
	
	
	
	
	
	
	

}
