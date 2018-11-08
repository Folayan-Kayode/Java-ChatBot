/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Folayan Kayode
 */
import java.util.*;

public class ChatBot {
    public static void main(String [] args)
    {
        try {
        String input1, input2, input3, input5, input6;
        Scanner sc = new Scanner(System.in);
         System.out.println("                                                   This is an Automated ChatBot                           ");
        
        System.out.println();
        
        System.out.println("You Can Start Up A Conversation With Me By Typing 'Hello' or Other Words");
        
        System.out.println();
        
        
        input1 = sc.nextLine();
        String[] arr = input1.split(" ");
        
          System.out.println();
        
       
        
        if (!input1.equals(" ") || input1.equalsIgnoreCase("Hi") || input1.equalsIgnoreCase("Hello") || input1.equalsIgnoreCase("What's Up?") || input1.equalsIgnoreCase("Hey") || input1.equalsIgnoreCase("wassup") || input1.equalsIgnoreCase("howfar") || input1.equalsIgnoreCase("how far") || input1.equalsIgnoreCase("heys") || input1.equalsIgnoreCase("waddup") || input1.equalsIgnoreCase("sup") || input1.equalsIgnoreCase("xup") || input1.equalsIgnoreCase("yo"))
        {
              System.out.println("Hello!");
              
            System.out.println("How are You?");
            
            System.out.println();
            
        }
        else if (input1.equals(" "))
        {
            do
            {
                System.out.println("Input cannot be empty");
                input1 = sc.nextLine();
            }
            while (input1.equals(" "));
        }
        else 
              {
              System.out.println("Hello!");
              
            System.out.println("How are You?");
            
            System.out.println();
              }
        
        input2 = sc.nextLine();
        
          System.out.println();
          
        if( input2.equalsIgnoreCase("I am Fine") || input2.contains("fine") || input2.contains("Fine") || input2.contains("great") || input2.contains("Great") || input2.contains("cool") || input2.contains("Cool") || input2.contains("awesome") || input2.contains("Awesome") || input2.contains("good") || input2.contains("Good") || input2.contains("okay") || input2.contains("Okay"))
        {
            System.out.println();
            
            System.out.println("Wow! That's Good to hear");
            
            System.out.println();
            
        }
        else if (input2.contains("ass") || input2.contains("Ass") || input2.contains("Fuck") || input2.contains("fuck") || input2.contains("google") || input2.contains("Google") || input2.contains("stupid") || input2.contains("ask") || input2.contains("Ask"))
   
        {
            
            System.out.println();
            
            System.out.println("No Insults Please!");
            
            System.out.println();
            
        }
        else 
        {
            System.out.println("I don't Understand Your Input");
            System.out.println();
            System.out.println("Goodbye!");
            System.exit(0);
        }
        
        System.out.println("What's Your Name");
        
        System.out.println();
        
        input3 = sc.nextLine();
        
        System.out.println();
        
        
         if (input3.contains("ass") || input3.contains("Ass") || input3.contains("fuck") || input3.contains("fuck") || input3.contains("google") || input3.contains("Google") || input3.contains("stupid") || input3.contains("ask") || input3.contains("Ask") || input3.contains("sexy") || input3.contains("idiot") || input3.contains("question") || input3.contains("Question"))
   
        {
         System.out.println("That's Not a Name!");  
            System.out.println("Goodbye!");
            System.exit(0);
            
        }
        
        
         
         else 
         {
              System.out.println(input3 + "! That's a Sweet Name");
        System.out.println("My name is Dave The Chatbot!");
        
         } 
         
         System.out.println();
         
         System.out.println("How Old Are You?");
         
         System.out.println();
         
         Long age;
         
         age = sc.nextLong();
         
         System.out.println();
         
         if (age > 70 || age <= 5 || age.equals("years") || age.equals("old"))
        {
            System.out.println("Lol! " + " If You were " + age + " years old, You won't be able to interact with Me!!");
        }
        
         else
         {
             System.out.println("Wow!");
             System.out.println(age + " years old!");
             System.out.println("You're way Older than Me :-)");
         }
          String input4;
         
          Scanner input = new Scanner(System.in);
         
          
          System.out.println();
          
          System.out.println("What's Your Favorite Color?");
        
            System.out.println();
          
          input4 = input.nextLine();
          
            System.out.println();
          
          if (input4.contains("blue") || input4.contains("Blue"))
          {
              System.out.println("Me too! Blue is My Favorite Color.");
          }
          else if (input4.contains("red") || input4.contains("Red") || input4.contains("yellow") || input4.contains("Yellow") || input4.contains("green") || input4.contains("Green") || input4.contains("Black") || input4.contains("black") || input4.contains("white") || input4.contains("White") || input4.contains("pink") || input4.contains("Pink") || input4.contains("purple") || input4.contains("Purple") || input4.contains("torquoise") || input4.contains("Torquoise") || input4.contains("orange") || input4.contains("Orange") || input4.contains("Maroon") || input4.contains("maroon") || input4.contains("Brown") || input4.contains("brown") || input4.contains("gray") || input4.contains("Gray") || input4.contains("grey") || input4.contains("Grey"))
          {
         System.out.println("That's Nice. Mine is Blue :-D.");     
          }
          else if (input4.contains("stupid") || input4.contains("fuck") || input4.contains("crazy") || input4.contains("ass") || input4.contains("google") || input4.contains("Google") || input4.contains("know") || input4.contains("ask") || input4.contains("Ask") || input4.contains("nothing") || input4.contains("Know") || input4.contains("question") || input4.contains("Question"))
          {
              System.out.println("Funny You! I'll Smack You even if I'm a Bot!");
          }
          else
          {
              System.out.println("That's Not a Color, but, Okay!");
          }
          
            System.out.println();
            
          System.out.println(input3 + " Can I Ask A quick random question on football?");
          
          System.out.println();
          
          System.out.println("Input 'Yes' or 'No'");
          
            System.out.println();
          
          input5 = input.nextLine();
          
            System.out.println();
         
              if (input5.equalsIgnoreCase("Yes") || input5.contains("yes") || input5.contains("Yes"))
              {
                  System.out.println("Cool. Ok, Here is the Question!");
                  
                    System.out.println();
                    
                  System.out.println("Who won the Just Concluded 2018 FIFA world cup");
                  System.out.println("1. Brazil");
                  System.out.println("2. Belgium");
                  System.out.println("3. France");
                  System.out.println("4. Croatia");
                  System.out.println("5. England");
                  
                    System.out.println();
                    
                  input6 = input.nextLine();
                  
                    System.out.println();
                    
                  if (input6.equalsIgnoreCase("France"))
                  {
                      System.out.println("That's Really Accurate " + input3);
                     System.out.println("You actually got it right!");
                  }
                  else if (input6.equalsIgnoreCase("Brazil") || input6.equalsIgnoreCase("Belgium") || input6.equalsIgnoreCase("Croatia") || input6.equalsIgnoreCase("England"))
              
                  {
                      do
                      {
                  System.out.println("Wrong Answer!");
                  
                  System.out.println();
                  
                  System.out.println("Try Again.");
                  
                  input6 = input.nextLine();
                  
                    System.out.println();
                    
                      }
                      while(input6.equalsIgnoreCase("Brazil") || input6.equalsIgnoreCase("Belgium") || input6.equalsIgnoreCase("Croatia") || input6.equalsIgnoreCase("England"));
                 if(input6.equalsIgnoreCase("France"))
                 {
                     System.out.println("That's Correct. Nicely Done!");
                 }
                  }
              
              else 
              {
                  System.out.println("That's Wrong! It isn't even part of the Options.");
                  System.out.println("Goodbye!");
                  System.exit(0);
              }
          
    }
              else if (input5.equalsIgnoreCase("No"))
              {
                  System.out.println("I Guess You Don't actually Like Sport");
              }
              else
              {
               System.out.println("You've Input The Wrong Command.");
               System.out.println("Goodbye!");
               System.exit(0);
               
              } 
              
                System.out.println();
                
              System.out.println("Oh! I forgot to Ask.");
              
                System.out.println();
                
              System.out.println("What's Your Gender?");
              
                System.out.println();
              
              String input7 = input.nextLine();
              
                System.out.println();
                
              if (input7.equalsIgnoreCase("Boy") || input7.equalsIgnoreCase("Guy") || input7.equalsIgnoreCase("Man") || input7.equalsIgnoreCase("Dude") || input7.contains("Boy") || input7.contains("boy") || input7.contains("man") || input7.contains("Man") || input7.contains("Guy") || input7.contains("guy") || input7.contains("dude") || input7.contains("Dude") || input7.contains("Male") || input7.contains("male"))
              {
                  System.out.println("Cool :-). It Must be Pretty Amazing to be of the Male Gender");
                  System.out.println("I'm an AI, I belong neither to the Male or Female Gender.");
              }
              
              else if (input7.equalsIgnoreCase("Girl") || input7.equalsIgnoreCase("Woman") || input7.equalsIgnoreCase("Lady") || input7.contains("Girl") || input7.contains("girl") || input7.contains("Woman") || input7.contains("woman") || input7.contains("Lady") || input7.contains("lady"))
              {
                    System.out.println("Cool :-). It Must be Pretty Amazing to be of the Female Gender");
                  System.out.println("I'm an AI, I belong neither to the Male or Female Gender.");
              }      
              
              else 
              {
                  System.out.println("I do not Think that's Part of The Human Gender");
                  System.out.println("Goodbye!");
                  System.exit(0);
              }
              
              System.out.println();
              System.out.println("Shall We Play A Game of 'Guess The Number'?");
              System.out.println();
              System.out.println("1. Yes");
              System.out.println("2. No");
              System.out.println();
              String ans = input.nextLine();
              System.out.println();
              {
                  if (ans.equalsIgnoreCase("Yes"))
              
                        
                          {
              Random rand = new Random(); 
              Scanner scan = new Scanner(System.in);
 
              int count = 0;
              int guess = 0;
 
              int random = rand.nextInt(20);
              
              System.out.println("The Game is Played By Guessing any digit ranging from '1-20' till You Guess it right.");
 
              System.out.println("Enter a guess: ");
              
              System.out.println();
             
              while(guess != random){ 
              guess = scan.nextInt();
              
              System.out.println();
 
             if(guess < 1 || guess > 20)
             {
             System.out.println("The number must be between 1 and 20");
               }
            else if(guess < random){
                System.out.println("Wrong!");
           System.out.println("But You're Close. Try again!");
           count++;
                }
            else if(guess > random){
            System.out.println("Wrong! Try again!");
            count++;
                }
                
              }
                count++;
            System.out.println("Right guess!");
            
            System.out.println();
            
            
            System.out.println("Number of tries: "+count);
            
         
                          }
               
                  else if (ans.equalsIgnoreCase("No"))
                   {
                      System.out.println("Ooh! I would have Loved for You to Play The 'Number Guess' Game. It is actually Fun");
                  }
              else
                  {
                      System.out.println("You've Input The Wrong Command!");
                      System.out.println("Goodbye!");
                      System.exit(0);
        
                  }
              
              }
        
        
              System.out.println("Hey!" + input3 + ", I have another Game for You :-)");
              
              System.out.println();
              
              System.out.println("It's Called The 'Unscramble' Game.");
              
              System.out.println("Wanna Play?");
              
              String Play;
              
              Scanner scan = new Scanner(System.in);
              
              System.out.println();
              
              Play = scan.nextLine();
              
              
              if (Play.equalsIgnoreCase("Yes") || Play.contains("Yes") || Play.contains("yes") || Play.contains("Sure") || Play.contains("sure") || Play.contains("Yeah") || Play.contains("yeah"))
              {
                 
     System.out.println("So! " + input3 + ", Here is how the Game works");
     
      System.out.println();
      
       System.out.println("You'll be given a word that is disarranged");
        System.out.println("You're expected to input the word back in the Right Order");
         System.out.println();
          System.out.println("Goodluck!");
          
           System.out.println();
            System.out.println();
            
             System.out.println("UnScRaMbLe: leancd");
      
             Scanner scanner = new Scanner(System.in);
             
       System.out.println();
    String candle = scanner.nextLine();
    System.out.println();
    
if (candle.equalsIgnoreCase("Candle"))   
{
    System.out.println("Cool! You Actually got it right on Your First Attempt.");
    System.out.println("I'm impressed!");
}    else if (candle.contains("c") && candle.contains("a") && candle.contains("n") && candle.contains("d") && candle.contains("l") && candle.contains("e") && !candle.equalsIgnoreCase("Candle") || candle.contains("C") && candle.contains("A") && candle.contains("N") && candle.contains("D") && candle.contains("L") && candle.contains("E") || candle.contains("C") && candle.contains("a") && candle.contains("n") && candle.contains("d") && candle.contains("l") && candle.contains("e") || candle.contains("c") && candle.contains("A") && candle.contains("n") && candle.contains("d") && candle.contains("l") && candle.contains("e") || candle.contains("c") && candle.contains("a") && candle.contains("N") && candle.contains("d") && candle.contains("l") && candle.contains("e") || candle.contains("c") && candle.contains("a") && candle.contains("n") && candle.contains("D") && candle.contains("l") && candle.contains("e") || candle.contains("c") && candle.contains("a") && candle.contains("n") && candle.contains("d") && candle.contains("L") && candle.contains("e") || candle.contains("c") && candle.contains("a") && candle.contains("n") && candle.contains("d") && candle.contains("l") && candle.contains("E"))
        {
            do {
                 System.out.println();
    System.out.println("Try Again!");
    System.out.println();
    candle = scanner.nextLine();
            }
    while (candle.contains("c") && candle.contains("a") && candle.contains("n") && candle.contains("d") && candle.contains("l") && candle.contains("e") && !candle.equalsIgnoreCase("Candle") || candle.contains("C") && candle.contains("A") && candle.contains("N") && candle.contains("D") && candle.contains("L") && candle.contains("E") || candle.contains("C") && candle.contains("a") && candle.contains("n") && candle.contains("d") && candle.contains("l") && candle.contains("e") || candle.contains("c") && candle.contains("A") && candle.contains("n") && candle.contains("d") && candle.contains("l") && candle.contains("e") || candle.contains("c") && candle.contains("a") && candle.contains("N") && candle.contains("d") && candle.contains("l") && candle.contains("e") || candle.contains("c") && candle.contains("a") && candle.contains("n") && candle.contains("D") && candle.contains("l") && candle.contains("e") || candle.contains("c") && candle.contains("a") && candle.contains("n") && candle.contains("d") && candle.contains("L") && candle.contains("e") || candle.contains("c") && candle.contains("a") && candle.contains("n") && candle.contains("d") && candle.contains("l") && candle.contains("E"));
if (candle.equalsIgnoreCase("Candle"))   
{
    System.out.println("Correct!");
    System.out.println("That was Nice.");
        }

    }
else
    {
        System.out.println("You have typed in a wrong word!");
        System.out.println("Goodbye!");
        System.exit(0);
    }

System.out.println();
System.out.println("Just One More To Go!");
System.out.println();

System.out.println("UnScRaMbLe: meatsr");

String stream = scanner.nextLine();
if (stream.equalsIgnoreCase("Stream"))
{
    System.out.println("Wow! " + input3 + ", You Got it Right");
    System.out.println("I bet it was too easy for You.");
}

else if (stream.contains("s") && stream.contains("t") && stream.contains("r") && stream.contains("e") && stream.contains("a") && stream.contains("m") && !stream.equalsIgnoreCase("Stream") || stream.contains("S") && stream.contains("t") && stream.contains("r") && stream.contains("e") && stream.contains("a") && stream.contains("m") || stream.contains("s") && stream.contains("T") && stream.contains("r") && stream.contains("e") && stream.contains("a") && stream.contains("m") || stream.contains("s") && stream.contains("t") && stream.contains("R") && stream.contains("e") && stream.contains("a") && stream.contains("m") || stream.contains("s") && stream.contains("t") && stream.contains("r") && stream.contains("E") && stream.contains("a") && stream.contains("m") || stream.contains("s") && stream.contains("t") && stream.contains("r") && stream.contains("e") && stream.contains("A") && stream.contains("m") || stream.contains("s") && stream.contains("t") && stream.contains("r") && stream.contains("e") && stream.contains("a") && stream.contains("M"))
{
      do {
                 System.out.println();
    System.out.println("Try Again!");
    System.out.println();
    stream = scanner.nextLine();
            }
    while  (stream.contains("s") && stream.contains("t") && stream.contains("r") && stream.contains("e") && stream.contains("a") && stream.contains("m") && !stream.equalsIgnoreCase("Stream") || stream.contains("S") && stream.contains("t") && stream.contains("r") && stream.contains("e") && stream.contains("a") && stream.contains("m") || stream.contains("s") && stream.contains("T") && stream.contains("r") && stream.contains("e") && stream.contains("a") && stream.contains("m") || stream.contains("s") && stream.contains("t") && stream.contains("R") && stream.contains("e") && stream.contains("a") && stream.contains("m") || stream.contains("s") && stream.contains("t") && stream.contains("r") && stream.contains("E") && stream.contains("a") && stream.contains("m") || stream.contains("s") && stream.contains("t") && stream.contains("r") && stream.contains("e") && stream.contains("A") && stream.contains("m") || stream.contains("s") && stream.contains("t") && stream.contains("r") && stream.contains("e") && stream.contains("a") && stream.contains("M"));

      if (stream.equalsIgnoreCase("Stream"))   

{
    System.out.println("You got it right!");
    System.out.println("Not too Hard Right?");
        }
else
    {
        System.out.println("You have typed in a wrong word!");
        System.out.println("Goodbye!");
        System.exit(0);
    }
}

System.out.println();
              

     
              }
               else if (Play.equalsIgnoreCase("No") || Play.contains("No") || Play.contains("no") || Play.contains("Nah") || Play.contains("nah") || Play.contains("Nope") || Play.contains("nope"))
                  {
                      System.out.println("Ooh! I would have Loved for You to Play The 'Unscramble' Game. It is actually Fun");
                  }
              else
                  {
                      System.out.println("You've Input The Wrong Command!");
                      System.out.println("Goodbye!");
                      System.exit(0);
                  }
              System.out.println();
              System.out.println("Here's a Bonus for You.");
              System.out.println();
              System.out.println("Enter a Word, I'll give You a Design.");
              
              
String[] array = { "   /\\\n  /__\\\n /    \\\n/      \\\n"," _\n| \\\n|_/\n| \\\n|_/\n",
" __ \n|  |\n|\n|\n|__|\n"," _\n| \\\n|  |\n|  |\n|_/\n"," __\n|  |\n|_\n|\n|__|\n",
" __\n|  |\n|_\n|\n|\n"," ___\n|   |\n| __\n| | |\n|___|\n","|  |\n|__|\n|  |\n|  |\n",
"|\n|\n|\n|\n"," _ _\n| | |\n  |\n  |\n\\_/\n","| /\n|/\n|\\\n| \\\n","|\n|\n|\n|__\n",
"|\\  /|\n| \\/ |\n|    |\n|    |\n","|\\   |\n| \\  |\n|  \\ |\n|   \\|\n",
" __ \n/  \\\n|  |\n|  |\n\\__/\n"," _\n| \\\n|_/\n|\n|\n",
" __\n|  |\n|  |\n|\\ |\n|_\\|\n   \\\n"," _\n| \\\n|_/\n|\\\n| \\\n",
"____\n|\n|____\n    |\n____|\n","__ __\n  |\n  |\n  |\n","|  |\n|  |\n|  |\n\\__/\n",
"\\      /\n \\    /\n  \\  /\n   \\/\n","|    |\n|    |\n| /\\ |\n|/  \\|\n",
"\\  /\n \\/\n /\\\n/  \\\n","\\  /\n \\/\n /\n/\n","____\n   /\n  /\n /\n/____\n"};
Scanner in = new Scanner(System.in);
String na=in.nextLine();
System.out.println("Your word = "+na+"\n");
char[]ca = na.toLowerCase().toCharArray();
for(int i=0; i<ca.length; i++)
{
    System.out.println(array[((int)ca[i])-97]);
    }
              
              
              System.out.println("So, " + input3 + ". This is as far as I can go for now");
              System.out.println("Goodbye!");
    }
        catch (Exception e)
        {
            System.out.println("You've input the wrong command");
            System.exit(0);
        }
}
}
