package be.vdab.taken.kleinsteopp;

public class Opp {


    private final int length;
    private final int width;

    public Opp(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public int getOppervlakte(){
        return length*width;

    }
    @Override
    public String toString(){
        return length + " * " + width;
    }

}
