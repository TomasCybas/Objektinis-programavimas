package paskaitos.threads;

public class Execute {

    public static void main(String[] args) {


        // Prime number check
        int primeCount = 0;
        for (int i = 0; i < 100000; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeCount++;
            }


        }
        System.out.println(primeCount + " pirminių skaičių");
    }
}



/*
10000
for (int i = 0; i < nums.length; i++) {
        boolean isPrime = true;
        for (int j = 2; j <= nums[i] / 2; j++) {
        if (nums[i] % j == 0) {
        isPrime = false;
        break;
        }
        }
        if (isPrime) {
        primeNums += nums[i] + " ";
        } else {
        nonPrimeNums += nums[i] + " ";
        }
        }*/
