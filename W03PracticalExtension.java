public class W03PracticalExtension{
    static float[] Prices = {187.75f, 779.50f, 159.99f, 127.75f, 48.50f, 16.10f, 202.99f, 282.75f, 11.48f, 102.99f, 33.50f, 6.66f, 811.99f};//Array of float used to store values of the items
    static float[] Prices1 = {160.75f, 700.50f, 152.99f, 121.75f, 41.50f, 10.10f, 196.99f, 222.75f, 10.48f, 100.99f, 30.50f, 6.20f, 700.99f};//Array of float used to store values of the items from rival wedding firm 
    static String[] Items = {"1. Ring", "2. Wedding Dress", "3. Groom’s Outfit", "4. Bridesmaid’s Dress", "5. Dinner (per person)", "6. Drink (per person) ", "7. Wedding Cake", "8. Limo ", "9. Buttonhole ", "10. Bride’s Bouquet ", "11. Bridesmaid’s Bouquet", "12. Invitation ", "13. Reception Venue"};//Array of string used to store the names of the items 
    public static void main(String[] args) {
    		//Variables for total storing the total of wedding and total from rival wedding firm 
    		double Total = 0;
    		double Total1 = 0 ;
    	  	PrintArray();//Calls the Print array method which prints the contents of the Items array and the Prices array 
    	    System.out.println("Do you wish to edit the cost of items? (Y/N)");
    	    char ViewEdit = EasyIn.getChar();	//Takes a char input     
			//If the user wishes to edit the cost of items     	   
    	    if (ViewEdit =='Y' || ViewEdit =='y'){ 
    	    	    System.out.println("Which item would you like to edit?");
    	    	    int Number = EasyIn.getInt();
		    		System.out.println("Please enter the new cost in £");
		    		float Cost = EasyIn.getFloat();
		    		System.out.println("Enter 'S' to save changes");
		    		char Save = EasyIn.getChar(); 
		    		if (Save =='S'||Save =='s'){
    	    	    	Prices[Number-1]=Cost;
    	    	    	System.out.println("Changes saved");}
    	    	    else 
    	    	    	System.out.println("Changes not saved");
    	    	    PrintArray();  
    	    	    
    	    }
    	    	System.out.println("Enter the number of drinks per person:");
				double NoOfDrinks = (Prices[5])*EasyIn.getInt();//caculates the total cost of the drinks required
				double NoOfDrinks1 = (Prices1[5])*(NoOfDrinks/Prices[5]);//caculates the total cost of the drinks required from rival firm 
				System.out.println("Enter the number of people attending:"); 
				double NoOfPeople = (Prices[11]+Prices[4])*EasyIn.getInt(); // calcultes the total cost of the: Invitations and Dinners required	
				double NoOfPeople1 = (Prices1[11]+Prices1[4])*(NoOfPeople/(Prices[11]+Prices[4])); // calcultes the total cost of the: Invitations and Dinners required	from rival firm 
				System.out.println("Enter the number of bridesmaids attending:");
				double NoOfBridesmaids = (Prices[10]+Prices[3])*EasyIn.getInt();//calculates the total cost of the Bridesmaid’s Dresses and Bridesmaid’s Bouquet's required		
				double NoOfBridesmaids1 = (Prices1[10]+Prices1[3])*(NoOfBridesmaids/(Prices[10]+Prices[3]));//calculates the total cost of the Bridesmaid’s Dresses and Bridesmaid’s Bouquet's required	from rival firm 
				System.out.println("Enter the number of rings needed:");
				double NoOfRings = (Prices[0])*EasyIn.getInt();//Calculates the total cost of the rings required 
				double NoOfRings1 = (Prices1[0])*(NoOfRings/Prices[0]);//Calculates the total cost of the rings required from rival firm 
				System.out.println("Enter the number of limos needed:");
				double NoOfLimos = (Prices[7])*EasyIn.getInt();//Calculates the total cost of the limos required 
				double NoOfLimos1 = (Prices1[7])*(NoOfLimos/Prices[7]);//Calculates the total cost of the limos required from rival firm 
				System.out.println("Enter the number of buttonholes needed:");
				double NoOfButtonholes = (Prices[8])*EasyIn.getInt();//Calculates the total cost of the Buttonholes required 
				double NoOfButtonholes1 = (Prices1[8])*(NoOfButtonholes/Prices[8]);//Calculates the total cost of the Buttonholes required from rival firm 
				Total =  NoOfButtonholes+NoOfLimos+NoOfRings+NoOfBridesmaids+NoOfPeople+NoOfDrinks;
				Total +=  Prices[1]+Prices[2]+Prices[6]+Prices[9]+Prices[12];//Calculates total cost of wedding 
				Total1 =  NoOfButtonholes1+NoOfLimos1+NoOfRings1+NoOfBridesmaids1+NoOfPeople1+NoOfDrinks1;
				Total1 +=  Prices1[1]+Prices1[2]+Prices1[6]+Prices1[9]+Prices1[12];//Calculates total cost of wedding from rival firm 
				System.out.printf("The total coast of the wedding is £%.2f \n", Total);//Prints the total cost of wedding to 2.dp
				System.out.printf("The total coast of this wedding at a rival  wedding planning service is £%.2f \n", Total1);//Prints the total cost of wedding from rival firm to 2.dp
				
    }

    public static void PrintArray(){
    	for (int i = 0; i < 13; i++) {//prints the contents of the Items and Prices array 
    	    	    	    System.out.println(Items[i] + "  £" + Prices[i]);
    	    	    }    
    }
}
    	   
    	    
