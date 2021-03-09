package chemical.classes;

public class Compound {
    private final int t;   // Токсичность
    private final int e;   // Взрывоопасность
    private final int r;   // Радиационный фон

    private double complexDanger;    // Комплексная опасность

    public Compound(int t, int e, int r){
        this.t = t;
        this.e = e;
        this.r = r;
    }

    public int getT() {
        return t;
    }

    public int getE() {
        return e;
    }

    public int getR() {
        return r;
    }

    public double getComplexDanger(){
        return 1.7*this.t + 5.4*this.e + 4.9*this.r;
    }

    public String toString(){

        return "(" + this.t + ", " + this.e + ", " + this.r + ")" + " - " + this.getComplexDanger();
    }
}
