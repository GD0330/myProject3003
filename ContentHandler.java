package bg.tu_varna.sit.a1.f22621658.fileCommands;

import bg.tu_varna.sit.a1.f22621658.models.Calendar;

public interface ContentHandler {
    String encode(String content);
    Calendar decode(String content);
}
