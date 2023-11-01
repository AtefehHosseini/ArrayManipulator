

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Array numbers= new Array(5);
        //print the numbers of element in array
        // numbers.print();  
        //add new items
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
        numbers.insert(60);
        numbers.print();   

        numbers.printDivider();
        System.out.println("After Remove element of index 3");
        numbers.removeAt(3);
        numbers.print();
        numbers.printDivider();
        System.out.println(numbers.indexOf(50));
        
    }
}

