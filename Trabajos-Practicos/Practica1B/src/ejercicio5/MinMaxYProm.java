package ejercicio5;

public class MinMaxYProm {
    private int min;
    private int max;
    private int prom;

    public MinMaxYProm() {
        min = 9999;
        max = -1;
        prom = 0;
    }

    public MinMaxYProm(int min, int max, int prom) {
        this.min = min;
        this.max = max;
        this.prom = prom;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getProm() {
        return prom;
    }

    public void setProm(int prom) {
        this.prom = prom;
    }

    @Override
    public String toString() {
        return "MinMaxYProm{" +
                "min=" + min +
                ", max=" + max +
                ", prom=" + prom +
                '}';
    }
}
