public class Mentor extends User {
    private String major;
    private double rating;
    private boolean availability;

    public Mentor(int id, String name, String email, String password, String major) {
        super(id, name, email, password, "Mentor");
        this.major = major;
        this.rating = 0.0;
        this.availability = true;
    }

    // Getters & Setters
    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }

    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }

    public boolean isAvailable() { return availability; }
    public void setAvailability(boolean availability) { this.availability = availability; }
}
