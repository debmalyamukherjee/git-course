package QuizConsoleApp;

import java.util.Scanner;

import QuizConsoleApp.POJO.Answer;
import QuizConsoleApp.POJO.Question;

public class Questionaire {
	static Question[] questions = new Question[20];
	static String selection[] = new String[20];
	static Answer[] answer = new Answer[20];

	public static void QuestionAnswer() {
		System.out.println("");
		System.out.println("");

		Answer[] answers = new Answer[4];
		answers[0] = new Answer(1, " JRE", false);
		answers[1] = new Answer(2, " JIT", false);
		answers[2] = new Answer(3, " JDK", true);
		answers[3] = new Answer(4, " JVM", false);
		questions[0] = new Question(1, " Which component is used to compile, debug and execute the java programs?",
				answers);

		System.out.println(questions[0].getQuestion());
		System.out.println(answers[0].getAnswer());
		System.out.println(answers[1].getAnswer());
		System.out.println(answers[2].getAnswer());
		System.out.println(answers[3].getAnswer());

		System.out.println();

		answers = new Answer[4];
		answers[0] = new Answer(1, " identifier & keyword", false);
		answers[1] = new Answer(2, " identifier", false);
		answers[2] = new Answer(3, " keyword", true);
		answers[3] = new Answer(4, " none of the mentioned", false);
		questions[1] = new Question(2, " Which of these cannot be used for a variable name in Java?", answers);

		System.out.println(questions[1].getQuestion());
		System.out.println(answers[0].getAnswer());
		System.out.println(answers[1].getAnswer());
		System.out.println(answers[2].getAnswer());
		System.out.println(answers[3].getAnswer());

		System.out.println();

		answers = new Answer[4];
		answers[0] = new Answer(1, " .js", false);
		answers[1] = new Answer(2, " .txt", false);
		answers[2] = new Answer(3, " .class", false);
		answers[3] = new Answer(4, " .java", true);
		questions[2] = new Question(3, " What is the extension of java code files?", answers);

		System.out.println(questions[2].getQuestion());
		System.out.println(answers[0].getAnswer());
		System.out.println(answers[1].getAnswer());
		System.out.println(answers[2].getAnswer());
		System.out.println(answers[3].getAnswer());

		System.out.println();

		answers = new Answer[4];
		answers[0] = new Answer(1, " Polymorphism", false);
		answers[1] = new Answer(2, " Inheritance", false);
		answers[2] = new Answer(3, " Compilation", true);
		answers[3] = new Answer(4, " Encapsulation", false);
		questions[3] = new Question(4, " Which of the following is not an OOPS concept in Java?", answers);

		System.out.println(questions[3].getQuestion());
		System.out.println(answers[0].getAnswer());
		System.out.println(answers[1].getAnswer());
		System.out.println(answers[2].getAnswer());
		System.out.println(answers[3].getAnswer());

		System.out.println();
		answers = new Answer[4];
		answers[0] = new Answer(1, " Referring to the instance variable when a local variable has the same name",
				false);
		answers[1] = new Answer(2, " Passing itself to the method of the same class", true);
		answers[2] = new Answer(3, " Passing itself to another method", false);
		answers[3] = new Answer(4, " Calling another constructor in constructor chaining", false);
		questions[4] = new Question(5, " What is not the use of “this” keyword in Java?", answers);

		System.out.println(questions[4].getQuestion());
		System.out.println(answers[0].getAnswer());
		System.out.println(answers[1].getAnswer());
		System.out.println(answers[2].getAnswer());
		System.out.println(answers[3].getAnswer());

		System.out.println();

		answers = new Answer[4];
		answers[0] = new Answer(1, " .js", false);
		answers[1] = new Answer(2, " .txt", false);
		answers[2] = new Answer(3, " .class", true);
		answers[3] = new Answer(4, " .java", false);
		questions[5] = new Question(6, " What is the extension of compiled java classes?", answers);

		System.out.println(questions[5].getQuestion());
		System.out.println(answers[0].getAnswer());
		System.out.println(answers[1].getAnswer());
		System.out.println(answers[2].getAnswer());
		System.out.println(answers[3].getAnswer());

		System.out.println();

		answers = new Answer[4];
		answers[0] = new Answer(1, " if()", true);
		answers[1] = new Answer(2, " for()", false);
		answers[2] = new Answer(3, " continue", false);
		answers[3] = new Answer(4, " break", false);
		questions[6] = new Question(7, " Which of these are selection statements in Java?", answers);

		System.out.println(questions[6].getQuestion());
		System.out.println(answers[0].getAnswer());
		System.out.println(answers[1].getAnswer());
		System.out.println(answers[2].getAnswer());
		System.out.println(answers[3].getAnswer());

		System.out.println();

		answers = new Answer[4];
		answers[0] = new Answer(1, " Interface", false);
		answers[1] = new Answer(2, " interface", true);
		answers[2] = new Answer(3, " Intf", false);
		answers[3] = new Answer(4, " intf", false);
		questions[7] = new Question(8, " Which of these keywords is used to define interfaces in Java?", answers);

		System.out.println(questions[7].getQuestion());
		System.out.println(answers[0].getAnswer());
		System.out.println(answers[1].getAnswer());
		System.out.println(answers[2].getAnswer());
		System.out.println(answers[3].getAnswer());

		System.out.println();

		answers = new Answer[4];
		answers[0] = new Answer(1, " ArrayList", false);
		answers[1] = new Answer(2, " Object class", true);
		answers[2] = new Answer(3, " Abstract class", false);
		answers[3] = new Answer(4, " String", false);
		questions[8] = new Question(9, " Which of the following is a superclass of every class in Java?", answers);

		System.out.println(questions[8].getQuestion());
		System.out.println(answers[0].getAnswer());
		System.out.println(answers[1].getAnswer());
		System.out.println(answers[2].getAnswer());
		System.out.println(answers[3].getAnswer());

		System.out.println();

		answers = new Answer[4];
		answers[0] = new Answer(1, " Protected", false);
		answers[1] = new Answer(2, " Void", true);
		answers[2] = new Answer(3, " Public", false);
		answers[3] = new Answer(4, " Private", false);
		questions[9] = new Question(10, " Which one of the following is not an access modifier?", answers);

		System.out.println(questions[9].getQuestion());
		System.out.println(answers[0].getAnswer());
		System.out.println(answers[1].getAnswer());
		System.out.println(answers[2].getAnswer());
		System.out.println(answers[3].getAnswer());

		System.out.println();

		answers = new Answer[4];
		answers[0] = new Answer(1, " 0 to 32767", false);
		answers[1] = new Answer(2, " 0 to 65535", false);
		answers[2] = new Answer(3, " 0 to 256", false);
		answers[3] = new Answer(4, " -128 to 127", true);
		questions[10] = new Question(11, " What is the numerical range of a char data type in Java?", answers);

		System.out.println(questions[10].getQuestion());
		System.out.println(answers[0].getAnswer());
		System.out.println(answers[1].getAnswer());
		System.out.println(answers[2].getAnswer());
		System.out.println(answers[3].getAnswer());

		System.out.println();

		answers = new Answer[4];
		answers[0] = new Answer(1, " super", false);
		answers[1] = new Answer(2, " this", false);
		answers[2] = new Answer(3, " extend", false);
		answers[3] = new Answer(4, " extends", true);
		questions[11] = new Question(12, " Which of this keyword must be used to inherit a class?", answers);

		System.out.println(questions[11].getQuestion());
		System.out.println(answers[0].getAnswer());
		System.out.println(answers[1].getAnswer());
		System.out.println(answers[2].getAnswer());
		System.out.println(answers[3].getAnswer());

		System.out.println();

		answers = new Answer[4];
		answers[0] = new Answer(1, " abst", false);
		answers[1] = new Answer(2, " abstract", true);
		answers[2] = new Answer(3, " Abstract", false);
		answers[3] = new Answer(4, " abstract class", false);
		questions[12] = new Question(13, " Which of these keywords are used to define an abstract class?", answers);

		System.out.println(questions[12].getQuestion());
		System.out.println(answers[0].getAnswer());
		System.out.println(answers[1].getAnswer());
		System.out.println(answers[2].getAnswer());
		System.out.println(answers[3].getAnswer());

		System.out.println();

		answers = new Answer[4];
		answers[0] = new Answer(1, " Abstract", true);
		answers[1] = new Answer(2, " A simple class", false);
		answers[2] = new Answer(3, " Static class", false);
		answers[3] = new Answer(4, " None of the mentioned", false);
		questions[13] = new Question(14,
				" If a class inheriting an abstract class does not define all of its function then it will be known as?",
				answers);

		System.out.println(questions[13].getQuestion());
		System.out.println(answers[0].getAnswer());
		System.out.println(answers[1].getAnswer());
		System.out.println(answers[2].getAnswer());
		System.out.println(answers[3].getAnswer());

		System.out.println();

		answers = new Answer[4];
		answers[0] = new Answer(1, " Every class containing abstract method must be declared abstract", false);
		answers[1] = new Answer(2, " Abstract class defines only the structure of the class not its implementation",
				false);
		answers[2] = new Answer(3, " Abstract class can be initiated by new operator", true);
		answers[3] = new Answer(4, " Abstract class can be inherited", false);
		questions[14] = new Question(15, " Which of these is not a correct statement?", answers);

		System.out.println(questions[14].getQuestion());
		System.out.println(answers[0].getAnswer());
		System.out.println(answers[1].getAnswer());
		System.out.println(answers[2].getAnswer());
		System.out.println(answers[3].getAnswer());

		System.out.println();

		answers = new Answer[4];
		answers[0] = new Answer(1, " 0", false);
		answers[1] = new Answer(2, " Not a Number", false);
		answers[2] = new Answer(3, " Infinity", true);
		answers[3] = new Answer(4, " Run time exception", false);
		questions[15] = new Question(16, " What does the expression float a = 35 / 0 return?", answers);

		System.out.println(questions[15].getQuestion());
		System.out.println(answers[0].getAnswer());
		System.out.println(answers[1].getAnswer());
		System.out.println(answers[2].getAnswer());
		System.out.println(answers[3].getAnswer());

		System.out.println();

		answers = new Answer[4];
		answers[0] = new Answer(1, " for ( int i = 99; i >= 0; i / 9 )", true);
		answers[1] = new Answer(2, " for ( int i = 7; i <= 77; i += 7 )", false);
		answers[2] = new Answer(3, " for ( int i = 20; i >= 2; - -i )", false);
		answers[3] = new Answer(4, " for ( int i = 2; i <= 20; i = 2* i )", false);
		questions[16] = new Question(17, " Which of the following for loop declaration is not valid?", answers);

		System.out.println(questions[16].getQuestion());
		System.out.println(answers[0].getAnswer());
		System.out.println(answers[1].getAnswer());
		System.out.println(answers[2].getAnswer());
		System.out.println(answers[3].getAnswer());

		System.out.println();

		answers = new Answer[4];
		answers[0] = new Answer(1, " getClass()", false);
		answers[1] = new Answer(2, " intern()", false);
		answers[2] = new Answer(3, " getName()", true);
		answers[3] = new Answer(4, " toString()", false);
		questions[17] = new Question(18,
				" Which method of the Class.class is used to determine the name of a class represented by the class object as a String?",
				answers);

		System.out.println();

		System.out.println(questions[17].getQuestion());
		System.out.println(answers[0].getAnswer());
		System.out.println(answers[1].getAnswer());
		System.out.println(answers[2].getAnswer());
		System.out.println(answers[3].getAnswer());

		answers = new Answer[4];
		answers[0] = new Answer(1, " It has only methods", false);
		answers[1] = new Answer(2, " Objects can't be created", false);
		answers[2] = new Answer(3, " It has a fixed class name", false);
		answers[3] = new Answer(4, " It has no class name", true);
		questions[18] = new Question(19, " Which of the following is true about the anonymous inner class?", answers);

		System.out.println();

		System.out.println(questions[18].getQuestion());
		System.out.println(answers[0].getAnswer());
		System.out.println(answers[1].getAnswer());
		System.out.println(answers[2].getAnswer());
		System.out.println(answers[3].getAnswer());

		System.out.println();

		answers = new Answer[4];
		answers[0] = new Answer(1, " A final method cannot be overridden in its subclasses.", false);
		answers[1] = new Answer(2, " A final class cannot be extended.", false);
		answers[2] = new Answer(3, " A final class cannot extend other classes.", true);
		answers[3] = new Answer(4, " A final method can be inherited.", false);
		questions[19] = new Question(20, " Which option is false about the final keyword?", answers);

		System.out.println(questions[19].getQuestion());
		System.out.println(answers[0].getAnswer());
		System.out.println(answers[1].getAnswer());
		System.out.println(answers[2].getAnswer());
		System.out.println(answers[3].getAnswer());

		System.out.println();

	}

