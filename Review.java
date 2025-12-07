public class Review {
    private int reviewId;
    private int menteeId;
    private int mentorId;
    private int rating;
    private String comment;

    public Review(int reviewId, int menteeId, int mentorId, int rating, String comment) {
        this.reviewId = reviewId;
        this.menteeId = menteeId;
        this.mentorId = mentorId;
        this.rating = rating;
        this.comment = comment;
    }

    // Getters & Setters
}
