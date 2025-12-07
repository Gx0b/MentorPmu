public class Mentee extends User {
    private String major;

    public Mentee(int id, String name, String email, String password, String major) {
        super(id, name, email, password, "Mentee");
        this.major = major;
    }

    // Getters & Setters
    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }
}
