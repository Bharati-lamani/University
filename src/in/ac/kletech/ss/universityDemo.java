package in.ac.kletech.ss;

public class universityDemo {

	public static void main(String[] args) {
  college c=new college(300,200);
  c.noworking();
  c.intake();
  student s=new student(300,200,"Ram","ram044",85,70);
  s.attendance();
  s.Grade();
  faculty f=new faculty(259,300,"sham","CSE",1000000);
  f.display();

	}

}
