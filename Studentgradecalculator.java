import java.util.Scanner;
class Eodd{
        public static void main(String[] args){
        int subject,i,t=0,marks,maxmarks,average;
        float percentage;
        Scanner s= new Scanner(System.in);
        System.out.println("enter no of sub:");
        subject=s.nextInt();
        maxmarks=100*subject;
        for(i=1;i<=subject;i++){
            Scanner sc =new Scanner(System.in);
            System.out.println("enter marks:");
            marks=s.nextInt();
            if(marks<=100){
                t=t+marks;
            }
            else{
                System.out.println("enter correct value");
                i=i-1;
            }
        }
       average=t/subject;
       if(average>=85){
        System.out.println("O Grade");
       }
       else if(average>=75){
        System.out.println("S Grade");
       }
       else if(average>=65){
        System.out.println("A Grade");
       }
       else if(average>=65){
        System.out.println("B Grade");
       }
       else if(average>=55){
        System.out.println("c Grade");
       }
       else{
        System.out.println("FAIL");
       }
        }       
}
