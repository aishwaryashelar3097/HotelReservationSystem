package HotelReservation;

public class Rate {
	private Integer weekendRates;
	private Integer weekdayRates;
	
	public Rate (Integer weekEndRates, Integer weekDayRates) {
		this.weekendRates = weekEndRates;
		this.weekdayRates = weekDayRates;
	}
	public Integer getWeekendRates() {
		return weekendRates;
@Override
	public String toString() {
	return "Rate{" +
	"weekendRates=" + weekendRates + ", weekdayRates=" + weekdayRates + '}';
}

}
