package sem_8.Ex005;

public class Car {
    private EngineInterface engine;

    public Car(EngineInterface engine) {
        this.engine = engine;
    }

    public void startCar() {
        engine.start();
    }

    public void stopCar() {
        engine.stop();
    }
}
