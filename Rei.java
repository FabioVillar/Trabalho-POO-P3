package trabalhoxadrez;
public class Rei extends Pecas{
	public Rei(int cor, int tipo) {
		this.cor = cor;
		this.tipo = tipo;
	}
	boolean Analise(int l1, int c1, int l2, int c2, Tabuleiro t, String promocao) {
		boolean retorno = true;
		if(l2 > 7 || l2 < 0 || c2>7 || c2<0) {// respeitando as dimensões do tabuleiro
			return false;}
		if(t.p[l1][c1].cor == 1) {// é o rei branco
			if(t.p[l2][c2].tipo != 0 && t.p[l1][c1].cor == 1) {// há uma peça branca no destino
				return false;}
			if(Math.abs(c2-c1)==2) {//houve roque
				if(l1!=l2) {//a linha deve permanecer a mesma
					return false;}
				if(c2<c1) {//foi pra esquerda
					if(t.p[l2][c2-2].tipo == 4 && t.p[l2][c2-2].cor == 1) {
						if(t.p[l2][c1-1].tipo != 0) {// há uma peça a esquerda do rei
							return false;}
						if(t.p[l2][c2-1].tipo != 0) {//há uma peça a direita da torre
							return false;}
						t.p[l2][c2] = new Rei(1,6);//realizando o roque
						t.p[l1][c1] = new Peao(1,0);
						t.p[l2][c2-2] = new Peao(1,0);
						t.p[l2][c2+1] = new Torre(1,4);
						return retorno;}
					else {
						return false;}}
				else if(c2>c1) {//foi pra direita
					if(t.p[l2][c2+1].tipo == 4 && t.p[l2][c2+1].cor == 1) {
						if(t.p[l2][c1+1].tipo != 0) {// há uma peça a direita do rei
							return false;}
						t.p[l2][c2] = new Rei(1,6);//realizando o roque
						t.p[l1][c1] = new Peao(1,0);
						t.p[l2][c2+1] = new Peao(1,0);
						t.p[l2][c2-1] = new Torre(1,4);
						return retorno;}
					else{
						return false;}}}
			if(Math.abs(c2-c1)>1 || Math.abs(l2-l1)>1) {
				return false;}
			if(t.p[l2][c2].tipo != 0 && t.p[l1][c1].cor == 2) {// há uma peça preta no destino
				t.p[l2][c2] = new Rei(1,6);
				t.p[l1][c1] = new Peao(1,0);}
			if(t.p[l2][c2].tipo == 0) {// há uma casa vazia no destino
				t.p[l2][c2] = new Rei(1,6);
				t.p[l1][c1] = new Peao(1,0);}}
		
		if(t.p[l1][c1].cor == 2) {// é o rei preto
			if(t.p[l2][c2].tipo != 0 && t.p[l2][c2].cor == 2) {// há uma peça preta no destino
				return false;}
			if(Math.abs(c2-c1)==2) {//houve roque
				if(l1!=l2) {//a linha deve permanecer a mesma
					return false;}
				if(c2<c1) {//foi pra esquerda
					if(t.p[l2][c2-2].tipo == 4 && t.p[l2][c2-2].cor == 2) {
						if(t.p[l2][c1-1].tipo != 0) {// há uma peça a esquerda do rei
							return false;}
						if(t.p[l2][c2-1].tipo != 0) {//há uma peça a direita da torre
							return false;}
						t.p[l2][c2] = new Rei(2,6);//realizando o roque
						t.p[l1][c1] = new Peao(1,0);
						t.p[l2][c2-2] = new Peao(1,0);
						t.p[l2][c2-1] = new Torre(2,4);
						return retorno;}
					else {
						return false;}}
				else if(c2>c1) {//foi pra direita
					if(t.p[l2][c2+1].tipo == 4 && t.p[l2][c2+1].cor == 2) {
						if(t.p[l2][c1+1].tipo != 0) {// há uma peça a direita do rei
							return false;}
						t.p[l2][c2] = new Rei(2,6);//realizando o roque
						t.p[l1][c1] = new Peao(1,0);
						t.p[l2][c2+1] = new Peao(1,0);
						t.p[l2][c2-1] = new Torre(2,4);
						return retorno;}
					else{
						return false;}}}
			if(Math.abs(c2-c1)>1 || Math.abs(l2-l1)>1) {
				return false;}
			if(t.p[l2][c2].tipo != 0 && t.p[l2][c2].cor == 1) {// há uma peça branca no destino
				t.p[l2][c2] = new Rei(2,6);
				t.p[l1][c1] = new Peao(1,0);}
			if(t.p[l2][c2].tipo == 0) {// há uma casa vazia no destino
				t.p[l2][c2] = new Rei(2,6);
				t.p[l1][c1] = new Peao(1,0);}}
	return retorno;}
}
