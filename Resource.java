public class Resource {
    private int resourceId;
    private int mentorId;
    private String fileName;
    private String filePath;
    private String uploadedAt;

    public Resource(int resourceId, int mentorId, String fileName, String filePath, String uploadedAt) {
        this.resourceId = resourceId;
        this.mentorId = mentorId;
        this.fileName = fileName;
        this.filePath = filePath;
        this.uploadedAt = uploadedAt;
    }

    // Getters & Setters
}
