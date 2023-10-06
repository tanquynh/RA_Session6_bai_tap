package BT3;

public class StopWatch {
    //   1. Khai báo các Atribute
    private long startTime;
    private long endTime;
    //   2.    Khai báo các contructor
    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    //   3.  khai báo các method
    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        if (endTime == 0) {
            return 0; // Trường hợp chưa gọi phương thức stop()
        } else {
            return endTime - startTime;
        }
    }
}
