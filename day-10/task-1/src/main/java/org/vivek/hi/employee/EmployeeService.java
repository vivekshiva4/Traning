package org.vivek.hi.employee;



import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/emp")
public class EmployeeService {
@GET
@Path("/get/{empID}")
@Produces(MediaType.APPLICATION_XML)


public Employee getEmployee(@PathParam("empId") String empId){
	Employee employee=new Employee();
	employee.setName("vivek");
	employee.setEmpId("100");
	employee.setEmail("vivek4@gmail.com");
	
	
	return employee;
}
@POST
@Path("/create")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public Employee createEmployee(Employee employee){
	
	return employee;
	
}
@PUT
@Path("/update")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public Employee updateEmployee(Employee employee){
	employee.setName(employee.getName()+"updated");
	return employee;
	
}


}
