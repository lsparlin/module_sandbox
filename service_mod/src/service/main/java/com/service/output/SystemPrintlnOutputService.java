package com.service.output;

import com.service.output.api.*;

public class SystemPrintlnOutputService implements OutputService {

	public void printOut(Object objToOutput) {
		System.out.println(objToOutput);
	}
}
