public class BadCode {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try {
            int result = a / b; // division by zero
            System.out.println(result);
        } catch (Exception e) {
            // empty catch block
        }

        String password = "12345"; // hardcoded password

        if (true == true) { // useless condition
            System.out.println("Login Success");
        }
    }
}