package javolin.chamber1.project;

//http://stackoverflow.com/questions/8550674/android-calculate-distance-between-two-locations
public class DistanceBetweenZipCodes {
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

	public void checkIfTwoLatOrLongAreSame(Address a1, Address a2) {
		double latitude1 = a1.getLatAndLong().getLatitude();
		double longitude1 = a1.getLatAndLong().getLongitude();
		double latitude2 = a2.getLatAndLong().getLatitude();
		double longitude2 = a2.getLatAndLong().getLongitude();

		double threshold = 0.0000000000000001;
		boolean a = Math.abs(latitude1 - latitude2) < threshold;
		boolean b = Math.abs(longitude2 - longitude1) < threshold;
		// Comparing floating point number
		// http://stackoverflow.com/questions/4915462/how-should-i-do-floating-point-comparison
		if (latitude1 > latitude2) {
			a = Math.abs(latitude1 - latitude2) < threshold;
			if (longitude1 > longitude2) {
				b = Math.abs(longitude1 - longitude2) < threshold;
			} else {
				b = Math.abs(longitude2 - longitude1) < threshold;
			}
		} else if (latitude2 > latitude1) {
			a = Math.abs(latitude1 - latitude2) < threshold;
			if (longitude1 > longitude2) {
				b = Math.abs(longitude1 - longitude2) < threshold;
			} else {
				b = Math.abs(longitude2 - longitude1) < threshold;
			}
		}
		if (a == true && b == true) {
			System.out.println("Two locations are same");
		}

	}

}
