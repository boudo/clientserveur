
public class Main {


	public static void main(String[] args) {
		
		Client c1 = new Client("JOJO");
		Client c2 = new Client("AREZKI");
		Client c3 = new Client("MOHA");
		Client c5 = new Client("IBRAHIM");
		Serveur s = new Serveur();
		
		c1.seConnecter(s);
		c2.seConnecter(s);
		c3.seConnecter(s);
		
		Client c4 = new Client("ANDY");
		
		c4.seConnecter(s);
		c5.seConnecter(s);
		
		c4.envoyer("Bonjour les amis, allons fumer un join (^_^)");
		System.out.println(s.afficherMessage());
		System.out.println("Va tout seul frère!!! :D");

	}

}
