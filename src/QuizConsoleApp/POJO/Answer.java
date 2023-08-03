package QuizConsoleApp.POJO;

public class Answer {
	private int id;
    private String answer;
    private boolean isTrueAnswer = false;

    public Answer(int id,String answer, boolean isTrueAnswer) {
    	this.id = id;
        this.answer = answer;
        this.isTrueAnswer = isTrueAnswer;
    }
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
    
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean isTrueAnswer() {
        return isTrueAnswer;
    }

    public void setTrueAnswer(boolean trueAnswer) {
        isTrueAnswer = trueAnswer;
    }
}
