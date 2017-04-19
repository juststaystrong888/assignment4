
public class NumericalQuestion {
	private int attempt;//private fields of NumericalQuestion class
	private int mark;
	
	public NumericalQuestion(int attempt, int mark){//constructor of class NumericalQuestion with attempt and mark as its parameters
		this.attempt = attempt;//clarify that I am talking about a field, when there's also constructor's parameter with the same name as a field
		this.mark = mark;
	}
	
	public int getAttempt(){//this method returns attempt of integer type
		return attempt;
	}
	
	public int getMark(){//this method returns mark of integer type
		return mark;
	}

}
