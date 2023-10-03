package EjemploClase;

public class Main {
    public static void main(String[] args) {
        ComputerBuilder gamingComputerBuilder = new GamingComputerBuilder();
        ComputerDirector director = new ComputerDirector(gamingComputerBuilder);

        director.buildComputer();

        Computer computer = gamingComputerBuilder.getComputer();
        computer.showComputer(); // Supongo que tienes un método showComputer() en la clase Computer
    }
    
}
