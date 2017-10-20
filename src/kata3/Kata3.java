package kata3;

public class Kata3 {

    public static void main(String[] args) {
        Histogram histo = new Histogram();
        histo.increment("gmail.com", 12);
        histo.increment("ulpgc.es", 8);
        histo.increment("ull.es", 2);
        histo.increment("hotmail.com", 4);
        new HistogramDisplay(histo).execute();
    }
    
}
