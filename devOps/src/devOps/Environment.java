/**
 */
package devOps;

import org.eclipse.emf.common.util.EMap;

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
	 * Returns the value of the '<em><b>Variables</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' map.
	 * @see devOps.DevOpsPackage#getEnvironment_Variables()
	 * @model mapType="devOps.StringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EMap<String, String> getVariables();

	/**
	 * Returns the value of the '<em><b>Artifacts</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifacts</em>' map.
	 * @see devOps.DevOpsPackage#getEnvironment_Artifacts()
	 * @model mapType="devOps.StringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EMap<String, String> getArtifacts();

	/**
	 * Returns the value of the '<em><b>Secrets</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secrets</em>' map.
	 * @see devOps.DevOpsPackage#getEnvironment_Secrets()
	 * @model mapType="devOps.StringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EMap<String, String> getSecrets();

} // Environment
