/*
 * generated by Xtext 2.24.0
 */
package org.xtext.mdsm.simplePalladio.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractSimplepalladioValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.xtext.mdsm.simplePalladio.simplepalladio.SimplepalladioPackage.eINSTANCE);
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.example.org/simplePalladio/SystemIndependentViewPoint"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.example.org/simplePalladio/AssemblyViewPoint"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.example.org/simplePalladio/DeploymentViewPoint"));
		return result;
	}
}