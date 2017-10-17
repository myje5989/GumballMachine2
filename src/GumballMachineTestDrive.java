
public class GumballMachineTestDrive {

	public static void main(String[] args) {
		GumballMachine gumballMachine =new GumballMachine(3);
	
		System.out.println(gumballMachine);
		gumballMachine.ejectQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();

		System.out.println(gumballMachine);
	}

}
