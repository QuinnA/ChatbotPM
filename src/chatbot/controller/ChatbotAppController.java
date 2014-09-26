package chatbot.controller;

import javax.swing.JOptionPane;

import chatbot.model.Chatbot;
import chatbot.view.ChatbotView;

public class ChatbotAppController
{
	private ChatbotView applicationView;
	private Chatbot mySillyChatbot;
	
	
	public ChatbotAppController()
	{
		applicationView = new ChatbotView(this);
		mySillyChatbot = new Chatbot("Derf");
	}
	
	public void start()
	{
		String result = applicationView.showChatbot("Cody");
		
		if (mySillyChatbot.quitChecker(result))
		{
			quit();
		}
	}
	
	private void quit()
	{
		JOptionPane.showMessageDialog(null, "goodbye cruel world");
		System.exit(0);
		
	}

}
