package tictactoe;

public class Igrac extends GlobalnaTabla implements Igra{
	
	public int pozicija;
	public int prethodnaPozicija;
	public String trenutniIgrac = "X";
	public boolean igraTrajeKvadrat1 = true;
	public boolean igraTrajeKvadrat2 = true;
	public boolean igraTrajeKvadrat3 = true;
	public boolean igraTrajeKvadrat4 = true;
	public boolean igraTrajeKvadrat5 = true;
	public boolean igraTrajeKvadrat6 = true;
	public boolean igraTrajeKvadrat7 = true;
	public boolean igraTrajeKvadrat8 = true;
	public boolean igraTrajeKvadrat9 = true;
	
	
	
	public Igrac(String[][] lokalnaTabla, String[][] globalnaTabla, int pozicija, int prethodnaPozicija,
			String trenutniIgrac) {
		super(lokalnaTabla, globalnaTabla);
		this.pozicija = pozicija;
		this.prethodnaPozicija = prethodnaPozicija;
		this.trenutniIgrac = trenutniIgrac;
	}

	public void zameniIgraca(String trenutniIgrac) {
		if(trenutniIgrac.equals("X"))
			trenutniIgrac = "O";
		else if(trenutniIgrac.equals("O"))
			trenutniIgrac = "X";
	}
	
	public void proveriLokalneRedove() {
		
		//Kvadrat 1
		if(igraTrajeKvadrat1) {
			if(lokalnaTabla[0][0].equals(lokalnaTabla[0][1].equals(lokalnaTabla[0][2])) || 
			   lokalnaTabla[1][0].equals(lokalnaTabla[1][1].equals(lokalnaTabla[1][2]))	|| 
			   lokalnaTabla[2][0].equals(lokalnaTabla[2][1].equals(lokalnaTabla[2][2]))) {
				globalnaTabla[0][0] = trenutniIgrac;
				igraTrajeKvadrat1 = false;
			}
		}
		
		//Kvadrat 2
		if(igraTrajeKvadrat2) {
			if(lokalnaTabla[0][3].equals(lokalnaTabla[0][4].equals(lokalnaTabla[0][5])) || 
			   lokalnaTabla[1][3].equals(lokalnaTabla[1][4].equals(lokalnaTabla[1][5]))	|| 
			   lokalnaTabla[2][3].equals(lokalnaTabla[2][4].equals(lokalnaTabla[2][5]))) {
				globalnaTabla[0][1] = trenutniIgrac;
				igraTrajeKvadrat2 = false;
			}
		}
		
		//Kvadrat 3
		if(igraTrajeKvadrat3) {
			if(lokalnaTabla[0][6].equals(lokalnaTabla[0][7].equals(lokalnaTabla[0][8])) || 
			   lokalnaTabla[1][6].equals(lokalnaTabla[1][7].equals(lokalnaTabla[1][8]))	|| 
			   lokalnaTabla[2][6].equals(lokalnaTabla[2][7].equals(lokalnaTabla[2][8]))) {
				globalnaTabla[0][2] = trenutniIgrac;
				igraTrajeKvadrat3 = false;
			}
		}
		
		//Kvadrat 4
		if(igraTrajeKvadrat4) {
			if(lokalnaTabla[3][0].equals(lokalnaTabla[3][1].equals(lokalnaTabla[3][2])) || 
			   lokalnaTabla[4][0].equals(lokalnaTabla[4][1].equals(lokalnaTabla[4][2]))	|| 
			   lokalnaTabla[5][0].equals(lokalnaTabla[5][1].equals(lokalnaTabla[5][2]))) {
				globalnaTabla[1][0] = trenutniIgrac;
				igraTrajeKvadrat4 = false;
			}
		}
		
		//Kvadrat 5
		if(igraTrajeKvadrat5) {
			if(lokalnaTabla[3][3].equals(lokalnaTabla[3][4].equals(lokalnaTabla[3][5])) || 
			   lokalnaTabla[4][3].equals(lokalnaTabla[4][4].equals(lokalnaTabla[4][5]))	|| 
			   lokalnaTabla[5][3].equals(lokalnaTabla[5][4].equals(lokalnaTabla[5][5]))) {
				globalnaTabla[1][1] = trenutniIgrac;
				igraTrajeKvadrat5 = false;
			}
		}
		
		//Kvadrat 6
		if(igraTrajeKvadrat6) {
			if(lokalnaTabla[3][6].equals(lokalnaTabla[3][7].equals(lokalnaTabla[3][8])) || 
			   lokalnaTabla[4][6].equals(lokalnaTabla[4][7].equals(lokalnaTabla[4][8]))	|| 
			   lokalnaTabla[5][6].equals(lokalnaTabla[5][7].equals(lokalnaTabla[5][8]))) {
				globalnaTabla[1][2] = trenutniIgrac;
				igraTrajeKvadrat6 = false;
			}
		}
		
		//Kvadrat 7
		if(igraTrajeKvadrat7) {
			if(lokalnaTabla[6][0].equals(lokalnaTabla[6][1].equals(lokalnaTabla[6][2])) || 
			   lokalnaTabla[7][0].equals(lokalnaTabla[7][1].equals(lokalnaTabla[7][2]))	|| 
			   lokalnaTabla[8][0].equals(lokalnaTabla[8][1].equals(lokalnaTabla[8][2]))) {
				globalnaTabla[2][0] = trenutniIgrac;
				igraTrajeKvadrat7 = false;
			}
		}
		
		//Kvadrat 8
		if(igraTrajeKvadrat8) {
			if(lokalnaTabla[6][3].equals(lokalnaTabla[6][4].equals(lokalnaTabla[6][7])) || 
			   lokalnaTabla[7][3].equals(lokalnaTabla[7][4].equals(lokalnaTabla[7][7]))	|| 
			   lokalnaTabla[8][3].equals(lokalnaTabla[8][4].equals(lokalnaTabla[8][7]))) {
				globalnaTabla[2][1] = trenutniIgrac;
				igraTrajeKvadrat8 = false;
			}
		}
		
		//Kvadrat 9
		if(igraTrajeKvadrat9) {
			if(lokalnaTabla[6][6].equals(lokalnaTabla[6][7].equals(lokalnaTabla[6][8])) || 
			   lokalnaTabla[7][6].equals(lokalnaTabla[7][7].equals(lokalnaTabla[7][8]))	|| 
			   lokalnaTabla[8][6].equals(lokalnaTabla[8][7].equals(lokalnaTabla[8][8]))) {
				globalnaTabla[2][2] = trenutniIgrac;
				igraTrajeKvadrat9 = false;
			}
		}
			
	}

