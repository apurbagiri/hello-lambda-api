package com.apurbagiri.hellolambda;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import org.json.simple.JSONObject;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;

/**
 * Hello world!
 *
 */
public class HelloLambda implements RequestStreamHandler {

	@Override
	public void handleRequest(InputStream input, OutputStream output, Context context) throws IOException {

		
		OutputStreamWriter writer = new OutputStreamWriter(output, "UTF-8");
		writer.write(getSampleJsonResponse().toString());
		writer.close();
	}

	private JSONObject getSampleJsonResponse() {
		JSONObject responseJson = new JSONObject();
		JSONObject responseBody = new JSONObject();
		responseBody.put("message", "Lambda RequestStreamHandler says hello!");
		responseJson.put("statusCode", 200);
		responseJson.put("body", responseBody.toString());
		return responseJson;
	}
	
}