package practice;

public class TimeTable {
public enum DAYS{MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY}
Subject[][] timeTable;

private void initialize(){
	timeTable= new Subject[10][5];
	

	
	
	
	for(int i=0;i<10;i++){
		for(int j=0;j<5;j++){
			if(i==3){
				Subject s1 = new Subject("BREAK");
				timeTable[i][j]=s1;	
				
			}
			else if(i==7){
				Subject s1 = new Subject("LUNCH");
				timeTable[i][j]=s1;	
		
			}
			else{
				Subject s1 = new Subject("---");
				timeTable[i][j]=s1;	
			}
			
		}
		
	}
}
	
public  TimeTable(){
		
		
		initialize();

		
			
			
	}

public Subject getSchedule(String DAY, int period){
	
	String date=DAY.toUpperCase();
	 DAYS date1=DAYS.valueOf(date);
	 int dayn=date1.ordinal();
	 
	return timeTable[period-1][dayn];
}
	
public boolean setSchedule(String DAY, int period, String name, String tutor, String room){
	Subject s1 = new Subject(name, tutor, room);
	String date=DAY.toUpperCase();
	 DAYS date1=DAYS.valueOf(date);
	 int dayn=date1.ordinal();
	 if((period-1==3)||(period-1==7))
			return false;
	 else
	timeTable[period-1][dayn]=s1;
	
	
	
	if(timeTable[period-1][dayn]!=null){
		return true;
	}
	else
		return false;
	
	
	
}

public String toString(){

	String output;
	output="      ";
	DAYS[] days=DAYS.values();
	for(DAYS day:days){
		output+=day+"   ";
	}
	output+="\n";
	
	for(int i=0;i<10;i++){
		output+=i+1;
		
			
		
		
		for(int j=0;j<5;j++){
			String format=String.format("%5s", timeTable[i][j].toString());
			if(j==0&&i==9){
				output+="    "+format;
					
			}
			else
			output+="     "+format;
			
	}
		
		output+="\n";
	}	
	
return output;



	
}
}
