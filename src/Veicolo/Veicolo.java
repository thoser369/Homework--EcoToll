package Veicolo;

public abstract class Veicolo {

	private String classe_veicolo;
	private String classe_ambientale;
	private String modello;
	private String marca;
	private String targa;
	private int assi;
	private int peso;
	private int anno;
	private int altezza;

	public Veicolo(String classe_ambientale, String modello, String marca, 
			String targa, int peso, int anno, int altezza) {
		
		this.classe_ambientale=classe_ambientale;
		this.modello=modello;
		this.marca=marca;
		this.targa=targa;
		this.peso=peso;
		this.anno=anno;
		this.altezza=altezza;
	}
	
	public String getClasseVeicolo() { return this.classe_veicolo; }
	public String setClasseVeicolo(String n) { return this.classe_veicolo=n; }
	
	public String getClasseAmbientale() { return this.classe_ambientale; }
	public String setClasseAmbientale(String n) { return this.classe_ambientale=n; }
	
    public String getModello() { return this.modello; }
	public String setModello(String n) { return this.modello=n; }
	
	public String getMarca() { return this.marca; }
	public String setMarca(String n) { return this.marca=n; }
	
	public String getTarga() { return this.targa; }
	public String setTarga(String n) { return this.targa=n; }
	
	public int getAssi() { return this.assi; }
	public int setAssi(int n) { return this.assi=n; }
	
	public int getPeso() { return this.peso; }
	public int setPeso(int n) { return this.peso=n; }
	
	public int getAnno() { return this.anno; }
	public int seAnno(int n) { return this.anno=n; }
	
	public int getAltezza() { return this.altezza; }
	public int setAltezza(int n) { return this.altezza=n; }

	public abstract String toString();

}
