import java.util.Random;
import java.util.Scanner;

public class coin{

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Who are you?");
    System.out.print(">");
    String n = sc.nextLine();
    System.out.println("Hello, "+n+"!");
    String[] hand = {"Hands","Tails"};
    Random ram=new Random();
int cnt = 0;


System.out.println("Tossing a coin...");
for(int i = 0; i <3; i ++){
String  coin = hand[ram.nextInt(2)];
if(coin==hand[0])cnt++;

System.out.println("Round "+(i+1)+": "+ coin);
}
int a=3-cnt;
System.out.println("Heads:"+ cnt+", Tails: "+a);
if(cnt>a)System.out.println("You won!");
else {
    System.out.println("You lost.");
}
}



}
