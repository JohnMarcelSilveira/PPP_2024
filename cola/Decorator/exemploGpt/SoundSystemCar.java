public class SoundSystemCar extends CarDecorator {

    public SoundSystemCar(Car c) {
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding sound system to the car.");
    }
}
