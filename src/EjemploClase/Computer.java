package EjemploClase;

public class Computer {

    private String cpu;
    private String discoDuro;
    private String memoriaRam;
    private String grafica;

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setDiscoDuro(String discoDuro) {
        this.discoDuro = discoDuro;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public void setGrafica(String grafica) {
        this.grafica = grafica;
    }

    public void showComputer() {
        System.out.println("computer whit cpu:" + cpu + ",Disco Duro:" + discoDuro + ", Memoria Ram:" + memoriaRam + ", Grafica:" + grafica);
    }
}
