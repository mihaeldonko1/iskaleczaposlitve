package um.feri.si.isakleczaposlitve.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
public class Podjetje {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	@OneToOne(mappedBy = "podjetje")
	private Oglas oglas;
	private String imePodjetja;
	private String lokacija;
	private String TRRpodjetja;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Oglas getOglas() {
		return oglas;
	}

	public void setOglas(Oglas oglas) {
		this.oglas = oglas;
	}

	public String getImePodjetja() {
		return imePodjetja;
	}

	public void setImePodjetja(String imePodjetja) {
		this.imePodjetja = imePodjetja;
	}

	public String getLokacija() {
		return lokacija;
	}

	public void setLokacija(String lokacija) {
		this.lokacija = lokacija;
	}

	public String getTRRpodjetja() {
		return TRRpodjetja;
	}

	public void setTRRpodjetja(String TRRpodjetja) {
		this.TRRpodjetja = TRRpodjetja;
	}
}