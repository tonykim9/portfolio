package practice;

public class Subject {
String name;
String tutor;
String room;

public Subject(String name, String tutor, String room){
	this.name=name;
	setTutor(tutor);
	setRoom(room);
}

public Subject(String name){
this.name=name;
}

public Subject(Subject original){
	if(original==null)
	{
		System.out.println("Fatal error.");
		System.exit(0);
	}
	
	name=original.name;
	tutor=original.tutor;
	room=original.room;
	}

public String getName(){return name;}
public String getTutor(){return tutor;}
public String getRoom(){return room;}

public void setTutor(String tutor){
	this.tutor=tutor;

}

public void setRoom(String room){
	this.room=room;
}

public boolean equals(Subject otherS)
{
	return name.equals(otherS.name)&&tutor.equals(otherS.tutor)&&room.equals(otherS.room);
	
}

public String toString(){
	return name;
	
}

public String getDetails(){
	
	return ("Name:" + name + "\n" + "Tutor:"+tutor + "\n" +"Room:"+ room);
}


}
