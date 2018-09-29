package Java2;
import java.util.ArrayList;
public class ChoiceQuestion extends Question {
	public String text;
	private ArrayList<String> choices;
	public ChoiceQuestion() {
		choices=new ArrayList<String>();
		text="";
	}
	public void setText(String questionText) {
		text=questionText;
	}
	public void addChoice(String choice) {
		choices.add(choice);
	}
	public String toString() {
		return "ChoiceQuestion[text="+text+"choices="+choices+"]";
	}
	public static void main(String[] args) {
		ChoiceQuestion one=new ChoiceQuestion();
		one.setText("Which is the best food ");
		one.addChoice("tomatoes");
		one.addChoice("chicken");
		one.addChoice("lemon");
		one.addChoice("tea");
		String s=one.toString();
		System.out.println(s);
	}
}
