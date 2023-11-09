/**
 */
package devOps;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Conditional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devOps.BinaryConditional#getOperand <em>Operand</em>}</li>
 *   <li>{@link devOps.BinaryConditional#getLogicOperator <em>Logic Operator</em>}</li>
 * </ul>
 *
 * @see devOps.DevOpsPackage#getBinaryConditional()
 * @model
 * @generated
 */
public interface BinaryConditional extends Conditional {
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference list.
	 * The list contents are of type {@link devOps.Operand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference list.
	 * @see devOps.DevOpsPackage#getBinaryConditional_Operand()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<Operand> getOperand();

	/**
	 * Returns the value of the '<em><b>Logic Operator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logic Operator</em>' reference.
	 * @see #setLogicOperator(LogicOperator)
	 * @see devOps.DevOpsPackage#getBinaryConditional_LogicOperator()
	 * @model required="true"
	 * @generated
	 */
	LogicOperator getLogicOperator();

	/**
	 * Sets the value of the '{@link devOps.BinaryConditional#getLogicOperator <em>Logic Operator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logic Operator</em>' reference.
	 * @see #getLogicOperator()
	 * @generated
	 */
	void setLogicOperator(LogicOperator value);

} // BinaryConditional
