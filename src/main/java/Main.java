public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();

        for (int i = 0; i < 10; i++) {
            User toAdd = new User((long) i + 1, "Current: " + (i + 1), "password");
            System.out.println(toAdd);
            stack.Add(toAdd);
        }
        for (int i = 0; i < 10; i++) {
            String toAdd = "String: " + (i + 1);
            System.out.println(toAdd);
            stack.Add(toAdd);
        }
        for (int i = 0; i < 20; i++) {
            Object added = stack.Pop();
            System.out.println(added.toString() + ";  Stack size: " + stack.Size());
        }
    }
}
