public class IntegerArithmeticDemo6 {
    public static void main(String[] args) {
        int n = -536870912;
        int a = n >> 1;  // 11110000 00000000 00000000 00000000 = -268435456
        int b = n >> 2;  // 11111000 00000000 00000000 00000000 = -134217728
        int c = n >> 28; // 11111111 11111111 11111111 11111110 = -2
        int d = n >> 29; // 11111111 11111111 11111111 11111111 = -1
    }
}