package trabalhoxadrez;
public class Cavalo extends Pecas{
	public Cavalo(int cor, int tipo) {
		this.cor = cor;
		this.tipo = tipo;}
    //======================================================================
  	//======================================================================
	boolean Analise(int l1, int c1, int l2, int c2, Tabuleiro t, String promocao) {
		boolean retorno = true;
		if((Math.abs(l2-l1) == 2 && Math.abs(c2-c1) == 1) || (Math.abs(l2-l1) == 1 && Math.abs(c2-c1) == 2)) {
					if(t.p[l1][c1].cor == 1) {// é um cavalo branco
						if(l2 > 7 || l2 < 0 || c2>7 || c2<0) {// respeitando as dimensões do tabuleiro
							return false;}
						if(t.p[l2][c2].tipo != 0) {// já existe uma peça na casa final
							if(t.p[l2][c2].cor == 1) {// há uma peça branca na casa final
								return false;}
							if(t.p[l2][c2].cor == 2) {// há uma peça preta na casa final, há captura
								t.p[l2][c2] = new Cavalo(1,2);
								t.p[l1][c1] = new Peao(1,0);}}
						else if(t.p[l2][c2].tipo == 0) {// a casa final está vazia
							t.p[l2][c2] = new Cavalo(1,2);
							t.p[l1][c1] = new Peao(1,0);}}
					
					if(t.p[l1][c1].cor == 2) {// é um cavalo preto
						if(l2 > 7 || l2 < 0) {// respeitando as dimensões do tabuleiro
							return false;}
						if(t.p[l2][c2].tipo != 0) {// já existe uma peça na casa final
							if(t.p[l2][c2].cor == 2) {// há uma peça preta na casa final
								return false;}
							if(t.p[l2][c2].cor == 1) {// há uma peça branca na casa final, há captura
								t.p[l2][c2] = new Cavalo(2,2);
								t.p[l1][c1] = new Peao(1,0);}}
						else if(t.p[l2][c2].tipo == 0) {// a casa final está vazia
							t.p[l2][c2] = new Cavalo(2,2);
							t.p[l1][c1] = new Peao(1,0);}}}
		else {
			return false;}
	return retorno;}
	//======================================================================
  	//======================================================================
}
