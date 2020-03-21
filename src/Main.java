import java.util.ArrayList;

import Autostrada.Autostrada;
import Casello.Casello;
import Pedaggio.Pedaggio;
import Tariffa.Tariffa;
import Veicolo.VeicoloA;

public class Main {

	public static void main(String[] args) {
		
		VeicoloA veicoloA= new VeicoloA("Euro 1", "Mod", "Mar", "Tar", 2, 3, 2);
		Tariffa tariffa= new Tariffa(veicoloA);
		//Pedaggio pedaggio=new Pedaggio(veicoloA);
		System.out.println(tariffa.getTariffaUnitaria() +"\n"+ tariffa.getTariffaAmbientale());
		
		ArrayList<Casello> elencocaselli= new ArrayList<>();
		
		Autostrada A1= new Autostrada("A1", 0.5, elencocaselli);
		
		Casello casello1= new Casello("Milano", A1, 20);
		Casello casello2= new Casello("Napoli", A1, 200);
		elencocaselli.add(casello1);
		elencocaselli.add(casello2);	
		
		System.out.println(casello1.toString());
		System.out.println(A1.toString());
		
		Pedaggio p=new Pedaggio("Classe Unitaria", casello1, casello2, veicoloA);
		System.out.println(p.getPedaggio());
		
	}

}
