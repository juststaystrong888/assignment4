
public class Exam {
	private NumericalQuestion nq;//private fields of class Exam
	private BooleanQuestion bq;
	private MultipleChoiceQuestion mcq;
	
	public Exam(NumericalQuestion nq, BooleanQuestion bq,MultipleChoiceQuestion mcq){//constructor of class Exam with all types of questions as its parameters
		this.nq = nq;//clarify that I am talking about a field, when there's also constructor's parameter with the same name as a field
		this.bq = bq;
		this.mcq = mcq;
	}
	
	public NumericalQuestion getNq(){//this method returns numerical question
		return nq;
	}
	public BooleanQuestion getBq(){//this method returns boolean question
		return bq;
	}
	public MultipleChoiceQuestion getMcq(){//this method returns multiple choice question
		return mcq;
	}
}
