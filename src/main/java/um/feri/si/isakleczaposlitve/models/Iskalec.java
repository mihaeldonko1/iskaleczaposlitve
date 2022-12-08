package um.feri.si.isakleczaposlitve.models;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Date;

@Entity
public class Iskalec extends Uporabnik{

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	Collection<Vloga> vloge;

	@OneToOne
	private Napotnica napotnica;
	private String ime;

	private String priimek;

	private Date rojstniDatum;

	private int davcnaStevilka;

	private String TRR;

	private String bivalniNaslov;

	private String telefonskaStevilka;

	private boolean statusStudenta;

	private String nazivSole;

	private String smerStudija;

	private int letnik;

	public Collection<Vloga> getVloge() {
		return vloge;
	}

	public void setVloge(Collection<Vloga> vloge) {
		this.vloge = vloge;
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

	public Date getRojstniDatum() {
		return rojstniDatum;
	}

	public void setRojstniDatum(Date rojstniDatum) {
		this.rojstniDatum = rojstniDatum;
	}

	public int getDavcnaStevilka() {
		return davcnaStevilka;
	}

	public void setDavcnaStevilka(int davcnaStevilka) {
		this.davcnaStevilka = davcnaStevilka;
	}

	public String getTRR() {
		return TRR;
	}

	public void setTRR(String TRR) {
		this.TRR = TRR;
	}

	public String getBivalniNaslov() {
		return bivalniNaslov;
	}

	public void setBivalniNaslov(String bivalniNaslov) {
		this.bivalniNaslov = bivalniNaslov;
	}

	public String getTelefonskaStevilka() {
		return telefonskaStevilka;
	}

	public void setTelefonskaStevilka(String telefonskaStevilka) {
		this.telefonskaStevilka = telefonskaStevilka;
	}

	public boolean isStatusStudenta() {
		return statusStudenta;
	}

	public void setStatusStudenta(boolean statusStudenta) {
		this.statusStudenta = statusStudenta;
	}

	public String getNazivSole() {
		return nazivSole;
	}

	public void setNazivSole(String nazivSole) {
		this.nazivSole = nazivSole;
	}

	public String getSmerStudija() {
		return smerStudija;
	}

	public void setSmerStudija(String smerStudija) {
		this.smerStudija = smerStudija;
	}

	public int getLetnik() {
		return letnik;
	}

	public void setLetnik(int letnik) {
		this.letnik = letnik;
	}
}