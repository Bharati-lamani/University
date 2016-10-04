package in.ac.kletech.ss;

interface university {
      void noworking();
      void intake();
}
class college implements university{
	static final String scode="kle204";
	static final String sname="kle tech";
	int no_of_wd;
	int no_of_std;
	
	public college(int no_of_wd,int no_of_std){
		//super();
		this.no_of_wd=no_of_wd;
		this.no_of_std=no_of_std;
	}

	@Override
	public void noworking() {
    if(no_of_wd<200)
    	System.out.println("it is not fit to be university\n");
    else
    	System.out.println("it is fit to be university\n");
		
	}

	@Override
	public void intake() {
		if(no_of_std<500)
			System.out.println("college has less no of students\n");
		else
			System.out.println("college has appropriate students\n");
		
	}
	
}
class student extends college{
	String sName;
	String sUSN;
	float fmarks;
	int iattendence;
	
	public student(int no_of_wd,int no_of_std,String sName,String sUSN,
			float fmarks,int iattendence){
		
		super(no_of_wd,no_of_std);
		this.sName=sName;
		this.sUSN=sUSN;
		this.fmarks=fmarks;
		this.iattendence=iattendence;
	}
	public void attendance(){
		if(iattendence<85)
			System.out.println("student is ineligible to attend the exams\n");
		else
			System.out.println("student is eligible to exams\n");
	}
	public void Grade(){
		if(fmarks>90)
			System.out.println("Grade A\n");
		else if(fmarks>80)
			System.out.println("Grade B\n");
		else
			System.out.println("Grdae C\n");
	}
}	
class faculty extends college{
	String sName;
	String sdepname;
	float fsalary;
	
	public faculty(int no_of_wd,int no_of_std,String sName,String sdepname,float fsalary){
		super(no_of_wd,no_of_std);
		this.sName=sName;
		this.sdepname=sdepname;
		this.fsalary=fsalary;
	}
 public void display(){
	 System.out.println("the faculty name:"+sName);
	 System.out.println("the faculty belongs to:"+sdepname);
	 System.out.println("the faculty salary:"+fsalary);
 }
 
}



