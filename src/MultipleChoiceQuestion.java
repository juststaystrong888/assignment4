
public class MultipleChoiceQuestion {
	private boolean option1;//private fields of MultipleChoiceQuestion class
	private boolean option2;
	private boolean option3;
	private int mark;
	
	public MultipleChoiceQuestion(boolean option1,boolean option2,boolean option3, int mark){ //constructor of class MultipleChoiceQuestion with 3 options and mark as its parameters
		
		this.option1 = option1;//clarify that I am talking about a field, when there's also constructor's parameter with the same name as a field
		this.option2 = option2;
		this.option3 = option3;
		this.mark = mark;
	}
	public boolean getOption1(){//this method returns option1 of boolean type
		return option1;
	}
	public boolean getOption2(){//this method returns option2 of boolean type
		return option2;
	}
	public boolean getOption3(){//this method returns option3 of boolean type
		return option3;
	}
	
	public int getMark(){//this method returns mark of integer type
		return mark;
	}
	


}
