/**
 * Class 7 sample code
 */

public class Main {
    public static void main(String[] args) {
        final int N = 1000000;
        long startTime, endTime;
        long sumN;
        startTime = System.nanoTime(); // get starting time
        sumN = sumToN(N); // do computation
        endTime = System.nanoTime(); // end time
        System.out.println("Sum to " + N + " is : " + sumN);
        System.out.println("It took " + (endTime - startTime) + " nanoseconds");

    }//main

    /**
     * A "somewhat long"? computation
     * @param n
     * @return
     */
    public static long sumToN(int n){
        long answer = 0;
        for(int i = 1; i <= n; i++)
            answer = answer + i;
        return answer;
    }//sumToN

    /**
     * Building a long string without string builder
     * @param c
     * @param n
     * @return
     */
    public static String stringRepeat1(char c, int n){

        String answer = "";
        for(int i = 0; i < n; i++)
            answer = answer + c;
        return answer;
    }//stringRepeat1


    /**
     * Building a long string with string builder
     * @param c
     * @param n
     * @return
     */
    public static StringBuilder stringRepeat2(char c, int n){
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < n; i++)
            answer.append(c);
        return answer;

    }//stringRepeat2


}