package com.niit.kushal.rest.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.niit.kushal.rest.messenger.model.Message;
import com.niit.kushal.rest.messenger.service.MessageService;

@Path("/messages") // 
public class MessageResource {
	
	MessageService messageService = new MessageService();
	
	@GET // The HTTP method
	@Produces(MediaType.APPLICATION_JSON) // Gives the type of response that needs to be sent back to the client!!
	public List<Message> getMessages() {
		return messageService.getAllMessages();
	}
	
	@GET
	@Path("/{messageID}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("messageID") long id) {
		return messageService.getMessage(id);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message addMessage(Message message) {
		return messageService.addMessage(message);
	}
	
	@PUT
	@Path("/{messageID}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message updateMessage(@PathParam("messageID") long id, Message message) {
		message.setMessageID(id);
		return messageService.updateMessage(message);
	}
	
	@DELETE
	@Path("/{messageID}") 
	@Produces(MediaType.APPLICATION_JSON) //Delete does not have a consumes because it does not take any message in JSON or XML!!
	public void deleteMessage(@PathParam("messageID") long id) {
		messageService.deleteMessage(id);
	}
	
}
