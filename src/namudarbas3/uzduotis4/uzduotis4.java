package namudarbas3.uzduotis4;

public class uzduotis4 {
    public static void main(String[] args) {
        for (int i = 10; i < 100; i++){
            String tmp = Integer.toString(i);
            String reverse = new StringBuffer(tmp).reverse().toString();
            int reverseInt = Integer.parseInt(reverse);
            if( (i % 10) == (i / 10 * 2) && reverseInt - 36 == i ){
                System.out.println("Sugalvotas skaičius: " + i);
            }
        }
    }
}
