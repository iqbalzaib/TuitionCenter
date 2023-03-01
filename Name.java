public class Name{
    String fname;
    String lname;
    String mname;
    
    //constructor
    public Name(String fname,String mname,String lname){
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
    }
    public void setFName(String fname){
        //"this refers to class attributes"
        this.fname = fname;
    }
    
    public void setMName(String mname){
        //"this refers to class attributes"
        this.mname = mname;
    }
    
    public void setLName(String lname){
        //"this refers to class attributes"
        this.lname = lname;
    }
    
    public String getFname(){
        return fname;
    }
    
    public String getMname(){
        return mname;
    }
    
    public String getLname(){
        return lname;
    }
    
}   
