package trabalhoxadrez;
public class Bispo extends Pecas{
	public Bispo(int cor, int tipo) {
		this.cor = cor;
		this.tipo = tipo;
	}
    //======================================================================
  	//======================================================================
	boolean Analise(int l1, int c1, int l2, int c2, Tabuleiro t, String promocao) {
		boolean retorno = true;
		int auxl = l1, auxc = c1;
		if(l2 > 7 || l2 < 0 || c2>7 || c2<0) {// respeitando as dimensões do tabuleiro
			return false;}
		if(t.p[l1][c1].cor == 1) {// se for um bispo branco
			if(Math.abs(l2 - l1) != Math.abs(c2 - c1)) { //se não for um movimento na diagonal
				return false;}
			if(t.p[l2][c2].tipo != 0 && t.p[l2][c2].cor == 1) {//há uma peça branca no destino
				return false;}
			if(l2 > l1) {// o bispo subiu no tabuleiro
				if(c2 > c1) {// foi para cima e para a direita
					auxl ++;
					auxc ++;
					while(auxl != l2 && auxc != c2) {
						if(t.p[auxl][auxc].tipo != 0) {//há uma peça no meio da trajetória do movimento
							return false;}
						auxl ++;
						auxc ++;}}
				if(c2 < c1) {// foi para cima e para a esquerda
					auxl ++;
					auxc --;
					while(auxl != l2 && auxc != c2) {
						if(t.p[auxl][auxc].tipo != 0) {//há uma peça no meio da trajetória do movimento
							return false;}
						auxl ++;
						auxc --;}}}
			if(l2 < l1) {//o bispo desceu no tabuleiro
				auxl --;
				auxc ++;
				if(c2 > c1) {// foi para baixo e para a direita
					while(auxl != l2 && auxc != c2) {
						if(t.p[auxl][auxc].tipo != 0) {//há uma peça no meio da trajetória do movimento
							return false;}
						auxl --;
						auxc ++;}}
				if(c1 > c2) {// foi para baixo e para a esquerda
					auxl --;
					auxc --;
					while(auxl != l2 && auxc != c2) {
						if(t.p[auxl][auxc].tipo != 0) {//há uma peça no meio da trajetória do movimento
							return false;}
						auxl --;
						auxc --;}}}
			if(t.p[l2][c2].tipo == 0) {// não há nenhuma peça na casa final
				t.p[l2][c2] = new Bispo(1,3);
				t.p[l1][c1] = new Peao(1,0);}
			else if(t.p[l2][c2].tipo != 0 && t.p[l2][c2].cor == 2) {//há captura
				t.p[l2][c2] = new Bispo(1,3);
				t.p[l1][c1] = new Peao(1,0);}}
		
		
		if(t.p[l1][c1].cor == 2) {// se for um bispo preto
			if(Math.abs(l2 - l1) != Math.abs(c2 - c1)) { //se não for um movimento na diagonal
				return false;}
			if(t.p[l2][c2].tipo != 0 && t.p[l2][c2].cor == 2) {//há uma peça preta no destino
				return false;}
			if(l2 > l1) {// o bispo subiu no tabuleiro
				if(c2 > c1) {// foi para cima e para a direita
					auxl ++;
					auxc ++;
					while(auxl != l2 && auxc != c2) {
						if(t.p[auxl][auxc].tipo != 0) {//há uma peça no meio da trajetória do movimento
							return false;}
						auxl ++;
						auxc ++;}}
				if(c1 > c2) {// foi para cima e para a esquerda
					auxl ++;
					auxc --;
					while(auxl != l2 && auxc != c2) {
						if(t.p[auxl][auxc].tipo != 0) {//há uma peça no meio da trajetória do movimento
							return false;}
						auxl ++;
						auxc --;}}}
			if(l1 > l2) {//o bispo desceu no tabuleiro
				if(c2 > c1) {// foi para baixo e para a direita
					auxl --;
					auxc ++;
					while(auxl != l2 && auxc != c2) {
						if(t.p[auxl][auxc].tipo != 0) {//há uma peça no meio da trajetória do movimento
							return false;}
						auxl --;
						auxc ++;}}
				if(c1 > c2) {// foi para baixo e para a esquerda
					auxl --;
					auxc --;
					while(auxl != l2 && auxc != c2) {
						if(t.p[auxl][auxc].tipo != 0) {//há uma peça no meio da trajetória do movimento
							return false;}
						auxl --;
						auxc --;}}}
			if(t.p[l2][c2].tipo == 0) {// não há nenhuma peça na casa final
				t.p[l2][c2] = new Bispo(2,3);
				t.p[l1][c1] = new Peao(1,0);}
			else if(t.p[l2][c2].tipo != 0 && t.p[l2][c2].cor == 1) {//há captura
				t.p[l2][c2] = new Bispo(2,3);
				t.p[l1][c1] = new Peao(1,0);}}
	return retorno;}}
