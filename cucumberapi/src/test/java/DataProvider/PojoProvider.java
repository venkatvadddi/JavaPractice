package DataProvider;

public class PojoProvider {
	
	public PojoProvider(String firstname,String lastname,String gender,String email,String status)
	{
		this.first_name=firstname;
		this.last_name=lastname;
		this.gender=gender;
		this.email=email;
		this.status=status;
	}
	   
		private String first_name;
	
	    private String last_name;
	
	    private String gender;
	
	    private String email;
	
	    private String status;
	
	    public void setFirst_name(String first_name){
	        this.first_name = first_name;
	    }
	    
	    public String getFirst_name(){
	        return this.first_name;
	    }
	    
	    public void setLast_name(String last_name){
	        this.last_name = last_name;
	    }
	    
	    public String getLast_name(){
	        return this.last_name;
	    }
	    
	    public void setGender(String gender){
	        this.gender = gender;
	    }
	    
	    public String getGender(){
	        return this.gender;
	    }
	    
	    public void setEmail(String email){
	        this.email = email;
	    }
	    
	    public String getEmail(){
	        return this.email;
	    }
	    
	    public void setStatus(String status){
	        this.status = status;
	    }
	    
	    public String getStatus(){
	        return this.status;
	    }
	    

}
