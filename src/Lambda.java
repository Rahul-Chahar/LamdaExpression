@FunctionalInterface
interface MyLambda {
    public int add(int x, int y);
}

public class Lambda {
    public static void main(String[] args) {
        MyLambda m = (a, b) -> {
            return a + b;
        };
        System.out.println(m.add(20, 30));
    }
}
