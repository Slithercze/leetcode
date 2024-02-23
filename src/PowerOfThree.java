class PowerOfThree {
    public static boolean isPowerOfThree(int n) {
double x = Math.pow(Integer.MAX_VALUE-1, (double) 1 /3);
  return (n > 0 &&  x%n==0);
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(9));
    }
}