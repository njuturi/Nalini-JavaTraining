package com.github.njuturi.zippr.project;

public class GetAddressUsingZipperCode {

	public static void printAddress(Address addr) {

		System.out.println(addr.getBuildingName());
		System.out.println(addr.getPlotNo());
		System.out.println(addr.getLandMark());
		System.out.println(addr.getAppFaltNo());
		System.out.println(addr.getCity());
		System.out.println(addr.getState());
		System.out.println(addr.getPincode());
		LatAndLong latLong = addr.getLatAndLong();
		System.out.println(latLong.getLatitude());
		System.out.println(latLong.getLongitude());

	}
}
