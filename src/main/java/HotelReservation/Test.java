import org.junit.jupiter.api.Assertions;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

import org.junit.api.Test;
package HotelReservation;

public class Test {
	HotelReservation hotelReservation = new HotelReservation();
	@Test
	public void givenHotel_WhenAdded_ShouldReturn_True() {
		boolean result = hotelReservation.addHotel(name:"Lakewood",rates:"100");
	Assertion.assertTrue(result);
	Map<CustomerType,Rate>rateMap = new HashMap<>();
	rateMap.put(CustomerType.REGULAR, new Rate(weekEndRates:110,weekDayRates:90));
	rateMap.put(CustomerType.REWARD,new Rate(weekEndRates:90, weekDayRates:80)};
	lakewood = new Hotel(name:"lakewood", rating :4,rateMap);
	}
}
@Test
public void givenHotel_whenInvokedAddHotel_shouldBeAbleToAdd() {
	assertTrue(this.hotelReservationService.addHotel(lakewood));
}
@Test
public void getHotel() {
	this.hotelReservation.addHotel (Lakewood);
	List<Hotel>hotel=this.hotelReservationService.getHotel();
	hotel.stream().forEach(hotel1 -> {
		System.out.println(hotel1.name);
		System.out.println(hotel1.rating);
		System.out.println(hotel1.rate.get(CustomerType.REGULAR));
		System.out.pritln(hotel1.rate.get(CustomerType.REWARD));
	});
}


