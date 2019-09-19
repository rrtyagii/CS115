package cognitive;

public class Car {
	private int id; 
	private int[] carUse; 
	private int[] checkoutDate; 
	private int[] checkinDate; 
	
	public Car(int id, int[]checkoutCheck, int[]checkinCheck, int[] carUse) {
		if(id<0) {
		System.out.println("this is an invalid input");
		this.id=-1; 
		 }
		this.id=id; 
		this.carUse=new int[2]; 
		this.checkinDate=new int[3]; 
		this.checkoutDate=new int[3];
		
		checkoutCheck=new int[this.checkoutDate.length];
		checkinCheck=new int[this.checkinDate.length]; 
		carUse = new int[this.carUse.length]; 
		
		if( ( (checkoutCheck[0]<checkinCheck[0]) && (checkoutCheck[1]==checkinCheck[1]) && (checkoutCheck[2]==checkinCheck[2]) ) ||
			( (checkoutCheck[0]==checkinCheck[0]) && (checkoutCheck[1]<checkinCheck[1]) && (checkoutCheck[2]==checkinCheck[2]) ) ||
			( (checkoutCheck[0]==checkinCheck[0]) && (checkoutCheck[1]==checkinCheck[1]) && (checkoutCheck[2]<checkinCheck[2]) ) ) {
			 
			
			this.checkoutDate=checkoutCheck; 
			this.checkinDate=checkinCheck; 
		}
		if(carUse[0]<carUse[1]) {
			this.carUse=carUse; 
		}
		
		
	}
	public static int numberOfDays(int[] takeout, int[] takein) {
		int day = takein[1]-takeout[2]; 
		int month= takein[0]-takeout[0]; 
		int year= takein[3]-takeout[3]; 
		
		return day+(month*30)+(year*365); 
	}
	
	public int rentCar(int [] requestedDate, int [] returnDate) {
		int available=-1; 
		
		int daysInBetween=Car.numberOfDays(checkinDate, requestedDate); 
		
		if(daysInBetween<0) {
			System.out.println("The car is not available on "+ requestedDate);
			return available; 
		}
		else if(daysInBetween>0) {
			System.out.println("The car is available");
			
			requestedDate=new int[this.checkoutDate.length]; 
			returnDate= new int[this.checkinDate.length];
			
			for(int i=0; i<this.checkoutDate.length; i++) {
				this.checkoutDate[i]=requestedDate[i]; 
				 for(int j=0; j<this.checkinDate.length; j++) {
					 this.checkinDate[i]=returnDate[i]; 
				 }
			}
			carUse[0]=Car.numberOfDays(requestedDate, returnDate);
			
			return available=1;  
		}
		return available; 
	}
	public int serviceCar(int[] requestedDate , int[] returnDate) {
		int checker=-1; 
		
		int serviceDays=Car.numberOfDays(this.checkinDate, requestedDate); 
		
		if (serviceDays<1)
			return checker; 
		
		else if (serviceDays>=1)					/*if available*/
		{
			for(int i=0; i<3; i++)		/*update check in and check out date*/
			{
				this.checkoutDate[i] = requestedDate[i];
				this.checkinDate[i] = returnDate[i];
			}
			carUse[1] += Car.numberOfDays(requestedDate, returnDate); 
			checker=1; 
			return checker; 
		}
		
		
		
		return checker; 
	}
	  //Setters	
	public void setCarUse(int[] carUse) {
		this.carUse = carUse;
	}
	public void setCheckoutDate(int[] checkoutDate) {
		this.checkoutDate = checkoutDate;
	}
	public void setCheckinDate(int[] checkinDate) {
		this.checkinDate = checkinDate;
	}
	
	//Getters
	public int[] getCarUse() {
		return carUse;
	}

	public int[] getCheckoutDate() {
		int[] original=new int[this.checkoutDate.length]; 
		for(int i=0;i<this.checkoutDate.length; i++) {
			original[i]=this.checkoutDate[i];
		}
		return original;
	}
	public int[] getCheckinDate() {
		int[] original=new int[this.checkinDate.length]; 
		for(int i=0;i<this.checkinDate.length; i++) {
			original[i]=this.checkinDate[i];
		}
		return original;
	}
	
	
	
	

}
