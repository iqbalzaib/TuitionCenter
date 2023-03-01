public class Tutorlist
{

  //list of tutor
  Teacher tutor[] = new Teacher[10];
  int currsz = 0;

  //operation
  void add (Teacher s)
  {
    tutor[currsz++] = s;
  }
  
  
  public boolean find (Name name)
  {
    for (int i = 0; i < currsz; i++)
      {
	if (tutor[i].name == name)
	  {
	    return true;
	  }
	
      }
    return false;
  }
}
