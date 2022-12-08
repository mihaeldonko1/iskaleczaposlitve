package um.feri.si.isakleczaposlitve.models;

import jakarta.persistence.Entity;

@Entity
public class NakaziloNaTRR extends Placilo{

	private String TRR;

	private String imeBanke;

	private String bankID;

	public String getTRR() {
		return TRR;
	}

	public void setTRR(String TRR) {
		this.TRR = TRR;
	}

	public String getImeBanke() {
		return imeBanke;
	}

	public void setImeBanke(String imeBanke) {
		this.imeBanke = imeBanke;
	}

	public String getBankID() {
		return bankID;
	}

	public void setBankID(String bankID) {
		this.bankID = bankID;
	}
}