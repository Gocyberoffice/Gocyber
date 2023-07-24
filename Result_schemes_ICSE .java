import java.util.*;
class ICSE
{
	String nm,R,cenno,indno,supw ,cennm,sch;
	double sci,eng,math,sst,hin,comp;
	double phy,elan,elit,che,bio,his,geo,percent,tot;
ICSE()
{
	 nm ="";
      R="";
	 cenno="";
	 indno="";
	 supw="";
	 sch= "";
	 cennm="";
	 sci=0.0;
	 eng=0.0;
	 math=0.0;
	 sst=0.0;
	 hin=0.0;
	 comp=0.0;
	 phy=0.0;
	 elan=0.0;
	 elit=0.0;
	 che=0.0;
	 bio=0.0;
	 his=0.0;
	 geo=0.0;
	tot=0.0;
	percent=0.0;
}
void data_accept()
{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter your name");
	nm= sc.nextLine();
	System.out.println("enter your school name");
	sch= sc.nextLine();
	System.out.println("enter your center name");
	cennm= sc.nextLine();
	System.out.println("enter your centre number");
	cenno=sc.nextLine();
	System.out.println("enter your Index number");
	indno=sc.nextLine();
	System.out.println("enter your Roll no");
	R=sc.nextLine();
	System.out.println("enter your physics mark");
	phy= sc.nextInt();
	System.out.println("enter your Chemistry mark");
	che=sc.nextInt();
	System.out.println("enter your Biology mark");
	bio=sc.nextInt();
	System.out.println("enter your history mark");
	his= sc.nextInt();
	System.out.println("enter your Geography mark");
	geo= sc.nextInt();
	System.out.println("enter your English language mark");
	elan= sc.nextInt();
	System.out.println("enter your English litrature");
	elit=sc.nextInt();
	System.out.println("enter your Mathematic mark");
	math=sc.nextInt();
	System.out.println("enter your Computer Application mark");
	comp= sc.nextInt();
	System.out.println("enter your Hindi mark");
     hin= sc.nextInt();
	 System.out.println("enter your SUPW Grade eg A ,B,C,D");
	supw= sc.next();
}
 void calc()
 {
	 eng= (elit+elan)/2;
	 sst=(his+geo)/2;
	 sci=( phy+che+bio)/3;
	double no[]= {sst,sci,math,hin,comp};
 int a,b;
 double temp =0.0;
 for(a=0;a<no.length-1;a++)
 {
	 for(b=0;b<no.length-1-a;b++)
	 {
		 if(no[b]>no[b+1])
		 {
			 temp=no[b];
			 no[b]= no[b+1];
			 no[b+1]=temp;
			 
		 }
		 
	 }
 }
 
 tot= eng+no[4]+no[3]+no[2]+no[1];
 percent=tot/5;
 }
 
 void Display()
 {
	 System.out.println("ICSE Result 2023 ");
	 System.out.println("Name="+nm);
	 
	 System.out.println("center number ="+cenno);
	 System.out.println("Index number"+indno);
	 System.out.println("Roll no="+R);
	 System.out.println("school name="+sch);
	 System.out.println("Center name= " + cennm);
	System.out.println("English="+eng);
	System.out.println("Science="+sci);
	System.out.println("Socal Study="+sst);
	System.out.println("Mathematic="+math);
	System.out.println("Computer="+comp);
	System.out.println("Hindi="+hin);
	 System.out.println(percent+"%");
 }
 public static void main(String args[])
 {
	 ICSE obj= new ICSE();
	 obj.data_accept();
	 obj.calc();
	 obj.Display();
 }
 
 }
