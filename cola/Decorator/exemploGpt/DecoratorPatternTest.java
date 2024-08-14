public class DecoratorPatternTest {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n-----");

        Car sportsCarWithSound = new SoundSystemCar(new SportsCar(new BasicCar()));
        sportsCarWithSound.assemble();
    }
}


//main

/*Explicação
Car: Interface que define o método assemble().

BasicCar: Implementação básica da interface Car.

CarDecorator: Classe abstrata que implementa a interface Car e que tem um campo protegido decoratedCar para armazenar a instância que está sendo decorada.

SportsCar e SoundSystemCar: São decoradores concretos que adicionam comportamentos ao carro básico.

Uso do Padrão: No método main, criamos um SportsCar que adiciona funcionalidades ao BasicCar e depois criamos um SportsCarWithSound, que adiciona mais uma camada de funcionalidade. */