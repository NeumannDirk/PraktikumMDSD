/*
 * generated by Xtext 2.24.0
 */
package org.xtext.mdsd.simplepalladio.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.xtext.mdsd.simplepalladio.repositoryviewtype.ui.internal.RepositoryviewtypeActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class RepositoryViewTypeExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(RepositoryviewtypeActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		RepositoryviewtypeActivator activator = RepositoryviewtypeActivator.getInstance();
		return activator != null ? activator.getInjector(RepositoryviewtypeActivator.ORG_XTEXT_MDSD_SIMPLEPALLADIO_REPOSITORYVIEWTYPE) : null;
	}

}
