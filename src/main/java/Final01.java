import java.math.BigInteger;

public class Final01 {

    private int result;

    public Final01() {
    }

    public String getResult(String n) {

        String[] strArray = n.split("");
        int[] intArray = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
        }
        System.out.println();
        System.out.println(intArray.length);

        compare(intArray.length - 1, intArray);

        String answer = "";
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
            if (intArray[i] != 0)
                answer += intArray[i];
        }
        
        return answer;
    }

    private void compare(int endIndex, int[] intArray) {

        for (int i = 0; i < endIndex; i++) {
            if (intArray[i] > intArray[i + 1]) {
                intArray[i]--;
                setNine(i + 1, intArray);
            }
        }
        if (endIndex > 0)
            compare(endIndex - 1, intArray);
    }

    private void setNine(int startIndex, int[] intArray) {
        for (int i = startIndex; i < intArray.length; i++) {
            intArray[i] = 9;
        }
    }

}
