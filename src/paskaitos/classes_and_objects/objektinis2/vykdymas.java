package paskaitos.classes_and_objects.objektinis2;

public class vykdymas {
    public static void main(String[] args) {
        Trupmena x = new Trupmena(1, 1, 2);
        System.out.println(x);
        Trupmena y = new Trupmena(2, 3);
        x.prideti(y);
        System.out.println(x);
        System.out.println(x.toDouble());
    }
}