	public static void displayQuestions() {
		var counter = 1;
		var count = 1;
		for (Question question : questions) {
			System.out.println(counter++ + ". " + question.getQuestion());

			// System.out.println( questions );
		}
	}

	public static void playQuiz() {
		int id = 0;
		for (Question e : questions) {
			System.out.println("Questions : " + (id + 1) + " ");
			System.out.println(e.getQuestion());

			System.out.println("Enter your answer: ");
			Scanner sc = new Scanner(System.in);
			selection[id] = sc.nextLine();
			id++;
			System.out.println(" **** ");
		}
	}

	public static void printScore() {
		int score = 0;
		for (String s : selection) {
			System.out.println(s);
		}
//        for (int i = 0; i < 20; i++) {
//		//	Question q = questions[i];
//			Answer a = answer[i];
//			String answer = a.getAnswer();
//			String selectanswer = selection[i];
//			if (answer.equals(selectanswer)) {
//				System.out.println("Correct !!!");
//				score++;
//			}
//			else {
//				System.out.println("Incorrect.. The correct answer is- " + a.getAnswer());
//			}
//		}
//		System.out.println();
//		int positive_points = (+2);
//		System.out.println("Right Answer-" + score);
//		System.out.println("Your Final Score is - " + score * positive_points);
//		
//       
//        
//   }
//   

	}
}
