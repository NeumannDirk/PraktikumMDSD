/*
 * generated by Xtext 2.24.0
 */
package org.xtext.mdsm.simplePalladio.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.mdsd.simplepalladio.simplepalladio.ui.internal.SimplepalladioActivator;

public class SimplepalladioUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return SimplepalladioActivator.getInstance().getInjector("org.xtext.mdsm.simplePalladio.Simplepalladio");
	}

}
