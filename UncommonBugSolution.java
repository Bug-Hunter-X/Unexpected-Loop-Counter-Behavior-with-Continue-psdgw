public class UncommonBugSolution {
    public static void main(String[] args) {
        int x = 0;
        while (x < 10) {
            if (x == 5) {
                x++; // Increment x before continuing
                continue; 
            }
            System.out.print(x + " ");
            x++;
        }
    }
}