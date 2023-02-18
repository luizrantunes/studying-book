class Clock {
    String time;

    public String getTime() {
        return time;
    }

    void setTime(String t) {
        time = t;
    }
}

class ClockTest {
    public static void main(String[] args) {
        Clock c = new Clock();
        c.setTime("10:45");
        String tod = c.getTime();
        System.out.println("time: " + tod);
    }
}
