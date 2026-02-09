import java.util.Scanner;
public class palindrome{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int org = n;
    int rev = 0;
      while (n != 0) {
         int dgt = n % 10;
         rev = rev * 10 + dgt;
         n = n / 10;
      }
      
      if (org == rev) {
            System.out.println("The number is a Palindrome");}
      else {
            System.out.println("The number is NOT a Palindrome");
      }
   } 
}