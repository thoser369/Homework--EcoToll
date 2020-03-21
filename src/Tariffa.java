import Veicolo.Veicolo;

public class Tariffa {
	
	private int iva=22;
	private double tariffaunitaria;
	private double tariffaambientale;

	public Tariffa(Veicolo veicolo) {
		String classe_veicolo= veicolo.getClasseVeicolo();
		String classe_ambientale= veicolo.getClasseAmbientale();
		
		switch(classe_veicolo) {
		case "Classe A":
			this.tariffaunitaria=0.10;
			break;
			
		case "Classe B":
			this.tariffaunitaria=0.20;
			break;
			
		case "Classe 3":
			this.tariffaunitaria=0.30;
			break;
			
		case "Classe 4":
			this.tariffaunitaria=0.40;
			break;
			
		case "Classe 5":
			this.tariffaunitaria=0.50;
			break;
		}
		
		switch(classe_ambientale) {
		case "Euro 1":
			this.tariffaambientale=1.00;
			break;
			
		case "Euro 2":
			this.tariffaambientale=2.00;
			break;
			
		case "Euro 3":
			this.tariffaambientale=3.00;
			break;
			
		case "Euro 4":
			this.tariffaambientale=4.50;
			break;
			
		case "Euro 5":
			this.tariffaambientale=6.50;
			break;
			
		case "Euro 6":
			this.tariffaambientale=9.00;
			break;
		}
	}
	
	public int getIva() { return this.iva; }
	public int setIva(int n) { return this.iva=n; }
	
	public double getTariffaUnitaria() { return this.tariffaunitaria; }
	public double setTariffaUnitaria(double n) { return this.tariffaunitaria=n; }
	
	public double getTariffaAmbientale() { return this.tariffaambientale; }
	public double setTariffaAmbientale(double n) { return this.tariffaambientale=n; }

}
