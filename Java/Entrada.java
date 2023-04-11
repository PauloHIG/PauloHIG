import java.util.Scanner;
//ver videeo 11 para revis�o
public class Entrada{
	public static void main (String[] args){
	//receber dados utilizando a chamada (tirar as barras se quiser relembrar)
	//System.out.println(args[0]);
	Scanner nom = new Scanner (System.in);
//exemplo II : interatividade
System.out.println("Qual � o seu nome?");
String nome = nom.nextLine();	
System.out.println(nome + " � legal.");
	
	}

}