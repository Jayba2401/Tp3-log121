package log121.team08;

import java.util.Scanner;

public class Jeu implements IStrategie{

	static int nbTours;


	public static void main (String[] args){

		int i =0;

		Scanner scan = new Scanner(System.in);
		System.out.print("Combien de tour compter vous jouez ? ");
		nbTours = scan.nextInt();

		while(i != nbTours){

			
			
			
			
			
			
			
			
			i++;
		}







	}



	public void calculerScoreTour(){

	}

	public void calculerLeVainqueur(){

	}

	@Override
	public void calculerLeVainqueur(Jeu jeu) {
		// TODO Auto-generated method stub

	}

	@Override
	public void calculerScoreTour(Jeu jeu) {
		// TODO Auto-generated method stub

	}

	/**
	 * @return the nbTours
	 */
	public int getNbTours() {
		return nbTours;
	}

	/**
	 * @param nbTours the nbTours to set
	 */
	public void setNbTours(int nbTours) {
		this.nbTours = nbTours;
	}


}
