package Exercise02;

import java.util.ArrayList;

/**
 * Created by Ilian on 7/25/2017.
 */
public class Mailbox {


    ArrayList<Message> arrayList = new ArrayList<>();
    Message currentMessage;
    int newMessages;
    int savedMessages;

    public  void add(Message message){
        this.arrayList.add(message);
        currentMessage = message;
        savedMessages = arrayList.size();
    }

    public Message getCurrentMessage(){
        return this.currentMessage;
    }

}
