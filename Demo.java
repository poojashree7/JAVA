public class Demo {
    public int a = 10;
    protected int b = 20;
    int c = 30;         
    private int d = 40;
    public void display() {
        System.out.println("Inside same class:");
        System.out.println("Public a = " + a);
        System.out.println("Protected b = " + b);
        System.out.println("Default c = " + c);
        System.out.println("Private d = " + d);
    }
    public static void main(String args[]) {
        Demo obj = new Demo();
        System.out.println("Accessing members inside same package:");
        System.out.println("a = " + obj.a);  
        System.out.println("b = " + obj.b);   
        System.out.println("c = " + obj.c);  
        System.out.println("d = " +obj.d);        
        obj.display();
    }
}