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
        pianoType = "null";
    }


     
     public Piano (String name, double price, String pianoType) {
        
                 
        super(name, price);
        this.pianoType = pianoType;
        
    }
        

public void print() {
    super.print(); 
    System.out.println("pianoType: " + pianoType);
   
}
}

