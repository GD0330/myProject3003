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
