package task1;

public class Exercise1 {
    public static void main(String[] args) {
        UserValidator userValidator = new UserValidator();
        String[] results = userValidator.validateEmails("pb@",
                "@yahoo.com");
        System.out.println(results[0]);
        System.out.println(results[1]);
    }
}

