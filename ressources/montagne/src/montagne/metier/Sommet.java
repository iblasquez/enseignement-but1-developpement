package montagne.metier;

import java.util.Objects;

public class Sommet {

	private final String nom;
	private final Integer altitude;
	private final ChaineDeMontagne chaine;

	public Sommet(String nom, Integer altitude, ChaineDeMontagne chaine) {
		this.nom = nom;
		this.altitude = altitude;
		this.chaine = chaine;
	}

	public String nom() {
		return nom;
	}

	public Integer altitude() {
		return altitude;
	}

	public ChaineDeMontagne chaine() {
		return chaine;
	}

	public String description() {
		return nom + " - altitude : " + altitude + " - " + chaine.nom();
	}


	@Override
	public int hashCode() {
		return Objects.hash(altitude, chaine, nom);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sommet other = (Sommet) obj;
		return Objects.equals(altitude, other.altitude) && chaine == other.chaine && Objects.equals(nom, other.nom);
	}
	
	

}
