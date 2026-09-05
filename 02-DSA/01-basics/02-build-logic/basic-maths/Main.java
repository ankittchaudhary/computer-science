public class Main {
    public static void main(String[] args) {
        int num = 35330;
        System.out.println(countDigits(num));
    }

    static int countDigits(int num) {
        if (num == 0) return 1;

        long n = Math.abs((long) num);
        int count = 0;

        while (n > 0) {
            count++;       
            n = n / 10; 
        }

        return count;
    }
}
