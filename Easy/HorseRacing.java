import java.util.*;

class HorseRacing {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] strengths = new int[N];
        
        for (int i = 0; i < N; i++) {
            strengths[i] = in.nextInt();    
        }
        
        Arrays.sort(strengths);
        
        int minDiff = Math.abs(strengths[0] - strengths[1]);
        for (int i=1; i<N-1; i++) {
            int diff = Math.abs(strengths[i] - strengths[i+1]);
            if (diff < minDiff) {
                minDiff = diff; 
            }
        }
        
        System.out.println(minDiff);
    }
}