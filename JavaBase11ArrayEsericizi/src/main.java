import java.util.Scanner;
import java.util.Random;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeroRandom = (int) Math.random()*100;  //genero un numero random con valore compreso tra 0 e 100
		
		int lunghezza=30;
		Random random = new Random();

		int[] vettore1 = new int [30];
		int[] vettore2 = new int [lunghezza];
		int[] vettore3 = new int [lunghezza];
		
		for (int i=0;i<30;i++){
			vettore1[i] = random.nextInt(100);	
			System.out.println(vettore1[i]);
		}
		
		for (int i=0;i<30;i++){
			System.out.println("l'elemento "+i+" del vettore è: "+vettore1[i]); 		
		}
		
		
//		Scanner tastiera = new Scanner(System.in);  //sto indicando che come imput voglio la tastiera (con "System.in"), ma protrei anche leggere da file o da altro
//		int eta = tastiera.nextInt();               //estraggo dalla tastiera il prossimo numero intero inserito 
//	
	}

}
