package may.ex_21052024.abstraction.abstractkeyword.CarEx;

public class Lab197 {
    public static void main(String[] args) {

        Car lambo = new Car() {
            @Override
            void brakeMech() {

            }
        };
        lambo.start();
        lambo.partGearBox();
        lambo.stop();

        Tesla m1 = new Tesla();
        m1.openCar();
        m1.start();
        m1.partGearBox();
        m1.stop();
    }

}
