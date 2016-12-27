package com.gmail.at.bartoszpop.stackoverflow.questions.mapping40378645;

import org.springframework.web.bind.annotation.ResponseBody;

public abstract class VariableResolvingController {
	public final @ResponseBody Object resolveContextVariable(String variableName) {
		return "{}";
	}
	
	protected void registerVariableResolver(String variableName, VariableResolver resolver) {
		//...
	}
	
	private static final class VariableResolver {
	}
}