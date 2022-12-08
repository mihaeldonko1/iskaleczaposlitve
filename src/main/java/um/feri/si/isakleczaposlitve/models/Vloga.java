package um.feri.si.isakleczaposlitve.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Date;

@Entity
public class Vloga {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "oglas_id")
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JsonIgnore
	Oglas oglas;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "uporabnik_id")
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JsonIgnore
    Iskalec iskalecDela;

	private Date casOddaje;

	private String zivljenjepis;


	public Vloga() {
	}
}