package log121.team08.frameWork;

public class Joueur implements Comparable{

	private String nom;
	private int score;

	public Joueur(){
		this.nom = null;
	}

	public Joueur (String nom){
		this.nom = nom;
	}

	
	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public int compareTo(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}


}
