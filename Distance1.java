class Distance1 {
    int km, m, cm;

    void input(int km, int m, int cm) {
        this.km = km;
        this.m = m;
        this.cm = cm;
    }

    void add(Distance1 d1, Distance1 d2) {
        cm = d1.cm + d2.cm;
        m = d1.m + d2.m + cm / 100;
        cm = cm % 100;
        km = d1.km + d2.km + m / 1000;
        m = m % 1000;
    }

    void display() {
        System.out.println(km + " km " + m + " m " + cm + " cm");
    }

    public static void main(String[] args) {
        Distance1 d1 = new Distance1();
        Distance1 d2 = new Distance1();
        Distance1 result = new Distance1();

        d1.input(2, 500, 50);
        d2.input(1, 800, 70);

        result.add(d1, d2);
        result.display();
    }
}