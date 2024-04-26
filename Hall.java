package bg.tu_varna.sit.a1.f22621658.models;

import java.util.HashMap;
import java.util.Map;

public class Hall {
    private int number;
    private int numRows;
    private int numSeatsPerRow;
    private Map<Integer, Seat> seats;

    public Hall(int number){
        switch (number) {
            case 1:
                this.number = 1;
                this.numRows = 5;
                this.numSeatsPerRow = 7;
                break;
            case 2:
                this.number = 2;
                this.numRows = 10;
                this.numSeatsPerRow = 10;
                break;
            case 3:
                this.number = 3;
                this.numRows = 9;
                this.numSeatsPerRow = 8;
                break;
            default:
                System.out.println("No such Hall !");
                return;
        }
        this.seats = new HashMap<>();
        initializeSeats();
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
