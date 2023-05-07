public class Main
{
	public static void main(String[] args) {
		RD rd =new RD();
		WD wd =new WD();
		LD ld =new LD();
		RHD rhd =new RHD();
		
		System.out.println();
		System.out.println("Rubber Duck :");
		rd.swim();
		rd.sound();
		
		System.out.println();
		System.out.println("Wood Duck :");
		wd.swim();
		
		System.out.println();
		System.out.println("Lake Duck :");
		ld.swim();
		ld.fly();
		ld.sound();
		
		System.out.println();
		System.out.println("Red Head Duck :");
		rhd.swim();
		rhd.fly();
		rhd.sound();
	}
}
