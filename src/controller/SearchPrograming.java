
package Controller;

import common.Algorithm;
import common.Library;
import model.Element;
import view.Menu;
import Controller.Validation;


public class SearchPrograming extends Menu<String> {

    Validation vl = new Validation();

    static String[] mc = {"Linear Search", "Binary Search", "Exit"};

    protected Library library;
    protected Algorithm algorithm;
    protected int[] array;
    protected int size_array;

    public SearchPrograming(Element element) {
        super("PROGRAMMING", mc);
        library = new Library();
        algorithm = new Algorithm();
        size_array = element.getSize_array();
        array = element.getArray();

    }

  
    public void execute(int n) {
        switch (n) {
            case 1: {
                linearSearch();
                break;
            }
            case 2: {
                binarySearch();
                break;
            }
            case 3: {
                System.exit(0);

            }
        }
    }

   public void linearSearch() {
        System.out.println("The array ");
        library.display(array);
        int x = vl.getValueInt("Enter search value:");
        if (algorithm.linearSearch(array, x) != -1) {
            System.out.println("Found " + x + " at index:" + (algorithm.linearSearch(array, x)));
        } else {
            System.out.println("No have number " + x + " in array");
        }
        System.out.println("");
    }

    public void binarySearch() {
        System.out.print("Sorted array: ");
        algorithm.quickSort(array, 0, size_array - 1);
        library.display(array);
        int x = vl.getValueInt("Enter search value:");
        if (algorithm.binarySearch(array, x) != -1) {
            System.out.println("Found " + x + " at index:" + (algorithm.binarySearch(array, x)));
        } else {
            System.out.println("No have number " + x + " in array");
        }
        System.out.println("");
    }

}

