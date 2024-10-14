package ulangan;

public class Piano extends Instruments {
     String pianoType;

    public String getPianoType() {
        return this.pianoType;
    }

    public void setPianoType(String pianoType) {
        this.pianoType = pianoType;
    }
    public Piano() {
        super();
        pianoType = "coba";
    }


     //constructor parameters
     public Piano (String name, double price, String pianoType) {
        
                 
        super(name, price);
        this.pianoType = pianoType;
        
    }
        
@Override
public void print() {
    super.print(); //untuk manggil method print() di class Product
    System.out.println("pianoType: " + pianoType);
   
}
}

