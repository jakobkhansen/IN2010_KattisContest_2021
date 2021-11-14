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

        // Dette fungerer naturligvis også med Double.parseDouble();


        // Det er god kodeskikk å lukke scanneren når man er ferdig, men det
        // er ikke påkrevd av Kattis :)
        sc.close();
    }
}
