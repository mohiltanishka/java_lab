class Palindrome {

    void check(int n) {
        int rev = 0, r, temp = n;

        while(n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }

        if(temp == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    public static void main(String args[]) {
        Palindrome obj = new Palindrome();
        obj.check(121);
    }
}