public class Message {
    private int msgId;
    private int senderId;
    private int receiverId;
    private String content;
    private String timestamp;

    public Message(int msgId, int senderId, int receiverId, String content, String timestamp) {
        this.msgId = msgId;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.content = content;
        this.timestamp = timestamp;
    }

    // Getters & Setters
}
