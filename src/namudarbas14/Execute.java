package namudarbas14;
public class Execute {
    public static void main(String[] args) {

        Stack <Integer> stack = new Stack<>();
        stack.push(15);
        stack.push(13);
        stack.push(45);
        stack.push(21);


        stack.add(0, 399);
        System.out.println(stack);


        stack.remove(0);

        System.out.println(stack);







    }
}
