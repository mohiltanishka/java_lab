class Time1 {
    int hr, min, sec;

    void input(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    void add(Time1 t1, Time1 t2) {
        sec = t1.sec + t2.sec;
        min = t1.min + t2.min + sec / 60;
        sec = sec % 60;
        hr = t1.hr + t2.hr + min / 60;
        min = min % 60;
    }

    void display() {
        System.out.println(hr + " hr " + min + " min " + sec + " sec");
    }

    public static void main(String[] args) {
        Time1 t1 = new Time1();
        Time1 t2 = new Time1();
        Time1 result = new Time1();

        t1.input(2, 45, 50);
        t2.input(1, 30, 30);

        result.add(t1, t2);
        result.display();
    }
}