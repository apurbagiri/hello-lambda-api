package com.apurbagiri.hellolambda;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.IOUtils;
import org.json.simple.JSONObject;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;

/**
 * 
 * Lambda HANDLER VALUE: com.apurbagiri.hellolambda.HelloLambda::handleRequest
 * Lambda input: ""
 * 
 * @author apurb
 *
 */
public class HelloLambda implements RequestStreamHandler {

	@Override
	public void handleRequest(InputStream input, OutputStream output, Context context) throws IOException {

		context.getLogger().log("Input: " + IOUtils.toString(input, StandardCharsets.UTF_8));

		OutputStreamWriter writer = new OutputStreamWriter(output, "UTF-8");
		writer.write(getSampleJsonResponse().toString());
		writer.close();
	}

	private JSONObject getSampleJsonResponse() {
		JSONObject responseJson = new JSONObject();
		JSONObject responseBody = new JSONObject();
		responseBody.put("message", "Lambda says hi!");
		responseJson.put("statusCode", 200);
		responseJson.put("body", responseBody.toString());
		return responseJson;
	}

}