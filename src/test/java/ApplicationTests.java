import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import project.entity.Vehicle;
import project.entity.Address;
import project.entity.Customer;
import project.repository.BuyInsuranceRepository;


@Rollback(false)
@AutoConfigureTestDatabase(replace = Replace.NONE)
@SpringBootTest
public class ApplicationTests {
    @Test
    public void testApplication() {
        assertEquals(true, true);
    }
    
    @Autowired
	private BuyInsuranceRepository buyInsuranceRepo;
	
	
	@Test
	void submitDetailsForBuyingInsurance() {
		Vehicle v = new Vehicle();
		v.setType("Four Wheeler");
		v.setModel("S-Cross");
		v.setManufacture("Maruti");
		v.setDrivingLicense("QWERTY12");
		v.setPurchaseDate(LocalDate.of(2019, 11, 19));
		v.setRegistrationNo("ASDFG123");
		v.setEngineNo("mnbvcxz");
		v.setChassisNo("zxcvbnm");
		v.setEngineType("200 HP");
		
		Customer cust = new Customer();
		cust.setName("Archit");
		cust.setEmailId("aryany996699@gmail.com");
		cust.setDateOfBirth(LocalDate.of(1997, 11, 19));
		cust.setContactNo(975883345);
		cust.setPassword("123456");
		
		Address addr = new Address();
		addr.setCity("Agra");
		addr.setPincode(282007);
		addr.setLandMark("Sikandra");
		
		cust.setAddress(addr);
		
		v.setCustomer(cust);
		
		buyInsuranceRepo.submitData(v);
		
	}
}