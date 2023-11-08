/**
 */
package devOps;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Engine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devOps.ContainerEngine#getImage <em>Image</em>}</li>
 *   <li>{@link devOps.ContainerEngine#getArguments <em>Arguments</em>}</li>
 *   <li>{@link devOps.ContainerEngine#getEntryPoint <em>Entry Point</em>}</li>
 *   <li>{@link devOps.ContainerEngine#getCommand <em>Command</em>}</li>
 * </ul>
 *
 * @see devOps.DevOpsPackage#getContainerEngine()
 * @model
 * @generated
 */
public interface ContainerEngine extends IaaS {
	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see devOps.DevOpsPackage#getContainerEngine_Image()
	 * @model required="true"
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link devOps.ContainerEngine#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' reference list.
	 * The list contents are of type {@link java.util.Map.Entry}<code>&lt;java.lang.String, java.lang.String&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' reference list.
	 * @see devOps.DevOpsPackage#getContainerEngine_Arguments()
	 * @model mapType="devOps.StringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EList<Map.Entry<String, String>> getArguments();

	/**
	 * Returns the value of the '<em><b>Entry Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Point</em>' attribute.
	 * @see #setEntryPoint(String)
	 * @see devOps.DevOpsPackage#getContainerEngine_EntryPoint()
	 * @model
	 * @generated
	 */
	String getEntryPoint();

	/**
	 * Sets the value of the '{@link devOps.ContainerEngine#getEntryPoint <em>Entry Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Point</em>' attribute.
	 * @see #getEntryPoint()
	 * @generated
	 */
	void setEntryPoint(String value);

	/**
	 * Returns the value of the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' attribute.
	 * @see #setCommand(String)
	 * @see devOps.DevOpsPackage#getContainerEngine_Command()
	 * @model
	 * @generated
	 */
	String getCommand();

	/**
	 * Sets the value of the '{@link devOps.ContainerEngine#getCommand <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' attribute.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(String value);

} // ContainerEngine
