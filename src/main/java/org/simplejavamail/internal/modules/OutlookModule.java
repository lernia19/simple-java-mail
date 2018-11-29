package org.simplejavamail.internal.modules;

import org.simplejavamail.email.Email;
import org.simplejavamail.email.EmailPopulatingBuilder;

import javax.annotation.Nonnull;
import java.io.File;
import java.io.InputStream;

public interface OutlookModule {
	
	ModuleDescriptor MODULE_DESCRIPTOR = new ModuleDescriptor(
			"Outlook",
			"org.simplejavamail.internal.module.clisupport.OutlookModuleImpl",
			"https://github.com/simple-java-mail/outlook-module"
	);
	
	Email outlookMsgToEmail(@Nonnull final File msgFile);
	Email outlookMsgToEmail(@Nonnull final String msgData);
	EmailPopulatingBuilder outlookMsgToEmailBuilder(@Nonnull final InputStream msgInputStream);
}