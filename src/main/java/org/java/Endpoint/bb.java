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
		System.out.println("�ܵ���"+ses.getId());
	}
	@OnMessage
	public void msg(Session ses,String msg) throws Exception{
		System.out.println("�ͻ��˵���Ϣ��"+msg);
		ses.getBasicRemote().sendText(msg);
	}
	@OnClose
	public void colse(Session ses){
		System.out.println("�ܵ�"+ses.getId());
	}
}
