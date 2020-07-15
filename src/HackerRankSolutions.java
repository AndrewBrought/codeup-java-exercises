
    import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerRankSolutions {

    public void wordChopper(){
        Scanner scan = new Scanner (System.in);
        int x = scan.nextInt();
        String s;

        for (int i = 0; i < x; i++){
            s = scan.next();

            for (int j = 0; j < s.length(); j++){

                if (j % 2 == 0){
                    System.out.print(s.charAt(j));
                }
            }
            System.out.print(" ");
            for (int j = 0; j < s.length(); j++){
                if (j % 2 != 0){
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
    } //END

    public void arrayReverse(){
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scan.nextLine().split(" ");
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = n - 1; i >= 0; i--) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
            System.out.print(arr[i] + " ");
        }

        scan.close();
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

//       convert base 10 to binary and return max count of 1s
        Scanner scanner = null;
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int consec1 = 0;
        String strBinary = Integer.toString(n, 2);
        // above is binary of given in in string
        String[] strparts = strBinary.split("0");
        //above we get all strings of ones, below find max from them
        for(int i = 0; i < strparts.length; i++ ){
            if (consec1 < strparts[i].length()) {
                consec1 = strparts[i].length();
            }
        }
        System.out.println(consec1);  //result



    }
}

