package ludde86.messenger.service;

import java.util.ArrayList;
import java.util.List;

import ludde86.messenger.model.Message;

public class MessageService {

	public List<Message> getAllMessages() {
		
		Message m1 = new Message(1L, "Hello", "Ludvig");
		Message m2 = new Message(2L, "Welcome", "Ludvig");
		
		List<Message> messages = new ArrayList<Message>();
		
		messages.add(m1);
		messages.add(m2);
		
		return messages;
		
	}
	
}
