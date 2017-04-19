
public class Marker {
	
	private int totalMark;//private fields of class Marker
	private Exam examAttempt;
	private Exam markScheme;
	
	public int markAttempt(Exam examAttempt, Exam markScheme){//method returns total mark of your exam attempt

		return totalMark=compareNQ(examAttempt.getNq(), markScheme.getNq())+compareBQ(examAttempt.getBq(), markScheme.getBq())+compareMCQ(examAttempt.getMcq(), markScheme.getMcq());
		
	}
	
	public int compareNQ(NumericalQuestion nq1, NumericalQuestion nq2){ //method compares attempt of numerical question with attempt from mark scheme
		if(nq1.getAttempt()==nq2.getAttempt()){//if attempt of question equals to answer from mark scheme then
			totalMark=nq2.getMark();//total mark equals to total mark of numerical question from mark scheme
		}
		else if((nq1.getAttempt()==nq2.getAttempt()+1)||(nq1.getAttempt()==nq2.getAttempt()-1)){ //however if attempt of question is one higher or one lower than answer from the mark scheme
			totalMark=nq2.getMark()-1;//total mark for this question equals to one lower than total mark from mark scheme
		}
		else if((nq1.getAttempt()>=nq2.getAttempt()-5)&&(nq1.getAttempt()<=nq2.getAttempt()+5)){//if exam attempt is up to ir a five higher or lower than real answer then
			totalMark=1; // total mark for this question attempt will be 1
		}
		else { totalMark=0;//otherwise total mark is zero
		}
		return totalMark;//returns total mark of exam attempt for numerical question
		
	}
	
	public int compareBQ(BooleanQuestion bq1, BooleanQuestion bq2){//method compares attempt of boolean question with attempt from mark scheme
		if(bq1.getAttempt()==bq2.getAttempt()){//if attempt of question equals to answer from mark scheme then
			totalMark=bq2.getMark();//total mark equals to total mark of boolean question from mark scheme
		}
		else { totalMark = 0;//otherwise total mark is zero
		}
		return totalMark;//returns total mark of exam attempt for boolean question
	}
	
	
	public double convertMarksToClassification(int totalMark){//method convert total mark to degree classification and returns classification
		if(totalMark==9){//if total mark equals to 9 
			return 1.1; //then return 1.1
		}
		else if(totalMark==7 ||totalMark==8){//however if total mark is 8 or 7
			return 2.1;//then return 2.1
		}
		else if(totalMark==6){//if total mark equals to 6
			return 2.2;//then return 2.2
		}
		else return 0.0;//otherwise return 0.0
	}
	
	public int compareMCQ(MultipleChoiceQuestion mcq1,MultipleChoiceQuestion mcq2){//method compares attempt of multiple choice question with attempt from mark scheme
		if(mcq2.getOption1()==mcq1.getOption1()){//if option1 of exam attempt equals to option1 from mark scheme then
			totalMark=mcq1.getMark()+1;// total mark equals to total mark equals 1, because usually total mark for option1 of exam attempt is zero
		}
		else totalMark=0; //otherwise total mark is zero
		
		if(mcq2.getOption2()==mcq1.getOption2()){//if option2 of exam attempt equals to option2 from mark scheme then
			totalMark=totalMark+1;//  total mark equals to value of one higher than total mark
		}
		else totalMark=totalMark;//otherwise total mark remains the same
		
		if(mcq2.getOption3()==mcq1.getOption3()){//if option3 of exam attempt equals to option3 from mark scheme then
			totalMark=totalMark+1;//  total mark equals to value of one higher than total mark
		}
		else { totalMark=totalMark;//otherwise total mark remains the same
		}
		return totalMark;//return total mark of exam attempt for multiple choice question
    } 
	
}
