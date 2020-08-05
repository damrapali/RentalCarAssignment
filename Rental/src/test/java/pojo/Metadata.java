package pojo;

public class Metadata {
	
	String Color;
	String Notes;
	
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public String getNotes() {
		return Notes;
	}
	public void setNotes(String notes) {
		Notes = notes;
	}
	@Override
	public String toString() {
		return "Metadata [Color=" + Color + ", Notes=" + Notes + "]";
	}

	
}
