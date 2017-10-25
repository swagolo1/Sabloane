package lab1;

public class Imagine implements SubcapitolComponents{

	String numeImagine;

	Imagine(){}
	
	Imagine(String numeImagine)
	{
		this.numeImagine = numeImagine;
	}
	
	@Override
	public String getValue()
	{
		return numeImagine;
	}
	
	@Override
	public void setValue(String numeImagine)
	{
		this.numeImagine = numeImagine;
	}

}