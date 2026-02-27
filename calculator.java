import java.util.Scanner;
public class calculator{
  int add(int a, int b){
    return a+b;}
  int add(int a, int b, int c){
    return a+b+c;}
  double add(double a, double b, double c){
    return a+b+c;}
  public static void main(String args[]){
    calculator calc=new calculator();
    int a= calc.add(2,3);{
      System.out.println(a);}
    int b= calc.add(5,6,2);{
      System.out.println(b);}
    double c=calc.add(1,5);{
      System.out.println(c);}
  }
}