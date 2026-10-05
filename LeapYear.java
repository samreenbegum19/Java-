
public class LeapYear {
    public static void main(String[] args) {
        int year = 2000; // Example input, you can change this

        // Leap year logic:
        // 1. Divisible by 4 → possible leap year
        // 2. But if divisible by 100 → not leap year
        // 3. Unless divisible by 400 → leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
            {
            System.out.println(year + " is a Leap Year");
        }
         else 
            {
            System.out.println(year + " is not a Leap Year");
        }
    }
}

