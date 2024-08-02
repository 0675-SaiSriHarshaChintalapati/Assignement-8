//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a=12;
        int b=0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println("Divided by zero Exception");
        }


    }
}