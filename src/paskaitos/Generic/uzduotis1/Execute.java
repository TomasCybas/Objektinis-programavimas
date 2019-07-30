package paskaitos.Generic.uzduotis1;

public class Execute {
    public static void main(String[] args) {

        TwoItems<String, Integer> test = new TwoItems<>("testas", 75);
        test.setFirstItem("belekas");
        System.out.println(test.getFirstItem());
        System.out.println(test.getSecondItem());
    }
}
