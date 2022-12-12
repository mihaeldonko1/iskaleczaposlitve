package um.feri.si.isakleczaposlitve.models;

import jakarta.persistence.*;

@Entity
public class Napotnica{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "iskalec_dela_id", referencedColumnName = "id")
    private Iskalec iskalecDela;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "delodajalec_id", referencedColumnName = "id")
    private Delodajalec delodajalec;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "oglas_id", referencedColumnName = "id")
    private Oglas oglas;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "placilo_id", referencedColumnName = "id")
    private Placilo placilo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Iskalec getIskalecDela() {
        return iskalecDela;
    }

    public void setIskalecDela(Iskalec iskalecDela) {
        this.iskalecDela = iskalecDela;
    }

    public Delodajalec getDelodajalec() {
        return delodajalec;
    }

    public void setDelodajalec(Delodajalec delodajalec) {
        this.delodajalec = delodajalec;
    }

    public Oglas getOglas() {
        return oglas;
    }

    public void setOglas(Oglas oglas) {
        this.oglas = oglas;
    }

    public Placilo getPlacilo() {
        return placilo;
    }

    public void setPlacilo(Placilo placilo) {
        this.placilo = placilo;
    }
}