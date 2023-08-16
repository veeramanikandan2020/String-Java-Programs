package oops.concepts;

public class AWSMotor extends SpinningMotor{

	@Override
	void motorSpeed() {
		System.out.println("Motor speed is 2500RPM");		
	}

	public void nameOfMotor() {
		
		System.out.println("Motor company name is AWSMotors");

	}
	
	public static void main(String[] args) {
		
		AWSMotor am = new AWSMotor();
		
		am.motorType();
		
		am.motorSpeed();
		
		am.nameOfMotor();
		
		SpinningMotor.colorOfMotor();
	}
}



