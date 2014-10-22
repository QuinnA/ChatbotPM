package chatbot.controller;

/**
 * The runner for the Chatbot.
 * @author Cody Henrichsen
 * @version 10/1/14
 */
public class ChatbotRunner
{
	/**
	 * Starting point for all Java programs.
	 * @param args Unused!
	 */
	public static void main(String [] args)
	{
		ChatbotAppController appController = new ChatbotAppController();
		appController.start();
	}

}
