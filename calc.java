// polymorphism examples
public class calc{
    public void print(int num1){
        System.out.println(num1);
    }

    public void print(double num1){
        System.out.println(num1);
    }

    public void add(double num1, double num2){
        System.out.println(num1 + num2);
    }

    public void add(int num1, int num2){
        System.out.println(num1 + num2);
    }

    public static void main(String[] args){
        calc c = new calc();
        c.add(1,1);
    }
}