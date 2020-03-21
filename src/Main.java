import java.util.ArrayList;

import Autostrada.Autostrada;
import Casello.Casello;
import Pedaggio.Pedaggio;
import Veicolo.Veicolo3;
import Veicolo.Veicolo4;
import Veicolo.Veicolo5;
import Veicolo.VeicoloA;
import Veicolo.VeicoloB;

public class Main {

	public static void main(String[] args) {
		
		//dichiarazioni veicoli
		VeicoloA veicoloA= new VeicoloA("Euro 1", "m1", "Lancia", "AQ100AQ", 100, 2000, 135);
		VeicoloB veicoloB= new VeicoloB("Euro 2", "m2", "Fiat", "AB200BA", 250, 2001, 145);
		VeicoloB veicoloB2= new VeicoloB("Euro 4", "m3", "Toyota", "AC300CA", 100, 2002, 130);
		Veicolo3 veicolo3= new Veicolo3("Euro 5", "m4", "Citroen", "AD400DA", 300, 2003, 145);
		Veicolo4 veicolo4= new Veicolo4("Euro 3", "m5", "Opel", "AE500EA", 500, 2004, 155);
		Veicolo5 veicolo5= new Veicolo5("Euro 6", "m6", "Mercedes", "AF550FA", 950, 2005, 150);
		
		//dichiarazione elenco caselli di 3 autostrade diverse
		ArrayList<Casello> elencocaselli1= new ArrayList<>();
		ArrayList<Casello> elencocaselli24= new ArrayList<>();
		ArrayList<Casello> elencocaselli25= new ArrayList<>();
		
		//dichiarazione autostrade
		Autostrada A1= new Autostrada("A1", 1.2, elencocaselli1);
		Autostrada A24= new Autostrada("A24", 1.5, elencocaselli24);
		Autostrada A25= new Autostrada("A25", 1.0, elencocaselli25);
		
		//dichiarazione caselli- riferimento autostrade dichiarate
		Casello casello1= new Casello("Milano", A1, 200);
		Casello casello2= new Casello("Napoli", A1, 1);
		Casello casello3= new Casello("Firenze", A1, 145);
		Casello casello4= new Casello("Roma", A1, 100);
		
		Casello casello5= new Casello("L'Aquila Ovest", A24, 101);
		Casello casello6= new Casello("L'Aquila Est", A24, 107);
		Casello casello7= new Casello("Teramo", A24, 146);
		
		Casello casello8= new Casello("Sulmona", A25, 137);
		Casello casello9= new Casello("Chieti", A25, 178);
		Casello casello10= new Casello("Pescara", A25, 185);
		
		//aggiunta caselli nelle rispettive autostrade
		elencocaselli1.add(casello1);
		elencocaselli1.add(casello2);
		elencocaselli1.add(casello3);
		elencocaselli1.add(casello4);
		
		elencocaselli24.add(casello5);
		elencocaselli24.add(casello6);
		elencocaselli24.add(casello7);
		
		elencocaselli25.add(casello8);
		elencocaselli25.add(casello9);
		elencocaselli25.add(casello10);
		
		//Calcolo del pedaggio usando tariffe unitarie o ambientali
		Pedaggio p1=new Pedaggio("Classe Unitaria", casello1, casello2, veicoloA);
		Pedaggio p2=new Pedaggio("Classe Ambientale", casello1, casello2, veicoloA);
		Pedaggio p3=new Pedaggio("Classe Unitaria", casello2, casello3, veicoloB);
		Pedaggio p4=new Pedaggio("Classe Ambientale", casello2, casello1, veicoloB2);
		
		Pedaggio p5=new Pedaggio("Classe Unitaria", casello5, casello7, veicoloA);
		Pedaggio p6=new Pedaggio("Classe Ambientale", casello5, casello7, veicoloA);
		Pedaggio p7=new Pedaggio("Classe Ambientale", casello6, casello7, veicolo3);
		
		Pedaggio p8=new Pedaggio("Classe Unitaria", casello8, casello10, veicolo4);
		Pedaggio p9=new Pedaggio("Classe Unitaria", casello8, casello9, veicolo5);
		Pedaggio p10=new Pedaggio("Classe Ambientale", casello10, casello8, veicolo4);
		
		
		//Stampa dei pedaggi calcolati
		System.out.println("Pedaggio p1: "+p1);
		System.out.println("Pedaggio p2: "+p2);
		System.out.println("Pedaggio p3: "+p3);
		System.out.println("Pedaggio p4: "+p4);
		System.out.println("Pedaggio p5: "+p5);
		System.out.println("Pedaggio p6: "+p6);
		System.out.println("Pedaggio p7: "+p7);
		System.out.println("Pedaggio p8: "+p8);
		System.out.println("Pedaggio p9: "+p9);
		System.out.println("Pedaggio p10: "+p10);
	}

}
