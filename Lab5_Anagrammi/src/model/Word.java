package model;

import java.util.ArrayList;
import java.util.List;

public class Word {
	private String value;
	
	private List<Character> listaCaratteri;
	
	
	public Word() {
		listaCaratteri=new ArrayList<>();
		
	}
	
	public Word(String value)
	{
	 this.value=value;
	 listaCaratteri=new ArrayList<>();
	 for (int i = 0; i < value.length(); i++){
		    listaCaratteri.add(value.charAt(i)); 
	 }
	}
	
	
	public Word(Word word)
	{
		StringBuilder sb=new StringBuilder();
		for(char c:word.listaCaratteri)
		{
			sb.append(Character.toString(c));
		}
		
		this.value=sb.toString();
	}
	
	public String getValue()
	{
		return value;
	}
	
	public List<Character> getList()
	{
		return listaCaratteri;
	}
	
	public void addChar(Character ch)
	{
		
		listaCaratteri.add(ch);
		
	}
	
	public void removeLast()
	{
		listaCaratteri.remove(listaCaratteri.size()-1);
	}

	public String toString() {
	return this.value;
	
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
	
	
	

}
