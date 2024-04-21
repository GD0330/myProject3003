package bg.tu_varna.sit.a1.f22621658.models;

import java.util.HashMap;
import java.util.Map;

public class Hall {
    private int number;
    private int numRows;
    private int numSeatsPerRow;

    private Map<Integer, Seat> seats;

    public Hall(int number, int numRows, int numSeatsPerRow, Map<Integer, Seat> seats) {
        this.number = number;
        this.numRows = numRows;
        this.numSeatsPerRow = numSeatsPerRow;
        this.seats = seats;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumRows() {
        return numRows;
    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    public int getNumSeatsPerRow() {
        return numSeatsPerRow;
    }

    public void setNumSeatsPerRow(int numSeatsPerRow) {
        this.numSeatsPerRow = numSeatsPerRow;
    }

    public void setSeatState(String seatState, int i){
        seats.get(i).setSeatState(seatState);
    }

    @Override
    public String toString() {
        return "Hall{" +
                "number=" + number +
                ", numRows=" + numRows +
                ", numSeatsPerRow=" + numSeatsPerRow +
                ", seats=" + seats.toString() +
                '}';
    }
}


    public void setNumSeatsPerRow(int numSeatsPerRow) {
        this.numSeatsPerRow = numSeatsPerRow;
    }
}
