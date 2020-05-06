package trabalhoxadrez;
public class Torre extends Pecas{
	public Torre(int cor, int tipo) {
		this.cor = cor;
		this.tipo = tipo;
	}
	boolean Analise(int l1, int c1, int l2, int c2, Tabuleiro t, String promocao) {
		int auxl = l1, auxc = c1;
		boolean retorno = true;
		if(l2 != l1 && c2 != c1) {// um par deve ter valores iguais
			return false;}
		if(l2 > 7 || l2 < 0 || c2>7 || c2<0) {// respeitando as dimens�es do tabuleiro
			return false;}
		
		if(t.p[l1][c1].cor == 1) {//� uma torre branca
			if(t.p[l2][c2].tipo != 0 && t.p[l2][c2].cor == 1) {//h� uma pe�a branca no destino
				return false;}
			
			if(l1 != l2) {// manteve a coluna e variou a linha
				if(l2 > l1) {//subiu no tabuleiro
					auxl ++;
					while(auxl != l2) {
						if(t.p[auxl][c1].tipo != 0) {//h� uma pe�a no meio da trajet�ria
							return false;}
						auxl ++;}}
				if(l2 < l1) {//desceu no tabuleiro
					auxl --;
					while(auxl != l2) {
						if(t.p[auxl][c1].tipo != 0) {//h� uma pe�a no meio da trajet�ria
							return false;}
						auxl --;}}}
			else if(l1 == l2) {
				if(c2 > c1) {//foi pra direita
					auxc ++;
					while(auxc != c2) {
						if(t.p[l1][auxc].tipo != 0) {//h� uma pe�a no meio da trajet�ria
							return false;}
						auxc ++;}}
				if(c2 < c1) {//foi pra esquerda
					auxc --;
					while(auxc != c2) {
						if(t.p[l1][auxc].tipo != 0) {//h� uma pe�a no meio da trajet�ria
							return false;}
						auxc --;}}}
			if(t.p[l2][c2].tipo == 0) {// o destino � uma casa vazia
				t.p[l2][c2] = new Torre(1, 4);
				t.p[l1][c1] = new Peao(1,0);}
			if(t.p[l2][c2].tipo != 0 && t.p[l2][c2].cor == 2) {// h� captura
				t.p[l2][c2] = new Torre(1, 4);
				t.p[l1][c1] = new Peao(1,0);}}
		
		if(t.p[l1][c1].cor == 2) {//� uma torre preta
			if(t.p[l2][c2].tipo != 0 && t.p[l2][c2].cor == 2) {//h� uma pe�a preta no destino
				return false;}
			
			if(l1 != l2) {// manteve a coluna e variou a linha
				if(l2 > l1) {//subiu no tabuleiro
					auxl ++;
					while(auxl != l2) {
						if(t.p[auxl][c1].tipo != 0) {//h� uma pe�a no meio da trajet�ria
							return false;}
						auxl ++;}}
				if(l2 < l1) {//desceu no tabuleiro
					auxl --;
					while(auxl != l2) {
						if(t.p[auxl][c1].tipo != 0) {//h� uma pe�a no meio da trajet�ria
							return false;}
						auxl --;}}}
			else if(l1 == l2) {
				if(c2 > c1) {//foi pra direita
					auxc ++;
					while(auxc != c2) {
						if(t.p[l1][auxc].tipo != 0) {//h� uma pe�a no meio da trajet�ria
							return false;}
						auxc ++;}}
				if(c2 < c1) {//foi pra esquerda
					auxc --;
					while(auxc != c2) {
						if(t.p[l1][auxc].tipo != 0) {//h� uma pe�a no meio da trajet�ria
							return false;}
						auxc --;}}}
			if(t.p[l2][c2].tipo == 0) {
				t.p[l2][c2] = new Torre(2, 4);
				t.p[l1][c1] = new Peao(1,0);}
			if(t.p[l2][c2].tipo != 0 && t.p[l2][c2].cor == 1) {//h� captura
				t.p[l2][c2] = new Torre(2, 4);
				t.p[l1][c1] = new Peao(1,0);}}
	return retorno;}
}
