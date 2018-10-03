
import java.util.*;

public class Serveur {

	List< Client> _mesClient;
	
	public Serveur()
	{
		_mesClient = new ArrayList<Client>();
	}
	
	public boolean connecter(Client cli)
	{
		if(cli != null)
		{
			_mesClient.add(cli);
			cli.setServeur(this);
			return true;
		}
		
		return false;
	}
	
	public void diffuser(String message)
	{
		for(Client c: _mesClient)
		{
			if( !message.contains( c.getNom() ) )
				{
					c.recevoir(message);
				}
		}
		
//		for(int i=0; i<_mesClient.size(); i++)
//		{
//			if( !message.contains( _mesClient.get(i).getNom() ) )
//			{
//				_mesClient.get(i).recevoir(message);
//			}
//		}
	}
	
	public String afficherMessage()
	{
		String message ="";
		
		for(Client c: _mesClient)
			{
				if(c.getMessageR() != null)
				{
					message +=c.getMessageR()+" ---> à "+c.getNom()+"\n";
				}
			
			}
		
		return message;
	}

}
