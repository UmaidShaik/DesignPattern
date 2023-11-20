package com.aurionpro.model;

public class OperationStretegy {
	
	public IOperation operation;

	public OperationStretegy(IOperation operation) {
		super();
		this.operation = operation;
	}
	public int doOperation(int a, int b) {
		return operation.doOperation(a, b);
	}
	public void setOperation(IOperation operation) {
		this.operation = operation;
	}

}
