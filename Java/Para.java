public class Para{
   public static void main(String[]args){
   
   
 int [] []  chatice = {{1,2,3},{4,5,6},{1,2,3}};
//para escrever os numeros de 0 a 2
int n = 1;
for (int l=0;l<3;l++){
for (int c=0;c<3;c++){
chatice [l][c] = n;
n=n+1;
}
}
for (int l=0;l<3;l++){
for (int c=0;c<3;c++){
System.out.print(chatice [l] [c]);

}
System.out.println("");
}

}
}