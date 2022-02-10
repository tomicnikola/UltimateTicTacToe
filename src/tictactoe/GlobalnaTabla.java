package tictactoe;

public class GlobalnaTabla extends LokalnaTabla{
	
	public String[][] globalnaTabla = new String [3][3];

	public String[][] getGlobalnaTabla() {
		return globalnaTabla;
	}

	public void setGlobalnaTabla(String[][] globalnaTabla) {
		this.globalnaTabla = globalnaTabla;
	}

	public GlobalnaTabla(String[][] lokalnaTabla, String[][] globalnaTabla) {
		super(lokalnaTabla);
		this.globalnaTabla = globalnaTabla;
	}

}
