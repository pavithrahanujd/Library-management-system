package mini;
import java.util.Scanner;
public class Mini1 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        try {
	        	lcode1 l=new lcode1();
	        System.out.println("-----login Page-----");
	        System.out.println("-----SELECT YOUR LOGIN-----");
	        System.out.println("-----1.ADMINISTRATOR-----");
	        System.out.println("-----2.USER-----");
	        int opt=sc.nextInt();
	        switch(opt)
            {
            case 1:
            	System.out.println("-----ADMIN LOGIN PAGE-----");
     	        System.out.println("Enter a username");
     	        String adminuser=sc.next();
     	        System.out.println("Enter a Password");
     	        String adminpass=sc.next();
     	        System.out.println("--------------------------------------------------");
     	        if(l.login(adminuser, adminpass))
     	        {
     	        	while(true) {
     		            System.out.println("=====Welcome Admin Home Page=====");
     		            System.out.println("1. Add Book");
     		            System.out.println("2. Search Book");
     		            System.out.println("3. Allocate Book");
     		            System.out.println("4. Delete Book");
     		            System.out.println("5. Exit");
     		            System.out.println("------------------------------");
     		            int opt1=sc.nextInt();
     		            switch(opt1)
     		            {
     		            case 1:
     		            	 System.out.println("Enter a book id");
      		                int bid2=sc.nextInt();
     		            	System.out.println("Enter a Book Name");
     		                String bname=sc.next();
     		               System.out.println("Enter a Author Name");
     		                String aname=sc.next();
     		           
     		               if(l.insert(bid2,bname, aname)>0)
     		              {
     		                    System.out.println("Book Added Succssfully");
     		                }
     		               break;
     		           case 2:
     		        	  
     		        	  System.out.println("Enter a Book Name");
   		                String bname1=sc.next();
   		             if(l.search(bname1))
                    {
	                  System.out.println("update success");
                      }
     		           
     		          break;
     		           case 3:
     		        System.out.println("Enter a Book Name");
    		                String bname2=sc.next();
    		                System.out.println("Enter a student Name");
       		                String sname1=sc.next();
       		             if(l.update(bname2,sname1)>0)
       		             {
       		              System.out.println("Update successfully");
       		             }
       		             break;
     		           case 4:
     		        	  System.out.println("Enter a book id");
      		        	 int bid3=sc.nextInt();
  		        
     		               if(l.delete(bid3)>0)
         		             {
         		              System.out.println("Deleted successfully");
         		             }
         		             break;
     		           }
     		           if(opt==5)
     		            {
     		            System.out.println("Logout Succssfully");
     		            break;
     		            }
     		          main(args);
     		            }
     		        }
     		        else
     		        {
     		            System.out.println("Invalid Username and Password");
     		           
     		        }
     		            
     	        
            case 2:
            	System.out.println("-----USER LOGIN PAGE-----");
     	        System.out.println("Enter a username");
     	        String user=sc.next();
     	        System.out.println("Enter a Password");
     	        String pass=sc.next();
     	        System.out.println("--------------------------------------------------");
     	        if(l.login(user, pass))
     	        {
     	        	while(true) {
     		            System.out.println("=====Welcome User Home Page=====");
     		            System.out.println("1.Search Book");
     		            System.out.println("2.  view Book");
     		            System.out.println("3. Exit");
    		            System.out.println("------------------------------");
    		            int opt1=sc.nextInt();
    		            switch(opt1)
    		            {
    		            case 1:
    		            	
      		        	  System.out.println("Enter a Book Name");
    		                String bname1=sc.next();
    		             if(l.search(bname1))
                     {
 	                  System.out.println("update success");
                       }
    		             break;
    		            case 2:  
    		            	 l.view();	
    		            	  break;
    		          }
    		            	  if(opt==3)
    	     		            {
    	     		            System.out.println("Logout Succssfully");
    	     		            break;
    	    
    	     		            }
     	        	 main(args);	
     	        }}
    	     		        else
    	     		        {
    	     		            System.out.println("Invalid Username and Password");
    	     		           
    	     		        }
     	       break;
     	        }
     	       
     	       l.con.close();
	        }catch(Exception e)
	        {
	            System.out.println(e);
	            System.out.println("Exit---------------------------------");
	        }}}
	
