package javolin.chamber1.project;

//http://stackoverflow.com/questions/8550674/android-calculate-distance-between-two-locations
public class ZipCodesDistance {
	private static final int earthRadius = 6371;

	public static double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
		double dLat = (double) Math.toRadians(lat2 - lat1);
		double dLon = (double) Math.toRadians(lon2 - lon1);
		double a = (double) (Math.sin(dLat / 2) * Math.sin(dLat / 2) + Math.cos(Math.toRadians(lat1))
				* Math.cos(Math.toRadians(lat2)) * Math.sin(dLon / 2) * Math.sin(dLon / 2));
		double c = (double) (2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a)));
		double d = earthRadius * c;
		return d;
	}

	// http://stackoverflow.com/questions/4915462/how-should-i-do-floating-point-comparison
	public void checkIfTwoLatOrLongAreSame(Address a1, Address a2) {
		double lat1 = a1.getLatAndLong().getLatitude();
		double long1 = a1.getLatAndLong().getLongitude();
		double lat2 = a2.getLatAndLong().getLatitude();
		double long2 = a2.getLatAndLong().getLongitude();

		double minValue = 0.0000000000000001;
		boolean latBoolean = Math.abs(lat1 - lat2) < minValue;
		boolean longBoolean = Math.abs(long2 - long1) < minValue;
		
		if (lat1 > lat2) {
			latBoolean = Math.abs(lat1 - lat2) < minValue;
			if (lat1 > lat2) {
				longBoolean = Math.abs(lat1 - long2) < minValue;
			} else {
				longBoolean = Math.abs(long2 - long1) < minValue;
			}
		} else if (lat2 > lat1) {
			latBoolean = Math.abs(lat1 - lat2) < minValue;
			if (long1 > long2) {
				longBoolean = Math.abs(long1 - long2) < minValue;
			} else {
				longBoolean = Math.abs(long2 - long1) < minValue;
			}
		}
		if (latBoolean == true && longBoolean == true) {
			System.out.println("Two Zipper Loctions are same");
		}

	}

}
