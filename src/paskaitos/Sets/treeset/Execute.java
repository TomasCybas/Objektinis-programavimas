package paskaitos.Sets.treeset;

public class Execute {
    public static void main(String[] args) {

        Tree t= new Tree();
        t.add(30);
        t.add(15);
        t.add(40);
        t.add(12);

        System.out.println(t.root.data);
    }
}
