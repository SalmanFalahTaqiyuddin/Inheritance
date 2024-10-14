package ulangan;

public class Guitar extends Stringinstrument {
    private boolean isElectric;

    public boolean isIsElectric() {
        return this.isElectric;
    }

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public Guitar() {
        super();
        isElectric = false;
    }
    public Guitar (String name, double price, int numStrings, boolean isElectric) {
             
        super(name, price, numStrings);
        this.isElectric = isElectric;        
    }
        

public void print() {
    
    System.out.println("Name: " + name);
    System.out.println("Price: " + price);
    System.out.println("numStrings: " + numStrings);
    System.out.println("isElectric: " + isElectric);
   
}
}



