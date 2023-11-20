package com.aurionpro.test;

import com.aurionpro.model.AddOperation;
import com.aurionpro.model.MultiplyOperation;
import com.aurionpro.model.OperationStretegy;

public class operationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OperationStretegy op = new OperationStretegy(new AddOperation());
	    op.doOperation(3, 5);
	    System.out.println(op.doOperation(3, 5));
	    
	    System.out.println("-------------------------");
	    
	    OperationStretegy op1 = new OperationStretegy(new MultiplyOperation());
	    op.doOperation(3, 5);
	    System.out.println(op1.doOperation(3, 5));
	
	}

}
