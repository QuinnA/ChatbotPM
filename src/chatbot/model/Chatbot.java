package chatbot.model;

import java.util.ArrayList;

/**
 * The chatbot model class. Used for checking and manipulating Strings.
 * 
 * @author Cody Henrichsen
 * @version 1.4 11/11/14 Updated processText and added a checker.
 */
public class Chatbot
{
	/**
	 * The programmer supplied list of memes.
	 */
	private ArrayList<String> memeList;
	/**
	 * The name of the Chatbot.
	 */
	private String name;
	/**
	 * The programmer specified content area for the contentChecker method.
	 */
	private String contentArea;
	/**
	 * The amount of chats that have occurred with this chatbot.
	 */
	private int chatCount;
	/**
	 * The current user of the Chatbot object.
	 */
	private ChatbotUser myUser;
	/**
	 * The list of user input for the Chatbot
	 */
	private ArrayList<String> userInputList;

	/**
	 * Creates a Chatbot object with the supplied name and initializes the
	 * current number of chats to zero.
	 * 
	 * @param name
	 *            The supplied name for the Chatbot.
	 */
	public Chatbot(String name)
	{
		memeList = new ArrayList<String>();
		userInputList = new ArrayList<String>();
		this.name = name;
		contentArea = "";
		chatCount = 0;
		myUser = new ChatbotUser();
		fillTheMemeList();
	}

	/**
	 * Returns the name of the Chatbot object.
	 * 
	 * @return The current name of the Chatbot.
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * This returns the current number of chats.
	 * 
	 * @return The current chatCount value.
	 */
	public int getChatCount()
	{
		return chatCount;
	}

	public ChatbotUser getMyUser()
	{	
		return myUser;
	}

	public void setMyUser(ChatbotUser myUser)
	{
		this.myUser = myUser;
	}

	/**
	 * Sets the name of the Chatbot to the supplied name.
	 * 
	 * @param name
	 *            The new name for the chatbot.
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * Helper method to fill the list of memes.
	 */
	private void fillTheMemeList()
	{
		memeList.add("kitties");
		memeList.add("one does not simply");
		memeList.add("doge");
		memeList.add("doh!");
		memeList.add("toddler fist");
		memeList.add("y u no");
	}

	/**
	 * Processes input from the user against the checker methods. Returns the
	 * next output for the view.
	 * 
	 * @param currentInput
	 *            The supplied text.
	 * @return The processed text based on checker or other methods.
	 */
	public String processText(String currentInput)
	{
		String result = "";
		
		if(getChatCount() < 7)
		{
			//Ask questions about all data members here
			//you will need ifs or a switch
			//assign via myUser.set...
		}

		int randomPosition = (int) (Math.random() * 6);
		
		if (currentInput != null && currentInput.length() > 0)
		{
			if (randomPosition == 0)
			{
				if (stringLengthChecker(currentInput))
				{
					result = "too long";
				}
				else
				{
					result = "short words";
				}
			}
			else if (randomPosition == 1)
			{
				if (contentChecker(currentInput))
				{
					result = "yup you know the secret";
				}
				else
				{
					result = "try again another time";
				}
			}
			else if(randomPosition == 2)
			{
				if (memeChecker(currentInput))
				{
					result = "Wow, " + currentInput + " is a meme. Wahoo!";
				}
				else
				{
					result = "not a meme, try again";
					
				}
			}
			else if(randomPosition == 3)
			{
				 //Talk about the user here :D
			}
			else if(randomPosition == 4)
			{
				//add to our list
				userInputList.add(currentInput);
				result = "Thank you for the comment";
			}
			else
			{
				if(userInputChecker(currentInput))
				{
					
				}
				else
				{
					
				}
			}
		}
		else
		{
			result = "use words!!!!";
		}
		updateChatCount();
		return result;
	}
	
	private boolean userInputChecker(String userInput)
	{
		boolean matchesInput = false;
		
		for(int loopCount = 0; loopCount < userInputList.size(); loopCount++)
		{
			if(userInput.equalsIgnoreCase(userInputList.get(loopCount)))
			{
				matchesInput = true;
				userInputList.remove(loopCount);
				loopCount--;
			}
		}
		
		return matchesInput;
	}
	

	/**
	 * Private helper method to update the chatCount variable.
	 */
	private void updateChatCount()
	{
		chatCount++;
	}

	/**
	 * 
	 * @param input
	 * @return
	 */
	private boolean stringLengthChecker(String input)
	{
		boolean isTooLong = false;

		if (input.length() >= 20)
		{
			isTooLong = true;
		}

		return isTooLong;
	}
	
	/**
	 * Method checks if the user text contains the Chatbot's special content
	 * area text.
	 * 
	 * @param input
	 *            The user supplied text.
	 * @return Whether the user supplied text contains the content area supplied
	 *         by the user.
	 */
	private boolean contentChecker(String input)
	{
		boolean hasMyContent = false;

		if (input.contains(contentArea))
		{
			hasMyContent = true;
		}

		return hasMyContent;
	}

	/**
	 * Checks if the supplied text matches the list of memes.
	 * 
	 * @param input
	 *            The user supplied text to check.
	 * @return Whether or not a meme has been supplied by the user.
	 */
	private boolean memeChecker(String input) 
	{
		boolean isAMeme = false;

		for (String currentMeme : memeList)
		{
			if (input.equalsIgnoreCase(currentMeme))
			{
				isAMeme = true;
			}
		}

		return isAMeme;
	}

	/**
	 * Method to check for the appropriate exit message from the user.
	 * 
	 * @param input
	 *            The user supplied text.
	 * @return Whether or not the quit message has been supplied.
	 */
	public boolean quitChecker(String input)
	{
		boolean okToQuit = false;

		if (input != null && input.equals("sayonara"))
		{
			okToQuit = true;
		}

		return okToQuit;
	}
}