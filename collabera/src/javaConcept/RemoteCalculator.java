package javaConcept;

public class RemoteCalculator implements ToPerformCalculatorOperator {

	public int add(int... arr) {
		int sum=0;
		for(int c:arr) {
			sum=sum+c;
		}
		return sum;
	}

	public int subtract(int... brr) {
		int sum=0;
		for(int d:brr) {
			sum=d-sum;
		}
		return sum;
	}
	}

	

