
public class Casello {

	private String nome;
	private String riferimento_autostrada;
	private double km;
	
	public Casello(String nome, String riferimento_autostrada, double km) {
		this.nome=nome;
		this.riferimento_autostrada=riferimento_autostrada;
		this.km= km;
	}
	
	public String getNome() { return this.nome; }
	public String setNome(String n) { return this.nome=n; }
	
	public String getRifAutostrada() { return this.riferimento_autostrada; }
	public String setRifAutostrada(String n) { return this.riferimento_autostrada=n; }
	
	public double getKm() { return this.km; }
	public double setKm(double n) { return this.km=n; }
	
	public String toString() {
		return "Descrizione Casello: \n" + 
				"Nome Casello: " + this.nome + "\n" +
				"Autostrada casello: " + this.riferimento_autostrada + "\n" +
	            "Km: " + this.km;
	            
	}

}
