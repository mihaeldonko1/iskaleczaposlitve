package um.feri.si.isakleczaposlitve.models;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Delodajalec extends Uporabnik{

	@OneToMany(mappedBy = "delodajalec", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	Collection<Oglas> oglas;

	@OneToOne(mappedBy = "delodajalec")
	private Napotnica napotnica;
	private String ime;

	private String priimek;



	public Collection<Oglas> getOglas() {
		return oglas;
	}

	public void setOglas(Collection<Oglas> oglas) {
		this.oglas = oglas;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPriimek() {
		return priimek;
	}

	public void setPriimek(String priimek) {
		this.priimek = priimek;
	}
}