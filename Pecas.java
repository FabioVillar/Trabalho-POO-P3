package trabalhoxadrez;
public class Pecas {
    int tipo,cor;
    //tipo = 0, peça fora de jogo
    //tipo = 1, peça é peão
    //tipo = 2, peça é cavalo
    //tipo = 3, peça é bispo
    //tipo = 4, peça é torre
    //tipo = 5, peça é dama
    //tipo = 6, peça é rei
    //cor = 1, peça é branca
    //cor = 2, peça é preta
    //Primeiro a cor, depois o tipo
    //======================================================================
  	//======================================================================
    String checar(){
    	if(this.tipo == 0) {
    		return "-";
    	}
    	else{
	    	if(this.cor == 1) {// Peça branca
	    		if(this.tipo == 1) { // Peão
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
	    	else if(this.cor == 2) {// Peça preta
	    		
	    		if(this.tipo == 1) { // Peão
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