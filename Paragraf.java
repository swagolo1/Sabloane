package lab1;

public class Paragraf implements SubcapitolComponents {

	String text;
	
	Paragraf(){}
	
	Paragraf(String text){
		this.text = text;
	}
	
	@Override
	public String getValue()
	{
		return text;
	}
	
	@Override
	public void setValue(String text)
	{
		this.text = text;
	}
}
