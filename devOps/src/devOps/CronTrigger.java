/**
 */
package devOps;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cron Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devOps.CronTrigger#getHours <em>Hours</em>}</li>
 *   <li>{@link devOps.CronTrigger#getMinutes <em>Minutes</em>}</li>
 *   <li>{@link devOps.CronTrigger#getSeconds <em>Seconds</em>}</li>
 * </ul>
 *
 * @see devOps.DevOpsPackage#getCronTrigger()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PositiveDuration'"
 * @generated
 */
public interface CronTrigger extends Trigger {
	/**
	 * Returns the value of the '<em><b>Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hours</em>' attribute.
	 * @see #setHours(int)
	 * @see devOps.DevOpsPackage#getCronTrigger_Hours()
	 * @model required="true"
	 * @generated
	 */
	int getHours();

	/**
	 * Sets the value of the '{@link devOps.CronTrigger#getHours <em>Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hours</em>' attribute.
	 * @see #getHours()
	 * @generated
	 */
	void setHours(int value);

	/**
	 * Returns the value of the '<em><b>Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minutes</em>' attribute.
	 * @see #setMinutes(int)
	 * @see devOps.DevOpsPackage#getCronTrigger_Minutes()
	 * @model required="true"
	 * @generated
	 */
	int getMinutes();

	/**
	 * Sets the value of the '{@link devOps.CronTrigger#getMinutes <em>Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minutes</em>' attribute.
	 * @see #getMinutes()
	 * @generated
	 */
	void setMinutes(int value);

	/**
	 * Returns the value of the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seconds</em>' attribute.
	 * @see #setSeconds(int)
	 * @see devOps.DevOpsPackage#getCronTrigger_Seconds()
	 * @model required="true"
	 * @generated
	 */
	int getSeconds();

	/**
	 * Sets the value of the '{@link devOps.CronTrigger#getSeconds <em>Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seconds</em>' attribute.
	 * @see #getSeconds()
	 * @generated
	 */
	void setSeconds(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hours &gt; 0 or self.minutes &gt; 0 or self.seconds &gt; 0'"
	 * @generated
	 */
	boolean PositiveDuration(DiagnosticChain diagnostics, Map<Object, Object> context);

} // CronTrigger
