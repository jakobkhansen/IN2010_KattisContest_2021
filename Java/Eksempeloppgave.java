/*
Under følger et eksempel på en løsning til følgende problem:
"Gi meg summen av n heltall"

Input:
5
60
34
2
13
20

Output:
134
*/

import java.util.Scanner;

class Eksempeloppgave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // Det første tallet, som markerer hvor mange tall som følger
        int s = 0;
        
        for (int i = 0; i < n; i++) { // Gjør noe med de neste n tallene
            s += sc.nextInt();
        }
        
        System.out.println(s);
        sc.close();
    }
}
