/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package message;


import java.io.Serializable;

/**
 * <code>CustomerQuoteRequest</code> is the request sent by the the LoanBroker
 */
public class FigureRequest implements Serializable
{
    /**
     * Serial version
     */
    private static final long serialVersionUID = 6365612435470800746L;

    /** The requested loan Amount */
    private int  firstNum;

    /** the duration of the loan */
    private int secondNum;
    
    private String operator;
    
    public FigureRequest()
    {
        super();
    }

    public FigureRequest(int firstNum, int secondNum,String operator)
    {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.operator = operator;
    }

    public String getOperator()
    {
        return operator;
    }

    public void setOperator(String operator)
    {
        this.operator = operator;
    }

    public int getFirstNum()
    {
        return firstNum;
    }

    public void setFirstNum(int firstNum)
    {
        this.firstNum = firstNum;
    }
    
    public int getSecondNum()
    {
        return secondNum;
    }

    public void setSecondNum(int secondNum)
    {
        this.secondNum = secondNum;
    }
}
