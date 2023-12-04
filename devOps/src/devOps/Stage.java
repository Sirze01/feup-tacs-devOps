/**
 */
package devOps;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devOps.Stage#getTasks <em>Tasks</em>}</li>
 *   <li>{@link devOps.Stage#getConditional <em>Conditional</em>}</li>
 * </ul>
 *
 * @see devOps.DevOpsPackage#getStage()
 * @model
 * @generated
 */
public interface Stage extends EObject {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' reference list.
	 * The list contents are of type {@link devOps.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' reference list.
	 * @see devOps.DevOpsPackage#getStage_Tasks()
	 * @model required="true"
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * Returns the value of the '<em><b>Conditional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditional</em>' containment reference.
	 * @see #setConditional(Conditional)
	 * @see devOps.DevOpsPackage#getStage_Conditional()
	 * @model containment="true"
	 * @generated
	 */
	Conditional getConditional();

	/**
	 * Sets the value of the '{@link devOps.Stage#getConditional <em>Conditional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditional</em>' containment reference.
	 * @see #getConditional()
	 * @generated
	 */
	void setConditional(Conditional value);

} // Stage
