package com.github.njuturi.zippr.project;

//http://stackoverflow.com/questions/18170131/comparing-two-locations-using-their-longitude-and-latitude

public class ZipCodesDistance {
	public double calculateDistance(double lat1, double lng1, double lat2, double lng2) {

		double earthRadius = 3958.75; // in miles

		double dLat = Math.toRadians(lat2 - lat1);
		double dLng = Math.toRadians(lng2 - lng1);

		double sindLat = Math.sin(dLat / 2);
		double sindLng = Math.sin(dLng / 2);

		double a = Math.pow(sindLat, 2)
				+ Math.pow(sindLng, 2) * Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2));

		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

		double dist = earthRadius * c;

		return dist;
	}

	public String checkIfTwoLatOrLongAreSame(Address a1, Address a2) {

		double lat1 = a1.getLatAndLong().getLatitude();
		double long1 = a1.getLatAndLong().getLongitude();
		double lat2 = a2.getLatAndLong().getLatitude();
		double long2 = a2.getLatAndLong().getLongitude();

		double distance = calculateDistance(lat1, long1, lat2, long2);
		System.out.println("Distance Between Two Locations:"+distance);

		if (distance < 0.1) {
			return "The Two Locations are Same";
		} else {
			return "The Two Locations are different";
		}

	}

}
