package prova;

public class Xml {
	private String tag;
	private String character;
	private String traI2;
	private boolean inizio =false;
	
	public void setInizio ()
	{
		inizio=true;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public void setCharacter(String character) {
		this.character = character;
	}
	public void setTraI2(String traI2) {
		this.traI2 = traI2;
	}
	@Override
	public String toString() {
		StringBuffer tmp=new StringBuffer();
		if (inizio==false)
		{
			tmp.append("</");
			tmp.append(tag);
			tmp.append(">");
		}
		else
		{
			tmp.append("<");
			tmp.append(tag);
			if (character !=null)
				tmp.append("-"+character+"-");
			tmp.append(">");
			if (traI2 !=null)
			{
				tmp.append(" "+traI2);
			}
			
		}
			return tmp.toString();
	}
	
	

}
