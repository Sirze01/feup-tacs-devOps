/**
 */
package devOps.tests;

import devOps.DevOpsFactory;
import devOps.PhoneHomeRunner;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Phone Home Runner</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PhoneHomeRunnerTest extends SelfHostedRunnerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PhoneHomeRunnerTest.class);
	}

	/**
	 * Constructs a new Phone Home Runner test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhoneHomeRunnerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Phone Home Runner test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PhoneHomeRunner getFixture() {
		return (PhoneHomeRunner)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DevOpsFactory.eINSTANCE.createPhoneHomeRunner());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //PhoneHomeRunnerTest
