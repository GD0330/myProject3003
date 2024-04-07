package bg.tu_varna.sit.a1.f22621658;

public class Seat {
    private int row;
    private int numSeat;

    private Boolean isItFree;

    public Seat(int row, int numSeat) {
        this.row = row;
        this.numSeat = numSeat;
        this.isItFree = true;
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

    public void setNumSeat(int numSeat) {
        this.numSeat = numSeat;
    }

    public Boolean getItFree() {
        return isItFree;
    }

    public void setItFree(Boolean itFree) {
        isItFree = itFree;
    }
}
