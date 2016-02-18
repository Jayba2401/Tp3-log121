package log121.team8.bunco;

import java.util.Scanner;

import log121.team08.frameWork.CollectionJoueur;

public class BuncoGame {

	int nbJoueur;
	CollectionJoueur colJoueur;

	Scanner scan = new Scanner(System.in);
	public  BuncoGame(){
		System.out.print("Combien de joueur etes vous ? ");
		nbJoueur = scan.nextInt();

		for ( int i = 0; i < nbJoueur ; i++){
			System.out.print("ok");
			//colJoueur.ajouterJoueur(joueur);
		}



	}




}
