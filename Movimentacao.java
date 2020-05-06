package trabalhoxadrez;
import java.util.Objects;
public class Movimentacao{
    Tabuleiro t;
    String vetor[];
    static int tamanho;
    static int jogadas = 0;
    static int vez = 1;// se vez = 1, jogada das brancas, = 2, das pretas
    int numerizarcoluna(String c){
    	if(Objects.equals(c,"a") == true) {
    		return 0;
    	}
    	if(Objects.equals(c,"b") == true) {
    		return 1;
    	}
    	if(Objects.equals(c,"c") == true) {
    		return 2;
    	}
    	if(Objects.equals(c,"d") == true) {
    		return 3;
    	}
    	if(Objects.equals(c,"e") == true) {
    		return 4;
    	}
    	if(Objects.equals(c,"f") == true) {
    		return 5;
    	}
    	if(Objects.equals(c,"g") == true) {
    		return 6;
    	}
    	if(Objects.equals(c,"h") == true) {
    		return 7;
    	}
    	return -1;
    }
    @SuppressWarnings("static-access")
	Movimentacao(Tabuleiro t, String vetor[],int tamanho){
    	this.tamanho = tamanho;
    	Boolean verif = true;
        this.t = t;
        this.vetor = vetor;
        String promocao = "JAVA";
        if(jogadas < tamanho) {
        	String comando = vetor[jogadas];
        	if(comando != "q" && comando != "t" && comando != "h" && comando != "b") {
		        	if((jogadas + 1)<tamanho) {
		        		promocao = vetor[jogadas +1];}
		        	String mov[] = comando.split(":");
		        	String ci = mov[0].substring(0,1);
		        	String li = mov[0].substring(1,2);
		        	String cf = mov[1].substring(0,1);
		        	String lf = mov[1].substring(1,2);
		        	int l1 = Integer.parseInt(li) - 1;
		        	int l2 = Integer.parseInt(lf) - 1;
		        	int c1 = numerizarcoluna(ci);
		        	int c2 = numerizarcoluna(cf);
		        	if(vez == 1) {
		        		if(t.p[l1][c1].cor == 2) {
		        			verif = false;
		        		}
		        	}
		        	if(vez == 2) {
		        		if(t.p[l1][c1].cor == 1) {
		        			verif = false;
		        		}
		        	}
		        	if(verif == true) {
		        	//Hora de analisar o movimento da peça
		        	if(t.p[l1][c1].tipo != 0) {
		        		if(t.p[l1][c1].tipo == 1) {
		        			verif = t.p[l1][c1].Analise(l1,c1,l2,c2,t,promocao);
		        			if(verif == true) {
		        				Transforma tr = new Transforma();
		        				tr.transforma(t,l2,c2,promocao,jogadas);}}
		        		else {
		        			verif = t.p[l1][c1].Analise(l1,c1,l2,c2,t,promocao);}}
		        	if(verif == true) {
		        		if(vez == 1) {
		        			System.out.println("Vez das brancas:");
		        			vez = 2;}
		        		else if(vez == 2) {
		        			System.out.println("Vez das pretas:");
		        			vez = 1;}
		        		System.out.println("\nSource: "+mov[0]);
				        System.out.println("Target: "+mov[1]);
		        		t.imprimirtabuleiro();}}}
		        	jogadas ++;}}
        }
