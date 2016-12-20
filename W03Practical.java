public class W03Practical{
    public static void main(String[] args) {
    
    //Variables for the cost of items
    float Ring =187.75f;
	float WeddingDress =779.50f;
	float GroomOutfit =159.99f;
	float BridesmaidDress =127.75f;
	float Dinner =48.50f;
	float Drink  =16.10f;
	float WeddingCake =202.99f;
	float Limo =282.75f;
	float Buttonhole =11.48f;
	float BrideBouquet =102.99f;
	float BridesmaidBouquet =33.50f;
	float Invitation =6.66f;
	float ReceptionVenue =811.99f;
	
	
	float total=(64*(Dinner+Drink))+(2*Ring)+(3*(BridesmaidDress+BridesmaidBouquet))+(2*Limo)+(8*Buttonhole)+(2*GroomOutfit)+(50*Invitation)+ReceptionVenue+BrideBouquet+WeddingCake+WeddingDress;//Calculates the cost of the wedding 
	System.out.printf("The total coast of the wedding is £%.2f \n", total);//Prints the total cost of wedding to 2.dp
	
    }
}