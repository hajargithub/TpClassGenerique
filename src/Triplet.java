public class Triplet <T,U,V>  extends Paire{
    private V c;
    public Triplet(T a, U b, V c) {
        super(a, b);
        this.c = c;
    }
    public Triplet() {
        super();
    }
    public V getC() {
        return c;
    }
    public void setC(V c) {}
}
