package Exceptions.Throw;

public class Main {
    public static void main(String[] args) {
        String email = "eliot.aldersion@oxford.com";

        try {
            if (!email.contains("oxford.com")) {
                // throw new Exception("Only oxford domains are allowed.");
                throw new OnlyOxfordException("Only oxford domains are allowed");
            } else {
                System.out.println("Wellcome to Oxform University");
            }
        } catch (Exception err) {
            System.out.println(err);
        }
    }

}
