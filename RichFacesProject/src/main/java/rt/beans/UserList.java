package rt.beans;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;



@ManagedBean(name="userList")
@ViewScoped
public class UserList {
 
   private ArrayList<String> users;
   private String selectedUser;
 
   @PostConstruct
   public void create (){
	users = new ArrayList <String> ();
	users.add("John");
	users.add("Charley");
	users.add("Priscila");
	users.add("Kate");
	users.add("Emily");
	users.add("Barack");
	users.add("Mia");
	users.add("Arthur");
   }
   public void delete (){
	users.remove(selectedUser);
   }
   public String getSelectedUser() {
	return selectedUser;
   }
   public void setSelectedUser(String selectedUser) {
	this.selectedUser = selectedUser;
   }
   public ArrayList<String> getUsers() {
	return users;
   }
}