/**
 */
package devOps;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registry Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devOps.RegistryTask#getCmd <em>Cmd</em>}</li>
 *   <li>{@link devOps.RegistryTask#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see devOps.DevOpsPackage#getRegistryTask()
 * @model
 * @generated
 */
public interface RegistryTask extends DevOpsTask, Step {
	/**
	 * Returns the value of the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmd</em>' attribute.
	 * @see #setCmd(String)
	 * @see devOps.DevOpsPackage#getRegistryTask_Cmd()
	 * @model
	 * @generated
	 */
	String getCmd();

	/**
	 * Sets the value of the '{@link devOps.RegistryTask#getCmd <em>Cmd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmd</em>' attribute.
	 * @see #getCmd()
	 * @generated
	 */
	void setCmd(String value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' map.
	 * @see devOps.DevOpsPackage#getRegistryTask_Arguments()
	 * @model mapType="devOps.StringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EMap<String, String> getArguments();

} // RegistryTask
