package main.it.sevenbits;

public class Main {
public static void main(String[] args) {
	Section[] sections = new Section[3];
	Section first = new Section(new Dote(0, 0), new Dote(2, 2));
	Section second = new Section(new Dote(1, 2), new Dote(2, 2));
	Section third = new Section(new Dote(3, 3), new Dote(1, 0));
	sections[0] = first;
	sections[1] = second;
	sections[2] = third;
	for(Section section : sections) {
		System.out.println(section.getLength());
	}
}
}
