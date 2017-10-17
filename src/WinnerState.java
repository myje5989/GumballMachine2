
public class WinnerState implements State {

GumballMachine gumballMachine;
	
	public WinnerState(GumballMachine gumballMachine){
		 this.gumballMachine = gumballMachine;
	}
	@Override
	public void insertQuarter() {
		System.out.println("Please wait, we're already giving you a gumball");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Sorry, you already turned the crank");

	}

	@Override
	public void turnCrank() {
		System.out.println("Turning twice does't get you another gumball!");
	}

	@Override
	public void dispense() {
		System.out.println("You'RE A WINNER! You get two gumball for your quarter");
		gumballMachine.releaseBall();
		if(gumballMachine.getCount()==0){
			gumballMachine.setState(gumballMachine.getSoldOutState());}
		else{ 
			gumballMachine.releaseBall();
			if(gumballMachine.getCount()>0){
				gumballMachine.setState(gumballMachine.getNoQuarterState());}
			
			else {
				System.out.println("Oops, out of gumballs!");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
		
	}


}
