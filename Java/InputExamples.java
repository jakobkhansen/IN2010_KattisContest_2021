// Å lese input fra i Java terminalen er ikke like trivielt som i Python.
// Her må man hente enten Scanner eller BufferedReader fra standardbiblioteket.
import java.util.Scanner;

// Når man skal levere løsningen sin, må man også skrive inn navnet på klassen
// som inneholder main-metoden.
class Test {
    public static void main(String[] args) {

        // Herfra kan man bruke variabelen sc til å lese fra terminalen.
        Scanner sc = new Scanner(System.in);


        // Scanneren gir oss mange nyttige operasjoner!
        // Man kan sjekke verge seg mot EOFErrors ved å avslutte når man har
        // nådd enden av input.
        while (sc.hasNextLine()) {
          
            // Slik leser man inn neste string-verdi (frem til mellomrom)
            String s = sc.next();

            // Slik leser man inn neste int-verdi
            int i = sc.nextInt();
            // Her kan man også skrive nextDouble() og nextLong() når det
            // passer seg

            // Slik leser man inn en hel linje
            String line = sc.nextLine();

            // Hvis man vil lese inn en hel linje, og legge verdiene i
            // et array, kan man gjøre slik:
            String[] array = sc.nextLine().split(" ");
        }

        // Med mindre man spesifiserer noe annet, vil scanneren alltid lese
        // input som strings. Man kan gjøre dem om til ints slik:
        String s = sc.nextLine();
        int s_int = Integer.parseInt(s);



        // Noen ganger har man behov for å lese inn n heltall, og legge dem i en liste.
        // Her er en mulig løsning:

        int n = sc.nextInt(); // Leser inn n
        int[] array = new array[n]; // Oppretter et array med plass til elementene

        for (int i = 0; i < n; i++) { // Kjører en løkke n ganger
            array[i] = sc.nextInt(); // Fyller arrayet med tallene
        }



        // Det er god kodeskikk å lukke scanneren når man er ferdig, men det
        // er ikke påkrevd av Kattis :)
        sc.close();
    }
}


/* I utgangspunktet trenger du som oftest bare å importe Scanner,
 * lage en klasse med en tilhørende main-metode, og la Scanner lese
 * fra System.in, for å komme i gang :)
 */
