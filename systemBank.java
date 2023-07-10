package entities;

public class systemBank {

	String Name;
	public double Balance;
	private int Number;
	private double value;
	
	public systemBank(){
		
			
	}
	public systemBank(String name, double Balance, int Number, double value) {
		this.Name = name;
		this.Balance = Balance;
		this.Number = Number;
		this.value = value;
	}
	public systemBank (String name, int Number, double value) {
		this.Name = name;
		this.Number = Number;
		this.value = value;
	}

	public double value() {
		return value;
	}

	public double totalBalance() {
		return value + Balance;
	}
	public void depositValue(double value){
		this.Balance += value;
	}
	public void withdrawValue (double value) {
		this.Balance = (Balance - value) - 5.0;
	}
	public String toString() {
		return "Account " + Number + ", Holder: " + Name + ", Balance: $ " + String.format("%.2f", totalBalance());
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public int getNumber() {
		return Number;
	}

	public void setNumber(int number) {
		Number = number;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public double getBalance() {
		return Balance;
	}

	
	
}
