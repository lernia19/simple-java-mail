package org.simplejavamail.internal.modules;

import org.simplejavamail.email.Email;

import javax.mail.internet.MimeMessage;

public interface DKIMModule {
	
	ModuleDescriptor MODULE_DESCRIPTOR = new ModuleDescriptor(
			"DKIM",
			"org.simplejavamail.internal.module.dkimsupport.DKIMModuleImpl",
			"https://github.com/simple-java-mail/dkim-module"
	);
	
	MimeMessage signMessageWithDKIM(MimeMessage messageToSign, Email emailContainingSigningDetails);
}