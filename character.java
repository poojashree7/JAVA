import java.util.Scanner;
public class character{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    char ch=sc.next().charAt(0);
    if (ch>='A' && ch<='Z')
      System.out.println("UPPERCASE LETTER");
    else if (ch>='a' && ch<='z')
      System.out.println("LOWERCASE LETTER");
    else if (ch>='0' && ch<='9')
      System.out.println("DIGIT");
    else
      System.out.println("SPECIAL CHARACTER");
  }
}
    