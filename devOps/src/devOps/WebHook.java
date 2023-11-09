/**
 */
package devOps;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Hook</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devOps.WebHook#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see devOps.DevOpsPackage#getWebHook()
 * @model
 * @generated
 */
public interface WebHook extends Trigger {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see devOps.DevOpsPackage#getWebHook_Body()
	 * @model required="true"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link devOps.WebHook#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

} // WebHook
