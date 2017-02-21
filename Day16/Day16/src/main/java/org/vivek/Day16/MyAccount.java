package org.vivek.Day16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.Entity;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/*@WebService()
@Entity*/
@Path
("/user")
public class MyAccount
{
    @POST
    @Path("/fetch")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
public String insert(@PathParam("name") String name) 
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "vivek", "vivek");
            String query = "insert into CUSTOMER"+"(NAME) VALUES"+"(?)";

            PreparedStatement st = con.prepareStatement(query);
            st.setString(1,name);
            
            st.executeUpdate();     
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
        return"Record inserted successfully";
    }
    
}
