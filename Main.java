import java.util.Scanner;

public class Main
 {
 public static int[] Hisaab =  new int[20];

  public static void main(String[] args)
   {
    ChatBot.sayHello();
    Scanner keyboard = new Scanner(System.in); 
    String userName = "";               
    userName = keyboard.nextLine();  
    System.out.println(" ");
    System.out.println(userName+", it is a pleasure to meet you.");
    System.out.println(" ");
    System.out.println("WELCOME to the Covid-19 CHAT BOT");
    System.out.println(" ");
    System.out.println("For Covid Related = PRESS 1");
    System.out.println(" ");
    System.out.println("General = PRESS 2");
    System.out.println(" ");

  Scanner ab = new Scanner(System.in);
  int g = ab.nextInt();
  switch(g)
    {
    case 1:
      covid();
      break;
    case 2:
      general();
      break;
    }
  }
     public static void covid()
      {
          int i = 0 ;
         
          Scanner abb = new Scanner(System.in);
          System.out.println(" ");
          System.out.println("Please Share your symptoms");
          System.out.println(" ");
          System.out.println("Fever or chills in the body?");
          System.out.println(" ");
          System.out.println("1=YES");
          System.out.println("0=NO");
          System.out.println(" ");
          Hisaab[i] = abb.nextInt();
          i++;

          System.out.println(" ");
          System.out.println("constant headaches?");
          System.out.println(" ");
          System.out.println("1=YES");
          System.out.println("0=NO");
          System.out.println(" ");
          Hisaab[i] = abb.nextInt();
          i++;

          System.out.println(" ");
          System.out.println("diffiulty in breathing?");
          System.out.println(" ");
          System.out.println("1=YES");
          System.out.println("0=NO");
          System.out.println(" ");
          Hisaab[i] = abb.nextInt();
          i++;

          System.out.println(" ");
          System.out.println("runny nose?");
          System.out.println(" ");
          System.out.println("1=YES");
          System.out.println("0=NO");
          System.out.println(" ");
          Hisaab[i] = abb.nextInt();
          i++;
  
          System.out.println(" ");
          System.out.println("Nausea or vomiting?");
          System.out.println(" ");
          System.out.println("1=YES");
          System.out.println("0=NO");
          System.out.println(" ");
          Hisaab[i] = abb.nextInt();
          i++;

          System.out.println(" ");
          System.out.println("Muscle or body aches?");
          System.out.println(" ");
          System.out.println("1=YES");
          System.out.println("0=NO");
          System.out.println(" ");
          Hisaab[i] = abb.nextInt();
          i++;
          System.out.println(" ");
          System.out.println("loss of taste or smell?");
          System.out.println(" ");
          System.out.println("1=YES");
          System.out.println("0=NO");
          System.out.println(" ");
          Hisaab[i] = abb.nextInt();
          i++;
          System.out.println(" ");
          System.out.println("Sore throat?");
          System.out.println(" ");
          System.out.println("1=YES");
          System.out.println("0=NO");
          System.out.println(" ");
          Hisaab[i] = abb.nextInt();
          i++;
          
          System.out.println(" ");
          System.out.println("Diarrhea?");
          System.out.println(" ");
          System.out.println("1=YES");
          System.out.println("0=NO");
          System.out.println(" ");
          Hisaab[i] = abb.nextInt();
          i++;
          
          System.out.println(" ");
          System.out.println("Fatigue?");
          System.out.println(" ");
          System.out.println("1=YES");
          System.out.println("0=NO");
          System.out.println(" ");
          Hisaab[i] = abb.nextInt();
          i++;

          int sum = Hisaab[0];
        for(i=1;i<10;i++)
          {
          
            sum =  Hisaab[i] + sum;

          }
          sum = sum * 10;
          System.out.println(" ");
          System.out.println("Your chances of Having covid is "+sum+" % ");

      }
 
 public static void general()
 {
          int i = 0 ;
         
          Scanner abb = new Scanner(System.in);
          System.out.println(" ");
          System.out.println("Please share your symptoms");
          System.out.println(" ");
          System.out.println("Mild fever?");
          System.out.println(" ");
          System.out.println("1=YES");
          System.out.println("0=NO");
          System.out.println(" ");
          Hisaab[i] = abb.nextInt();
          i++;

          System.out.println(" ");
          System.out.println("dry cough?");
          System.out.println(" ");
          System.out.println("1=YES");
          System.out.println("0=NO");
          System.out.println(" ");
          Hisaab[i] = abb.nextInt();
          i++;
          
          System.out.println(" ");
          System.out.println("Constant tiredness?");
          System.out.println(" ");
          System.out.println("1=YES");
          System.out.println("0=NO");
          System.out.println(" ");
          Hisaab[i] = abb.nextInt();
          i++;
          
          System.out.println(" ");
          System.out.println("Sneezing?");
          System.out.println(" ");
          System.out.println("1=YES");
          System.out.println("0=NO");
          System.out.println(" ");
          Hisaab[i] = abb.nextInt();
          i++;

          System.out.println(" ");
          System.out.println("Stuffy nose?");
          System.out.println(" ");
          System.out.println("1=YES");
          System.out.println("0=NO");
          System.out.println(" ");
          Hisaab[i] = abb.nextInt();
          i++;
          
          System.out.println(" ");
          System.out.println("Earache?");
          System.out.println(" ");
          System.out.println("1=YES");
          System.out.println("0=NO");
          System.out.println(" ");
          Hisaab[i] = abb.nextInt();
          i++;
          
          System.out.println(" ");
          System.out.println("Loss of appetite?");
          System.out.println(" ");
          System.out.println("1=YES");
          System.out.println("0=NO");
          System.out.println(" ");
          Hisaab[i] = abb.nextInt();
          i++;

          System.out.println(" ");
          System.out.println("Sore throat or hoarseness in voice?");
          System.out.println(" ");
          System.out.println("1=YES");
          System.out.println("0=NO");
          System.out.println(" ");
          Hisaab[i] = abb.nextInt();
          i++;

          System.out.println(" ");
          System.out.println("Body ache?");
          System.out.println(" ");
          System.out.println("1=YES");
          System.out.println("0=NO");
          System.out.println(" ");
          Hisaab[i] = abb.nextInt();
          i++;

          System.out.println(" ");
          System.out.println("Fatigue?");
          System.out.println(" ");
          System.out.println("1=YES");
          System.out.println("0=NO");
          System.out.println(" ");
          Hisaab[i] = abb.nextInt();
          i++;

          int sum = Hisaab[0];
          for(i=1;i<10;i++)
           {
          
            sum =  Hisaab[i] + sum;

           }
          sum = sum*10;
          System.out.println(" ");
          System.out.println("Your chances of Having common code is "+sum+" % ");
      }
 }