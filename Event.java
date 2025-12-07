public class Event {
    private int eventId;
    private String title;
    private String description;
    private String date;
    private String time;
    private int mentorId;

    public Event(int eventId, String title, String description, String date, String time, int mentorId) {
        this.eventId = eventId;
        this.title = title;
        this.description = description;
        this.date = date;
        this.time = time;
        this.mentorId = mentorId;
    }

    // Getters & Setters
}
