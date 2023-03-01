public class StudentBatch
{

  //list of students
  Student students[] = new Student[10];
  int currsz = 0;

  //operation
  void add (Student s)
  {
    students[currsz++] = s;
  }
  
  
  public boolean find (Name name)
  {
    for (int i = 0; i < currsz; i++)
      {
	if (students[i].name == name)
	  {
	    return true;
	  }
	
      }
    return false;
  }
}
