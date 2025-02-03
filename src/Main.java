import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> res = findPrimeNumbers(269);
        System.out.println(res);
    }

    public static ArrayList<Integer> findPrimeNumbers(int max) {
        ArrayList<Integer> primes = new ArrayList<>();
        int[] numbers = new int[max];

        //create array
        for (int it = 0; it < max; it++) {
            numbers[it] = it + 1;
        }

        //iterate
        for (int outer_index = 0; outer_index < (max - 1); outer_index++) {
            int plaintiff = numbers[outer_index];
            boolean isPrime = true;
            if (plaintiff == 1) {
                primes.add(plaintiff);
            } else {
                //iterate backwards from one less than defendant
                for (int inner_index = outer_index - 1; inner_index > 0; inner_index--) {
                    int defendant = numbers[inner_index];
                    if (plaintiff % defendant == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    primes.add(plaintiff);
                }
            }
        }

        return primes;
    }
}