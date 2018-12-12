import java.util.*;
import java.io.*;
import java.math.*;

class Swaps {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] list = new int[n];
        
        for (int i = 0; i < n; i++) {
            list[i] = in.nextInt();
            System.err.println("list: " + list[i]);
        }
        
        int steps = 0;
        int j = n-1;
        for (int i=0; i<n; i++) {
            if (list[i] == 0) {
                System.err.println("j: " + j);
                while (j > i) {
                    if (list[j] == 1) {
                        list[i] = 1;
                        list[j] = 0;
                        steps++;
                        break;
                    }
                    j--;
                }
            }
        }
        
        System.out.println(steps);
    }
}