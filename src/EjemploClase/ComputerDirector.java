package EjemploClase;

public class ComputerDirector {
    private ComputerBuilder computerBuilder;{
    
   public ComputerDirector(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public void buildComputer() {
        computerBuilder.buildCpu();
        computerBuilder.buildDiscoDuro();
        computerBuilder.buildMemoriaRam();
        computerBuilder.buildGrafica();
    }

}
