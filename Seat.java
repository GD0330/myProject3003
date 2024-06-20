package bg.tu_varna.sit.a1.f22621658.models;

public class Seat {
    private int row;
    private int numSeat;

    private String seatState;

    public Seat(int row, int numSeat) {
        this.row = row;
        this.numSeat = numSeat;
        this.seatState = "Free";
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getNumSeat() {
        return numSeat;
    }

    public String getSeatState() {
        return seatState;
    }

    public void setSeatState(String seatState) {
        this.seatState = seatState;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "row=" + row +
                ", numSeat=" + numSeat +
                ", seatState='" + seatState + '\'' +
                '}';
    }
}
