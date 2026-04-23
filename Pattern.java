class Pattern {

    void printPattern() {

        for(int i=1;i<=5;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Pattern obj = new Pattern();
        obj.printPattern();
    }
}