public class UserDAO {

    // Temporary login check (no database yet)
    public User login(String email, String password) {
        // Example dummy users
        if (email.equals("mentor@pmu.edu") && password.equals("1234")) {
            return new Mentor("Ali", email, password, "Computer Science", "9-5");
        }

        if (email.equals("mentee@pmu.edu") && password.equals("1234")) {
            return new Mentee("Sara", email, password, "Software Engineering");
        }

        return null; // Login failed
    }
}
