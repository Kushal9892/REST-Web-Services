package com.niit.kushal.rest.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.niit.kushal.rest.messenger.database.DatabaseClass;
import com.niit.kushal.rest.messenger.model.Message;

public class MessageService {

	private Map<Long, Message> messages = DatabaseClass.getMessages();

	public MessageService() {
		messages.put(1L, new Message(1, "Hello World!!", "Kushal"));
		messages.put(2L, new Message(2, "Hello Jersey!!", "Kushal"));
	}
	
	public List<Message> getAllMessages() {
		return new ArrayList<Message>(messages.values());
	}

	public Message getMessage(long id) {
		return messages.get(id);
	}

	public Message addMessage(Message message) {
		message.setMessageID(messages.size() + 1);
		messages.put(message.getMessageID(), message);
		return message;
	}

	public Message updateMessage(Message message) {
		if(message.getMessageID() <= 0) {
			return null;
		}
		messages.put(message.getMessageID(), message);
		return message;
	}
	
	public Message deleteMessage(long id) {
		return messages.remove(id);
	}
}
