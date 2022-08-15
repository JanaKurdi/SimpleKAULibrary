//CPCS202
//8/10/2019

import java.util.Scanner;//Scanner is in java.util pakage

public class KauLibrary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //Create a Scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("---------------------------------------------------");
        System.out.println("             Welcome to KAU Library   ");
        System.out.println("---------------------------------------------------");
        System.out.println("Enter 1 for Borrowing Books");
        System.out.println("Enter 2 for Returning Books");
        System.out.print("Enter any other number to quit\n"
                + "Enter your choice:");//prompt the user to enter a choice
        int choice = input.nextInt();
     
      if (choice == 1){//if choice=1 print borrowing and returnig menu
            System.out.println(" ---------------------------------------------------");
            System.out.println(" BORROWING/RETURNING MENU");
            System.out.println(" ---------------------------------------------------");
            System.out.println(" Enter 1 for Faculty Members:");   
            System.out.println(" Enter 2 for Staff");
            System.out.println(" Enter 3 for PhD/Master Student");
            System.out.println(" Enter 4 for Undergraduate Student");
            System.out.print(" Enter any other number to quit\n" + ""
                    + " Enter your choice:");//prompt the user to enter a choice
            int choice2 = input.nextInt();
        
 
           if (choice2 == 1) {//if choice2=1 enter id and borrowed books
                System.out.print("Enter your ID:");//prompt the user to enter ID
                int id = input.nextInt();
                //prompt the user to enter the number of borrowed
                System.out.print("Enter the number of books being borrowed:");
                int book = input.nextInt();
                
              if (book<=10){//if book<=10 print information details for borrowing
               System.out.println("---------------------------------------------------");
               System.out.println("INFORMATION DETAILS FOR BORROWING");
               System.out.println("---------------------------------------------------");
               System.out.println("Identity number :"+id);
               System.out.println("Member Category : faculty");
               System.out.println("Number of borrowed books :"+book); 
               int fbooks=10;//fbooks=faculty allowed books
               System.out.println("Number of allowed books :"+fbooks);
               int fdays=120;//fdays=faculty allowed days 
               System.out.println("Number of allowed days :"+fdays);
               System.out.println("------------------------------------------");
               System.out.println("*** Thank you for Visiting ***");
               System.out.println("------------------------------------------");
                }
                
                else//if the books>10 print sorry
                    System.out.println("Sorry! Number of books exceeds the allowed quantity!");
        
            }else if (choice2 == 2) {
                System.out.print("Enter your ID:");
                int id = input.nextInt();
                System.out.print("Enter the number of books being borrowed:");
                int book = input.nextInt();
                 if (book<=8){
               System.out.println("---------------------------------------------------");
               System.out.println("INFORMATION DETAILS FOR BORROWING");
               System.out.println("---------------------------------------------------");
               System.out.println("Identity number :"+id);
               System.out.println("Member Category : staff");
               System.out.println("Number of borrowed books :"+book); 
               int sbooks=8;//sbooks= staff allowed books
               System.out.println("Number of allowed books :"+sbooks);
               int sdays=90;//sdays=staff allowed days
               System.out.println("Number of allowed days :"+sdays);
               System.out.println("------------------------------------------");
               System.out.println("*** Thank you for Visiting ***");
               System.out.println("------------------------------------------");
                }
                
                else
                    System.out.println("Sorry! Number of books exceeds the allowed quantity!");
                
                
                
            } else if (choice2 == 3) {
                System.out.print("Enter your ID:");
                int id = input.nextInt();
                System.out.print("Enter the number of books being borrowed:");
                int book = input.nextInt();
                 if (book<=6){
               System.out.println("---------------------------------------------------");
               System.out.println("INFORMATION DETAILS FOR BORROWING");
               System.out.println("---------------------------------------------------");
               System.out.println("Identity number :"+id);
               System.out.println("Member Category : Postgraduate Student");
               System.out.println("Number of borrowed books :"+book); 
               int pmbooks=6;//pmbooks=PhD/Master Student allowed books
               System.out.println("Number of allowed books :"+pmbooks);
               int pmdays=30;//pmdays=PhD/Master Student allowed days
               System.out.println("Number of allowed days :"+pmdays);
               System.out.println("------------------------------------------");
               System.out.println("*** Thank you for Visiting ***");
               System.out.println("------------------------------------------");
                }
                
                else
                    System.out.println("Sorry! Number of books exceeds the allowed quantity!");
                
               
                
            
                
            }else if (choice2 == 4) {
                System.out.print("Enter your ID:");
                int id = input.nextInt();
                System.out.print("Enter the number of books being borrowed:");
                int book = input.nextInt();
                 if (book<=3){
               System.out.println("---------------------------------------------------");
               System.out.println("INFORMATION DETAILS FOR BORROWING");
               System.out.println("---------------------------------------------------");
               System.out.println("Identity number :"+id);
               System.out.println("Member Category : Undergraduate Student");
               System.out.println("Number of borrowed books :"+book); 
               int usbooks=3;//usbooks=Undergraduate Student allowed books
               System.out.println("Number of allowed books :"+usbooks);
               int usdays=15;//usdays=Undergraduate Student allowed days
               System.out.println("Number of allowed days :"+usdays);
               System.out.println("------------------------------------------");
               System.out.println("*** Thank you for Visiting ***");
               System.out.println("------------------------------------------");
                }
                
                else
                    System.out.println("Sorry! Number of books exceeds the allowed quantity!");
                
      
            } else {
                System.out.println("Wrong selection of member type!");
                System.out.println("------------------------------------------");
                System.out.println("*** Thank you for visiting ***");
                System.out.println("------------------------------------------");
                System.exit(0);
                
            }
            
        }else if (choice== 2) {
                System.out.println("---------------------------------------------------");
                System.out.println("BORROWING/RETURNING MENU");
                System.out.println("---------------------------------------------------");
            System.out.println(" Enter 1 for Faculty Members:");   
            System.out.println(" Enter 2 for Staff");
            System.out.println(" Enter 3 for PhD/Master Student");
            System.out.println(" Enter 4 for Undergraduate Student");
            System.out.print(" Enter any other number to quit\n" + ""
                    + " Enter your choice:");
            int choice3=input.nextInt();
            
            if (choice3==1){//if choice3=1 enter your id,books returning and extra days
                   System.out.print("Enter your ID:");
                   int id=input.nextInt();
                   System.out.print("Enter the number of books returning:");
                   int rebook=input.nextInt();
                   System.out.print("Enter the number of extra days:");
                   int extra=input.nextInt();
                   
             if (extra==0){//if extra=0 print information details for returning
                System.out.println("-----------------------------------------");
                System.out.println("Information Details for RETURNING");
                System.out.println("-----------------------------------------");
                System.out.println("Identity number :"+id);
                System.out.println("Member Category :Faculty Members ");
                //rebook= books returning
                System.out.println("Number of books returned : :"+rebook); 
                int fdays=120;
                System.out.print("Number of allowed days :" +fdays);
                System.out.println("Number of extra days : 0");
                System.out.println("------------------------------------------");
                System.out.println("*** Thank you for Visiting ***");
                System.out.println("------------------------------------------");
             }
             else if (extra>0){//if extra>0 print enter your price and information details
                System.out.print("Enter the total price of books (in SAR):");
               double price=input.nextDouble();
                System.out.println("-----------------------------------------");
                System.out.println("Information Details for RETURNING");
                System.out.println("-----------------------------------------");
                System.out.println("Identity number :"+id);
                System.out.println("Member Category :Faculty Members ");
                System.out.println("Number of books returned : :"+rebook); 
                int fdays=120;
                System.out.println("Number of allowed days :" +fdays);
                System.out.println("Number of extra days :"+extra);
                System.out.println("Total price of books (in SAR): "+price);
                double fpenalty;//fpenallty= faculty penalty
                double penalty;
                fpenalty=0.50;
                penalty=price * fpenalty; //compute penalty     
                System.out.println("Penalty:" + penalty+"SAR");//display results
                System.out.println("You exceeded the allowed period! The penalty"
                        + " is 50%of the price of the books.");
                System.out.println("------------------------------------------");
                System.out.println("*** Thank you for Visiting ***");
                System.out.println("------------------------------------------");
               
             }
                 
                   
            }
            else if (choice3==2){
                    System.out.print("Enter your ID:");
                   int id=input.nextInt();
                   System.out.print("Enter the number of books returning:");
                   int rebook=input.nextInt();
                   System.out.print("Enter the number of extra days:");
                   int extra=input.nextInt();
                   
             if (extra==0){
                System.out.println("-----------------------------------------");
                System.out.println("Information Details for RETURNING");
                System.out.println("-----------------------------------------");
                System.out.println("Identity number :"+id);
                System.out.println("Member Category :staff ");
                System.out.println("Number of books returned : :"+rebook); 
                int sdays=90;
                System.out.println("Number of allowed days :" +sdays);
                System.out.println("Number of extra days : 0");
                System.out.println("------------------------------------------");
                System.out.println("*** Thank you for Visiting ***");
                System.out.println("------------------------------------------");
                   }
              else if (extra>0){
                System.out.print("Enter the total price of books (in SAR):");
               double price=input.nextDouble();
                System.out.println("-----------------------------------------");
                System.out.println("Information Details for RETURNING");
                System.out.println("-----------------------------------------");
                System.out.println("Identity number :"+id);
                System.out.println("Member Category :staff ");
                System.out.println("Number of books returned : :"+rebook); 
                int sdays=90;
                System.out.println("Number of allowed days :" +sdays);
                System.out.println("Number of extra days :"+extra);
                System.out.println("Total price of books (in SAR): "+price);
                double spenalty;//spenallty= staff penalty
                double penalty;
                spenalty=0.40;
                penalty=price * spenalty;      
                System.out.println("Penalty:" + penalty+"SAR");
                System.out.println("You exceeded the allowed period! The penalty"
                        + " is 40%of the price of the books.");
                System.out.println("------------------------------------------");
                System.out.println("*** Thank you for Visiting ***");
                System.out.println("------------------------------------------");
              }
             
            }
             else if (choice3==3){
                   System.out.print("Enter your ID:");
                   int id=input.nextInt();
                   System.out.print("Enter the number of books returning:");
                   int rebook=input.nextInt();
                   System.out.print("Enter the number of extra days:");
                   int extra=input.nextInt();
                   
             if (extra==0){
                System.out.println("-----------------------------------------");
                System.out.println("Information Details for RETURNING");
                System.out.println("-----------------------------------------");
                System.out.println("Identity number :"+id);
                System.out.println("Member Category :PhD/Masters Student ");
                System.out.println("Number of books returned : :" +rebook); 
                int pmdays=30;
                System.out.println("Number of allowed days :" +pmdays);
                System.out.println("Number of extra days : 0");
                System.out.println("------------------------------------------");
                System.out.println("*** Thank you for Visiting ***");
                System.out.println("------------------------------------------");
                   }
              else if (extra>0){
                System.out.print("Enter the total price of books (in SAR):");
               double price=input.nextDouble();
                System.out.println("-----------------------------------------");
                System.out.println("Information Details for RETURNING");
                System.out.println("-----------------------------------------");
                System.out.println("Identity number :"+id);
                System.out.println("Member Category :Postgraduate Student ");
                System.out.println("Number of books returned : :"+rebook); 
                int pmdays=30;
                System.out.println("Number of allowed days :" +pmdays);
                System.out.println("Number of extra days :"+extra);
                System.out.println("Total price of books (in SAR): "+price);
                double pmpenalty;//pmpenallty= PhD/Masters Student
                double penalty;
                pmpenalty=0.30;
                penalty=price * pmpenalty;      
                System.out.println("Penalty:" + penalty+"SAR");
                System.out.println("You exceeded the allowed period! The penalty"
                        + " is 30%of the price of the books.");
                System.out.println("------------------------------------------");
                System.out.println("*** Thank you for Visiting ***");
                System.out.println("------------------------------------------");
              }
             
             }
             else if (choice3==4){
                    System.out.print("Enter your ID:");
                   int id=input.nextInt();
                   System.out.print("Enter the number of books returning:");
                   int rebook=input.nextInt();
                   System.out.print("Enter the number of extra days:");
                   int extra=input.nextInt();
                   
             if (extra==0){
                System.out.println("-----------------------------------------");
                System.out.println("Information Details for RETURNING");
                System.out.println("-----------------------------------------");
                System.out.println("Identity number :"+id);
                System.out.println("Member Category :Undergraduate Student ");
                System.out.println("Number of books returned : :"+rebook); 
                int undays=15;
                System.out.println("Number of allowed days :" +undays);
                System.out.println("Number of extra days : 0");
                System.out.println("------------------------------------------");
                System.out.println("*** Thank you for Visiting ***");
                System.out.println("------------------------------------------");
                   }
              else if (extra>0){
                System.out.print("Enter the total price of books (in SAR):");
               double price=input.nextDouble();
                System.out.println("-----------------------------------------");
                System.out.println("Information Details for RETURNING");
                System.out.println("-----------------------------------------");
                System.out.println("Identity number :"+id);
                System.out.println("Member Category :Undergraduate Student ");
                System.out.println("Number of books returned : :"+rebook); 
                int usdays=15;
                System.out.println("Number of allowed days :" +usdays);
                System.out.println("Number of extra days :"+extra);
                System.out.println("Total price of books (in SAR): "+price);
                double uspenalty;//uspenallty= Undergraduate Student
                double penalty;
                uspenalty=0.20;
                penalty=price * uspenalty;      
                System.out.println("Penalty:" + penalty+"SAR");
                System.out.println("You exceeded the allowed period! The penalty"
                        + " is 20%of the price of the books.");
                System.out.println("------------------------------------------");
                System.out.println("*** Thank you for Visiting ***");
                System.out.println("------------------------------------------");
              }
              
              
              }
             else{
                System.out.println("Wrong selection of member type!");
                System.out.println("------------------------------------------");
                System.out.println("*** Thank you for visiting ***");
                System.out.println("------------------------------------------");
                System.exit(0);
              }
        
      
        } else {
                System.out.println("---------------------------------------------------");
                System.out.println("*** Thank you for Visiting ***");
                System.out.println("---------------------------------------------------");
                System.exit(0);
                }
        }
    }
 
    


    
           
    



    
    
    
        
        
        
        
              
   
       
       
       
    
    
                
          
           
        
        
        
           
       
        


            
                
                
        
    
