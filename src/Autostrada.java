import java.util.ArrayList;

public class Autostrada {

	private String nome;
	private double tariffa;
	private ArrayList<Casello> autostrada= new ArrayList<>();
	
	public Autostrada(String nome, double tariffa, ArrayList<Casello> autostrada) {
		this.nome=nome;
		this.tariffa=tariffa;
		this.autostrada=autostrada;
	}

	public String getNome() { return this.nome; }
	public String setNome(String n) { return this.nome=n; }
	
	public double getTariffa() { return this.tariffa; }
	public double setTariffa(double n) { return this.tariffa=n; }
	
	public ArrayList<Casello> getAutostrada() { return this.autostrada; }
	public ArrayList<Casello> setAutostrada(ArrayList<Casello> n) { return this.autostrada=n; }
	
	public String toString() {
		return "Descrizione Autostrada: \n " + 
				"Nome Autostrada: " + this.nome + "\n" +
				"Tariffa Autostrada: " + this.tariffa + "\n" +
	            "Caselli Autostrada: " + this.autostrada;
	            
	}
}
