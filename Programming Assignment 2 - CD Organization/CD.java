/**
 * @author Christopher Bergsveinsson
 * @version 10/2/2025
 * CSC 223 - Anwar Ahmad
 * Every Tuesday and  Thursday 9:35am → 11:35am
 * Programming Assignment 2 - Stack ADT (Node Based Implementation) for organizing CDs - CD class
 */

public class CD {
    private String artistName;
    private String albumName;
    private String lyricLanguage;

    public CD() {
        super();
    }

    public CD(String artistName, String albumName, String lyricLanguage) {
        super();
        this.artistName = artistName;
        this.albumName = albumName;
        this.lyricLanguage = lyricLanguage;
    }

    public String getName() {
        return artistName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getLyricLanguage() {
        return lyricLanguage;
    }

    public String toString() {
        return "Name: " + artistName + " | Album name: " + albumName + " | Language: " + lyricLanguage;
    }
}
