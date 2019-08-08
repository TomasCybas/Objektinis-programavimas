package namudarbas17;

import javax.swing.*;

public class Timer extends Thread {
    public Integer timeLimit;
    public Integer time = 0;
    public JLabel timerField;
    public volatile boolean started = false;

    public boolean isStarted() {
        return started;
    }

    public Integer getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(Integer timeLimit) {
        this.timeLimit = timeLimit;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public JLabel getTimerField() {
        return timerField;
    }

    public void setTimerField(JLabel timerField) {
        this.timerField = timerField;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    public Timer(Integer timeLimit, JLabel timerField) {
        this.timeLimit = timeLimit;
        this.timerField = timerField;
    }


    public void run() {
        while (true) {
            if (started){
                timerField.setText(time.toString());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                time++;
                if (time > timeLimit){
                    started = false;
                }
            }
        }
    }
}



