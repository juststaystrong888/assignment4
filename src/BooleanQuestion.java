
public class BooleanQuestion {
	private boolean attempt;//private fields of BooleanQuestion class
	private int mark;
	
	public BooleanQuestion(boolean attempt,int mark){//constructor of class BooleanQuestion with attempt and mark as its parameters
		this.attempt = attempt;//clarify that I am talking about a field, when there's also constructor's parameter with the same name as a field
		this.mark = mark;
	}
	
	public boolean getAttempt(){//this method returns attempt of boolean type
		return attempt;
	}
	public int getMark(){//this method returns mark of integer type
		return mark;
	}
}
