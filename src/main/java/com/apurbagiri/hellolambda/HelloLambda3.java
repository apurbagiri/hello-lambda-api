package com.apurbagiri.hellolambda;

import com.amazonaws.services.lambda.runtime.Context;

/**
 * 
 * Lambda HANDLER VALUE: com.apurbagiri.hellolambda.HelloLambda3::handleRequest
 * Lambda input: ""
 * 
 * @author apurb
 *
 */

public class HelloLambda3 {

	public String handleRequest(String input, Context context) {
		context.getLogger().log("Input: " + input);
		return "Lambda MethodHandler says hello!";
	}
}
