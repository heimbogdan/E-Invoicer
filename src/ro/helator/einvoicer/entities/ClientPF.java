package ro.helator.einvoicer.entities;

public class ClientPF extends Client {

	private String nume;
	private String prenume;
	private String cnp;

	public ClientPF() {
		super();
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public String getCnp() {
		return cnp;
	}

	public void setCnp(String cnp) {
		this.cnp = cnp;
	}

	@Override
	public String toString() {
		return "Client_PF [id=" + id + ", nume=" + nume + ", prenume=" + prenume + ", cnp=" + cnp + ", adresa=" + adresa
				+ ", adreseLivrare=" + adreseLivrare + "]";
	}

}
