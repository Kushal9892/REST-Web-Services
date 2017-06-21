package com.niit.kushal.rest.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement // Converts the Model class as the XML Root Element with the fields in the Model Class!!
public class Message {

	private long messageID;
	private String message;
	private Date messageCreated;
	private String messageAuthor;
	
	public Message() {
		
	}
	
	public Message(long messageID, String message, String messageAuthor) {
		this.messageID = messageID;
		this.message = message;
		this.messageCreated = new Date();
		this.messageAuthor = messageAuthor;
	}
	public long getMessageID() {
		return messageID;
	}
	public void setMessageID(long messageID) {
		this.messageID = messageID;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getMessageCreated() {
		return messageCreated;
	}
	public void setMessageCreated(Date messageCreated) {
		this.messageCreated = messageCreated;
	}
	public String getMessageAuthor() {
		return messageAuthor;
	}
	public void setMessageAuthor(String messageAuthor) {
		this.messageAuthor = messageAuthor;
	}
}
