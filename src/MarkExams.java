
public class MarkExams {

	public static void main(String[] args) {
	
		NumericalQuestion nqMarkScheme = new NumericalQuestion(198,6);//create object nqMarkScheme of class NumericalQuestion with attempt=198 and mark=6
		BooleanQuestion bqMarkScheme = new BooleanQuestion(true,1);//create object bqMarkScheme of class BooleanQuestion with attempt=true and mark=1
		MultipleChoiceQuestion mcqMarkScheme = new MultipleChoiceQuestion(false,false,false,3);//create object mcqMarkScheme of class MultipleChoiceQuestion with option1=option2=option3=false and mark=3
		
		Exam markScheme = new Exam(nqMarkScheme,bqMarkScheme, mcqMarkScheme);//create object markScheme of class Exam with 3 questions of mark scheme
		
		NumericalQuestion nqAttempt = new NumericalQuestion(196,0);//create object nqAttempt of class NumericalQuestion with attempt=196 and mark=0
		BooleanQuestion bqAttempt = new BooleanQuestion(true,0);//create object bqAttempt of class BooleanQuestion with attempt=true and mark=0
		MultipleChoiceQuestion mcqAttempt = new MultipleChoiceQuestion(false,false,false,0);//create object mcqAttempt of class MultipleChoiceQuestion with option1=option2=option3=false and mark=0
		
		Exam examAttempt = new Exam(nqAttempt, bqAttempt, mcqAttempt);//create object examAttempt of class Exam with 3 questions of exam attempt
		
		Marker marker = new Marker();//create object marker of class Marker
		
		System.out.println("Question 1: "+marker.compareNQ(examAttempt.getNq(), markScheme.getNq()) + " out of " +markScheme.getNq().getMark());//print Questions1: total mark of exam attempt for numerical question out of total mark from mark scheme for numerical question
		System.out.println("Question 2: "+marker.compareBQ(examAttempt.getBq(), markScheme.getBq()) + " out of " +markScheme.getBq().getMark());//print Questions2: total mark of exam attempt for boolean question out of total mark from mark scheme for boolean question
		System.out.println("Question 3: "+marker.compareMCQ(examAttempt.getMcq(), markScheme.getMcq())+ " out of " +markScheme.getMcq().getMark());//print Questions3: total mark of exam attempt for multiple choice question out of total mark from mark scheme for multiple choice question
		
		System.out.println("Your total mark is "+ marker.markAttempt(examAttempt,markScheme));////print Questions1: total mark of exam attempt out of total mark from mark scheme
		
		System.out.println("Your degree classification is " + marker.convertMarksToClassification(marker.markAttempt(examAttempt,markScheme)));//print classification degree after conversion of total mark
		
		
		
	}

}
