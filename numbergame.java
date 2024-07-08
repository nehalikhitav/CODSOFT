import java.util.*;

class task1
{
    public static void main(String[] args) {
       Random random =new Random();
       int gnumber,guess;
       gnumber=random.nextInt(100);
       System.out.println("Enter a number within 1 to 100: "+gnumber);
       int i,chance=3;
       for(i=1;i<=chance;i++)
       {
       Scanner S =new Scanner(System.in);
       System.out.println("Enter the guess number: ");
       guess=S.nextInt();  
        {
        if(gnumber==guess)
        {
            System.out.println("your guess is correct");
            if(i==1)
            {
                System.out.println("congratulations!your score is 10");
                break;
            }
            else if(i==2)
            {
                System.out.println("congratulations!your score is 5");
                break;
            }
            else if(i==3)
            {
                System.out.println("congratulations!your score is 2");
                break;
            }
            else
            {
                System.out.println("0");
                break;
         
              }
            }
        else if(gnumber>guess && i!=chance)
        
        {
            System.out.println("your guess is too low");
        
        }
        else if(gnumber<guess && i!=chance)
        {
            System.out.println("your guess is too high");
    
        }
        if(i==chance)
        {
         System.out.println();  
        
        }
    }

        }   
        }
        }