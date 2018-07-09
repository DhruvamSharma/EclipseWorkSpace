package com.fil.multi_threading;

public class PrinterUser extends Thread{
	
	Printer printer;
	
	public void printData(String msg) {
		printer.print(msg);
	}
	
	@Override
	public void run() {
		printData("hello" + Thread.currentThread().getName());
	}

	public PrinterUser(Printer printer) {
		super();
		this.printer = printer;
	}
	
	
}
