package um.feri.si.isakleczaposlitve.models;

import jakarta.persistence.Entity;

import java.util.Date;

@Entity
public class Denar extends Placilo{

	private Date datumIzplacila;

	private float vsotaIzplacila;


}