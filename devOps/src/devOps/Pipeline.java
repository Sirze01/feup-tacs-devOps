/**
 */
package devOps;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pipeline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devOps.Pipeline#getName <em>Name</em>}</li>
 *   <li>{@link devOps.Pipeline#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link devOps.Pipeline#getStages <em>Stages</em>}</li>
 *   <li>{@link devOps.Pipeline#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link devOps.Pipeline#getRunner <em>Runner</em>}</li>
 * </ul>
 *
 * @see devOps.DevOpsPackage#getPipeline()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueName'"
 * @generated
 */
public interface Pipeline extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see devOps.DevOpsPackage#getPipeline_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link devOps.Pipeline#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' containment reference.
	 * @see #setEnvironment(Environment)
	 * @see devOps.DevOpsPackage#getPipeline_Environment()
	 * @model containment="true"
	 * @generated
	 */
	Environment getEnvironment();

	/**
	 * Sets the value of the '{@link devOps.Pipeline#getEnvironment <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' containment reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(Environment value);

	/**
	 * Returns the value of the '<em><b>Stages</b></em>' containment reference list.
	 * The list contents are of type {@link devOps.Stage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stages</em>' containment reference list.
	 * @see devOps.DevOpsPackage#getPipeline_Stages()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Stage> getStages();

	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' reference list.
	 * The list contents are of type {@link devOps.Trigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' reference list.
	 * @see devOps.DevOpsPackage#getPipeline_Triggers()
	 * @model required="true"
	 * @generated
	 */
	EList<Trigger> getTriggers();

	/**
	 * Returns the value of the '<em><b>Runner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runner</em>' reference.
	 * @see #setRunner(Runner)
	 * @see devOps.DevOpsPackage#getPipeline_Runner()
	 * @model
	 * @generated
	 */
	Runner getRunner();

	/**
	 * Sets the value of the '{@link devOps.Pipeline#getRunner <em>Runner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runner</em>' reference.
	 * @see #getRunner()
	 * @generated
	 */
	void setRunner(Runner value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.stages.tasks-&gt;isUnique(name)'"
	 * @generated
	 */
	boolean UniqueTaskNames(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Pipeline.allInstances()-&gt;isUnique(name)'"
	 * @generated
	 */
	boolean UniqueName(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Pipeline
