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




}