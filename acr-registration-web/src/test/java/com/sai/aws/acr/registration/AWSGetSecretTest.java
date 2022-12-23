package com.sai.aws.acr.registration;

// Use this code snippet in your app.
// If you need more information about configurations or implementing the sample
// code, visit the AWS docs:
// https://docs.aws.amazon.com/sdk-for-java/latest/developer-guide/home.html

// Make sure to import the following packages in your code
import org.junit.jupiter.api.Test;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.secretsmanager.SecretsManagerClient;
import software.amazon.awssdk.services.secretsmanager.model.GetSecretValueRequest;
import software.amazon.awssdk.services.secretsmanager.model.GetSecretValueResponse;

public class AWSGetSecretTest {
	
	/**
	 * To get your access key ID and secret access key
	 * Open the IAM console at https://console.aws.amazon.com/iam/.
	 * On the navigation menu, choose Users.
	 * Choose your IAM user name (not the check box).
	 * Open the Security credentials tab, and then choose Create access key.
	 */
	@Test
	public void testGetSecret() {
		System.setProperty("aws.accessKeyId","AKIAWXZOWHKIEYIQA2XB");
		System.setProperty("aws.secretAccessKey","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");
		String secretName = "acr/rds/dbconnection/secret";
		Region region = Region.of("us-east-1");
		
		// Create a Secrets Manager client
		SecretsManagerClient client = SecretsManagerClient.builder()
				.region(region)
				.build();
		
		GetSecretValueRequest getSecretValueRequest = GetSecretValueRequest.builder()
				.secretId(secretName)
				.build();
		
		GetSecretValueResponse getSecretValueResponse;
		
		try {
			getSecretValueResponse = client.getSecretValue(getSecretValueRequest);
		} catch (Exception e) {
			// For a list of exceptions thrown, see
			// https://docs.aws.amazon.com/secretsmanager/latest/apireference/API_GetSecretValue.html
			throw e;
		}
		
		String secret = getSecretValueResponse.secretString();
		System.out.println(secret);
		// Your code goes here.
	}
	
}
