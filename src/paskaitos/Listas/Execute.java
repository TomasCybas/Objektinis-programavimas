package paskaitos.Listas;

public class Execute {
    public static void main(String[] args) {

        MList<Integer> l = new MList<>();

        l.add(10);
        l.add(15);
        l.add(3);

        l.remove(1);

        Integer i = l.get();

        while (i != null){
            System.out.println(i + " ");
            i = l.get();
        }


    }


}
