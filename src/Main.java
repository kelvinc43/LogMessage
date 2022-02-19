import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LogMessage message = new LogMessage("Webserver:disk offline");
        System.out.println(message.containsWord("Webserver"));
        System.out.println(message.containsWord("disk"));
        System.out.println(message.containsWord("apple"));
        System.out.println("---");

        ArrayList<LogMessage> messageList = new ArrayList<LogMessage>();
        LogMessage message1 = new LogMessage("SERVER1:file not found");
        LogMessage message2 = new LogMessage("SERVER2:read error on disk DSK1");
        messageList.add(message);
        messageList.add(message1);
        messageList.add(message2);

        for (LogMessage item: messageList) {
            System.out.println("Item: " + item.getMachineId() + " " + item.getDescription());
        }
        System.out.println("---");

        ArrayList<LogMessage> a = new ArrayList<LogMessage>();
        for (int i = 0; i < messageList.size(); i++) {
            if (messageList.get(i).containsWord("disk")) {
                a.add(messageList.remove(i));
                i--;
            }
        }
        for (LogMessage item: a) {
            System.out.println("Item: " + item.getMachineId() + " " + item.getDescription());

        }
    }
}

