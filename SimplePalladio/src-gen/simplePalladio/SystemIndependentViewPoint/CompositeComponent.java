/**
 */
package simplePalladio.SystemIndependentViewPoint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplePalladio.SystemIndependentViewPoint.CompositeComponent#getSystem <em>System</em>}</li>
 * </ul>
 *
 * @see simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage#getCompositeComponent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ProvidedInterfacesMustMatchWithSystemProvidedInterfaces RequiredInterfacesMustMatchWithSystemRequiredInterfaces'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ProvidedInterfacesMustMatchWithSystemProvidedInterfaces='(system.providedInterfaces-&gt;includesAll(self.providedInterfaces)) and (providedInterfaces-&gt;includesAll(self.system.providedInterfaces))' RequiredInterfacesMustMatchWithSystemRequiredInterfaces='(system.requiredInterfaces-&gt;includesAll(self.requiredInterfaces)) and (requiredInterfaces-&gt;includesAll(self.system.requiredInterfaces))'"
 * @generated
 */
public interface CompositeComponent extends AbstractComponent {
	/**
	 * Returns the value of the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' reference.
	 * @see #setSystem(simplePalladio.AssemblyViewPoint.System)
	 * @see simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage#getCompositeComponent_System()
	 * @model required="true"
	 * @generated
	 */
	simplePalladio.AssemblyViewPoint.System getSystem();

	/**
	 * Sets the value of the '{@link simplePalladio.SystemIndependentViewPoint.CompositeComponent#getSystem <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(simplePalladio.AssemblyViewPoint.System value);

} // CompositeComponent
