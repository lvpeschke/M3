// FRANCOIS

public class Magazine {
	
	private String Rank;
	private String FoR1;
	private String FoR1Name;
	private String FoR2;
	private String FoR2Name;
	private String FoR3;
	private String FoR3Name;
	
	public Magazine(String rank, String foR1, String foR1Name, String foR2, String foR2Name, String foR3, String foR3Name) {
		Rank = rank;
		FoR1 = foR1;
		FoR1Name = foR1Name;
		FoR2 = foR2;
		FoR2Name = foR2Name;
		FoR3 = foR3;
		FoR3Name = foR3Name;
	}

	public String getRank() {
		return Rank;
	}

	public void setRank(String rank) {
		Rank = rank;
	}

	public String getFoR1() {
		return FoR1;
	}

	public void setFoR1(String foR1) {
		FoR1 = foR1;
	}

	public String getFoR1Name() {
		return FoR1Name;
	}

	public void setFoR1Name(String foR1Name) {
		FoR1Name = foR1Name;
	}

	public String getFoR2() {
		return FoR2;
	}

	public void setFoR2(String foR2) {
		FoR2 = foR2;
	}

	public String getFoR2Name() {
		return FoR2Name;
	}

	public void setFoR2Name(String foR2Name) {
		FoR2Name = foR2Name;
	}

	public String getFoR3() {
		return FoR3;
	}

	public void setFoR3(String foR3) {
		FoR3 = foR3;
	}

	public String getFoR3Name() {
		return FoR3Name;
	}

	public void setFoR3Name(String foR3Name) {
		FoR3Name = foR3Name;
	}
	
	public String toString() { // TODO A ameliorer si certains champs sont nuls.
		return "Rank: " + getRank() + "\n" + "FoR1: " + getFoR1() + "\n" + "FoR1Name: " + getFoR1Name() + "\n" + "FoR2: " + getFoR2() + "\n" + "FoR2Name: " + getFoR2Name() + "\n" + "FoR3: " + getFoR3() + "\n" + "FoR3Name: " + getFoR3Name();
	}
}
