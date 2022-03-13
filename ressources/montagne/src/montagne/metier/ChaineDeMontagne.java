package montagne.metier;

public enum ChaineDeMontagne {

	MASSIF_CENTRAL("Massif Central"), MONTBLANC("Massif du Mont Blanc"), PYRENEES("Pyrénées"),
	VOSGES("Massif des Vosges");

	private final String nom;

	ChaineDeMontagne(String nom) {
		this.nom = nom;
	}

	public final String nom() {
		return nom;
	}

}
