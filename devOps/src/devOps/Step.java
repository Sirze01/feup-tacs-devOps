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
 *   <li>{@link devOps.Step#getCmd <em>Cmd</em>}</li>
 * </ul>
 *
 * @see devOps.DevOpsPackage#getStep()
 * @model
 * @generated
 */
public interface Step extends EObject {
	/**
	 * Returns the value of the '<em><b>Conditional</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditional</em>' reference.
	 * @see #setConditional(Conditional)
	 * @see devOps.DevOpsPackage#getStep_Conditional()
	 * @model
	 * @generated
	 */
	Conditional getConditional();

	/**
	 * Sets the value of the '{@link devOps.Step#getConditional <em>Conditional</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditional</em>' reference.
	 * @see #getConditional()
	 * @generated
	 */
	void setConditional(Conditional value);

	/**
	 * Returns the value of the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmd</em>' attribute.
	 * @see #setCmd(String)
	 * @see devOps.DevOpsPackage#getStep_Cmd()
	 * @model
	 * @generated
	 */
	String getCmd();

	/**
	 * Sets the value of the '{@link devOps.Step#getCmd <em>Cmd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmd</em>' attribute.
	 * @see #getCmd()
	 * @generated
	 */
	void setCmd(String value);

} // Step
