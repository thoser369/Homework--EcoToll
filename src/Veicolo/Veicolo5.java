package Veicolo;

public class Veicolo5 extends Veicolo {

	public Veicolo5 (String classe_ambientale, String modello, String marca, String targa, int peso, int anno, int altezza) {
		
		super(classe_ambientale,modello,marca,targa,peso,anno,altezza);
		super.setClasseVeicolo("Classe 5");
		super.setAssi(5);			
	}

	@Override
	public String toString() {
		return "Descrizione Veicolo: \n " + 
				"Classe veicolo: " + super.getClasseVeicolo() + "\n" +
				"Classe ambientale: " + super.getClasseAmbientale() + "\n" +
	            "Modello: " + super.getModello() + "\n" + 
	            "Marca: " + super.getMarca() + "\n" + 
	            "Targa: " + super.getTarga() + "\n" +
	            "Anno di immatricolazione: " + super.getAnno() + "\n" +
	            "Peso: " + super.getPeso() + "\n" +
	            "Altezza(cm): " + super.getAltezza() + "\n" + 
	            "Numero assi: " + super.getAssi();
	            
	}
	
}
