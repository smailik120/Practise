package main.it.sevenbits;

public class Section {
private Dote first;
private Dote second;
public Section(Dote first, Dote second) {
	this.first = first;
	this.second = second;
}

public float getLength() {
	int firstX = first.getX();
	int firstY = first.getY();
	int secondX = second.getX();
	int secondY = second.getY();
	int betweenX = secondX - firstX;
	int betweenY = secondY - firstY;
	return (float) Math.sqrt((betweenX * betweenX) + (betweenY * betweenY));
}
}
