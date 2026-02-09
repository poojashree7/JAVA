import java.util.Scanner;
class salary{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int salary=sc.nextInt();
    if (salary>=50000)
      System.out.println("BONUS="+(salary*0.10));
    else if (salary>=30000)
      System.out.println("BONUS="+(salary*0.07));
    else 
      System.out.println("BONUS="+(salary*0.05));
  }
}