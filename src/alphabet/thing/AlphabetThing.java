
package alphabet.thing;

import java.util.Scanner;

public class AlphabetThing {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a letter and a number ");
        System.out.print("letter: ");
        String var1 = input.next();
        System.out.println();
        System.out.print("number: ");
        int num = input.nextInt();
        char ch = var1.charAt(0);
        for (int i = 0; i <num; i++) {
            if(ch=='a'){
                System.out.print(ch);
                ch+=25;
            }
            System.out.print(ch);
            --ch;
        }
    }
}
