package task2;

public class Exercise2 {
    public static void main(String[] args) {
        Integer[] tab = {10, 21, 33, 40, 50, 60};
        int counter = Utils.countIf(tab, new Validator<Integer>()
        {
            @Override
            public boolean validate(Integer value) {
                return value % 3 == 0;
            }
        });
        System.out.println(counter);
    }
}
