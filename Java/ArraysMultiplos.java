import java.util.Random;

public class ArraysMultiplos{
  public static void main(String[]args){
 int [] []  chatice = {{1,2,3,4},{4,5,6},{7,8,9}};
  System.out.println(chatice [0] [0]);
  System.out.println(chatice [0] [2]);
  System.out.println(chatice [2] [2]);
    System.out.println("");
  System.out.println(chatice.length);//mostra quantas"linhas " eu tenho
   System.out.println(chatice[0].length);//mostra quantos elementos a "linha" tem
   //os resultados esperados s�o 3e4
   
   //n dimens�es mas n�o s�o necess�rias
    int [] [] [][][] muitas ={{{{}}}};
	//Ramdon(n�o est� importada )serve para numeros aleatorios
	//Como funciona
	Random al = new Random();
	al.nextInt(10);//esse 10 � o limite
	 System.out.println(al.nextInt(10));//vai aparecer qualquer numero entre 1 e 10
  }


}