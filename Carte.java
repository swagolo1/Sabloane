package lab1;
import java.util.*;

public class Carte {
	String titlu;
	Autor autor;
	ArrayList<Capitol> vectorCapitol;
	Carte(Autor autor)
	{
		this.autor = autor;
	}
	String getAutor()
	{
		return autor.getNume();
	}
	
///	public static void main(String[] args)
//	{
//		Autor autor = new Autor("Tarba");
//		Carte newBook1 = new Carte(autor);
////		System.out.println(newBook1.getAutor());
//	}
}
