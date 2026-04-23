class Distance2 {
    int m, cm;

    void input(int m, int cm) {
        this.m = m;
        this.cm = cm;
    }

    void add(Distance2 d1, Distance2 d2) {
        cm = d1.cm + d2.cm;
        m = d1.m + d2.m + cm / 100;
        cm = cm % 100;
    }

    void display() {
        System.out.println(m + " meter " + cm + " cm");
    }

    public static void main(String args[]) {

        Distance2 d1 = new Distance2();
        Distance2 d2 = new Distance2();
        Distance2 result = new Distance2();

        d1.input(5, 80);
        d2.input(3, 40);

        result.add(d1, d2);
        result.display();
    }
}