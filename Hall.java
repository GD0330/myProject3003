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

    private void initializeSeats() {
        int seatId=1;
        for (int row = 1; row <= numRows; row++) {
            for (int seatNum = 1; seatNum <= numSeatsPerRow; seatNum++) {
                Seat seat = new Seat(row, seatNum);
                seats.put(seatId, seat);
                seatId++;
            }
        }
    }
    public int getHallTotalSeats(){
        return this.numRows*this.numSeatsPerRow;
    }
    public void setSeatState(int i,String state){
        this.seats.get(i).setSeatState(state);
    }
    public String getNumber() {
        return number;
    }

    public int getNumRows() {
        return numRows;
    }

    public int getNumSeatsPerRow() {
        return numSeatsPerRow;
    }

    public Map<Integer, Seat> getSeats() {
        return seats;
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
