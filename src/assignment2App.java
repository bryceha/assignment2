
public class assignment2App {

	public static void main(String[] args) {

		int currentTemp = 100;
		
		boolean isHotOutside = currentTemp >= 90;
		System.out.println("Is it hot outside? " + isHotOutside);
		
		int dayNumber = 7;
		
		boolean isWeekday = dayNumber < 6;
		System.out.println("Is it a weekday? " + isWeekday);
		
		double costOfMilk = 3.19;
		double moneyInWallet = 20.00;
		int thirstLevel = 10;
		
		boolean shouldBuyIceCream = isHotOutside && moneyInWallet > 5;
		System.out.println("Should I buy ice cream? " + shouldBuyIceCream);
		
		boolean willGoSwimming = isHotOutside && !isWeekday;
		System.out.println("Will I go swimming? " + willGoSwimming);
		
		boolean isGoodDay = !isHotOutside && moneyInWallet > 0 && !isWeekday;
		System.out.println("Is it a good day? " + isGoodDay);
		//I changed it to "good" being NOT hot outside
		
		boolean willBuyMilk = isHotOutside && thirstLevel >= 3 && moneyInWallet >= 2*costOfMilk;
		System.out.println("Will I buy milk today? " + willBuyMilk);
		
		
	}

}
