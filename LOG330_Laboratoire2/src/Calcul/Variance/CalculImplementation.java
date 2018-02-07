package Calcul.Variance;

import java.util.ArrayList;

/**
 * @author HICHAM
 * Description : cette classe permet de verifier les methodes de calcules .
 */

public class CalculImplementation implements InterfaceCalcul{
	
	private double calculeDeMoyenne ;
	private double calculDeVariance ;
	private double calculEcartType ;
	private double Distance;
	private double DistanceCarree ;
	private ArrayList<Integer> DonnerCsv ;

	public CalculImplementation(ArrayList<Integer> donnerCsv) {
		
		this.DonnerCsv = donnerCsv;
	}
	

	public CalculImplementation() {
		super();
		
	}


	@Override
	public double calculeDeMoyenne() {
		double somme = 0 ; 
		
		for (Integer chiffre : DonnerCsv) {
		    somme += chiffre;
		}
		calculeDeMoyenne = somme / DonnerCsv.size();
		
		return  calculeDeMoyenne;
	}

	@Override
	public double calculDeVariance() {

		for (int i = 0; i<DonnerCsv.size();i++) {
			
		    Distance = DonnerCsv.get(i) - calculeDeMoyenne();
			DistanceCarree+= Math.pow(Distance, 2);
		}

		calculDeVariance = 1/ (double)(DonnerCsv.size() - 1)*DistanceCarree;
		
		return calculDeVariance;
	}

	@Override
	public double calculEcartType() {
		
		calculEcartType = Math.sqrt(calculDeVariance);
		
		return calculEcartType;
	}

}
