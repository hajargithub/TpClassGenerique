package TP2_Exception;

public class NombreNegatifException  extends Exception{
    private final int valeurErronee;

    public NombreNegatifException(int valeurErronee) {
        super("Valeur négative non autorisée : " + valeurErronee);
        this.valeurErronee = valeurErronee;
    }

    public int getValeurErronee() {
        return valeurErronee;
    }
}
