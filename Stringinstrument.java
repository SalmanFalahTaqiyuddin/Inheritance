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

    
    public Stringinstrument(String name, double price, int numStrings) {

        super(name, price);
        this.numStrings = numStrings;

    }

   
    public void print() {
        super.print(); 
        System.out.println("numStrings: " + numStrings);

    }

}
