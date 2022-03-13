package montagne.ihm;

public class Console {

	public static final String LIGNE_HORIZONTALE = "--------------------------------------------";

	public static void message(String texte) {
		System.out.println(texte);
	}

	public static void titre(String texte) {
		message(LIGNE_HORIZONTALE);
		message(texte);
		message(LIGNE_HORIZONTALE);
	}

}
