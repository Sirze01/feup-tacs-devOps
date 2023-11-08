/**
 */
package devOps;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operating System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devOps.OperatingSystem#getShell <em>Shell</em>}</li>
 * </ul>
 *
 * @see devOps.DevOpsPackage#getOperatingSystem()
 * @model
 * @generated
 */
public interface OperatingSystem extends IaaS {
	/**
	 * Returns the value of the '<em><b>Shell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shell</em>' attribute.
	 * @see #setShell(String)
	 * @see devOps.DevOpsPackage#getOperatingSystem_Shell()
	 * @model
	 * @generated
	 */
	String getShell();

	/**
	 * Sets the value of the '{@link devOps.OperatingSystem#getShell <em>Shell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shell</em>' attribute.
	 * @see #getShell()
	 * @generated
	 */
	void setShell(String value);

} // OperatingSystem
