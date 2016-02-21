package log121.team08.frameWork;

import java.util.Random;

public class Dee implements Comparable{ 
	
	private int min;
	private int max;
	private int nbrFace = max;

	Random rand = new Random();
	//genere un nombre entre min et max
	
	int nombreAleatoire = 1;
	
	public Dee(){

		
	}

	
 public Dee(int min, int max, int nbrFace){
	 setMin(min);
	 setMax(max);
	 setNbrFace(max);
	 
 }




	@Override
	public int compareTo(Object o1, Object o2) {

		//Dee 1 = (Dee) o1;
		//Dee 2 = (Dee) o2;


		return 0;
	}


	public void initialiserIntervaleDes(int min, int max){
		this.min = min;
		this.max = max;
	}
	

	public int brasserDes(){
		nombreAleatoire = rand.nextInt(max - min + 1) + min;
		return getNombreAleatoire();
	}

	
	/**
	 * @return the nombreAleatoire
	 */
	public int getNombreAleatoire() {
		
		return nombreAleatoire;
	}

	/**
	 * @return the min
	 */
	public int getMin() {
		return min;
	}

	/**
	 * @param min the min to set
	 */
	public void setMin(int min) {
		this.min = min;
	}

	/**
	 * @return the max
	 */
	public int getMax() {
		return max;
	}

	/**
	 * @param max the max to set
	 */
	public void setMax(int max) {
		this.max = max;
	}


	/**
	 * @return the nbrFace
	 */
	public int getNbrFace() {
		return nbrFace;
	}


	/**
	 * @param nbrFace the nbrFace to set
	 */
	public void setNbrFace(int nbrFace) {
		this.nbrFace = nbrFace;
	}
	

	
}
