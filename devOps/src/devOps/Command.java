/**
 */
package devOps;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devOps.Command#getCmd <em>Cmd</em>}</li>
 * </ul>
 *
 * @see devOps.DevOpsPackage#getCommand()
 * @model
 * @generated
 */
public interface Command extends Step {
	/**
	 * Returns the value of the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmd</em>' attribute.
	 * @see #setCmd(String)
	 * @see devOps.DevOpsPackage#getCommand_Cmd()
	 * @model required="true"
	 * @generated
	 */
	String getCmd();

	/**
	 * Sets the value of the '{@link devOps.Command#getCmd <em>Cmd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmd</em>' attribute.
	 * @see #getCmd()
	 * @generated
	 */
	void setCmd(String value);

} // Command
