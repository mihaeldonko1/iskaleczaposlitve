package um.feri.si.isakleczaposlitve.models;

import jakarta.persistence.*;

@Entity
public class CekPlacilo extends Placilo{

	private String ime;

	private String priimek;

	private String bankID;

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

	public String getBankID() {
		return bankID;
	}

	public void setBankID(String bankID) {
		this.bankID = bankID;
	}
}