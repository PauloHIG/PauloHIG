import javax.swing.JOptionPane;

public class IntGrafica1{
	public static void main (String[] args){
	//exibe apenas a pergunta na caixa de dialogo
	
String nome = JOptionPane.showInputDialog("Qual � o seu nome?");
	System.out.println(nome + " � burro.");
	//A pergunta e o nome
String nome2 = JOptionPane.showInputDialog("Qual � o seu nome?");
JOptionPane.showMessageDialog(null,nome2 + " � burro.", JOptionPane.ERROR_MESSAGE);

	}

}