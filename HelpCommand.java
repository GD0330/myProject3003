package bg.tu_varna.sit.a1.f22621658.fileCommands;

public class HelpCommand implements Command {
    public Calendars execute( String[] param, Calendars calendars) {
        System.out.println("The following commands are supported:");
        System.out.println("open <file>              -> opens <file>");
        System.out.println("close                    -> closes currently opened file");
        System.out.println("save                     -> saves the currently open file");
        System.out.println("saveas <file>            -> saves the currently open file in <file>");
        System.out.println("help                     -> prints this information");
        System.out.println("exit                     -> exits the program");
        System.out.println("addevent <date> <name>   -> adds new event");
        System.out.println("<hall>");
        System.out.println("freeseats <name> <date>  -> checks which seats are Free");
        System.out.println("book <name>              -> books a seat ");
        System.out.println("<date> <row>");
        System.out.println("<seat> <note>");
        System.out.println("unbook <name> <date>     -> cancel a booked seat");
        System.out.println("<row> <seat>");
        System.out.println("buy <name> <date>        -> buys a seat");
        System.out.println("<row> <seat>");
        System.out.println("bookings [<name>]        -> checks the booked seats");
        System.out.println("[<date>]");
        System.out.println("check <code>             -> checks the code and return the row and seatNumber");
        System.out.println("report <from>            -> checks the booked seats");
        System.out.println("<to> [<hall>]");
        System.out.println("mostviewed               -> shows the list of events ordered by most views");
        return calendars;
    }
}
