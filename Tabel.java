package lab1;

public class Tabel implements SubcapitolComponents{

	String numeTabel;
	
	Tabel(){}
	
	Tabel(String numeTabel){
		this.numeTabel = numeTabel;
	}
	
	@Override
	public String getValue()
	{
		return numeTabel;
	}
	
	@Override
	public void setValue(String numeTabel)
	{
		this.numeTabel = numeTabel;
	}
}
