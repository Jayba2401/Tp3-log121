package log121.team8.bunco;

import java.util.Scanner;

import log121.team08.frameWork.CollectionDes;
import log121.team08.frameWork.CollectionJoueur;

public class BuncoGame {

	int nbJoueur;
	CollectionJoueur colJoueur;
	CollectionDes colDes;
	
	
	Scanner scan = new Scanner(System.in);
	public  BuncoGame(){
		InitialiserJoueur();
		initialiserDes();


	}


	public void InitialiserJoueur(){
		System.out.print("Combien de joueur etes vous ? ");
		nbJoueur = scan.nextInt();

		
		for ( int i = 0; i < nbJoueur ; i++){
			System.out.print("ok");
			colJoueur.ajouterJoueur(joueur);
		}
	}
	
	public void initialiserDes(){
		colDes.ajouterDe(de);
		colDes.ajouterDe(de);
		colDes.ajouterDe(de);
	}
	
	

}
