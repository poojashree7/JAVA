import java.util.Scanner;
public class day{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int d=sc.nextInt();
    if (d==1)
      System.out.println("MONDAY");
    else if (d==2)
      System.out.println("TUESDAY");
    else if (d==3)
      System.out.println("WEDNESDAY");
    else if (d==4)
      System.out.println("THURSDAY");
    else if (d==5)
      System.out.println("FRIDAY");
    else if (d==6)
      System.out.println("SATURDAY");
    else 
      System.out.println("SUNDAY");
  }
}
      