package org.vivek.Day16.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class Account implements Serializable 
{   
	  @Id
	  private long id;

	  @Column(name="NAME")  
	  private String name;

	  public Account()  
	  {

	  }

	  public Account(int id, String name)   
	  {     
	     this.id = id;      
	     this.name = name;  
	  }

	  public long getId() 
	  {     
	     return id; 
	  }

	  public void setId(long id) 
	  {     
	     this.id = id;  
	  }

	  public String getName() 
	  {     
	     return name;   
	  }

	  public void setName(String name)
	  {     
	     this.name = name;  
	  }

}
