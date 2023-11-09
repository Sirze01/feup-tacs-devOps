/**
 */
package devOps;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devOps.RepositoryEvent#getRepository <em>Repository</em>}</li>
 *   <li>{@link devOps.RepositoryEvent#getBranch <em>Branch</em>}</li>
 * </ul>
 *
 * @see devOps.DevOpsPackage#getRepositoryEvent()
 * @model
 * @generated
 */
public interface RepositoryEvent extends Trigger {
	/**
	 * Returns the value of the '<em><b>Repository</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' attribute.
	 * @see #setRepository(String)
	 * @see devOps.DevOpsPackage#getRepositoryEvent_Repository()
	 * @model required="true"
	 * @generated
	 */
	String getRepository();

	/**
	 * Sets the value of the '{@link devOps.RepositoryEvent#getRepository <em>Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' attribute.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(String value);

	/**
	 * Returns the value of the '<em><b>Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch</em>' attribute.
	 * @see #setBranch(String)
	 * @see devOps.DevOpsPackage#getRepositoryEvent_Branch()
	 * @model required="true"
	 * @generated
	 */
	String getBranch();

	/**
	 * Sets the value of the '{@link devOps.RepositoryEvent#getBranch <em>Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch</em>' attribute.
	 * @see #getBranch()
	 * @generated
	 */
	void setBranch(String value);

} // RepositoryEvent
