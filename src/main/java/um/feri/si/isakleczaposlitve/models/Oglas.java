package um.feri.si.isakleczaposlitve.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Collection;
import java.util.Date;

@Entity
public class Oglas {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@OneToOne(mappedBy = "oglas")
	private Napotnica napotnica;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "podjetje_id", referencedColumnName = "id")
	private Podjetje podjetje;

	@OneToMany(mappedBy = "oglas", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	Collection<Vloga> vloge;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "uporabnik_id")
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JsonIgnore
	Delodajalec delodajalec;

	private double urnaPostavka;

	private String tipDela;

	private Date obdobjeDela;

	private String opisDela;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Podjetje getPodjetje() {
		return podjetje;
	}

	public void setPodjetje(Podjetje podjetje) {
		this.podjetje = podjetje;
	}

	public double getUrnaPostavka() {
		return urnaPostavka;
	}

	public void setUrnaPostavka(double urnaPostavka) {
		this.urnaPostavka = urnaPostavka;
	}

	public String getTipDela() {
		return tipDela;
	}

	public void setTipDela(String tipDela) {
		this.tipDela = tipDela;
	}

	public Date getObdobjeDela() {
		return obdobjeDela;
	}

	public void setObdobjeDela(Date obdobjeDela) {
		this.obdobjeDela = obdobjeDela;
	}

	public String getOpisDela() {
		return opisDela;
	}

	public void setOpisDela(String opisDela) {
		this.opisDela = opisDela;
	}
}