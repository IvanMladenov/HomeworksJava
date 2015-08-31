import java.util.Scanner;

public class Problem08_CountOfEqualBitPairs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        String binaryRepresentation = Integer.toBinaryString(input);

        char previousBit = binaryRepresentation.charAt(binaryRepresentation.length() - 1);

        int counter=0;
        for (int i=binaryRepresentation.length()-2; i>=0; i--){
            char currentChar=binaryRepresentation.charAt(i);
            if(currentChar==previousBit){
                counter++;
            }

            previousBit=currentChar;
        }

        System.out.println(counter);

    }
}
