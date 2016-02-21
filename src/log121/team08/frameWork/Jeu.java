package log121.team08.frameWork;

import java.util.Scanner;

import log121.team8.bunco.BuncoGame;

public class Jeu implements IStrategie{
	
	static 

	int i =0;


	public Jeu (){

	}
	



	public static void main (String[] args){
		Jeu jeu = new Jeu();
		int jeu1 = 0;
		BuncoGame bunco;
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
				bunco = new BuncoGame();
				bunco.debutPartie();
				
			}
			else if (jeu1 != 1 ||jeu1 != 0){
				System.out.println("Le chiffre correspond a aucun jeu veullez choisir de nouveau");

			}

			
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
	public void calculerScoreTour(Dee premierDe, Dee deuxiemeDe, Dee troisiemeDe) {
		// TODO Auto-generated method stub
		
	}




}
