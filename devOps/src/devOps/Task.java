/**
 */
package devOps;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devOps.Task#getSteps <em>Steps</em>}</li>
 *   <li>{@link devOps.Task#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link devOps.Task#getRunner <em>Runner</em>}</li>
 * </ul>
 *
 * @see devOps.DevOpsPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends DevOpsTask {
	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link devOps.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see devOps.DevOpsPackage#getTask_Steps()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Step> getSteps();

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' containment reference.
	 * @see #setEnvironment(Environment)
	 * @see devOps.DevOpsPackage#getTask_Environment()
	 * @model containment="true"
	 * @generated
	 */
	Environment getEnvironment();

	/**
	 * Sets the value of the '{@link devOps.Task#getEnvironment <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' containment reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(Environment value);

	/**
	 * Returns the value of the '<em><b>Runner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runner</em>' containment reference.
	 * @see #setRunner(Runner)
	 * @see devOps.DevOpsPackage#getTask_Runner()
	 * @model containment="true"
	 * @generated
	 */
	Runner getRunner();

	/**
	 * Sets the value of the '{@link devOps.Task#getRunner <em>Runner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runner</em>' containment reference.
	 * @see #getRunner()
	 * @generated
	 */
	void setRunner(Runner value);

} // Task
