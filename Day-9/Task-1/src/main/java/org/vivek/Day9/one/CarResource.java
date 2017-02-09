package org.vivek.Day9.one;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.vivek.Day9.car.Car;

@Path("/car")
public class CarResource {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	 public ArrayList<Car> getCars(){
	 ArrayList<Car> listOfCars=new ArrayList<Car>();
	 listOfCars =createCarList();
	 return listOfCars;
	
}
	@GET
	@Path("{id: \\d+}")
	public Car gtCarById(@PathParam("id") int id){
		 ArrayList<Car> listOfCars=new ArrayList<Car>();
		 listOfCars =createCarList();
		 
		for(Car Car:listOfCars){
			if(Car.getId()==id)
				return Car;
		}
		
		
		return null;
	}
	
	public ArrayList<Car> createCarList(){
		
		Car BMW=new Car(1, "BMW");
		Car BENZ=new Car(2, "BENZ");
		Car FORD=new Car(3, "FORD");
		
		ArrayList<Car> listOfCars=new ArrayList<Car>();
		listOfCars.add(BMW);
		listOfCars.add(BENZ);
		listOfCars.add(FORD);
		return listOfCars;
		
		
	}
	
	
	
	
}