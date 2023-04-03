package com.dell.emailService;

import com.dell.entity.EmailDetails;

public interface EmailService {

		// Method
		// To send a simple email
		String sendSimpleMail(EmailDetails details);

		// Method
		// To send an email with attachment
		String sendMailWithAttachment(EmailDetails details);
	}



