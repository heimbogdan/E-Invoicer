package ro.helator.einvoicer.entities;

import java.util.List;

public abstract class Client {

	protected String id;

	protected Adresa adresa;
	protected List<Adresa> adreseLivrare;

	public Client() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Adresa getAdresa() {
		return adresa;
	}

	public void setAdresa(Adresa adresa) {
		this.adresa = adresa;
	}

	public List<Adresa> getAdreseLivrare() {
		return adreseLivrare;
	}

	public void setAdreseLivrare(List<Adresa> adreseLivrare) {
		this.adreseLivrare = adreseLivrare;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", adresa=" + adresa + ", adreseLivrare=" + adreseLivrare + "]";
	}

}
