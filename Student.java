
public class Student
{

  // data/attributes
  Name name;
  String ic;
  String address;
  String schoolname;
  float marks[] = new float[5];
    
    
  public Student(){
      System.out.println("Student object created");
  }
  //method or operations 
  public void calcAvg ()
  {
    float sum = 0,avg = 0;
    for (int i =0;i<5;i++){
        sum+=marks[i];}
    avg = sum/5;
    System.out.println("Avg = " + avg);
  }
  
  
  
  void setName(Name setname)
  {
    name = setname;
  }
  
  void setMark(float mark,int i)
  {
    if (mark >= 0){
        marks[i] = mark;
    }
    else
        System.out.println("Error!");
        return;
        
  }
  
  void displayMarks(){
      //print marks
      for (int i = 0;i < marks.length;i++){
          System.out.println("Marks at index " + i + ":" + marks[i]);
      }
  }
  
}
