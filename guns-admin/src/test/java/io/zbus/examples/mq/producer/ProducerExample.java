package io.zbus.examples.mq.producer;

import io.zbus.mq.Broker;
import io.zbus.mq.Message;
import io.zbus.mq.Producer; 

public class ProducerExample { 
	public static void main(String[] args) throws Exception { 
		Broker broker = new Broker("localhost:15555"); 
		  
		Producer p = new Producer(broker);
		p.declareTopic("MyMQ"); 
		 
		Message msg = new Message();
		msg.setTopic("MyMQ");
		//msg.setTag("oo.account.pp");
		msg.setBody("hello " + System.currentTimeMillis()); 
		
		
		for(int i=0; i<10;i++){
			Message res = p.publish(msg);
			System.out.println("***************************");   
			System.out.println(res);   
			System.out.println("***************************");   
		}
		
		
		
		 
		broker.close();
	} 
}
