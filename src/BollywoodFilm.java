/* Written by Christopher Bergsveinsson
 CSC 223
 Every Tuesday and  Thursday 9:35am → 11:35am
 Programming Assignment 18 - Film Classes - Bollywood Film Class */

public class BollywoodFilm extends ForeignFilm {

    private static int songMax = 20;
    private String[] songInfo = new String[songMax];
    private int songNum = 0;
    private static int secondaryLangMax = 5;
    private String[] secondaryLangInfo = new String[secondaryLangMax];
    private int secondaryLangNum = 0;

    public BollywoodFilm() {
        super();
        songInfo = new String[songMax];
        secondaryLangInfo = new String[secondaryLangMax];
    }

    public BollywoodFilm(String filmName, String directorName, int yearOfRelease, String translatedFilmName, String filmLanguage, String[] subtitleInfo, String[] songInfo, String[] secondaryLangInfo) {
        super(filmName, directorName, yearOfRelease, translatedFilmName, filmLanguage, subtitleInfo);
        this.songInfo = songInfo;
        this.secondaryLangInfo = secondaryLangInfo;
    }


}
