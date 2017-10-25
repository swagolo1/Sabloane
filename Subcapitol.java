package lab1;

import java.util.*;


public class Subcapitol {

	String titlu;
	int nr;
	private int nrMax;
	ArrayList<SubcapitolComponents> vectorSubcapitolComponents; //paragraf, tabel, imagine

	Subcapitol()
	{
		vectorSubcapitolComponents = new ArrayList<SubcapitolComponents>(nrMax);
	}
	
	void setValue()
	{
		vectorSubcapitolComponents.add(new Paragraf("1 paragraf"));
		vectorSubcapitolComponents.add(new Paragraf("2 paragraf"));
		vectorSubcapitolComponents.add(new Imagine("1 imagine"));
		vectorSubcapitolComponents.add(new Paragraf("3 paragraf"));
		vectorSubcapitolComponents.add(new Tabel("1 tabel"));
		vectorSubcapitolComponents.add(new Imagine("2 imagine"));
	}
	
	void getValue()
	{
		Iterator it = vectorSubcapitolComponents.listIterator();
		
		
		for(int i=0; i<vectorSubcapitolComponents.size(); i++)
			System.out.println(vectorSubcapitolComponents.get(i).getValue());
	}
	
	public static void main(String[] args)
	{
		Subcapitol s1 = new Subcapitol();
		s1.setValue();
		s1.getValue();
	}
}
