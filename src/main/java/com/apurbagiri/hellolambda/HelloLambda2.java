package com.apurbagiri.hellolambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * 
 * Lambda HANDLER VALUE: com.apurbagiri.hellolambda.HelloLambda2::handleRequest
 * Lambda input: ""
 * 
 * @author apurb
 *
 */
public class HelloLambda2 implements RequestHandler<Object, Object> {

	@Override
	public Object handleRequest(Object input, Context context) {
		context.getLogger().log("Input: " + input);
		return "Lambda RequestHandler says hello!";
	}
}