	public void proveriLokalneKolone() {
		//Kvadrat 1
		if(igraTrajeKvadrat1) {
			if(lokalnaTabla[0][0].equals(lokalnaTabla[1][0].equals(lokalnaTabla[2][0])) || 
			   lokalnaTabla[0][1].equals(lokalnaTabla[1][1].equals(lokalnaTabla[2][1]))	|| 
			   lokalnaTabla[0][2].equals(lokalnaTabla[1][2].equals(lokalnaTabla[2][2]))) {
				globalnaTabla[0][0] = trenutniIgrac;
				igraTrajeKvadrat1 = false;
			}
		}
		
		//Kvadrat 2
		if(igraTrajeKvadrat2) {
			if(lokalnaTabla[0][3].equals(lokalnaTabla[1][3].equals(lokalnaTabla[2][3])) || 
			   lokalnaTabla[0][4].equals(lokalnaTabla[1][4].equals(lokalnaTabla[2][4]))	|| 
			   lokalnaTabla[0][5].equals(lokalnaTabla[1][5].equals(lokalnaTabla[2][5]))) {
				globalnaTabla[0][1] = trenutniIgrac;
				igraTrajeKvadrat2 = false;
			}
		}
		
		//Kvadrat 3
		if(igraTrajeKvadrat3) {
			if(lokalnaTabla[0][6].equals(lokalnaTabla[1][6].equals(lokalnaTabla[2][6])) || 
			   lokalnaTabla[0][7].equals(lokalnaTabla[1][7].equals(lokalnaTabla[2][7]))	|| 
			   lokalnaTabla[0][8].equals(lokalnaTabla[1][8].equals(lokalnaTabla[2][8]))) {
				globalnaTabla[0][2] = trenutniIgrac;
				igraTrajeKvadrat3 = false;
			}
		}
		
		//Kvadrat 4
		if(igraTrajeKvadrat4) {
			if(lokalnaTabla[3][0].equals(lokalnaTabla[4][0].equals(lokalnaTabla[5][0])) || 
			   lokalnaTabla[3][1].equals(lokalnaTabla[4][1].equals(lokalnaTabla[5][1]))	|| 
			   lokalnaTabla[3][2].equals(lokalnaTabla[4][2].equals(lokalnaTabla[5][2]))) {
				globalnaTabla[1][0] = trenutniIgrac;
				igraTrajeKvadrat4 = false;
			}
		}
		
		//Kvadrat 5
		if(igraTrajeKvadrat5) {
			if(lokalnaTabla[3][3].equals(lokalnaTabla[4][3].equals(lokalnaTabla[5][3])) || 
			   lokalnaTabla[3][4].equals(lokalnaTabla[4][4].equals(lokalnaTabla[5][4]))	|| 
			   lokalnaTabla[3][5].equals(lokalnaTabla[4][5].equals(lokalnaTabla[5][5]))) {
				globalnaTabla[1][1] = trenutniIgrac;
				igraTrajeKvadrat5 = false;
			}
		}
		
		//Kvadrat 6
		if(igraTrajeKvadrat6) {
			if(lokalnaTabla[3][6].equals(lokalnaTabla[4][6].equals(lokalnaTabla[5][6])) || 
			   lokalnaTabla[3][7].equals(lokalnaTabla[4][7].equals(lokalnaTabla[5][7]))	|| 
			   lokalnaTabla[3][8].equals(lokalnaTabla[4][8].equals(lokalnaTabla[5][8]))) {
				globalnaTabla[1][2] = trenutniIgrac;
				igraTrajeKvadrat6 = false;
			}
		}
		
		//Kvadrat 7
		if(igraTrajeKvadrat7) {
			if(lokalnaTabla[6][0].equals(lokalnaTabla[7][0].equals(lokalnaTabla[8][0])) || 
			   lokalnaTabla[6][1].equals(lokalnaTabla[7][1].equals(lokalnaTabla[8][1]))	|| 
			   lokalnaTabla[6][2].equals(lokalnaTabla[7][2].equals(lokalnaTabla[8][2]))) {
				globalnaTabla[2][0] = trenutniIgrac;
				igraTrajeKvadrat7 = false;
			}
		}
		
		//Kvadrat 8
		if(igraTrajeKvadrat8) {
			if(lokalnaTabla[6][3].equals(lokalnaTabla[7][3].equals(lokalnaTabla[8][3])) || 
			   lokalnaTabla[6][4].equals(lokalnaTabla[7][4].equals(lokalnaTabla[8][4]))	|| 
			   lokalnaTabla[6][5].equals(lokalnaTabla[7][5].equals(lokalnaTabla[8][5]))) {
				globalnaTabla[2][1] = trenutniIgrac;
				igraTrajeKvadrat8 = false;
			}
		}
		
		//Kvadrat 9
		if(igraTrajeKvadrat9) {
			if(lokalnaTabla[6][6].equals(lokalnaTabla[7][6].equals(lokalnaTabla[8][6])) || 
			   lokalnaTabla[6][7].equals(lokalnaTabla[7][7].equals(lokalnaTabla[8][7]))	|| 
			   lokalnaTabla[6][8].equals(lokalnaTabla[7][8].equals(lokalnaTabla[8][8]))) {
				globalnaTabla[2][2] = trenutniIgrac;
				igraTrajeKvadrat9 = false;
			}
		}	
	}

	public void proveriLokalneDijagonale() {

		
	}

	public void proveriGloabalneRedove() {
		
		
	}

	public void proveriGloabalneKolone() {
		
		
	}

	public void proveriGloabalneDijagonale() {
		
		
	}

	public void proveriPobednika() {
		
		
	}

	public void proveriLokalnoNereseno() {
		
		
	}

	public void proveriGlobanoNereseno() {
		
		
	}
	
	
}
