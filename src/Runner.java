import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Runner
	{
		static int random;
		static String ans;
		static int count = 0;
		public static void main(String[] args)
			{
				Scanner input = new Scanner(System.in);
				System.out.println("How many questions would you like to be asked?");
				int num = input.nextInt();
				ArrayList<String> answers = new ArrayList<String>();
				answers.add("Woof");
				answers.add("Meow");
				answers.add("Wa-pa-pa-pa-pa-pa-pow!");
				answers.add("Tchoff-tchoff-tchoffo-tchoffo-tchoff!");
				answers.add("This would not work");
				ArrayList<String> questions = new ArrayList<String>();
				questions.add("a.animalSound()");
				questions.add("a.animalNoise()");
				questions.add("a.foxNoise()");
				questions.add("f.animalSound()");
				questions.add("f.animalNoise()");
				questions.add("f.foxNoise()");
				for (int i = 0; i < num; i++)
					{
						random = (int) (Math.random() * 4 + 1);
						question(1, "Animal a = new Animal()");
						question(2, "Animal a = new Fox()");
						question(3, "Fox f = new Fox()");
//						if (random == 1)
//							{
//								System.out.println("Animal a = new Animal()");
//							}
//						if (random == 2)
//							{
//								System.out.println("Animal a = new Fox()");
//							}
//						if (random == 3)
//							{
//								System.out.println("Fox f = new Fox()");
//							}
						if (random < 4)
							{
								if (random <= 2)
									{
										random = (int) (Math.random() * 3);
									}
								else
									{
										random = (int) (Math.random() * 3 + 3);
									}
								System.out.println("What would print out if " + questions.get(random) + " is called?");
								System.out.println("a. " + answers.get(0));
								System.out.println("b. " + answers.get(1));
								System.out.println("c. " + answers.get(2));
								System.out.println("d. " + answers.get(3));
								System.out.println("e. " + answers.get(4));
								Scanner input2 = new Scanner(System.in);
								ans = input2.nextLine().toLowerCase();
								check(0, "a", "Woof");
								check(1, "b", "Meow");
								check(2, "e", "This would not work");
								check(3, "d", "Tchoff-tchoff-tchoffo-tchoffo-tchoff!");
								check(4, "b", "Meow");
								check(5, "c", "Wa-pa-pa-pa-pa-pa-pow!");
							}
						else
							{
								System.out.println("Fox f = new Animal()");
								System.out.println("What would print out if " + questions.get(random) + " is called?");
								System.out.println("a. " + answers.get(0));
								System.out.println("b. " + answers.get(1));
								System.out.println("c. " + answers.get(2));
								System.out.println("d. " + answers.get(3));
								System.out.println("e. " + answers.get(4));
								Scanner input2 = new Scanner(System.in);
								String an = input2.nextLine();
								if (an.equals("e"))
									{
										System.out.println("That is correct");
										count++;
									}
								else
									{
										System.out.println("That is incorrect");
										System.out.println("This would not work");
									}
							}
						}
						System.out.println("You got " + count + " out of " + num);
					}
		public static void check(int num, String answer, String print)
		{
			if (random == num)
				{
					if (ans.toLowerCase().equals(answer))
						{
							System.out.println("That is correct");
							count++;
						} 
					else
						{
							System.out.println("That is incorrect");
							System.out.println("The answer is: " + print);
						}
				}
		}
		public static void question(int a, String s)
		{
			if (random == a)
				{
					System.out.println(s);
				}
		}
	}
