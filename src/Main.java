import Veicolo.VeicoloA;

public class Main {

	public static void main(String[] args) {
		
		VeicoloA veicoloA= new VeicoloA("Euro 1", "Mod", "Mar", "Tar", 2, 3, 2);
		Tariffa tariffa= new Tariffa(veicoloA);
		//Pedaggio pedaggio=new Pedaggio(veicoloA);
		System.out.println(tariffa.getTariffaUnitaria() +"\n"+ tariffa.getTariffaAmbientale());
		
	}

}
