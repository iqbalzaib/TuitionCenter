import java.util.*;

public class Main
{
  Scanner input = new Scanner(System.in);
  //application Code
  public static void main (String[]args)
  {
    //creating students
    Student nasrul = new Student ();
    Name name = new Name("Wan","Nasrul","Lah");
    nasrul.setName(name);
    
    Student lutfi = new Student ();
    name = new Name("Wan","Lutfi","Zaha");
    lutfi.setName(name);
    
    Student wan = new Student ();
    name = new Name("Wan","Hadzri","Roy");
    wan.setName(name);
    
    //creating a batch object
    StudentBatch sb2023 = new StudentBatch ();
    sb2023.add(nasrul);
    sb2023.add(lutfi);
    sb2023.add(wan);
    
    //find the name
    boolean isIn = sb2023.find(nasrul.name);
    System.out.println(isIn);

    //set the mark for students
    for (int i = 0; i < nasrul.marks.length; i++){
        nasrul.setMark(70,i);
        lutfi.setMark(85,i);
        wan.setMark(59,i);
    }
    
    lutfi.displayMarks();
        
    //calculate and print avg
    nasrul.calcAvg();
    
    
    //create tutor object
    Teacher CikguMinah = new Teacher ();
    name = new Name("Nur","Aminah","Ahmad");
    CikguMinah.setName(name);
    
    Teacher CikguSiti = new Teacher ();
    name = new Name("Nur","Siti","Zaleha");
    CikguSiti.setName(name);
    
    //add tutor to the tutorlist
    Tutorlist tl2023 = new Tutorlist ();
    tl2023.add(CikguMinah);
    tl2023.add(CikguSiti);
  }

}
