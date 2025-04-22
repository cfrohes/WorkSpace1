package com.Exception.OverloadingRules;

import java.util.regex.PatternSyntaxException;

public class Parent {
	
		void readFile() throws Exception {
			
		}
	}

class child extends Parent{
	
	void readFile() throws PatternSyntaxException{
		
	}
}