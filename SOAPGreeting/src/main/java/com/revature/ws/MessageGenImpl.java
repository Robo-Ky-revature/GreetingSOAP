package com.revature.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.revature.ws.MessageGen",
		serviceName = "messageGenService")
public class MessageGenImpl {
	
	public String getMessage() {
		return "What's up, doc?";
	}
	
}
