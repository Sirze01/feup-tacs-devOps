/**
 */
package devOps;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Conditional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devOps.UnaryConditional#getOperand <em>Operand</em>}</li>
 *   <li>{@link devOps.UnaryConditional#isNegated <em>Negated</em>}</li>
 * </ul>
 *
 * @see devOps.DevOpsPackage#getUnaryConditional()
 * @model
 * @generated
 */
public interface UnaryConditional extends Conditional {
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference.
	 * @see #setOperand(Operand)
	 * @see devOps.DevOpsPackage#getUnaryConditional_Operand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Operand getOperand();

	/**
	 * Sets the value of the '{@link devOps.UnaryConditional#getOperand <em>Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' containment reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(Operand value);

	/**
	 * Returns the value of the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negated</em>' attribute.
	 * @see #setNegated(boolean)
	 * @see devOps.DevOpsPackage#getUnaryConditional_Negated()
	 * @model required="true"
	 * @generated
	 */
	boolean isNegated();

	/**
	 * Sets the value of the '{@link devOps.UnaryConditional#isNegated <em>Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negated</em>' attribute.
	 * @see #isNegated()
	 * @generated
	 */
	void setNegated(boolean value);

} // UnaryConditional
