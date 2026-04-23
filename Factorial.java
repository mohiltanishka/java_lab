class Factorial {
    void fact(int n) {
        int f = 1;

        for(int i = 1; i <= n; i++) {
            f = f * i;
        }

        System.out.println("Factorial = " + f);
    }

    public static void main(String args[]) {
        Factorial obj = new Factorial();
        obj.fact(5);
    }
}