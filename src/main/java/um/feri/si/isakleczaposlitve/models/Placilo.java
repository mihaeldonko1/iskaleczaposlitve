package um.feri.si.isakleczaposlitve.models;

import jakarta.persistence.*;

@Entity
public class Placilo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	public float vsotaDenarja;

	@OneToOne(mappedBy = "placilo")
	private Napotnica napotnica;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public float getVsotaDenarja() {
		return vsotaDenarja;
	}

	public void setVsotaDenarja(float vsotaDenarja) {
		this.vsotaDenarja = vsotaDenarja;
	}
}