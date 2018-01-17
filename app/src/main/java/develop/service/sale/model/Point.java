package develop.service.sale.model;

import java.math.BigDecimal;

 
public class Point {
	/**
	 * 緯度：latitude
	 */
	 
	private java.math.BigDecimal lat;

	/**
	 * 經度:longitude
	 * 
	 */
	 
	private java.math.BigDecimal lon;

	public static void main(String[] args) {
		new Point(24.755353, 121.766202);
	}

	public Point(Double lat, Double lon) {
		super();
		this.lat = new BigDecimal(lat).setScale(6, BigDecimal.ROUND_HALF_UP);
		this.lon = new BigDecimal(lon).setScale(6, BigDecimal.ROUND_HALF_UP);
		this.lon.setScale(6);
	}

	public Point(BigDecimal lat, BigDecimal lon) {
		super();
		this.lat = lat;
		this.lon = lon;
	}

	public Point() {
		super();
	}

	public java.math.BigDecimal getLat() {
		return lat;
	}

	public void setLat(java.math.BigDecimal lat) {
		this.lat = lat;
	}

	public java.math.BigDecimal getLon() {
		return lon;
	}

	public void setLon(java.math.BigDecimal lon) {
		this.lon = lon;
	}

}
