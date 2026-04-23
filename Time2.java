class Time2 {
    int hr, min;

    void input(int hr, int min) {
        this.hr = hr;
        this.min = min;
    }

    void add(Time2 t1, Time2 t2) {
        min = t1.min + t2.min;
        hr = t1.hr + t2.hr + min / 60;
        min = min % 60;
    }

    void display() {
        System.out.println(hr + " hour " + min + " minutes");
    }

    public static void main(String args[]) {

        Time2 t1 = new Time2();
        Time2 t2 = new Time2();
        Time2 result = new Time2();

        t1.input(2, 45);
        t2.input(3, 30);

        result.add(t1, t2);
        result.display();
    }
}