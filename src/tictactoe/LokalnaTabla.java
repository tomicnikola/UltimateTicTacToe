package tictactoe;

public class LokalnaTabla {
	
	public String[][] lokalnaTabla = new String [9][9];

	public String[][] getLokalnaTabla() {
		return lokalnaTabla;
	}

	public void setLokalnaTabla(String[][] lokalnaTabla) {
		this.lokalnaTabla = lokalnaTabla;
	}

	public LokalnaTabla(String[][] lokalnaTabla) {
		this.lokalnaTabla = lokalnaTabla;
	}
	
}
