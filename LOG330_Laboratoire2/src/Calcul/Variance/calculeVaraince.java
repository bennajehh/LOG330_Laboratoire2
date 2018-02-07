
package Calcul.Variance;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * @author HICHAM
 * Description : cette classe permet de verifier les calcules de variance .
 */
public class calculeVaraince {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Préparation des variables pour l'affichage des calcules 
		
		
		ArrayList<Integer> tableau = new ArrayList<>();
		DecimalFormat df = new DecimalFormat("########.0000"); 
		
	   // Ajouter les donnes de test dans le tableau 
		
		tableau.add(186);
		tableau.add(699);
		tableau.add(132);
		tableau.add(272);
		tableau.add(291);
		tableau.add(331);
		tableau.add(199);
		tableau.add(1890);
		tableau.add(788);
		tableau.add(1601);
		
		CalculImplementation implementation = new CalculImplementation(tableau);
		
		// Validation des bonne donnees de sortie 
		
		System.out.println(df.format(implementation.calculDeVariance()));
		System.out.println(df.format(implementation.calculEcartType()));
		System.out.println(df.format(implementation.calculeDeMoyenne()));

	}

}
