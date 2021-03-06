package Model;

public class Word {

    private int wordid;

    public Word(int wordid, String word, String meaning) {
        this.wordid = wordid;
        this.word = word;
        this.meaning = meaning;
    }

    private String word, meaning;

    public int getWordid() {
        return wordid;
    }

    public void setWordid(int wordid) {
        this.wordid = wordid;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

}
