/**
 */
package devOps;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devOps.DevOpsTask#isAllowFailure <em>Allow Failure</em>}</li>
 *   <li>{@link devOps.DevOpsTask#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see devOps.DevOpsPackage#getDevOpsTask()
 * @model abstract="true"
 * @generated
 */
public interface DevOpsTask extends EObject {
	/**
	 * Returns the value of the '<em><b>Allow Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Failure</em>' attribute.
	 * @see #setAllowFailure(boolean)
	 * @see devOps.DevOpsPackage#getDevOpsTask_AllowFailure()
	 * @model required="true"
	 * @generated
	 */
	boolean isAllowFailure();

	/**
	 * Sets the value of the '{@link devOps.DevOpsTask#isAllowFailure <em>Allow Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Failure</em>' attribute.
	 * @see #isAllowFailure()
	 * @generated
	 */
	void setAllowFailure(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see devOps.DevOpsPackage#getDevOpsTask_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link devOps.DevOpsTask#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DevOpsTask
