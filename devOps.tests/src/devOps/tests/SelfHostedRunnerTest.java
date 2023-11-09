/**
 */
package devOps.tests;

import devOps.DevOpsFactory;
import devOps.SelfHostedRunner;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Self Hosted Runner</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SelfHostedRunnerTest extends RunnerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SelfHostedRunnerTest.class);
	}

	/**
	 * Constructs a new Self Hosted Runner test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelfHostedRunnerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Self Hosted Runner test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SelfHostedRunner getFixture() {
		return (SelfHostedRunner)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DevOpsFactory.eINSTANCE.createSelfHostedRunner());
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

} //SelfHostedRunnerTest
