import java.util.Scanner;
public class NestedLoops {
    public static void main(String[] args) {
        // nested loop mean a loop inside a loop

        Scanner sc = new Scanner(System.in);

        int rows;
        int columns;
        String symbol = "";
        System.out.println("Enter the number of rows");
        rows = sc.nextInt();
        System.out.println("Enter the number of columns");
        columns = sc.nextInt();
        System.out.println("Enter the number of symbol");
        symbol = sc.next();
        for( int i = 1; i <rows; i++){
            System.out.println();
            for(int j = i; j<= columns; j++){
                System.out.print(symbol);
            }
        }


    }
}
