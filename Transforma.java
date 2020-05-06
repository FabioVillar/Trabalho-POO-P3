package trabalhoxadrez;
public class Transforma{
	void transforma(Tabuleiro t, int l2, int c2, String promocao,int jogadas) {
		int color = t.p[l2][c2].cor;
		if(l2 == 7) {
			if(promocao == "q") {
				t.p[l2][c2] = new Dama(color,5);}
			if(promocao == "t") {
				t.p[l2][c2] = new Torre(color,4);}
			if(promocao == "h") {
				t.p[l2][c2] = new Cavalo(color,2);}
			if(promocao == "b") {
				t.p[l2][c2] = new Bispo(color,3);}}}
}
