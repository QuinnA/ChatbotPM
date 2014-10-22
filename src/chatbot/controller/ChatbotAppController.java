package chatbot.controller;

import javax.swing.JOptionPane;

import chatbot.model.Chatbot;
import chatbot.view.ChatbotFrame;
import chatbot.view.ChatbotView;

/**
 * Runs the Chatbot Project. Owns the model and associated views.
 * @author Cody Henrichsen
 * @version 1.2 10/2/14 - cleaned the quit method.
 */
public class ChatbotAppController
{
	/**
	 * The instance of the ChatbotView, the View of the application
	 */
	private ChatbotView applicationView;
	/**
	 * The instance of the Chatbot, the Model of this application
	 */
	private Chatbot mySillyChatbot;
	/**
	 * The message used when starting the application.
	 */
	private String startMessage;
	/**
	 * The message provided when the user quits the application.
	 */
	private String quitMessage;
	/**
	 * Reference to the GUI JFrame object for the application.
	 */
	private ChatbotFrame appFrame;
	
	/**
	 * Constructor for the AppController. Initializes the Model and View components.
	 */
	public ChatbotAppController()
	{
		applicationView = new ChatbotView(this);
		appFrame = new ChatbotFrame(this);
		mySillyChatbot = new Chatbot("Derf");
		startMessage = "Welcome to the " + mySillyChatbot.getName() + " chatbot. What is your name?";
		quitMessage = "goodbye cruel user :(";
	}
	
	/**
	 * Getter method for the applications Chatbot.
	 * @return The Chatbot for the application.
	 */
	public Chatbot getMySillyChatbot()
	{
		return mySillyChatbot;
	}
	
	/**
	 * Startup method for the Chatbot application. This is the standard method we use in all of our projects.
	 */
	public void start()
	{
		String result = applicationView.showChatbotDialog(startMessage);
		
//		while(!mySillyChatbot.quitChecker(result))
//		{
//			result = mySillyChatbot.processText(result);
//			result = applicationView.showChatbotDialog(result);
//		}
//		quit();
	}
	
	/**
	 * Quit method for the Chatbot application.
	 */
	private void quit()
	{
		applicationView.showChatbotMessage(quitMessage);
		System.exit(0);
	}
}
