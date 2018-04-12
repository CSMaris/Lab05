package model;

 import java.util.ArrayList;
 import java.util.List;

 public class Ricorsione {
	
 public List<Word> soluzione;
	
	
   public List<Word> anagramma(String parola)
   {
	soluzione=new ArrayList<>();
	boolean flag;
	recursive(new Word(parola),new Word() ,0 );
	List<Word> soluzioneFinale=new ArrayList<>();
	
	for(Word w:soluzione)
	{
		flag=true;
		for(Word word: soluzioneFinale)
		{
			if(word.equals(w))
				flag=false;
		}
		
		if(flag)
			soluzioneFinale.add(w);
	}
	
	return soluzioneFinale;
	
    }
	
   
	private void recursive(Word parola, Word parziale, int livello)
	{
		if(livello==parola.getValue().length())
		{
			soluzione.add(new Word(parziale));
			return;
		}
		
		List<Character> lista=parola.getList();
		
		for(Character c:lista)
		{
			if(wordOK(parziale, parola, c))
			{
			parziale.addChar(c);
			recursive(parola, parziale, livello+1);
			parziale.removeLast();
			}
				
		}
	}
	
	private boolean wordOK(Word parziale, Word parola, Character c)
	{
	boolean flag=true;
	int contaC=0;
	for(Character ch:parziale.getList())
	{
		if(c.equals(ch))
			flag=false;
	}
	if(flag)
		return flag;
	
	for(Character ch:parola.getList())
	{
		if(c.equals(ch))
			contaC++;
	}
	
	
	for(Character ch:parziale.getList())
	{
		if(c.equals(ch))
			contaC--;	
	}
	
	if(contaC>0)
		return true;
	else
	{
		return false;
	}
	}
}
