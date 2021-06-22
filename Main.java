
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        String input = sc.nextLine();
        int spaceLength = input.length() - 1;
        StringBuilder output = new StringBuilder();
        for(int index = input.length()/2; index < input.length(); index++){
            printSequence(index, spaceLength, input, output);
            spaceLength--;
        }
        for(int index = 0; index < input.length()/2; index++){
            printSequence(index, spaceLength, input, output);
            spaceLength--;
        }
    }
    
    private static void printSequence(int index, int spaceLength, String input, StringBuilder output){
        for(int i=0; i < spaceLength; i++){
                System.out.print(" ");
            }
            output = output.append(input.charAt(index));
            System.out.print(output);
            System.out.println("");
    }
}
