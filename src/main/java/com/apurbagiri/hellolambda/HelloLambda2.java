package com.apurbagiri.hellolambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class HelloLambda2 implements RequestHandler<Object, Object> {

	@Override
	public Object handleRequest(Object input, Context context) {
		return "Lambda RequestHandler says hello!";
	}
}
