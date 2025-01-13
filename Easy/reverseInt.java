package Easy;

public class reverseInt {
    public static int reverse(int x) {
        int res = 0;
        boolean neg = false;
        if (x < 0) {
            neg = true;
            x = -x;
        }
        while (x > 0) {
            int i = x % 10;
            x /= 10;
            if ((res > Integer.MAX_VALUE/10) || (res == Integer.MAX_VALUE/10 && i > 7)) return 0;
            else res = res * 10 + i;
        }
        return neg ? -res : res;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
}
