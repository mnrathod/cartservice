package demo.cart.service.impl;

import demo.cart.service.NotificationService;

public interface SMSService extends NotificationService{

	public boolean sendSMS(String from, String to, String text);
	
}
