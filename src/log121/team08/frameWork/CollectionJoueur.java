package log121.team08.frameWork;


public class CollectionJoueur {
	
	
	private class Noeud{

		//La liste peut les utiliser directement via un objet
		//donc pas besoin d'accesseurs et de mutateurs.
		private Joueur element;
		private Noeud suivant;
		private Noeud precedent;	 

		//Constructeur par copie d'attributs.
		private Noeud(Joueur element, Noeud suivant, Noeud precedent){
			this.element = element;
			this. suivant = suivant;
			this.precedent = precedent;
		}
	}
	
	//Pointeur sur le premier et le dernier noeud (null lorsque la liste est vide).
		private Noeud debut;
		private Noeud fin;

		//R�f�rence sur la position o� sont effectu� les op�ration.
		private Noeud positionCourante;	

		//Maintenu � jour apr�s une insertion ou une suppresion.
		private int nbElements;
		
		
		public CollectionJoueur(){

			/**
			 * STRAT�GIE : On initialise explicitement les valeurs plut�t que d'utiliser 
			 * l'initialisation automatique de l'environnement.
			 */

			debut = null;
			fin = null;
			positionCourante = null;
			nbElements = 0;

		}
		
		/**
		 * Retourne si la liste est vide.
		 * 
		 * Ant�c�dent : Aucun.
		 * 
		 * Cons�quent : Aucun.
		 * 
		 * @return Si true la liste est vide et false autrement
		 */
		public boolean estVide(){

			/*
			 * STRAT�GIE : On retourne simplement l'�valuation bool�enne de la
			 *  comparaison du nombre d'�l�ments avec 0.
			 */
			return nbElements == 0;
		}
		//LES M�THODES DE D�PLACEMENT
		/**
		 * Passe la position courante au suivant dans la liste.  
		 * 
		 * Ant�c�dent : Aucun.
		 * 
		 * Cons�quent : La position est d�plac�e sur l'�l�ment suivant s'il existe.
		 * Sinon position courante est �gale au pointeur de  fin .
		 * 
		 *  @throws JavaNullPointerException  
		 */
		public void setPosSuivant() {


			/*
			 * STRAT�GIE : Si c'est la fin, on ne d�place pas, sinon on passe au suivant.
			 */
			if(positionCourante.suivant != null){


				positionCourante = positionCourante.suivant;

			}		 

		}

		/**
		 * Met la position courante au d�but de la  liste.
		 * 
		 * Cons�quent : position == debut.
		 */
		public void setPosDebut() {


			/*
			 * STRAT�GIE : On d�place la position courante au noeud point� par d�but.
			 */
			positionCourante = debut;

		}

		/**
		 * Met la position courante � la fin de la liste.
		 * 
		 * Cons�quent : position == fin.
		 * 
		 */  
		public void setPosFin() {


			/*
			 * STRAT�GIE : on d�place la position courante au noeud point� par fin.
			 */
			positionCourante = fin;


		}

		/**
		 * Passe la position courante au pr�c�dent dans la liste.
		 * 
		 * Ant�c�dent : La liste ne doit pas �tre vide.
		 * 
		 * Cons�quent : La position courante est sur l'�l�ment pr�c�dent s'il existe.
		 * Sinon position courante == debut.
		 * 
		 *  @throws JavaNullPointerException  
		 */
		public void setPosPrecedent(){


			/*
			 *STRAT�GIE : On d�place la position sur son pr�c�dent sauf si au d�but
			 *
			 ***********************************************************/

			//on ne d�place rien si on est au d�but
			if(positionCourante != debut) {


				positionCourante = positionCourante.precedent;		    


			}

		}
	public void ajouterJoueurApres(Joueur joueur){

		if(nbElements == 0 || positionCourante == fin)
			insererJoueurFin(joueur);

		else{

			//Ajuste le pr�c�dent du suivant de la position courante
			/*positionCourante.suivant.precedent = 
					new Noeud(element,positionCourante.suivant,positionCourante);

			//Le suivant de la position courantepointe aussi sur le nouveau noeud
			positionCourante.suivant = positionCourante.suivant.precedent;

			//On place la position courante sur le suivant.
			positionCourante = positionCourante.suivant;*/

			//OU
			Noeud tmp = 
					new Noeud(joueur,positionCourante.suivant,positionCourante);
			//
			positionCourante.suivant.precedent = tmp;
			positionCourante.suivant = tmp;
			positionCourante = tmp;

			//un �l�ment de plus
			nbElements++;		      			 
		}
		
	}
	public void insererJoueurDebut(Joueur joueur){

		/*
		 * STRAT�GIE : On cr�e un noeud en faisant le lien sur l'ancien d�but.  On 
		 * utilise le nombre d'�l�ments pour tester si la liste est vide.  Si c'est le cas,
		 * il faut placer le pointeur de fin.  On place  la position courante sur le
		 * noeud qui vient d'�tre cr��.  On incr�mente le nombre d'�l�ments.
		 */

		//Cr�ation du noeud avec le lien sur l'ancien d�but.
		debut = new Noeud(joueur,debut,null);

		//La liste est vide, on place le pointeur de fin.
		if (nbElements == 0)
			fin = debut;  	     

		//Sinon, il faut ajuste le pr�c�dent de l'ancien d�but
		else
			debut.suivant.precedent = debut;

		//On place la position courante sur le nouveau noeud en t�te de liste.
		positionCourante = debut;

		//Un �l�ment de plus.
		nbElements++;
	}
	public void insererJoueurFin(Joueur joueur){

		/*
		 * STRAT�GIE : On utilise le nombre d'�l�ments pour tester si la liste est
		 *  vide. Si c'est le cas, on utilise la m�thode qui ins�re au d�but.
		 * Sinon, on cr�e un nouveau noeud et on le lie � celui de fin.  On d�place
		 * ensuite le pointeur de fin et la position courante sur le nouveau noeud.
		 * On incr�mente le nombre d'�l�ments.
		 */

		//Si la liste est vide, on ins�re au d�but.
		if(nbElements == 0)
			insererJoueurDebut(joueur);

		//Sinon on ins�re apr�s le dernier.
		else{

			//Cr�ation du nouveau noeud li� apr�s la fin avec cha�nage sur
			//l'ancienne fin
			fin.suivant = new Noeud(joueur,null,fin);

			//D�place le pointeur de fin.
			fin = fin.suivant;

			//Place la position courante � la fin.
			positionCourante = fin;

			//Un �l�ment de plus.
			nbElements++;
		}		 		 
	}
	
	public Joueur getElement(){

		/*STRAT�GIE : Retourne simplement l'�l�ment du noeud � la 
		 * position courante.
		 */
		return positionCourante.element;
	}

	/**
	 * Retourne le nombre d'�l�ments actuellement dans la liste.
	 * 
	 * Ant�c�dent : aucun.
	 * Cons�quent : aucun.
	 * 
	 * @return Le nombre d'�l�ments de la liste.
	 */
	public int getNbElements(){	 

		return nbElements;
	} 
	public void creeIterateur(){
		
	}
}
