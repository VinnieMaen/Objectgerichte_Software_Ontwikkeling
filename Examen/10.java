//Een compositie is de situatie waarbij objecten niet perse rechtstreeks in een "parent class" worden aangemaakt. Ze kunnen in de
//Main klasse worden aangemaakt en dan toegewezen worden aan een ander object aan de hand van een set of add functie. Zoals bijvoorbeeld
//een computer, cpu en monitor worden appart aangemaakt. De cpu en monitor worden met een set functie dan toegekend aan de computer in plaats
//van in het computer object new CPU(); en new Monitor(); te gebruiken.

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        CPU cpu = new CPU();
        Monitor monitor = new Monitor();

        computer.setCPU(cpu);
        computer.setMonitor(monitor);
    }
}
