package vivek.Task;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/db")
public class UserLoginDBRst {
	
	DBConnection dbCoN;
	Connection con;
	ResultSet rs;
	String Iuser="Invalid User";
	
	@Path("/{userName}")
	@GET
	@Produces(MediaType.TEXT_HTML)

	public String LoginUserValidation(@PathParam("userName") String userName) throws SQLException{
		String query="select * from courses where name=''"
				+userName;
		System.out.println(""+query);
		dbCoN=new DBConnection();
		try {
			con=DBConnection.setDBConnection();
			rs=dbCoN.getResultSet(query,con);
			if(rs.next()){
				String namee=rs.getString(2);
				return "welcome"+namee;
			}
			else{
			return Iuser;
			}
			
			
		} 
		catch (Exception e) {
			System.out.println(e);
		}
		
		return Iuser;
		
	}
	
	

}
