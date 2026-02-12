public class WordFreq {
    String word;
    int frequency;

    // Constructor
    public WordFreq(String word, int frequency) {
        this.word = word;
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return word + " (" + frequency + ")";
    }
}