import java.util.Scanner;

public class Problem07_CountOfBitsOne {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int inputNumber=scanner.nextInt();
        int count = 0;

        while (inputNumber>0){
            count+=inputNumber&1;
            inputNumber = inputNumber>>1;
        }

        System.out.println(count);
    }
}
