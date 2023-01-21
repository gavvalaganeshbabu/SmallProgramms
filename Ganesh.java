import java.util.Scanner;
public class Ganesh{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n= sc.nextInt();
String s=isEvenOdd(n);
System.out.println(s);
System.out.println(s);
}
public static String isEvenOdd(int n){
if(n%2==0)
return "Even";
else 
return "Odd";
}
}