import javax.swing.JOptionPane;

public class IntGrafica1{
	public static void main (String[] args){
	//exibe apenas a pergunta na caixa de dialogo
	
String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
	System.out.println(nome + " é burro.");
	//A pergunta e o nome
String nome2 = JOptionPane.showInputDialog("Qual é o seu nome?");
JOptionPane.showMessageDialog(null,nome2 + " é burro.", JOptionPane.ERROR_MESSAGE);

	}

}