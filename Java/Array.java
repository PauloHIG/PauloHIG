//Array simples
//mais um pacote
import java.util.Arrays;
public class Array{


 public static void main(String[]args){
 
 int [] numeros = {1,2,3,4};
 String[] paises = {"Brasil","N�oBrasil"};
 
 System.out.println (paises[1]);
 //mudar
 paises[1]="Baf�o";
 System.out.println (paises[1]);
 //Esse � outro jeito de declarar(lembra o visualg)
 int[] exemplo = new int [10]; //bem parecido
 exemplo [0] = 1;
  exemplo [1] = 2;
  exemplo [2] = 3;
   exemplo [3] = 4;
   exemplo [4] = 124124113;
       System.out.print (exemplo[0]);
    System.out.print (exemplo[1]);
	    System.out.print (exemplo[2]);    
		System.out.print (exemplo[3]);
		    System.out.print(exemplo[4]);
   // para saber a quantidade de posi��es
 
   System.out.println ("\n Array paises " + paises.length);
    System.out.println ("Array exemplo " + exemplo.length);
	
	//Aquela importa��o serve para isso:
	System.out.println(Arrays.toString(exemplo));
	System.out.println(Arrays.toString(paises));
	
	//pesquisa para saber qual a posi��o de uma variavel no array
	int posicao = Arrays.binarySearch(exemplo,124124113);
	
	System.out.println(posicao);
 }
 
 }