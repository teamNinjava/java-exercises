import java.util.Scanner;

public class ReadingFromCommandLine{

    public static void main(String[] args){
        System.out.print("Input 4 diget int: ");
        Scanner numReader = new Scanner(System.in);
        int readInt = numReader.nextInt();
        System.out.println(readInt/1000);
        System.out.println(readInt/100%10);
        System.out.println(readInt/10%10);
        System.out.println(readInt%10);
    }

}
