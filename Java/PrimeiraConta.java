import javax.swing.JOptionPane;
public class PrimeiraConta{
	public static void main (String[] args){
//2+3 operador bunario
//-2 operador unário apenas um numero
//true ?"sim":"não" op trenario
int x = 9+4;
String n1 = JOptionPane.showInputDialog("digite o primeiro numero da soma.");
String n2 = JOptionPane.showInputDialog("digite o segundo numero da soma.");
String xb = n1+n2;

JOptionPane.showMessageDialog(null, xb);
	}

}