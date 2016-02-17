package log121.team08;

import java.util.Scanner;

public class Jeu implements IStrategie{
	static int nbTours;
	static int jeu1;
	int i =0;

	
	public Jeu (){

	}
	public Jeu (int numero){
		if (numero == 1){
			jeuBunco();
		}
	}



	public static void main (String[] args){

		Jeu jeu;

		Scanner scan = new Scanner(System.in);

		while(jeu1 != 1){
			System.out.println("Choisisez un chiffre correspondant au jeu auquel "
					+ "vous voulez vous jouer ? : \n 1) Bunco+  \n 0) quitter" );
			jeu1 = scan.nextInt();

			if (jeu1 ==0){
				System.out.println("Merci d'avoir jouer");
				break;
			}
			else if (jeu1 == 1){
				System.out.println("Bienvenue au jeu Bunco+");
				jeu = new Jeu(1);
			}
			else if (jeu1 != 1 ||jeu1 != 0){
				System.out.println("Le chiffre correspond a aucun jeu veullez choisir de nouveau");

			}

		}


	}


	public void jeuBunco(){
		
		while(i != nbTours){



			System.out.print("Coucou");





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
