/*
 * generated by Xtext 2.24.0
 */
package org.xtext.mdsd.simplepalladio;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class AllocationViewTypeStandaloneSetup extends AllocationViewTypeStandaloneSetupGenerated {

	public static void doSetup() {
		new AllocationViewTypeStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}