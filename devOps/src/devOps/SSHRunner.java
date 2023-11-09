/**
 */
package devOps;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SSH Runner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devOps.SSHRunner#getSshCredentials <em>Ssh Credentials</em>}</li>
 * </ul>
 *
 * @see devOps.DevOpsPackage#getSSHRunner()
 * @model
 * @generated
 */
public interface SSHRunner extends SelfHostedRunner {
	/**
	 * Returns the value of the '<em><b>Ssh Credentials</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssh Credentials</em>' attribute.
	 * @see #setSshCredentials(String)
	 * @see devOps.DevOpsPackage#getSSHRunner_SshCredentials()
	 * @model required="true"
	 * @generated
	 */
	String getSshCredentials();

	/**
	 * Sets the value of the '{@link devOps.SSHRunner#getSshCredentials <em>Ssh Credentials</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssh Credentials</em>' attribute.
	 * @see #getSshCredentials()
	 * @generated
	 */
	void setSshCredentials(String value);

} // SSHRunner
