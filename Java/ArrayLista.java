import java.util.ArrayList;
public class ArrayLista{
public static void main(String[]args){

ArrayList<String> cores = new ArrayList<String>();
cores.add("branco"); //equivale a fazer isso no array normal:cores[0]="branco"
cores.add("vermelho");
System.out.println(cores.toString());

cores.add(0,"vermelho");
System.out.println(cores.toString());
//size,get,indexof video 22
//para remover cores.remove("branco");
}

}