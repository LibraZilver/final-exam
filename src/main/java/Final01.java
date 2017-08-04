import java.math.BigInteger;

public class Final01 {

    private int result;

    public Final01() {
    }

    public int getResult(int n) {
        String answer = "";
        if (n < 10)
            return n;

        else {
            String number = String.valueOf(n);
            String[] strArray = number.split("");
            int[] intArray = new int[strArray.length];
            for (int i = 0; i < strArray.length; i++) {
                intArray[i] = Integer.parseInt(strArray[i]);
            }
            for (int i = 0; i < intArray.length; i++) {
                System.out.print(intArray[i]);
            }
            System.out.println();
            System.out.println(intArray.length);
            for (int i = intArray.length -1 ; i > 0; i--) {
                if (intArray[i - 1] > intArray[i]) {
                    intArray[i - 1]--;
                    intArray[i] = 9;
                }

            }

            for (int i = 0; i < intArray.length; i++) {
                System.out.print(intArray[i]);
                answer += intArray[i];
            }
        }
        return Integer.parseInt(answer);
    }
}
