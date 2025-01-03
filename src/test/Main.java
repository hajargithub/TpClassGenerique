package test;

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
        Triplet<String,Double,Integer> p2= new Triplet<>();
        p2.setA("Ahmed");
        p2.setB(12.0);
        p2.setC(12);
        if (p2.getA().equals("Ahmed")) {
            System.out.println("Ahmed");
        }
        else {
            System.out.println("Not Ahmed");
        }
        ClasseNonGenerique p3=new ClasseNonGenerique( "Haroune",15.5,1);
        System.out.println("P3 id est: "+p3.getId());
    }
}