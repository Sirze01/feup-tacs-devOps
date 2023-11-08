/**
 */
package devOps;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Phone Home Runner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devOps.PhoneHomeRunner#getRunnerToken <em>Runner Token</em>}</li>
 * </ul>
 *
 * @see devOps.DevOpsPackage#getPhoneHomeRunner()
 * @model
 * @generated
 */
public interface PhoneHomeRunner extends SelfHostedRunner {
	/**
	 * Returns the value of the '<em><b>Runner Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runner Token</em>' attribute.
	 * @see #setRunnerToken(String)
	 * @see devOps.DevOpsPackage#getPhoneHomeRunner_RunnerToken()
	 * @model required="true"
	 * @generated
	 */
	String getRunnerToken();

	/**
	 * Sets the value of the '{@link devOps.PhoneHomeRunner#getRunnerToken <em>Runner Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runner Token</em>' attribute.
	 * @see #getRunnerToken()
	 * @generated
	 */
	void setRunnerToken(String value);

} // PhoneHomeRunner
