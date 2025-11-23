public class Group {
    protected String name;
    protected Message[] messages;

    public Group(String name, Message[] messages) {
        this.messages = messages;
        this.name = name;
    }
    public void printMessages(){
        for (Message msg : messages) {
            System.out.println("");
        }
    }
}
