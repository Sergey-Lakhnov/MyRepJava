
import java.io.*;public class User
{
	private String name;
	private String pass;
	private String email;
	private String pathUserDatas;
	
	public String getPathUserDatas(){return pathUserDatas;}
	public String setPathUserDatas(String pathUserDatas){
		this.pathUserDatas = pathUserDatas;
		return pathUserDatas;
	}
	
	public String getName(){ return name;}
	
	public String setName(String name){
		this.name =  name;
		
		return name;
	}
	public String setPass(String pass){
		this.pass = pass;
		return pass;
	}
    public String getPass(){ return pass;}
	
	public String setEmail(String email){ 
	this.email = email;
	return email;}
	
	public boolean validator(User u){
		boolean b = false;
		File f = new File(u.userPath(u));
		if (f.exists()) b = true;
		return b;
	}
	public String userPath(User u){
		String path = u.getName();
		return path;
	}
	
	public void saveUser(User u){
		if (u.validator(u)!= true){
			File f = new File(u.userPath(u));
			if (f.isDirectory() != true){
				f.mkdirs();
				
				
				
			}
		}
	}
	
}
