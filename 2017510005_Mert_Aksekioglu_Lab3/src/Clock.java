
public class Clock {
	
	int hour,minute;

	public Clock(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}
	
	public String convertTo12() {
		String output = "";
		
		if(this.getHour() > 11 && this.getHour() < 24) {
			output = String.valueOf(this.getHour()-12) + ":" + String.valueOf(this.getMinute()) + " p.m.";
		}
		else if ((this.getHour() <= 11 && this.getHour() >= 1)) {
			output = String.valueOf(this.getHour()) + ":" + String.valueOf(this.getMinute()) + " a.m.";
		}
		else if(this.getHour() == 24 && this.getMinute() == 0) {
			output = "12:00 a.m.";
		}
		else if(this.getHour() == 24 && this.getMinute() != 0) {
			output = "12:" + this.getMinute() + " a.m.";
		}
		else if(this.getHour() == 00) {
			output = "12:" + this.getMinute() + " a.m.";
		}
		else {
			System.out.println("Wrong input");
		}
		
		return output;
	}

}
