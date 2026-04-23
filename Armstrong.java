class Armstrong {

    void check(int n) {
        int r, sum = 0, temp = n;

        while(n > 0) {
            r = n % 10;
            sum = sum + r*r*r;
            n = n / 10;
        }

        if(sum == temp)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }

    public static void main(String args[]) {
        Armstrong obj = new Armstrong();
        obj.check(153);
    }
}