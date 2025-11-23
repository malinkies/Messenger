public class Message {
    protected String text;
    protected String date;
    protected User sender;
    protected User receiver;

    public Message(String text, String date, User sender, User receiver) {
        this.text = text;
        this.date = date;
        this.sender = sender;
        this.receiver = receiver;
    }

    public String toString(){
        return "от" + this.sender + "к" + this.receiver + ":\n" + this.text;
    }

    public String getText() {
        return text;
    }
}
