package EjemploClase;

interface ComputerBuilder { 
    void buildCpu();
    void buildDiscoDuro();
    void buildMemoriaRam();
    void buildGrafica();
    Computer getComputer();
}

public class GamingComputerBuilder implements ComputerBuilder {
    private final Computer computer = new Computer();
    
    @Override
    public void buildCpu() {
        computer.setCpu("Intel Core i7");
    }

    @Override
    public void buildDiscoDuro() {
        computer.setDiscoDuro("500 GB");
    }

    @Override
    public void buildMemoriaRam() {
        computer.setMemoriaRam("16 GB");
    }

    @Override
    public void buildGrafica() {
        computer.setGrafica("NVIDIA GTX 3050 de 4 GB");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}

