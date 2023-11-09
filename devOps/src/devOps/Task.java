/**
 */
package devOps;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link devOps.Task#getSteps <em>Steps</em>}</li>
 *   <li>{@link devOps.Task#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link devOps.Task#isAllowFailure <em>Allow Failure</em>}</li>
 *   <li>{@link devOps.Task#getTaskImports <em>Task Imports</em>}</li>
 *   <li>{@link devOps.Task#getRunner <em>Runner</em>}</li>
 *   <li>{@link devOps.Task#getConditional <em>Conditional</em>}</li>
 *   <li>{@link devOps.Task#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see devOps.DevOpsPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject {
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
	 * Returns the value of the '<em><b>Allow Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Failure</em>' attribute.
	 * @see #setAllowFailure(boolean)
	 * @see devOps.DevOpsPackage#getTask_AllowFailure()
	 * @model required="true"
	 * @generated
	 */
	boolean isAllowFailure();

	/**
	 * Sets the value of the '{@link devOps.Task#isAllowFailure <em>Allow Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Failure</em>' attribute.
	 * @see #isAllowFailure()
	 * @generated
	 */
	void setAllowFailure(boolean value);

	/**
	 * Returns the value of the '<em><b>Task Imports</b></em>' reference list.
	 * The list contents are of type {@link devOps.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Imports</em>' reference list.
	 * @see devOps.DevOpsPackage#getTask_TaskImports()
	 * @model
	 * @generated
	 */
	EList<Task> getTaskImports();

	/**
	 * Returns the value of the '<em><b>Runner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runner</em>' reference.
	 * @see #setRunner(Runner)
	 * @see devOps.DevOpsPackage#getTask_Runner()
	 * @model
	 * @generated
	 */
	Runner getRunner();

	/**
	 * Sets the value of the '{@link devOps.Task#getRunner <em>Runner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runner</em>' reference.
	 * @see #getRunner()
	 * @generated
	 */
	void setRunner(Runner value);

	/**
	 * Returns the value of the '<em><b>Conditional</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditional</em>' reference.
	 * @see #setConditional(Conditional)
	 * @see devOps.DevOpsPackage#getTask_Conditional()
	 * @model
	 * @generated
	 */
	Conditional getConditional();

	/**
	 * Sets the value of the '{@link devOps.Task#getConditional <em>Conditional</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditional</em>' reference.
	 * @see #getConditional()
	 * @generated
	 */
	void setConditional(Conditional value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see devOps.DevOpsPackage#getTask_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link devOps.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Task
