package InterfaceSegregation;

public class Interface_Segregation {
    interface Printer {
        void print();
    }

    interface Scanner {
        void scan();
    }

    class MultifunctionDevice implements Printer, Scanner {
        public void print() {
            System.out.println("Printing...");
        }

        public void scan() {
            System.out.println("Scanning...");
        }
    }

    class OldPrinter implements Printer {
        public void print() {
            System.out.println("Printing...");
        }
    }

}
