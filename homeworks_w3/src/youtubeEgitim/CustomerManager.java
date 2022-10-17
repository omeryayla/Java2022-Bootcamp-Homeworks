package youtubeEgitim;

public class CustomerManager {

	private Customer customer;
	private BaseLogger baseLogger;

	BaseDatabaseManager baseDatabaseManager;

	public CustomerManager(Customer customer, BaseLogger baseLogger) {
		this.customer = customer;
		this.baseLogger = baseLogger;
	}

	public void save() {

		System.out.println("Veritabanina eklendi: " + customer.firstName);
		this.baseLogger.log("Logging completed!");
	}

	public void delete() {

		System.out.println("Veritabanindan silindi:  " + customer.firstName);
	}

	public void getCustomer() {
		baseDatabaseManager.getData();
	}

}
