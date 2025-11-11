/**
 * @author Christopher Bergsveinsson
 * @version 11/11/2025
 * CSC 223 - Anwar Ahmad
 * Every Tuesday and  Thursday 9:35am → 11:35am
 * Programming Assignment 4 - Printing Prototype - PrintJob Class
 */

public class PrintJob {
    private int numberOfSheets;
    private String colorOfPaper;
    private String nameOfRequest;
    private String textOnPaper;

    public PrintJob() {
        super();
    }

    public PrintJob(int numberOfSheets, String colorOfPaper, String nameOfRequest, String textOnPaper) throws LessThanOneException, ColorPaperException {
        if (numberOfSheets < 1) {
            throw new LessThanOneException("The number of sheets must be greater than 0");
        }
        else if (!colorOfPaper.equals("yellow") && !colorOfPaper.equals("Yellow") && !colorOfPaper.equals("White") && !colorOfPaper.equals("white")) {
            throw new ColorPaperException("The color of paper must be either yellow or white");
        }
        else {
            this.numberOfSheets = numberOfSheets;
            this.colorOfPaper = colorOfPaper;
            this.nameOfRequest = nameOfRequest;
            this.textOnPaper = textOnPaper;
        }
    }


    public int getNumberOfSheets() {
        return numberOfSheets;
    }

    public void setNumberOfSheets(int numberOfSheets) {
        this.numberOfSheets = numberOfSheets;
    }

    public String getColorOfPaper() {
        return colorOfPaper;
    }

    public void setColorOfPaper(String colorOfPaper) {
        this.colorOfPaper = colorOfPaper;
    }

    public String getNameOfRequest() {
        return nameOfRequest;
    }

    public void setNameOfRequest(String nameOfRequest) {
        this.nameOfRequest = nameOfRequest;
    }

    public String getTextOnPaper() {
        return textOnPaper;
    }

    public void setTextOnPaper(String textOnPaper) {
        this.textOnPaper = textOnPaper;
    }

    @Override
    public String toString() {
        return "Request:" + nameOfRequest + "\nColor:" + colorOfPaper + "\nPaper:" + textOnPaper + "\nNumber of Sheets:" + numberOfSheets;
    }
}
