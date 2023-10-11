package com.jspiiders.cardekho1.car;

public class Car {
	
	private int carid;
	private String carname;
	private int carmodel;
	private String Brand;
	private String fueltype;
	private String fuelcapacity;
	


	
	
	public Car(int carid, String carname, int carmodel, String fueltype, String fuelcapacity) {
	
		this.carid = carid;
		this.carname = carname;
		this.carmodel = carmodel;
		this.fueltype = fueltype;
		this.fuelcapacity = fuelcapacity;
	}





	public int getCarid() {
		return carid;
	}

	public void setCarid(int carid) {
		this.carid = carid;
	}





	public String getCarname() {
		return carname;
	}


	public void setCarname(String carname) {
		this.carname = carname;
	}




	public int getCarmodel() {
		return carmodel;
	}






	public void setCarmodel(int carmodel) {
		this.carmodel = carmodel;
	}


	public String getFueltype() {
		return fueltype;
	}


	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}



	public String getFuelcapacity() {
		return fuelcapacity;
	}



	public void setFuelcapacity(String fuelcapacity) {
		this.fuelcapacity = fuelcapacity;
	}






	public String toString() {
		
		return carid+" "+carname+" "+carmodel+" "+fueltype+" " +fuelcapacity;
		
	}





	public String getBrand() {
		return Brand;
	}





	public void setBrand(String brand) {
		Brand = brand;
	}
		
	}

