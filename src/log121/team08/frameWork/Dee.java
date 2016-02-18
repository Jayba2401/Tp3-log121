package log121.team08.frameWork;

import java.util.Random;

public class Dee implements Comparable{ 
	
	private int min;
	private int max;
	
	Random rand = new Random();
	//genere un nombre entre min et max
	
	int nombreAleatoire ;
	
	public Dee(){

		
	}

 public Dee(int min, int max){
	 setMin(min);
	 setMax(max);
	 //initialiserIntervaleDes(min, max);
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
		return getNombreAleatoire();
	}

	
	/**
	 * @return the nombreAleatoire
	 */
	public int getNombreAleatoire() {
		nombreAleatoire = rand.nextInt(max - min + 1) + min;
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

	
}
