package youtubeEgitim;

public class Main {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;

		x = y;

		y = 30;

		System.out.println(x);

		String[] array1 = { "Ankara", "Izmir" };

		String[] array2 = { "Bursa", "Kastamonu" };

		String[] array3;

		array3 = new String[5];

		System.out.println(array3.length);

		array1 = array2;

		array2[0] = "Diyarbakir";

		System.out.println(array1[0]);

		CreditManager creditManager = new CreditManager();

		creditManager.Calculate();

		Customer customer = new Customer();

		customer.firstName = "Omer";
		customer.id = 1;
		customer.lastName = "Yayla";
		customer.nationalIdentity = "12345";

		CustomerManager customerManager = new CustomerManager(customer, new SmsLogger());
		customerManager.baseDatabaseManager = new SqlServerDatabaseManager();

		customerManager.save();
		customerManager.delete();

		BaseCreditManager[] credits = new BaseCreditManager[] { new ArmyCreditManager(), new EngineerCreditManager(),
				new StudentCreditManager() };

		for (BaseCreditManager credit : credits) {
			System.out.println(credit.calculate(1000));
		}

		BaseGameCalculator[] calculators = new BaseGameCalculator[] { new ManGameCalculator(),
				new WomanGameCalculator(), new KidsGameCalculator() };
		
		for(BaseGameCalculator calculator : calculators) {
			calculator.calculate();
			calculator.gameOver();
		}
		
		customerManager.getCustomer();

	}

}
