package paskaitos.recursion;

public class vykdymas {

    public static int factorial(int num){
        if(num == 1) return 1;
        return num * (factorial(num - 1));
    }

    public static int daugyba(int x, int y){
        if(y == 1) return x;
        return x + daugyba(x, y - 1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(daugyba(6, 4));
    }
}
