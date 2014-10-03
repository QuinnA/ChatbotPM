package chatbot.view;

import javax.swing.JOptionPane;

import chatbot.controller.ChatbotAppController;
/**
 * The View component of the Application. This currently uses popup windows to provide input and output for all messages.
 * @author CodyH
 *
 */
public class ChatbotView
{
	/**
	 * The reference to the AppController so the Model components can be accessed for display purposes.
	 */
	private ChatbotAppController baseController;
	
	/**
	 * Creates the ChatbotView with a reference to the controller.
	 * @param baseController The reference to the ChatbotController.
	 */
	public ChatbotView(ChatbotAppController baseController)
	{
		this.baseController = baseController;
	}
	
	/**
	 * Shows a String from the Chatbot with the availability of user input.
	 * @param currentInput The supplied String.
	 * @return The users typed response.
	 */
	public String showChatbotDialog(String currentInput)
	{
		String result = "";
		
		result = JOptionPane.showInputDialog(null, baseController.getMySillyChatbot().getName() + " says: " + currentInput);
	
		return result;
	}
	
	/**
	 * Shows a String from the Chatbot as a popup window.
	 * @param currentInput The string from the Chatbot.
	 */
	public void showChatbotMessage(String currentInput)
	{
		JOptionPane.showMessageDialog(null, baseController.getMySillyChatbot().getName() + " says: " + currentInput);
	}
}
