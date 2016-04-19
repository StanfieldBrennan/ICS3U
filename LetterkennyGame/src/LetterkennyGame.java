//Have Fun
import java.awt.image.BufferedImage;
import sun.audio.*;
import java.io.IOException;
import java.io.*;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.imageio.ImageIO;

import hsa_new.Console;

public class LetterkennyGame {
	
	
	// images
				public static BufferedImage picProduce = null;
				public static BufferedImage picTrump = null;
				public static BufferedImage picBirthday = null;
				public static BufferedImage picGameOver = null;
				public static BufferedImage picHockeyPlayers = null;
				public static BufferedImage picBar = null;
				public static BufferedImage picTheRealSanchez = null;
				public static BufferedImage picMaxTheDog = null;

	public static void main(String[] args) throws InterruptedException, LineUnavailableException, UnsupportedAudioFileException {
		
		Console c = new Console(50, 150);
		
		//sound
				try{
					Clip theme = AudioSystem.getClip(); //create the clip object
					theme.open(AudioSystem.getAudioInputStream(new File("LetterkenntMusic.wav"))); //open the given file for the clip
				

		/* LetterkennyGame.java
		 * choose your own adventure by making decisions through the town of Letterkenny 
		 * April 18 2016
		 * Adam Seravalle
		 */	
		
			// images
				try {
					picProduce = ImageIO.read(LetterkennyGame.class.getResourceAsStream("letterkenny Producestand.jpg"));
					picTrump = ImageIO.read(LetterkennyGame.class.getResourceAsStream("donald Trump.jpg"));
					picBirthday = ImageIO.read(LetterkennyGame.class.getResourceAsStream("BIrthdayParty.jpg"));
					picGameOver = ImageIO.read(LetterkennyGame.class.getResourceAsStream("gameOver.jpg"));
					picHockeyPlayers = ImageIO.read(LetterkennyGame.class.getResourceAsStream("HockeyPlayers.jpg"));
					// variables
					String seen;
					String trump;
					String birthdayParty;
					String chirpOrFight;
					String chirpChoice;
					boolean start = false;
					String playAgain;
					boolean chirpOrFightAgain = false;
					boolean trumpError = false;
					boolean birthdayError = false;
					
					theme.start();
					
					// loop for starting program
					while (start == false) {// loops if the user input in not valid
						c.drawImage(picProduce, 300, 300, 800, 800, null);// display image
						c.println(" Have you seen Letterkenny? Yes or No ");// ask user for input
						seen = c.readString();

						c.clear();
						
						if (seen.equalsIgnoreCase("No")) {
							c.println(" Go Watch It!");

							start = false;

						} else if (seen.equalsIgnoreCase("Yes")) {
							start = true;
		            // output
							while (trumpError == false){// loops if user input in not valid
							c.println(" The year is 2017 in the small town of Letterkenny. Today is your birthday, you are hoping for a great day. But you turn on the TV and see something  horrible....... ");
							Thread.sleep(1000);// sleep code then display the next line
							c.drawImage(picTrump, 300, 300, 800, 800, null);
							c.println(" Donald Trump is the president, Americans are fleeing. Do you let them in? yes or no ");
							trump = c.readString();
							c.clear();
							
							if (trump.equalsIgnoreCase("Yes")) {
								c.clear();
								c.println(" Letterkenny's population is now 5025. The produce stand can't supply enough food. You die of starvation!!!");

								c.drawImage(picGameOver, 300, 300, 800, 800, null);
								Thread.sleep(3000);
								theme.stop();
								c.close();
							}

							else if (trump.equalsIgnoreCase("No")) {
							while( birthdayError == false){// loops if user input is not valid
								c.clear();
								c.println(" The town celebrates with a super soft birthday party. Do you go ? Texas sized 10-4 or Hard No!");
								c.drawImage(picBirthday, 300, 300, 800, 800, null);
								birthdayParty = c.readLine();
								trumpError = true;
								if (birthdayParty.equalsIgnoreCase("Texas Sized 10-4")) {
									c.clear();
									birthdayError = true;
									while (chirpOrFightAgain == false) {
										c.drawImage(picHockeyPlayers, 300, 300, 800, 800, null);
										c.println(
												" The hockey players didn't get the ingredients for the drinks. Chirp or fight ");
										chirpOrFight = c.readLine();
										c.clear();
										if (chirpOrFight.equalsIgnoreCase("Chirp")) {
											chirpOrFightAgain = true;
											c.println(
													" Choose your chirp. ' Buddy you're made of spare parts'. or 'Did you get er' done? Just kidding I don't care' ");
											chirpChoice = c.readLine();
											c.clear();
											for (int i = 0; i <= 3; i++) {// loops until you win
												// 40% chance chirp doesn't work, 60% it works  
												int chirp = (int) (Math.random() * 10) + 1;
												if (chirp <= 4) {

													c.println(" Your chirp " + chirpChoice + " didn't work");
													c.println(
															" Choose your chirp.Buddy you're made of spare parts. or Did you get er' done? Just kidding I don't care ");
													chirpChoice = c.readLine();
													c.clear();
												}

												else if (chirp >= 5) {
													c.println(" You won the chrip off and the hockey players leave ");

													i = 3;
												}

											}

										} else if (chirpOrFight.equalsIgnoreCase("fight")) {
		                                   // 70% Chance you win, 30% you lose
											int fight = (int) (Math.random() * 10) + 1;

											if (fight <= 3) {
												c.drawImage(picGameOver, 300, 300, 800, 800, null);
												c.println(
														" you lose the fight. you are embaressed so you leave Letterykenny to live in Hamilton");

												c.println(" Would you like to try again? Texas sized 10-4 or Hard No");
												playAgain = c.readLine();

												if (playAgain.equalsIgnoreCase("Texas sized 10-4")) {
													chirpOrFightAgain = false;
													c.clear();
												} else if (playAgain.equalsIgnoreCase("Hard NO")) {
													chirpOrFightAgain = true;
													theme.stop();
													c.close();
												}

											} else if (fight >= 4) {
												chirpOrFightAgain = true;
												c.println(" You won the fight!! Congrats!");
												Thread.sleep(1000);
											
											}
										}

									}
								}

								else if (birthdayParty.equalsIgnoreCase("Hard No")) {
									c.clear();
									c.drawImage(picGameOver, 300, 300, 800, 800, null);
									c.println(" You miss the party of your life. You die of lonelyness");
									Thread.sleep(3000);
									theme.stop();
									c.close();
								}
								else{
									c.println(" please enter texas sized 10-4 or hard no ");
									birthdayError = false;
								}
							
							}
							}	
							
						
							else{
									
									c.println(" please enter yes or no ");
									trumpError = false;
								}
							}

						}
						

						else {

							c.println(" Please enter yes or no ");
							start = false;
						}
					}
		 /* LetterkennyGame.java
		 * choose your own adventure by making decisions through the town of Letterkenny 
		 * April 18 2016
		 * Brennan Stanfield
		 */
					picBar = ImageIO.read(LetterkennyGame.class.getResourceAsStream("LetterKennyBar.jpg"));
					picTheRealSanchez = ImageIO.read(LetterkennyGame.class.getResourceAsStream("TheRealSanchez.jpg"));
					picMaxTheDog = ImageIO.read(LetterkennyGame.class.getResourceAsStream("MaxTheDog.jpg"));

					// Variables
					String answerSwingFirst;
					String responseToChirpOrFight;
					String replyToStayOrLeave;
					String answerToFightOrRun;
					String responseToLeftOrRight;
					String replyKeepChirping;
					String answerKeepChirping;

					// Output
					c.drawImage(picTheRealSanchez, 0, 0, 600, 800, null);
					c.println("The phone rings. It's Sanchez. ''Okay don't come down the laneway.''");
					c.println("Sanchez walks up to you. Do you swing first? Texas sized 10-4 or Hard no?");
					answerSwingFirst = c.readLine();

					for (int i = 0; i < 3; i++) {
						// fight with sanchez
						if (answerSwingFirst.equalsIgnoreCase("Texas sized 10-4")) {
							c.println("Do you want to swing left hook or right?");
							responseToLeftOrRight = c.readLine();
						} else if (answerSwingFirst.equalsIgnoreCase("Hard No")) {
							// Chirp battle with sanchez
							c.println("Buddy you're softer than a tootsie roll fruit cup.");
							c.println("Do you want to continue chirping? Texas sized 10-4 or Hard no?");
							replyKeepChirping = c.readLine();
							c.clear();
							if (replyKeepChirping.equalsIgnoreCase("Hard no")) {
								c.println(
										"Sanchez thinks your chirp is weak and knocks you out... You wake up in Hamilton never to return to letterkenny again.");
								Thread.sleep(3000);
								theme.stop();
								c.close();
							} else if (replyKeepChirping.equalsIgnoreCase("Texas sized 10-4")) {
								c.println("You look like a skunk my dog killed and probably violated.");
							}

							c.println(
									"Sanchez looks like these chirps are starting to get to him. Hit him with one more or spare him the emberassment? One more or spare him?");
							answerKeepChirping = c.readLine();

							if (answerKeepChirping.equalsIgnoreCase("Spare him")) {
								c.println(
										"Sanchez thinks your chirp is weak and knocks you out... You wake up in Hamilton never to return to letterkenny again.");
								Thread.sleep(3000);
								theme.stop();
								c.close();
							} else if (answerKeepChirping.equalsIgnoreCase("One more")) {
								c.clear();
								c.println(
										"Take your tank tops and tonka trucks and kick rocks! You probably write Taylor Swift lyrics on birthday cards.");
							}

							c.println("Sanchez: Fellas, that's some of  the finest chirping I've ever recived... Ever");
							c.println(
									"Sanchez leaves and you decide to celebrate! Until you realize Tim's, McDonalds, and the Beer Store are closed and thats pretty much your whole world  right there. So you go chill at home");
							Thread.sleep(15000);
							theme.stop();
							c.close();
						}
					}
					c.clear();
					// The fight with Sanchez. 55% chance you win 45% chance you lose.
					int sanchezFight = (int) (Math.random() * 100) + 1;
					if (sanchezFight <= 45) {
						c.println("You lost?! Against Sanchez??? You get emberassed and move out of Letterkenny to Hamilton");
						Thread.sleep(5000);
						theme.stop();
						c.close();
					} else {
						c.println("Wow nice win bud. He won't be coming around again anytime soon");
						Thread.sleep(2000);
					}

					// The night after the fight
					c.drawImage(picBar, 0, 0, 500, 500, null);
					c.println("That night you go to the bar with the boys and your sis to celebrate the w");
					c.println(
							"While minding your own buisness at the bar you notice your sister is getting hit on by the hockey players.");
					c.println("Do you chirp them in hopes they back off or leave the bar? Chirp them? Leave bar?");
					responseToChirpOrFight = c.readLine();
					c.clear();
					if (responseToChirpOrFight.equalsIgnoreCase("Leave bar")) {
						c.println(
								"The hockey players leave with your sister. They end up getting married and move to Hamilton never to be seen again.");
						Thread.sleep(2000);
						theme.stop();
						c.close();
					} else if (responseToChirpOrFight.equalsIgnoreCase("Chirp them")) {
						c.println("Back off buddy, you couldn't wheel a tire down a hill");
						c.println("The hockey players get scared and back off");
						Thread.sleep(3000);
					}

					// The bar is now peaceful
					c.clear();
					c.println("Wayne: It's getting late boys, should we head out? Hard no or Texas Sized 10-4?");
					replyToStayOrLeave = c.readLine();

					if (replyToStayOrLeave.equalsIgnoreCase("Texas sized 10-4")) {
						c.println(
								"You leave the bar. After you leave you get attacked by a pack of the yellow eyed buggers, A.K.A cyotes, and you die.");
						Thread.sleep(3000);
						theme.stop();
						c.close();
					} else if (replyToStayOrLeave.equalsIgnoreCase("Hard no")) {
						c.println("Max the dog walks in looking for you...");
						Thread.sleep(2000);
					}
					c.clear();

					// Max seems mad
					c.drawImage(picMaxTheDog, 0, 0, 500, 600, null);
					c.println(
							"Max: I've been looking for you! Time to see who really is the toughest guy in Letterkenny! Do you fight or run away?");
					answerToFightOrRun = c.readLine();

					if (answerToFightOrRun.equalsIgnoreCase("Run away")) {
						c.println(
								"Max pumbels you and strips you of the title as toughest guy in Letterkenny. You are emberassed by this and move to Hamilton to escape the shame");
						Thread.sleep(2000);
						theme.stop();
						c.close();
					} else if (answerToFightOrRun.equalsIgnoreCase("Fight")) {
						c.println("Pitter patter you dog!");
					}

					int maxTheDogFight = (int) (Math.random() * 100) + 1;
					if (maxTheDogFight <= 49) {
						c.println("You let a dog beat you?! Wow... You move to Hamilton to escape the shame.");
					} else {
						c.println("Wow! You've reached it!! You are officially the toughest man in Letterkenny! Congrats!");
					}

					Thread.sleep(7000);
					theme.stop();
					c.close();
				
			

				}catch (Exception e) {
					e.printStackTrace();
				}
				}catch(IOException e)

			{
				c.println("Error. Restart Program.");
				Thread.sleep(3000);
				c.close();
			}


		}

	}



