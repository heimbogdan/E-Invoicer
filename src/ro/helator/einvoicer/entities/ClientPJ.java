package ro.helator.einvoicer.entities;

import java.util.List;

public class ClientPJ extends Client {

	private String denumire;
	private String cui;
	private List<ClientPF> delegati;

	private ClientPJ() {
		super();
	}

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public String getCui() {
		return cui;
	}

	public void setCui(String cui) {
		this.cui = cui;
	}

	public List<ClientPF> getDelegati() {
		return delegati;
	}

	public void setDelegati(List<ClientPF> delegati) {
		this.delegati = delegati;
	}

	@Override
	public String toString() {
		return "Client_PJ [id=" + id + ", denumire=" + denumire + ", cui=" + cui + ", delegati=" + delegati
				+ ", adresa=" + adresa + ", adreseLivrare=" + adreseLivrare + "]";
	}

}
