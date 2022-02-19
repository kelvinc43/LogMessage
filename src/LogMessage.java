import java.util.ArrayList;
import java.util.Arrays;

public class LogMessage {
    private String machineId;
    private String description;
    private ArrayList<LogMessage> messageList;

    public LogMessage(String message) {
        int a = message.indexOf(":");
        machineId = message.substring(0, a);
        description = message.substring(a + 1);
    }

    public boolean containsWord(String keyword) {
        if (description.indexOf(keyword) != -1) {
            if (description.indexOf(" " + keyword + " ") != -1) {
                return true;
            }
            else if (description.indexOf(keyword + " ") == 0) {
                return true;
            }
            else if (description.indexOf(" " + keyword) == (description.length() - keyword.length() + 1)) {
                return true;
            }
            else if (description.equals(keyword)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<LogMessage> removeMessages(String keyword) {
        ArrayList<LogMessage> a = new ArrayList<LogMessage>();
        for (int i = 0; i < messageList.size(); i++) {
            if (messageList.get(i).containsWord(keyword)) {
                a.add(messageList.remove(i));
                i--;
            }
        }
        return a;
    }

    public String getMachineId() {
        return machineId;
    }

    public String getDescription() {
        return description;
    }
}
