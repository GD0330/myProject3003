package bg.tu_varna.sit.a1.f22621658;

import bg.tu_varna.sit.a1.f22621658.Files.Command;

import java.util.HashMap;
import java.util.Map;

public class Hall {
    private int number;
    private int numRows;
    private int numSeatsPerRow;

    private Map<Integer, Seat> seats;

    public Hall(int number, int numRows, int numSeatsPerRow) {
        this.number = number;
        this.numRows = numRows;
        this.numSeatsPerRow = numSeatsPerRow;
        this.seats = new HashMap<>();
        initializeSeats();
    }

    private void initializeSeats() {
        for (int row = 1; row <= numRows; row++) {
            for (int seatNum = 1; seatNum <= numSeatsPerRow; seatNum++) {
                Seat seat = new Seat(row, seatNum);
                seats.put(seatNum, seat);
            }
        }
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
}
