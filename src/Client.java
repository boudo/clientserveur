
public class Client {

	/**
	 * Attributs de Client:
	 * String _nom : le nom de client;
	 * Serveur _serv : le nom de serveur au quel le client est connecté;
	 * String _messageR : le message que le client a reçu;
	 */
	private String _nom;
	private Serveur _serv;
	private String _messageR;
	
	/**
	 * Constructeur
	 * 
	 * @param nom
	 */
	public Client(String nom)
	{
		_nom = nom; // si nom != null
		_serv = null;
	}
	
	/**
	 * seConnecter
	 * 
	 * @param Serveur serv
	 * @return boolean vrai si le client s'est connecter au serveur sinon faux
	 */
	public boolean seConnecter(Serveur serv)
	{
		if(serv != null && serv.connecter(this))
		{
			//_serv = serv;
			return true;
		}
		return false;
	}
	
	
	/**
	 * envoyer
	 * Envoyer un message au serveur
	 * @param message
	 */
	public void envoyer(String message)
	{
		if(_serv != null)
		{
			_serv.diffuser(_nom+": "+message);
		}
	}
	
	/**
	 * recevoir
	 * @param message
	 */
	public void recevoir(String message)
	{
		_messageR = message;
	}
	
	public String getNom()
	{
		return _nom;
	}
	
	public String getMessageR()
	{
		return _messageR;
	}
	
	public void setServeur(Serveur serv)
	{
		_serv = serv;
	}

}
