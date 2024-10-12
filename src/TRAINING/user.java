
package TRAINING;

/**
 *
 * @author USER
 */
public class user {
    
    int ID;
    String name;
    int age;
    String gender;

   public user(int ID, String name, int age, String gender){
       this.ID=ID;
       this.age=age;
       this.gender=gender;
       this.name=name;
   
   }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
   
   
    
    
    
    
    
    
}
