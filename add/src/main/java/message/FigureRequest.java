package message;

import java.io.Serializable;

public class FigureRequest implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private int firstNum;

	private int secondNum;
	
	private String operator;
	
	public FigureRequest()
    {
        super();
    }
	
	public FigureRequest(int firstNum,int secondNum,String operator)
	{
		this.firstNum=firstNum;
		this.secondNum=secondNum;
		this.operator=operator;
	}
	
	public int getFirstNum() {
		return firstNum;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public int getSecondNum() {
		return secondNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

}
