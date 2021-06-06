/**
 */
package simplePalladio.SystemIndependentViewPoint;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplePalladio.SystemIndependentViewPoint.Branch#getBehaviorElements <em>Behavior Elements</em>}</li>
 * </ul>
 *
 * @see simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage#getBranch()
 * @model
 * @generated
 */
public interface Branch extends BehaviorElement {
	/**
	 * Returns the value of the '<em><b>Behavior Elements</b></em>' containment reference list.
	 * The list contents are of type {@link simplePalladio.SystemIndependentViewPoint.BehaviorElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior Elements</em>' containment reference list.
	 * @see simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage#getBranch_BehaviorElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<BehaviorElement> getBehaviorElements();

} // Branch
