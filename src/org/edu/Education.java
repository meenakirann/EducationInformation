package org.edu;

public class Education extends Arts {
public void ug() {
	System.out.println("Courses available in UG");
}
public void pg() {
	System.out.println("Courses available in PG");
}
public static void main(String[] args) {
	Education ed=new Education();
	ed.ug();
	ed.pg();
	ed.bed();
	ed.ba();
	ed.bsc();
	ed.bba();
	ed.be();
	ed.btech();
	ed.dental();
	ed.mbbs();
	ed.physiyo();
}
}
