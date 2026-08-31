
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

class AdvancedCalculator extends Calculator {
    public int multi(int a, int b) {
        return a * b;
    }
}

public class inherdemo {
    public static void main(String[] args) {
        AdvancedCalculator obj = new AdvancedCalculator();

        // Correct method calls
        System.out.println(
            obj.add(10, 34) + " : " +
            obj.sub(52, 45) + " : " +
            obj.multi(5, 5)
        );
    }
}
