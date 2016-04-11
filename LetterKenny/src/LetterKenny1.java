/*LetterKenny1.java
 * This program takes you through the life of people who live in LetterKenny Ontario.
 * April 6 2016
 * Brennan Stanfield
 */


import hsa_new.Console;

public class LetterKenny1 {
	
	public static void main(String[] args) throws InterruptedException {
	
		
		//Variables
		Console c = new Console();
		String answer;
		String response;
		String reply;
		String answer2;
		String response2;
		
		//Output
		c.println("The phone rings. It's Sanchez. ''Okay don't come down the laneway.''");
		c.println("Sanchez walks up to you. Do you swing frist? Texas sized 10.4 or Hard no?");
		answer = c.readLine();
		c.readLine();
		
		for (int i=0; i< 3; i++){
			if(answer.equalsIgnoreCase("Texas sized 10.4")){
				c.println("Do you want to swing left hook or right?");
				response2 = c.readLine();
			} else if (answer.equalsIgnoreCase("Hard No")){
				c.println("Buddy you're softer than a tootsie roll fruit cup.");
			}
		}
		//The fight with Sanchez. 55% chance you win 45% chance you lose.
		int sanchezFight = (int)(Math.random() * 100) + 1;	
		if (sanchezFight <= 45){
			c.println("You lost?! Against Sanchez??? You get emberassed and move out of Letterkenny to Hamilton");
			Thread.sleep(2000);
			c.close();
		}else{
			c.println("Wow nice win bud. He won't be coming around again anytime soon");
		}
		
		//The night after the fight
		c.println("That night you go to the bar with the boys and your sis to celebrate the w");
		c.println("While minding your own buisness at the bar you notice your sister is getting hit on by the hockey players.");
		c.println("Do you chirp them in hopes they back off or leave the bar? Chirp them? Leave bar?");
		response = c.readLine();
		
		if(response.equalsIgnoreCase("Leave bar")){
			c.println("The hockey players leave with your sister. They end up getting married and move to Hamilton never to be seen again.");
			Thread.sleep(2000);
			c.close();
		}else{
			c.println("Back off buddy, you couldn't wheel a tire down a hill");
			c.println("The hockey players get scared and back off");
		}
		
		//The bar is now peaceful
		c.println("Wayne: It's getting late boys, should we head out? Hard no or Texas Sized 10.4?");
		reply = c.readLine();
		
		if(reply.equalsIgnoreCase("Hard no")){
			c.println("You leave the bar. After you leave you get attacked by a pack of the yellow eyed buggers, A.K.A cyotes, and you die.");
			Thread.sleep(2000);
			c.close();
		}else{
			c.println("Max the dog walks in looking for you...");
		}
		
		//Max seems mad
		c.println("Max: I've been looking for you! Time to see who really is the toughest guy in Letterkenny! Do you fight or run away?");
		answer2 = c.readLine();
		
		if(answer2.equalsIgnoreCase("Run away")){
			c.println("Max pumbels you and strips you of the title as toughest guy in Letterkenny. You are emberassed by this and move to Hamilton to escape the shame");
			Thread.sleep(2000);
			c.close();
		}else{
			c.println("Pitter patter you dog!");
		}
		
		int maxTheDogFight = (int)(Math.random() * 100) + 1;
		if(maxTheDogFight <= 49){
			c.println("You let a dog beat you?! Wow... You move to Hamilton to escape the sgame.");
		}else{
			c.println("Wow! You've reached it!! You are officially the toughest man in Letterkenny! Congrats!");
		}
 
		
	}

}
