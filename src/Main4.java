public class Main4 {
    public static void main(String[] args) {
        LogicalOperations op = new LogicalOperations(){
            int x = 13;
        };
        op.printToHundred(13);

        op.printToMinusHundred(0);

        op.printFromNumberToNumber(4,15);

        op.printFromSmallerToLargerNumber(15,8);

        op.printEvenNumberFrom1to100();

        op.printOddNumbersFrom1to100();

        System.out.println(op.sumOfNumbers());

        System.out.println(op.sumAndAverage());

        op.printBackwards(100, 42);

        System.out.println(op.getAverageInRange(111,8899));

        System.out.println(op.getAverageForOddInRange(1,100));

        op.printTrianglePattern();

        //tema while loops
        Calculator calc = new Calculator();
        calc.printto100();
        op.printToMinus100();
        op.printFromFirstToLast(5,12);
        op.printFromSmallestToLargest(41, 25);
        op.printEvenNumbersInRange();
        op.printOddNumbersInRange();
        op.getAverageInRanges(111,8899);
        System.out.println(op.getAverageDivisibleTo7(1,21));
        op.getFibonacciSeries(20);
        op.printPattern(1,110);



    }
}
