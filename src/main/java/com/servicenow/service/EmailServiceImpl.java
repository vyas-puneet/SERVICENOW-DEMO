package com.servicenow.service;

import java.time.Duration;

import com.azure.communication.email.EmailClient;
import com.azure.communication.email.EmailClientBuilder;
import com.azure.communication.email.models.EmailMessage;
import com.azure.communication.email.models.EmailSendResult;
import com.azure.communication.email.models.EmailSendStatus;
import com.azure.core.credential.AzureKeyCredential;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.PollResponse;
import com.azure.core.util.polling.SyncPoller;

public class EmailServiceImpl {

	public static final Duration POLLER_WAIT_TIME = Duration.ofSeconds(10);

	public void sendEmail() {
		String endpoint = "https://cosmos-error.india.communication.azure.com/";
		AzureKeyCredential azureKeyCredential = new AzureKeyCredential(
				"LBTJepq5TFf8ls8Ilsyr9NyY8FbRF6CspUkCMkbeWxy+G+0zEjmxX0+7P3VG4zh4uUAcX+ctw3eLTiW+hljMDA==");
		String senderAddress = "DoNotReply@2ce4084e-ead6-4961-93a9-4b39207e1c6a.azurecomm.net";
		String recipientAddress = "virendrakashyap244@gmail.com";

		EmailClient client = new EmailClientBuilder().endpoint(endpoint).credential(azureKeyCredential).buildClient();

		EmailMessage message = new EmailMessage().setSenderAddress(senderAddress).setToRecipients(recipientAddress)
				.setSubject("Test email from Java Sample").setBodyPlainText("This is plaintext body of test email.");

		try {
			SyncPoller<EmailSendResult, EmailSendResult> poller = client.beginSend(message, null);

			PollResponse<EmailSendResult> pollResponse = null;

			Duration timeElapsed = Duration.ofSeconds(0);

			while (pollResponse == null || pollResponse.getStatus() == LongRunningOperationStatus.NOT_STARTED
					|| pollResponse.getStatus() == LongRunningOperationStatus.IN_PROGRESS) {
				pollResponse = poller.poll();
				System.out.println("Email send poller status: " + pollResponse.getStatus());

				Thread.sleep(POLLER_WAIT_TIME.toMillis());
				timeElapsed = timeElapsed.plus(POLLER_WAIT_TIME);

				if (timeElapsed.compareTo(POLLER_WAIT_TIME.multipliedBy(18)) >= 0) {
					throw new RuntimeException("Polling timed out.");
				}
			}

			if (poller.getFinalResult().getStatus() == EmailSendStatus.SUCCEEDED) {
				System.out.printf("Successfully sent the email (operation id: %s)", poller.getFinalResult().getId());
			} else {
				throw new RuntimeException(poller.getFinalResult().getError().getMessage());
			}
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
	}

}
