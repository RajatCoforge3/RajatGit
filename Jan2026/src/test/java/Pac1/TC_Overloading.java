package Pac1;
class car{
	int noofCylinders;
	int noofvalves;
	int enginepower;
	boolean ispowersteering;
	 car(){
		 noofCylinders=3;
		 noofvalves=4;
		 enginepower=70;
		 ispowersteering=false;
	 }
	 car(boolean ispowersterring){
		 this.ispowersteering=ispowersteering;
		 
	 }
	 car(int noofCylinders, int noofvalues, int enginepower ){
		 this.noofCylinders=noofCylinders;
		 this.noofvalves=noofvalves;
		 this.enginepower=enginepower;
		 this.ispowersteering=true;
		 
		 
		 
	 }
}
public class TC_Overloading {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car obj1=new car();
		System.out.println(obj1.noofCylinders);
		car obj2 = new car(true);
		System.out.println("is power steering : "+obj2.ispowersteering);
		car obj3 = new car(4,50,4);
		System.out.println("noofCylinders : "+obj3.noofCylinders);
		System.out.println("noofcylinders:"+obj3.noofvalves);
		System.out.println("noofcylinders:"+obj3.enginepower);
		System.out.println("ispoersteering:"+obj3.ispowersteering);
		
	}

}
