package bg.tu_varna.sit.a1.f22621658.models;

public class Event {
    private String date;
    private String name;
    private Hall hall;

    public Event(String date, String name, Hall hall) {
        this.date = date;
        this.name = name;
        this.hall = hall;
    }

    public String getHallNumber(){
        return this.hall.getNumber();
    }
    public int getHallSize(){
        return this.hall.getHallTotalSeats();
    }
    public int getCertainSeatID(int i){
        return this.hall.getSeats().get(i).getNumSeat();
    }
    public String getCertainSeatState(int i){
        return this.hall.getSeats().get(i).getSeatState();
    }
    public void setCertainSeatState(int i,String state){
        this.hall.setSeatState(i,state);
    }
    public int getCertainSeatRow(int i){
        return this.hall.getSeats().get(i).getRow();
    }
    public int getNumberOfRows(){
        return this.hall.getNumRows();
    }
    public int getNumberOfSeatsPerRow(){
        return this.hall.getNumSeatsPerRow();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    @Override
    public String toString() {
        return "Event{" +
                "date='" + date + '\'' +
                ", name='" + name + '\'' +
                ", hall=" + hall.toString() +
                '}';
    }
}
