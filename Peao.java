package trabalhoxadrez;
public class Peao extends Pecas{
	public Peao(int cor, int tipo) {
		this.cor = cor;
		this.tipo = tipo;}
    //======================================================================
  	//======================================================================
	boolean Analise(int l1, int c1, int l2, int c2, Tabuleiro t, String promocao) {
		boolean retorno = true;
		
		if(t.p[l1][c1].cor == 1) {// é um peão branco
			if(l2>l1) {// ele tem que ter subido no tabuleiro
				if(l1 == 0) {
					return false;}
				if(l1 == 1) {// se ele ainda não tiver se movimentado
					if((l2==l1+2 || l2==l1+1) && c2==c1) {//ou ele andou 1 ou 2 casas pra frente, na mesma coluna
						if(t.p[l2][c1].tipo != 0) {//tem uma peça aonde ele queria ir
							return false;}}
					else if(l2 > l1 +2) {//se ele saltar mais do que duas casas
						return false;}
					}
				else if(l1 != 0 && l1 != 1) {//caso ele já tenha se movimentado
					if(l2 == (l1 + 1) && c2 == c1) {//movimento comum pra cima 
						if(t.p[l2][c1].tipo != 0) {//tem uma peça aonde ele queria ir
							return false;}}}
				if(c2 == c1) {
					t.p[l2][c2] =  new Peao(1,1);
					t.p[l1][c1] = new Peao(1,0);}
				else if(c2 != c1) {// modo de captura
					if(t.p[l2][c2].tipo == 0) {//se não tiver nenhuma peça na casa final
						return false;}
					else if(t.p[l2][c2].tipo != 0 && t.p[l2][c2].cor == 2) {//a captura vai ocorrer
						t.p[l2][c2] =  new Peao(1,1);
						t.p[l1][c1] = new Peao(1,0);}}}
			else {
				return false;}}
		
		else if(t.p[l1][c1].cor == 2) {// é um peão preto
			if(l2<l1) {// ele tem que ter descido no tabuleiro
				if(l1 == 7) {
					return false;}
				if(l1 == 6) {// se ele ainda não tiver se movimentado
					if((l2==l1-2 || l2==l1-1) && (c2==c1)) {//ou ele andou 1 ou 2 casas pra baixo, na mesma coluna
						if(t.p[l2][c2].tipo != 0) {//tem uma peça aonde ele queria ir
							return false;}}
					else if(l2 < l1 - 2) {//se ele saltar mais do que duas casas
						return false;}}
				else if(l1 != 7 && l1 != 6) {//caso ele já tenha se movimentado
					if(l2 == (l1 - 1) && c2 == c1) {//movimento comum pra baixo 
						if(t.p[l2][c1].tipo != 0) {//tem uma peça aonde ele queria ir
							return false;}}
					else{
						return false;}
					}
				if(c2 == c1) {
					t.p[l2][c2] =  new Peao(2,1);
					t.p[l1][c1] = new Peao(1,0);}
				if(c2 != c1) {// modo de captura
					if(t.p[l2][c2].tipo == 0) {//se não tiver nenhuma peça na casa final
						return false;}
					else if(t.p[l2][c2].tipo != 0 && t.p[l2][c2].cor == 1) {//a captura vai ocorrer
						t.p[l2][c2] =  new Peao(2,1);
						t.p[l1][c1] = new Peao(1,0);}}}
			else {
				return false;}}
		return retorno;}
    //======================================================================
  	//======================================================================
}
