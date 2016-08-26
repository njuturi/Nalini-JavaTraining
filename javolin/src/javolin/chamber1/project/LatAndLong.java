package javolin.chamber1.project;

public class LatAndLong {

	private double latitude;
	private double longitude;

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	// http://stackoverflow.com/questions/4214969/how-to-find-degree-from-the-latitude-value-in-android
	public  String convertLatDecimalToDMS(double latnumber) {

		StringBuilder builder = new StringBuilder();

		if (latnumber < 0) {
			builder.append("W");
			latnumber = Math.abs(latnumber);
		} else {
			builder.append("E");
		}

		double latSeconds = latnumber * 3600;
		int degrees = (int) latSeconds / 3600;
		double latMinutes = (latSeconds % 3600) / 60;
		latMinutes = Math.round(latMinutes * 100.0) / 100.0;
		latSeconds = latSeconds % 60;
		latSeconds = Math.round(latSeconds * 100.0) / 100.0;
		builder.append(degrees + "°" + latMinutes + "'" + latSeconds + "\"");

		System.out.println(builder.toString());

		return builder.toString();

	}
	
	public  String convertLongDecimalToDMS(double longnumber) {

		StringBuilder builder = new StringBuilder();

		if (longnumber < 0) {
			builder.append("S");
			longnumber = Math.abs(longnumber);
		} else {
			builder.append("N");
		}

		double latSeconds = longnumber * 3600;
		int degrees = (int) latSeconds / 3600;
		double latMinutes = (latSeconds % 3600) / 60;
		latMinutes = Math.round(latMinutes * 100.0) / 100.0;
		latSeconds = latSeconds % 60;
		latSeconds = Math.round(latSeconds * 100.0) / 100.0;
		builder.append(degrees + "°" + latMinutes + "'" + latSeconds + "\"");

		System.out.println(builder.toString());

		return builder.toString();

	}


	

}
