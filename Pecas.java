package trabalhoxadrez;
public class Pecas {
    int tipo,cor;
    //tipo = 0, pe�a fora de jogo
    //tipo = 1, pe�a � pe�o
    //tipo = 2, pe�a � cavalo
    //tipo = 3, pe�a � bispo
    //tipo = 4, pe�a � torre
    //tipo = 5, pe�a � dama
    //tipo = 6, pe�a � rei
    //cor = 1, pe�a � branca
    //cor = 2, pe�a � preta
    //Primeiro a cor, depois o tipo
    //======================================================================
  	//======================================================================
    String checar(){
    	if(this.tipo == 0) {
    		return "-";
    	}
    	else{
	    	if(this.cor == 1) {// Pe�a branca
	    		if(this.tipo == 1) { // Pe�o
	    			return "p";
	    		}
	    		if(this.tipo == 2) { // Cavalo
	    			return "h";
	    		}
	    		if(this.tipo == 3) { // Bispo
	    			return "b";
	    		}
	    		if(this.tipo == 4) { // Torre
	    			return "t";
	    		}
	    		if(this.tipo == 5) { // Dama
	    			return "q";
	    		}
	    		if(this.tipo == 6) { // Rei
	    			return "k";
	    		}
	    	}
	    	else if(this.cor == 2) {// Pe�a preta
	    		
	    		if(this.tipo == 1) { // Pe�o
	    			return "P";
	    		}
	    		if(this.tipo == 2) { // Cavalo
	    			return "H";
	    		}
	    		if(this.tipo == 3) { // Bispo
	    			return "B";
	    		}
	    		if(this.tipo == 4) { // Torre
	    			return "T";
	    		}
	    		if(this.tipo == 5) { // Dama
	    			return "Q";
	    		}
	    		if(this.tipo == 6) { // Rei
	    			return "K";
	    		}
	    		
	    	}
    	}
		return null;
    }
    boolean Analise(int l1, int c1, int l2, int c2, Tabuleiro t,String promocao) {
    	return true;
    }
}