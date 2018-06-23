package ro.helator.einvoicer.entities;

public class Adresa {

	private String id;

	private String adresa1;
	private String adresa2;

	public Adresa() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAdresa1() {
		return adresa1;
	}

	public void setAdresa1(String adresa1) {
		this.adresa1 = adresa1;
	}

	public String getAdresa2() {
		return adresa2;
	}

	public void setAdresa2(String adresa2) {
		this.adresa2 = adresa2;
	}

	@Override
	public String toString() {
		return "Adresa [id=" + id + ", adresa1=" + adresa1 + ", adresa2=" + adresa2 + "]";
	}

}
