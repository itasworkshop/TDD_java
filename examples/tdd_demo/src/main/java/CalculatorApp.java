
class Calculator{

    private int a;
    private int b;

    public Calculator(int a,int b) {
        this.a = a;
        this.b = b;
    }

    public int addition(){
        int result = this.a + this.b;
        return result;
    }
}

public class CalculatorApp {
    public static void main(String[] args){
        Calculator calc = new Calculator(30,25);
        System.out.println(calc.addition());
    }
}
