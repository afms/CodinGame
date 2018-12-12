import java.util.*;

class Temperatures {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        in.nextLine();
        int[] temps = new int[n];
        
        if (n == 0) { 
            System.out.println(0); 
            return;
        } else if (n == 1) {
            System.out.println(in.nextInt());
            return;
        }
        
        for (int i=0; i<n; i++){
            temps[i] = in.nextInt();
        }
        
        int minimum = temps[0];
        for (int i=1; i<n; i++) {
            if (Math.abs(minimum) == Math.abs(temps[i])) {
                if (minimum < temps[i]) {
                    minimum = temps[i];
                }
            } else if (Math.abs(minimum) > Math.abs(temps[i])) {
                minimum = temps[i];
            }
        }
        System.out.println(minimum);
    }
}