package chatbot.view;

import javax.swing.JFrame;

import chatbot.controller.ChatbotAppController;

/**
 * GUI Frame class for a Chatbot.  Shows the basic framework code for a JFrame extension.
 * @author Cody Henrichsen
 * @version 1.1 10/21/14
 */
public class ChatbotFrame extends JFrame
{
	/**
	 * Reference for the ChatbotPanel of the GUI.
	 */
	private ChatbotPanel basePanel;
	/**
	 * Creates a ChatbotFrame with a reference to the ChatbotAppController to pass to the panel for MVC.
	 * @param baseController The reference to the controller object.
	 */
	public ChatbotFrame(ChatbotAppController baseController)
	{
		basePanel = new ChatbotPanel(baseController);
		
		setupFrame();
	}
	
	/**
	 * Helper method to load panel into frame, set size, and visibility.
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(400, 400);
		setVisible(true);
	}

}
