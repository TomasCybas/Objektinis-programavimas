package namudarbas15;

public class Execute {
    public static void main(String[] args) {
        Tree t  = new Tree();
        t.add(31);
        t.add(32);
        t.add(12);
        t.add(17);
        t.add(54);
        t.add(6);
        t.add(2);

        t.print();
        System.out.println();
        t.remove(54);

        t.print();
        System.out.println();
        t.total();
    }


}
