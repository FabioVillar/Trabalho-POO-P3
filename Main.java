package trabalhoxadrez;
public class Main{
    public static void main(String[] args){
        Tabuleiro tab = new Tabuleiro();
        System.out.println("Tabuleiro inicial:");
        tab.imprimirtabuleiro();
        CSVReader csv = new CSVReader();
        csv.setDataSource("Trabalho---POO---2020---P2/blob/master/Entradas.csv");
        String commands[] = csv.requestCommands();
        int tamanho = commands.length;
        int aux = 0;
        while(aux < tamanho) {
			@SuppressWarnings("unused")
			Movimentacao mov = new Movimentacao(tab, commands,tamanho);
        	aux ++;
        }
    }
}