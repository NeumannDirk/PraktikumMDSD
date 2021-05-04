/**
 */
package simplePalladio.SystemIndependentViewPoint;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplePalladio.SystemIndependentViewPoint.Loop#getBehaviorElements <em>Behavior Elements</em>}</li>
 * </ul>
 *
 * @see simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage#getLoop()
 * @model
 * @generated
 */
public interface Loop extends BehaviorElement {
	/**
	 * Returns the value of the '<em><b>Behavior Elements</b></em>' reference list.
	 * The list contents are of type {@link simplePalladio.SystemIndependentViewPoint.BehaviorElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior Elements</em>' reference list.
	 * @see simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage#getLoop_BehaviorElements()
	 * @model
	 * @generated
	 */
	EList<BehaviorElement> getBehaviorElements();

} // Loop
