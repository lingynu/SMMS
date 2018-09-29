package Java2;
public class Question {
	private String text;
	private String answer;
	public Question() {
		text="";
		answer="";
	}
	public void setText(String questionText) {
		text=questionText;
	}
	public void setAnswer(String correctAnswer) {
		answer=correctAnswer;
	}
	public String toString() {
		return "Question[text="+text+" answer="+answer+"]";
	}
	public static void main(String[] args) {
		Question aaa=new Question();
		aaa.setText("What is your name");
		aaa.setAnswer("MARY");
		String s=aaa.toString();
		System.out.println(s);
	}
}
