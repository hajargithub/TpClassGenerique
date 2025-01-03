package test;

public class ClasseNonGenerique extends Paire<String,Double> {
private int id;

public ClasseNonGenerique(String a, Double b, int id) {
        super(a, b);
        this.id = id;
    }
    public ClasseNonGenerique() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
