package question1.view;
import question1.model.Customer;
import question1.service.CustomerService;

public class CustomerView {
	public static void main(String[] args) {
		Customer customer1 = new Customer( 2,"Samiksha",22);
		CustomerService cusSer1 = new CustomerService();
		boolean value =cusSer1.checkEligibility(customer1);
		if (value==true)
			System.out.println("eligible for voting");
			
			else
				System.out.println("not eligible for voting");
		}

}
