package Pedaggio;
import Casello.Casello;
import Tariffa.Tariffa;
import Veicolo.Veicolo;

public class Pedaggio implements InterfacciaPedaggio{
	
	private String gestionepedaggio;
	private Casello casello_partenza;
	private Casello casello_arrivo;
	private Veicolo veicolo;
	private Tariffa tariffa;
	double pedaggio;

	public Pedaggio(String scelta, Casello cp, Casello ca, Veicolo v) {
		this.gestionepedaggio=scelta;
		this.casello_partenza=cp;
		this.casello_arrivo=ca;
		this.veicolo=v;
		this.tariffa=new Tariffa(this.veicolo);
		if(this.gestionepedaggio.equals("Classe Unitaria")) this.pedaggio=this.calcolo_pedaggio_unitario();
		else this.pedaggio=this.calcolo_pedaggio_ambientale();
    }
	
	

	@Override
	public double calcolo_pedaggio_unitario() {
		double tariffaunitaria, tariffaautostrada, iva, pedaggio;
		double distanza_caselli= this.casello_partenza.getKm()-this.casello_arrivo.getKm();
		
		if(distanza_caselli<0) distanza_caselli= distanza_caselli*(-1);
		
		iva= this.tariffa.getIva();
		
		tariffaunitaria=this.tariffa.getTariffaUnitaria();
		
		tariffaautostrada=this.casello_partenza.getRifAutostrada().getTariffa();
		
		pedaggio=distanza_caselli*(tariffaunitaria + tariffaautostrada);
		pedaggio=pedaggio+(pedaggio * iva / 100);
		pedaggio=(Math.round(pedaggio*100)/100.0);
		return pedaggio;
	}

	@Override
	public double calcolo_pedaggio_ambientale() {
		double tariffaunitaria, tariffaambientale, iva, pedaggio;
		double distanza_caselli= this.casello_partenza.getKm()-this.casello_arrivo.getKm();
		
		if(distanza_caselli<0) distanza_caselli= distanza_caselli*(-1);
		
		iva= this.tariffa.getIva();
		
		tariffaunitaria=this.tariffa.getTariffaUnitaria();
		
		tariffaambientale=this.tariffa.getTariffaAmbientale();
		
		pedaggio=distanza_caselli*(tariffaunitaria + tariffaambientale);
		pedaggio=pedaggio+(pedaggio * iva / 100);
		pedaggio=(Math.round(pedaggio*100)/100.0);
		return pedaggio;
	}
	
	public double getPedaggio() { return this.pedaggio; }
	public double setPedaggio(double n) { return this.pedaggio=n; }
}
