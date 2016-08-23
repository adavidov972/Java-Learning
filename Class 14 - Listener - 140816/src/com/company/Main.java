package com.company;

public class Main {

    public static void main(String[] args) {
        MotionSensor motionSensor = new MotionSensor();
        Police police = new Police();
        motionSensor.SetLitener(police);
    }
}


class MotionSensor {

    private MotionSensorListener litener;

    public MotionSensorListener getLitener() {
        this.litener = litener;

    }

    public void detectMotion() {

    }

    public void SetLitener(MotionSensorListener listener) {
        this.litener = listener;
    }


    interface MotionSensorListener {
        public void motionDetected();

    }

}

class Police implements MotionSensor.MotionSensorListener {


    @Override
    public void motionDetected() {
        System.out.printf("You are under arrest");
    }
}