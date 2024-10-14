package ulangan;

    import java.util.Scanner;
    public class DriverClass {


    public static void main(String[] args) {
        
        String choice = "";
        Scanner input = new Scanner(System.in);
        
        System.out.println("Guitar atau Piano?");
        choice = input.next();

        if (choice.equalsIgnoreCase("Guitar")) {
            System.out.println("Inputkan name: ");
            String name = input.next();
            System.out.println("Inputkan price: ");
            double price = input.nextDouble();
            System.out.println("Inputkan numStrings: ");
            int numStrings = input.nextInt();
            input.nextLine();
            System.out.println("apakah Electric: ");
            boolean isElectric = input.nextBoolean();
            Guitar Guitar2 = new Guitar(name, price, numStrings, isElectric);
            Guitar2.print();

        } else if (choice.equalsIgnoreCase("Piano")) {
        System.out.println("Inputkan name: ");
        String name = input.next();
        System.out.println("Inputkan price: ");
        double price = input.nextDouble();
        input.nextLine();
        System.out.println("Inputkan pianotype: ");
        String pianoType = input.nextLine();
        Piano Piano2 = new Piano(name, price, pianoType);
            Piano2.print();
        } else {
            System.out.println("Pilihan yang anda masukkan salah.");

        }
        input.close();

    }

}

