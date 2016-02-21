package log121.team8.bunco;

import java.util.Scanner;

import log121.team08.frameWork.CollectionDes;
import log121.team08.frameWork.CollectionJoueur;
import log121.team08.frameWork.Dee;
import log121.team08.frameWork.Joueur;

public class BuncoGame {
	static int NBTOURS = 6;
	int nbJoueur;
	CollectionJoueur colJoueur;
	CollectionDes colDes;
	int i = 0;

	Scanner scan = new Scanner(System.in);
	public  BuncoGame(){
		colJoueur = new CollectionJoueur();
		colDes= new CollectionDes();
		InitialiserJoueur();
		initialiserDes();
		debutPartie();
		
		

	}
	
	
	
	

	
	public void InitialiserJoueur(){
		System.out.print("Le Bunco+ est un jeu qui se joue de 2 a 6 joueurs"
				+ "Combien de joueur etes vous ? :  ");
		nbJoueur = scan.nextInt();
		if (nbJoueur <2 || nbJoueur > 6){

			while (nbJoueur <2 || nbJoueur > 6){
				if (nbJoueur <2){
					System.out.print("Il n'y a pas assez de joueur veuillez"
							+" entrer une autre valeur : ");
				}
				else if (nbJoueur > 6){
					System.out.print("Il y a trop de joueur veuillez"
							+" entrer une autre valeur : ");
				}
				nbJoueur = scan.nextInt();
			
				
			}
			
		}


		for ( int i = 0; i < nbJoueur ; i++){
			Joueur j = new Joueur("Joueur "+String.valueOf(i));
			colJoueur.ajouterJoueurApres(j);
		}
	}

	public void initialiserDes(){
		for (int i = 0;i<3;i++){
			Dee de = new Dee(1,6,6);
			colDes.ajouterDeeDebut(de);
		}

	}
	/**
	 * Methode pour changer de joueur
	 * 
	 */
	public void tourDejeu(int numeroJoueur){
		
		colJoueur.setPosDebut();
		for(int i = 0; i<numeroJoueur ; i++){
			colJoueur.setPosSuivant();
		}
		System.out.print("C'est le tour a "+colJoueur.getElement()+ "de jouer");
	}
	


	public void debutPartie(){
		
		System.out.print("Vous etes "+colJoueur.getNbElements() + "joueurs ");
		
		while (i<NBTOURS){
			
			System.out.print("Appuyer sur ENTER pour brasser les des");
		}
	}

}
