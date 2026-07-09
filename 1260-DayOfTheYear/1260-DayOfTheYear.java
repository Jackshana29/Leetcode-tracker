// Last updated: 09/07/2026, 09:31:10
import java.time.LocalDate;

class Solution {
	public int dayOfYear(String date) {
		return LocalDate.parse(date).getDayOfYear();
	}
}