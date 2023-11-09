/**
 */
package devOps;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devOps.Environment#getVariables <em>Variables</em>}</li>
 *   <li>{@link devOps.Environment#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link devOps.Environment#getSecrets <em>Secrets</em>}</li>
 * </ul>
 *
 * @see devOps.DevOpsPackage#getEnvironment()
 * @model
 * @generated
 */
public interface Environment extends EObject {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' reference list.
	 * The list contents are of type {@link java.util.Map.Entry}<code>&lt;java.lang.String, java.lang.String&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' reference list.
	 * @see devOps.DevOpsPackage#getEnvironment_Variables()
	 * @model mapType="devOps.StringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EList<Map.Entry<String, String>> getVariables();

	/**
	 * Returns the value of the '<em><b>Artifacts</b></em>' reference list.
	 * The list contents are of type {@link java.util.Map.Entry}<code>&lt;java.lang.String, java.lang.String&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifacts</em>' reference list.
	 * @see devOps.DevOpsPackage#getEnvironment_Artifacts()
	 * @model mapType="devOps.StringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EList<Map.Entry<String, String>> getArtifacts();

	/**
	 * Returns the value of the '<em><b>Secrets</b></em>' reference list.
	 * The list contents are of type {@link java.util.Map.Entry}<code>&lt;java.lang.String, java.lang.String&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secrets</em>' reference list.
	 * @see devOps.DevOpsPackage#getEnvironment_Secrets()
	 * @model mapType="devOps.StringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EList<Map.Entry<String, String>> getSecrets();

} // Environment
