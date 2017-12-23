package org.java.Endpoint;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/first")
public class bb {
	@OnOpen
	public void open(Session ses){
		System.out.println("管道是"+ses.getId());
	}
	@OnMessage
	public void msg(Session ses,String msg) throws Exception{
		System.out.println("客户端的信息是"+msg);
		ses.getBasicRemote().sendText(msg);
	}
	@OnClose
	public void colse(Session ses){
		System.out.println("管道"+ses.getId());
	}
}
