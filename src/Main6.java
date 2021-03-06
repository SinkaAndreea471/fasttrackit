import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main6 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(3);
        System.out.println(myList.get(0));
        myList.remove(Integer.valueOf(3));
        System.out.println(myList.size());
        List<Float> listOfFloats = new ArrayList<>();
        listOfFloats.add(4.5F);
        System.out.println(listOfFloats.size());
        LogicalOperations op = new LogicalOperations();
        List<String> listOfStrings= new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            listOfStrings.add(i + "");
        }
        System.out.println(listOfStrings);

        for (String value : listOfStrings){
            System.out.println(value);
        }

        List<Integer> myListOfInt = new ArrayList<>();
        for (int i = 1; i <= 41; i++) {
            myListOfInt.add(i);
        }
        op.printNumbersFromListBackwards(myListOfInt);
        op.printList(myListOfInt);
        op.addToEndOfList(myListOfInt, 9);
        op.printListStartingFromGivenNumber(myListOfInt,25);
        op.printListWithAddedStringToSpecificIndex(new ArrayList<>(Arrays.asList("Buenos Aires", "Cordoba", "La Plata")), 3, "Manciuria");
        op.addNumberToFirstIndexInList(myListOfInt,5);
        op.printListAndShowValueForSpecificIndex(myListOfInt);
        System.out.println("The biggest value in the string is " + op.getTheBiggestValueFromList(myListOfInt));
    }

}
