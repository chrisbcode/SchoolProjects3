/**
 * @author Christopher Bergsveinsson
 * @version 11/11/2025
 * CSC 223 - Anwar Ahmad
 * Every Tuesday and  Thursday 9:35am → 11:35am
 * Programming Assignment 4 - Printing Prototype - PaperTray Class
 */

public class PaperTray {

    private String trayName;
    private String colorOfPaper;
    private int numberOfSheets;
    private final int maximumNumberOfSheets = 100;

    public PaperTray() {
        super();
    }

    public PaperTray(String trayName, String colorOfPaper, int numberOfSheets) {
        this.trayName = trayName;
        this.colorOfPaper = colorOfPaper;
        this.numberOfSheets = numberOfSheets;
    }

    public String getTrayName() {
        return trayName;
    }

    public void setTrayName(String trayName) {
        this.trayName = trayName;
    }

    public String getColorOfPaper() {
        return colorOfPaper;
    }

    public void setColorOfPaper(String colorOfPaper) {
        this.colorOfPaper = colorOfPaper;
    }

    public int getNumberOfSheets() {
        return numberOfSheets;
    }

    public void setNumberOfSheets(int numberOfSheets) {
        this.numberOfSheets = numberOfSheets;
    }


}
