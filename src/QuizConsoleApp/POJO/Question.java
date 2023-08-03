package QuizConsoleApp.POJO;

public class Question {
	private int id;
    private String question;
    private Answer[] answers;

    public Question(int id,String question, Answer[] answers) {
    	this.id = id;
        this.question = question;
        this.answers = answers;
    }
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

    public String getQuestion() {
        return question;
    }

    public void printQuestionWithOptions() {
        System.out.println( question );
        printOptions();
    }

    public void printOptions() {
        int index = 0;

        System.out.println( "Options:");
        for ( Answer answer: answers ) {
            System.out.println( ( index + 1 ) + ". " + answer.getAnswer() );
        }
    }
}
