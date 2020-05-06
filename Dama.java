package trabalhoxadrez;
public class Dama extends Pecas{
	public Dama(int cor, int tipo) {
		this.cor = cor;
		this.tipo = tipo;
	}
	boolean Analise(int l1, int c1, int l2, int c2, Tabuleiro t, String promocao) {
		int auxl = l1, auxc = c1;
		boolean retorno = true;
		if(l2 > 7 || l2 < 0 || c2>7 || c2<0) {// respeitando as dimensões do tabuleiro
			return false;}
		if((l2 != l1 && c2 != c1) && Math.abs(l2 - l1) != Math.abs(c2 - c1)) {// se nao for um movimento diagonal 
			return false;}// ou se nao for um movimento na horizontal/vertical
		if(l2 != l1 && c2 != c1) {// a dama se movimenta como um bispo
					if(t.p[l1][c1].cor == 1) {// se for uma dama branca
						if(t.p[l2][c2].tipo != 0 && t.p[l2][c2].cor == 1) {//há uma peça branca no destino
							return false;}
						if(l2 > l1) {// a dama subiu no tabuleiro
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
						if(l2 < l1) {//a dama desceu no tabuleiro
							if(c2 > c1) {// foi para baixo e para a direita
								auxl --;
								auxc ++;
								while(auxl != l2 && auxc != c2) {
									if(t.p[auxl][auxc].tipo != 0) {//há uma peça no meio da trajetória do movimento
										return false;}
									auxl --;
									auxc ++;}}
							if(c2 < c1) {// foi para baixo e para a esquerda
								auxl --;
								auxc --;
								while(auxl != l2 && auxc != c2) {
									if(t.p[auxl][auxc].tipo != 0) {//há uma peça no meio da trajetória do movimento
										return false;}
									auxl --;
									auxc --;}}}
						if(t.p[l2][c2].tipo == 0) {// não há nenhuma peça na casa final
							t.p[l2][c2] = new Dama(1,5);
							t.p[l1][c1] = new Peao(1,0);}
						else if(t.p[l2][c2].tipo != 0 && t.p[l2][c2].cor == 2) {//há captura
							t.p[l2][c2] = new Dama(1,5);
							t.p[l1][c1] = new Peao(1,0);}}
					if(t.p[l1][c1].cor == 2) {// se for uma dama preta
						if(Math.abs(l2 - l1) != Math.abs(c2 - c1)) { //se não for um movimento na diagonal
							return false;}
						if(t.p[l2][c2].tipo != 0 && t.p[l2][c2].cor == 2) {//há uma peça preta no destino
							return false;}
						if(l2 > l1) {// a dama subiu no tabuleiro
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
						if(l1 > l2) {//a dama desceu no tabuleiro
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
							t.p[l2][c2] = new Dama(2,5);
							t.p[l1][c1] = new Peao(1,0);}
						else if(t.p[l2][c2].tipo != 0 && t.p[l2][c2].cor == 1) {//há captura
							t.p[l2][c2] = new Dama(2,5);
							t.p[l1][c1] = new Peao(1,0);}}}
		else if(Math.abs(l2 - l1) != Math.abs(c2 - c1)) {// a dama se movimenta como uma torre
						if(t.p[l1][c1].cor == 1) {//é uma dama branca
							if(t.p[l2][c2].tipo != 0 && t.p[l2][c2].cor == 1) {//há uma peça branca no destino
								return false;}
							if(l1 != l2) {// manteve a coluna e variou a linha
								if(l2>l1) {//subiu no tabuleiro
									auxl ++;
									while(auxl != l2) {
										if(t.p[auxl][c1].tipo != 0) {//há uma peça no meio da trajetória
											return false;}
										auxl ++;}}
								if(l2<l1) {//desceu no tabuleiro
									auxl --;
									while(auxl != l2) {
										if(t.p[auxl][c1].tipo != 0) {//há uma peça no meio da trajetória
											return false;}
										auxl --;}}}
							else if(l1 == l2) {
								if(c2>c1) {//foi pra direita
									auxc ++;
									while(auxc != c2) {
										if(t.p[l1][auxc].tipo != 0) {//há uma peça no meio da trajetória
											return false;}
										auxc ++;}}
								if(c2<c1) {//foi pra esquerda
									auxc --;
									while(auxc != c2) {
										if(t.p[l1][auxc].tipo != 0) {//há uma peça no meio da trajetória
											return false;}
										auxc --;}}}
							if(t.p[l2][c2].tipo == 0) {// o destino é uma casa vazia
								t.p[l2][c2] = new Dama(1, 5);
								t.p[l1][c1] = new Peao(1,0);}
							if(t.p[l2][c2].tipo != 0 && t.p[l2][c2].cor == 2) {// há captura
								t.p[l2][c2] = new Dama(1, 5);
								t.p[l1][c1] = new Peao(1,0);}}
						if(t.p[l1][c1].cor == 2) {//é uma dama preta
							if(t.p[l2][c2].tipo != 0 && t.p[l2][c2].cor == 2) {//há uma peça preta no destino
								return false;}
							if(l1 != l2) {// manteve a coluna e variou a linha
								if(l2>l1) {//subiu no tabuleiro
									auxl ++;
									while(auxl != l2) {
										if(t.p[auxl][c1].tipo != 0) {//há uma peça no meio da trajetória
											return false;}
										auxl ++;}}
								if(l2<l1) {//desceu no tabuleiro
									auxl --;
									while(auxl != l2) {
										if(t.p[auxl][c1].tipo != 0) {//há uma peça no meio da trajetória
											return false;}
										auxl --;}}}
							else if(l1 == l2) {
								if(c2>c1) {//foi pra direita
									auxc ++;
									while(auxc != c2) {
										if(t.p[l1][auxc].tipo != 0) {//há uma peça no meio da trajetória
											return false;}
										auxc ++;}}
								if(c2<c1) {//foi pra esquerda
									auxc --;
									while(auxc != c2) {
										if(t.p[l1][auxc].tipo != 0) {//há uma peça no meio da trajetória
											return false;}
										auxc --;}}}
							if(t.p[l2][c2].tipo == 0) {
								t.p[l2][c2] = new Dama(2, 5);
								t.p[l1][c1] = new Peao(1,0);}
							if(t.p[l2][c2].tipo != 0 && t.p[l2][c2].cor == 1) {//há captura
								t.p[l2][c2] = new Dama(2, 5);
								t.p[l1][c1] = new Peao(1,0);}}}
	return retorno;}
}
