package org.simplejavamail.internal.modules;

import org.simplejavamail.email.Email;

import javax.mail.internet.MimeMessage;

public interface DKIMModule {
	MimeMessage signMessageWithDKIM(MimeMessage messageToSign, Email emailContainingSigningDetails);
}