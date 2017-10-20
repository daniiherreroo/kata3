package kata3;

public class Kata3 {

    public static void main(String[] args) {
        Histogram histo = new Histogram();
        histo.increment("gmail.com");
        histo.increment("gmail.com");
        histo.increment("gmail.com");
        histo.increment("ulpgc.es");
        histo.increment("ulpgc.es");
        histo.increment("ulpgc.es");
        histo.increment("ulpgc.es");
        histo.increment("ull.es");
        histo.increment("ull.es");
        histo.increment("hotmail.com");
        new HistogramDisplay(histo).execute();
    }
    
}
