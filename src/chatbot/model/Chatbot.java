package chatbot.model;

/**
 * The chatbot model class.  Used for checking and manipulating Strings.
 * @author Cody Henrichsen
 * @version 1.1 9/26/14
 */
public class Chatbot
{

	private String name;
	private int chatCount;
	
	/**
	 * Creates a Chatbot object with the supplied name and initializes the current number of chats to zero.
	 * @param name The supplied name for the Chatbot.
	 */
	public Chatbot(String name)
	{
		this.name = name;
		chatCount = 0;
	}
	
	
	/**
	 * Returns the name of the Chatbot object.
	 * @return The current name of the Chatbot.
	 */
	public String getName()
	{
		return name;
	}
	
	public int getChatCount()
	{
		return chatCount;
	}
	
	/**
	 * This is a really important method.  Add lots of lines
	 * see more lines
	 * and even more
	 * wowwww...
	 * @param name The new name for the chatbot.
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	private void updateChatCount()
	{
		chatCount++;
	}
	
	public boolean quitChecker(String input)
	{
		boolean okToQuit = false;
		
		if(input.equals("sayonara"))
		{
			okToQuit = true;
		}
		
		return okToQuit;
	}
}
