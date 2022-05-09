/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaexamples5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

class User
{

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.role, other.role)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", roll=" + role + '}';
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public User(String name, String roll) {
        this.name = name;
        this.role = roll;
    }
    private String name;
    private String role;
    
}
public class UseUsers {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(new User("Deepak", "admin"),
				     new User("Akanksha", "employee"),
				     new User("Raunak","member"),
		           	     new User("Amit", "admin"),
				     new User("Ravi", "employee"),
				     new User("Ajit","employee"));
        Predicate<User>p1=u->u.getName().startsWith("A");
        Predicate<User>p2=u->u.getRole().equals("admin");
        Predicate<User>p3=u->u.getRole().equals("employee");
        User obj=new User("Amit","admin");
        Predicate <User>p4=Predicate.isEqual(obj);
        System.out.println("Is Amit-admin present:"+findUser(users,p4));
    }
    
    public static List<User> process(List<User> users,Predicate p)
    {
       List<User> ans=new ArrayList<User>();
       for(User u:users)
       {
           if(p.test(u))
               ans.add(u);
       }
       return ans;
    }
     public static List<User> process2(List<User> users,Predicate p)
    {
       List<User> ans=new ArrayList<User>();
       for(User u:users)
       {
           if(p.test(u))
               ans.add(u);
       }
       return ans;
    }
     public static boolean findUser(List<User> users,Predicate<User>p)
     {
         for(User u:users)
       {
           if(p.test(u))
               return true;
       }
       return false;
     }
}
