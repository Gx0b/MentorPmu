public class EventService {

    // Method for mentor to create a new event
    public Event createEvent(int eventId, String title, String description, 
                             String date, String time, int mentorId) {

        // Creating the event object
        Event newEvent = new Event(eventId, title, description, date, time, mentorId);

        // (Later: save to database or list)
        System.out.println("Event created successfully: " + newEvent.getTitle());

        return newEvent;
    }
}
