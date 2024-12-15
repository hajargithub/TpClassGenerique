//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
 Paire< String, Double> p1 = new Paire<>();
 p1.setA("Hajar");
        p1.setB(12.0);
        if (p1.getA().equals("Hajar")) {
            System.out.println("Hajar");
        } else {
            System.out.println("Not Hajar");
        }
    }
}