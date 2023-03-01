import java.util.*;

public class Teacher
{
    
  // data/attributes
  Name name;
  String ic;
  String address;
  int numyearexp;
  String qualification;

  //method or operations 
  public Teacher(){
      System.out.println("Teacher object created");
  }
  
  void setName(Name setname)
  {
    name = setname;
  }
  
  public void setIC(String setIC){
      ic = setIC;
  }
        
}
