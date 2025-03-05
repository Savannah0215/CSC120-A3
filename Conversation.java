
class Conversation implements Chatbot {
  int responses;

  // Attributes 

  /**
   * Constructor 
   */
  Conversation() {
    
  }

  /**
   * Starts and runs the conversation with the user
   */
  public void chat() {
    Conversation.out.print("Please tell me how many rounds of conversation we'll have today.");
    responses = in.nextInt();
    Conversation.out.print("Hi! I'm your chatbot and I'll be assisting you today. What would you like to discuss?");
  }

  /**
   * Prints transcript of conversation
   */
  public void printTranscript() {

  }

  /**
   * Gives appropriate response (mirrored or canned) to user input
   * @param inputString the users last line of input
   * @return mirrored or canned response to user input  
   */
  public String respond(String inputString) {
    String returnString = ""; 
    return returnString; 
  }

  public static void main(String[] arguments) {

    Conversation myConversation = new Conversation();
    myConversation.chat();
    myConversation.printTranscript();

  }
}
