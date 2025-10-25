class Car {
    private int speed;
    private double fuelLevel;
    private boolean engineStatus;
    private final int MAX_SPEED = 180;

    Car() {
        this.speed = 0;
        this.fuelLevel = 70;
        this.engineStatus = false;
    }

    void setSpeed(int speed) {
        if (speed >= 0 && speed <= MAX_SPEED) {
            this.speed = speed;
        } else {
            System.out.println("Invalid speed value!");
        }
    }

    void setFuelLevel(double fuelLevel) {
        if (fuelLevel >= 0 && fuelLevel <= 100) {
            this.fuelLevel = fuelLevel;
        } else {
            System.out.println("Invalid fuel level!");
        }
    }

    void setEngineStatus(boolean engineStatus) {
        this.engineStatus = engineStatus;
    }

    void startEngine() {
        if (!engineStatus) {
            if (fuelLevel > 0) {
                engineStatus = true;
                System.out.println("Engine started.");
            } else {
                System.out.println("Cannot start the engine — fuel tank is empty!");
            }
        } else {
            System.out.println("Engine is already running.");
        }
    }

    void stopEngine() {
        if (engineStatus) {
            engineStatus = false;
            speed = 0;
            System.out.println("Engine stopped.");
        } else {
            System.out.println("Engine is already off.");
        }
    }

    void accelerate(int increase) {
        if (!engineStatus) {
            System.out.println("Cannot accelerate — engine is off!");
            return;
        }

        if (fuelLevel <= 0) {
            System.out.println("Cannot accelerate — fuel is empty!");
            engineStatus = false;
            return;
        }

        if (speed + increase > MAX_SPEED) {
            speed = MAX_SPEED;
            System.out.println("Speed limit reached! (" + MAX_SPEED + " km/h)");
        } else {
            speed += increase;
            System.out.println("Accelerated to " + speed + " km/h.");
        }

        fuelLevel -= increase * 0.5;
        if (fuelLevel < 0) {
            fuelLevel = 0;
        }
    }

    void refuel(double quantity) {
        if (quantity <= 0) {
            System.out.println("Refuel amount must be positive.");
            return;
        }
        if (fuelLevel >= 100) {
            System.out.println("Tank is already full.");
            return;
        }
        fuelLevel += quantity;
        if (fuelLevel > 100) {
            fuelLevel = 100;
        }
        System.out.println("Refueled. Current fuel level: " + String.format("%.2f", fuelLevel) + "%");
    }

    void dashboard() {
        String status = engineStatus ? "ON" : "OFF";
        System.out.println("\n--- Car Dashboard ---");
        System.out.println("Engine: " + status);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel Level: " + String.format("%.1f", fuelLevel) + "%");
        System.out.println("----------------------\n");
    }
}

public class CarClass {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setFuelLevel(70);
        myCar.setSpeed(0);
        myCar.setEngineStatus(false);

        myCar.dashboard();
        myCar.startEngine();
        myCar.accelerate(50);
        myCar.accelerate(150);
        myCar.dashboard();
        myCar.stopEngine();
        myCar.refuel(30);
        myCar.dashboard();
    }
}
