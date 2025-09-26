/* Written by Christopher Bergsveinsson
 CSC 223
 Every Tuesday and  Thursday 9:35am → 11:35am
 Programming Assignment 18 - Film Classes - Foreign Film Class */

public class ForeignFilm extends Film {

    private String translatedFilmName;
    private String filmLanguage;
    private static final int subtitleMax = 10;
    private int subtitleNum = 0;
    private String[] subtitleInfo = new String[subtitleMax];

    public ForeignFilm() { // unique constructors that take different sets of parameters
        super();
        translatedFilmName = "";
        filmLanguage = "";
        subtitleInfo = new String[subtitleMax];
        subtitleNum = 0;
    }

    public ForeignFilm(String filmName, String directorName, int yearOfRelease, String translatedFilmName, String filmLanguage, String[] subtitleInfo) {
        super(filmName, directorName, yearOfRelease);
        this.translatedFilmName = translatedFilmName;
        this.filmLanguage = filmLanguage;
        this.subtitleInfo = subtitleInfo;
        subtitleNum = getSubtitleNum();
    }



    public String getTranslatedFilmName() { // getters for the variables of this class
        return translatedFilmName;
    }

    public String getFilmLanguage() {
        return filmLanguage;
    }

    public String getSubtitleInfo() { // returns the subtitle info using a string that formats the subitleInfo String array
        String subtitleInfoAsString = "";
        for (int i = 0; i < subtitleNum; i++) {
            if(i == 0) {
                subtitleInfoAsString += subtitleInfo[i];
            }
            else if(i < subtitleNum - 1) {
                subtitleInfoAsString += ", " + subtitleInfo[i];
            }
        }
        return subtitleInfoAsString;
    }

    public int getSubtitleNum() {
        subtitleNum = 0;
        while (subtitleInfo[subtitleNum] != null) {
            subtitleNum++;
        }
        return subtitleNum;
    }

    public static int getSubtitleMax() {
        return subtitleMax;
    }


    public void setTranslatedFilmName(String translatedFilmName) { // setters for variables of this class
        this.translatedFilmName = translatedFilmName;
    }

    public void setFilmLanguage(String filmLanguage) {
        this.filmLanguage = filmLanguage;
    }

    public void setSubtitleInfo(String[] subtitleInfo) { // a set method that replaces the existing subititleInfo array for another array
        this.subtitleInfo = subtitleInfo;
    }

    public void addToSubtitleInfo(String[] moreSubtitleInfo) { // a variation of the set method that can only add to the subtitleInfo array
        for (int i = subtitleNum + 1; i < (subtitleNum + moreSubtitleInfo.length - 1); i++) { // for loop that adds more user-inputted languages to the existing subtitleInfo String array
            subtitleInfo[i] = moreSubtitleInfo[i - subtitleNum - 1];
            subtitleNum++;
        }
    }


    @Override
    public String toString() { // the toString method that utilizes the previously defined getters and setters, and the super class's toString method
        return super.toString() + " The original language for this movie is " + getFilmLanguage() + " and its translated name is " + getTranslatedFilmName() + ", with " + getSubtitleNum() + " languages being available in subtitles. These languages include " + getSubtitleInfo() + ".\n";
    }


}
