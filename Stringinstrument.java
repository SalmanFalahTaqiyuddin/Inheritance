package ulangan;

public class Stringinstrument extends Instruments {
    public int numStrings;

    public int getNumStrings() {
        return this.numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }

    public Stringinstrument() {
        super();
        numStrings = 0;
    }

    // constructor parameters
    public Stringinstrument(String name, double price, int numStrings) {

        super(name, price);
        this.numStrings = numStrings;

    }

    @Override
    public void print() {
        super.print(); // untuk manggil method print() di class Product
        System.out.println("numStrings: " + numStrings);

    }

}