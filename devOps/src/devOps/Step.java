/**
 */
package devOps;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devOps.Step#getConditional <em>Conditional</em>}</li>
 * </ul>
 *
 * @see devOps.DevOpsPackage#getStep()
 * @model abstract="true"
 * @generated
 */
public interface Step extends EObject {
	/**
	 * Returns the value of the '<em><b>Conditional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditional</em>' containment reference.
	 * @see #setConditional(Conditional)
	 * @see devOps.DevOpsPackage#getStep_Conditional()
	 * @model containment="true"
	 * @generated
	 */
	Conditional getConditional();

	/**
	 * Sets the value of the '{@link devOps.Step#getConditional <em>Conditional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditional</em>' containment reference.
	 * @see #getConditional()
	 * @generated
	 */
	void setConditional(Conditional value);

} // Step
