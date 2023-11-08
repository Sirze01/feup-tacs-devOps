/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /devOps/model/devOps.ecore
 * using:
 *   /devOps/model/devOps.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package devOps;

// import devOps.DevOpsPackage;
// import devOps.DevOpsTables;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.MapTypeId;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * DevOpsTables provides the dispatch tables for the devOps for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class DevOpsTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(DevOpsPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_examples_s_devops_ecore = IdManager.getNsURIPackageId("http://www.example.org/examples/devops.ecore", null, DevOpsPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_BinaryConditional = DevOpsTables.PACKid_http_c_s_s_www_example_org_s_examples_s_devops_ecore.getClassId("BinaryConditional", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = DevOpsTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Conditional = DevOpsTables.PACKid_http_c_s_s_www_example_org_s_examples_s_devops_ecore.getClassId("Conditional", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_CronTrigger = DevOpsTables.PACKid_http_c_s_s_www_example_org_s_examples_s_devops_ecore.getClassId("CronTrigger", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Environment = DevOpsTables.PACKid_http_c_s_s_www_example_org_s_examples_s_devops_ecore.getClassId("Environment", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_LogicOperator = DevOpsTables.PACKid_http_c_s_s_www_example_org_s_examples_s_devops_ecore.getClassId("LogicOperator", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Operand = DevOpsTables.PACKid_http_c_s_s_www_example_org_s_examples_s_devops_ecore.getClassId("Operand", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Pipeline = DevOpsTables.PACKid_http_c_s_s_www_example_org_s_examples_s_devops_ecore.getClassId("Pipeline", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Runner = DevOpsTables.PACKid_http_c_s_s_www_example_org_s_examples_s_devops_ecore.getClassId("Runner", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Stage = DevOpsTables.PACKid_http_c_s_s_www_example_org_s_examples_s_devops_ecore.getClassId("Stage", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Step = DevOpsTables.PACKid_http_c_s_s_www_example_org_s_examples_s_devops_ecore.getClassId("Step", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Task = DevOpsTables.PACKid_http_c_s_s_www_example_org_s_examples_s_devops_ecore.getClassId("Task", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Trigger = DevOpsTables.PACKid_http_c_s_s_www_example_org_s_examples_s_devops_ecore.getClassId("Trigger", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_UnaryConditional = DevOpsTables.PACKid_http_c_s_s_www_example_org_s_examples_s_devops_ecore.getClassId("UnaryConditional", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = DevOpsTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ MapTypeId MAP_PRIMid_String_PRIMid_String = TypeId.MAP.getSpecializedId(TypeId.STRING, TypeId.STRING, false, false);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_BinaryConditional = TypeId.BAG.getSpecializedId(DevOpsTables.CLSSid_BinaryConditional, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Pipeline = TypeId.BAG.getSpecializedId(DevOpsTables.CLSSid_Pipeline, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Stage = TypeId.BAG.getSpecializedId(DevOpsTables.CLSSid_Stage, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Step = TypeId.BAG.getSpecializedId(DevOpsTables.CLSSid_Step, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Task = TypeId.BAG.getSpecializedId(DevOpsTables.CLSSid_Task, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Operand = TypeId.ORDERED_SET.getSpecializedId(DevOpsTables.CLSSid_Operand, true, ValueUtil.integerValueOf(2), ValueUtil.integerValueOf(2));
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Stage = TypeId.ORDERED_SET.getSpecializedId(DevOpsTables.CLSSid_Stage, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Step = TypeId.ORDERED_SET.getSpecializedId(DevOpsTables.CLSSid_Step, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Task = TypeId.ORDERED_SET.getSpecializedId(DevOpsTables.CLSSid_Task, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Task_0 = TypeId.ORDERED_SET.getSpecializedId(DevOpsTables.CLSSid_Task, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Trigger = TypeId.ORDERED_SET.getSpecializedId(DevOpsTables.CLSSid_Trigger, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_Task = TypeId.SEQUENCE.getSpecializedId(DevOpsTables.CLSSid_Task, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Pipeline = TypeId.SET.getSpecializedId(DevOpsTables.CLSSid_Pipeline, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			DevOpsTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DevOpsTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _APITrigger = new EcoreExecutorType(DevOpsPackage.Literals.API_TRIGGER, PACKAGE, 0);
		public static final EcoreExecutorType _BinaryConditional = new EcoreExecutorType(DevOpsPackage.Literals.BINARY_CONDITIONAL, PACKAGE, 0);
		public static final EcoreExecutorType _Conditional = new EcoreExecutorType(DevOpsPackage.Literals.CONDITIONAL, PACKAGE, 0);
		public static final EcoreExecutorType _ContainerEngine = new EcoreExecutorType(DevOpsPackage.Literals.CONTAINER_ENGINE, PACKAGE, 0);
		public static final EcoreExecutorType _CronTrigger = new EcoreExecutorType(DevOpsPackage.Literals.CRON_TRIGGER, PACKAGE, 0);
		public static final EcoreExecutorType _Environment = new EcoreExecutorType(DevOpsPackage.Literals.ENVIRONMENT, PACKAGE, 0);
		public static final EcoreExecutorType _IaaS = new EcoreExecutorType(DevOpsPackage.Literals.IAA_S, PACKAGE, 0);
		public static final EcoreExecutorType _LogicOperator = new EcoreExecutorType(DevOpsPackage.Literals.LOGIC_OPERATOR, PACKAGE, 0);
		public static final EcoreExecutorType _MergeRequest = new EcoreExecutorType(DevOpsPackage.Literals.MERGE_REQUEST, PACKAGE, 0);
		public static final EcoreExecutorType _Operand = new EcoreExecutorType(DevOpsPackage.Literals.OPERAND, PACKAGE, 0);
		public static final EcoreExecutorType _OperatingSystem = new EcoreExecutorType(DevOpsPackage.Literals.OPERATING_SYSTEM, PACKAGE, 0);
		public static final EcoreExecutorType _PhoneHomeRunner = new EcoreExecutorType(DevOpsPackage.Literals.PHONE_HOME_RUNNER, PACKAGE, 0);
		public static final EcoreExecutorType _Pipeline = new EcoreExecutorType(DevOpsPackage.Literals.PIPELINE, PACKAGE, 0);
		public static final EcoreExecutorType _Push = new EcoreExecutorType(DevOpsPackage.Literals.PUSH, PACKAGE, 0);
		public static final EcoreExecutorType _RepositoryEvent = new EcoreExecutorType(DevOpsPackage.Literals.REPOSITORY_EVENT, PACKAGE, 0);
		public static final EcoreExecutorType _Runner = new EcoreExecutorType(DevOpsPackage.Literals.RUNNER, PACKAGE, 0);
		public static final EcoreExecutorType _SSHRunner = new EcoreExecutorType(DevOpsPackage.Literals.SSH_RUNNER, PACKAGE, 0);
		public static final EcoreExecutorType _SelfHostedRunner = new EcoreExecutorType(DevOpsPackage.Literals.SELF_HOSTED_RUNNER, PACKAGE, 0);
		public static final EcoreExecutorType _Stage = new EcoreExecutorType(DevOpsPackage.Literals.STAGE, PACKAGE, 0);
		public static final EcoreExecutorType _Step = new EcoreExecutorType(DevOpsPackage.Literals.STEP, PACKAGE, 0);
		public static final EcoreExecutorType _StringToStringMapEntry = new EcoreExecutorType(DevOpsPackage.Literals.STRING_TO_STRING_MAP_ENTRY, PACKAGE, 0);
		public static final EcoreExecutorType _Task = new EcoreExecutorType(DevOpsPackage.Literals.TASK, PACKAGE, 0);
		public static final EcoreExecutorType _Trigger = new EcoreExecutorType(DevOpsPackage.Literals.TRIGGER, PACKAGE, 0);
		public static final EcoreExecutorType _UnaryConditional = new EcoreExecutorType(DevOpsPackage.Literals.UNARY_CONDITIONAL, PACKAGE, 0);
		public static final EcoreExecutorType _WebHook = new EcoreExecutorType(DevOpsPackage.Literals.WEB_HOOK, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_APITrigger,
			_BinaryConditional,
			_Conditional,
			_ContainerEngine,
			_CronTrigger,
			_Environment,
			_IaaS,
			_LogicOperator,
			_MergeRequest,
			_Operand,
			_OperatingSystem,
			_PhoneHomeRunner,
			_Pipeline,
			_Push,
			_RepositoryEvent,
			_Runner,
			_SSHRunner,
			_SelfHostedRunner,
			_Stage,
			_Step,
			_StringToStringMapEntry,
			_Task,
			_Trigger,
			_UnaryConditional,
			_WebHook
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DevOpsTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _APITrigger__APITrigger = new ExecutorFragment(Types._APITrigger, DevOpsTables.Types._APITrigger);
		private static final ExecutorFragment _APITrigger__OclAny = new ExecutorFragment(Types._APITrigger, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _APITrigger__OclElement = new ExecutorFragment(Types._APITrigger, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _APITrigger__Trigger = new ExecutorFragment(Types._APITrigger, DevOpsTables.Types._Trigger);

		private static final ExecutorFragment _BinaryConditional__BinaryConditional = new ExecutorFragment(Types._BinaryConditional, DevOpsTables.Types._BinaryConditional);
		private static final ExecutorFragment _BinaryConditional__Conditional = new ExecutorFragment(Types._BinaryConditional, DevOpsTables.Types._Conditional);
		private static final ExecutorFragment _BinaryConditional__OclAny = new ExecutorFragment(Types._BinaryConditional, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _BinaryConditional__OclElement = new ExecutorFragment(Types._BinaryConditional, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _BinaryConditional__Operand = new ExecutorFragment(Types._BinaryConditional, DevOpsTables.Types._Operand);

		private static final ExecutorFragment _Conditional__Conditional = new ExecutorFragment(Types._Conditional, DevOpsTables.Types._Conditional);
		private static final ExecutorFragment _Conditional__OclAny = new ExecutorFragment(Types._Conditional, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Conditional__OclElement = new ExecutorFragment(Types._Conditional, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Conditional__Operand = new ExecutorFragment(Types._Conditional, DevOpsTables.Types._Operand);

		private static final ExecutorFragment _ContainerEngine__ContainerEngine = new ExecutorFragment(Types._ContainerEngine, DevOpsTables.Types._ContainerEngine);
		private static final ExecutorFragment _ContainerEngine__IaaS = new ExecutorFragment(Types._ContainerEngine, DevOpsTables.Types._IaaS);
		private static final ExecutorFragment _ContainerEngine__OclAny = new ExecutorFragment(Types._ContainerEngine, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ContainerEngine__OclElement = new ExecutorFragment(Types._ContainerEngine, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ContainerEngine__Runner = new ExecutorFragment(Types._ContainerEngine, DevOpsTables.Types._Runner);

		private static final ExecutorFragment _CronTrigger__CronTrigger = new ExecutorFragment(Types._CronTrigger, DevOpsTables.Types._CronTrigger);
		private static final ExecutorFragment _CronTrigger__OclAny = new ExecutorFragment(Types._CronTrigger, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CronTrigger__OclElement = new ExecutorFragment(Types._CronTrigger, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _CronTrigger__Trigger = new ExecutorFragment(Types._CronTrigger, DevOpsTables.Types._Trigger);

		private static final ExecutorFragment _Environment__Environment = new ExecutorFragment(Types._Environment, DevOpsTables.Types._Environment);
		private static final ExecutorFragment _Environment__OclAny = new ExecutorFragment(Types._Environment, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Environment__OclElement = new ExecutorFragment(Types._Environment, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _IaaS__IaaS = new ExecutorFragment(Types._IaaS, DevOpsTables.Types._IaaS);
		private static final ExecutorFragment _IaaS__OclAny = new ExecutorFragment(Types._IaaS, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _IaaS__OclElement = new ExecutorFragment(Types._IaaS, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _IaaS__Runner = new ExecutorFragment(Types._IaaS, DevOpsTables.Types._Runner);

		private static final ExecutorFragment _LogicOperator__LogicOperator = new ExecutorFragment(Types._LogicOperator, DevOpsTables.Types._LogicOperator);
		private static final ExecutorFragment _LogicOperator__OclAny = new ExecutorFragment(Types._LogicOperator, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _LogicOperator__OclElement = new ExecutorFragment(Types._LogicOperator, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _MergeRequest__MergeRequest = new ExecutorFragment(Types._MergeRequest, DevOpsTables.Types._MergeRequest);
		private static final ExecutorFragment _MergeRequest__OclAny = new ExecutorFragment(Types._MergeRequest, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _MergeRequest__OclElement = new ExecutorFragment(Types._MergeRequest, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _MergeRequest__RepositoryEvent = new ExecutorFragment(Types._MergeRequest, DevOpsTables.Types._RepositoryEvent);
		private static final ExecutorFragment _MergeRequest__Trigger = new ExecutorFragment(Types._MergeRequest, DevOpsTables.Types._Trigger);

		private static final ExecutorFragment _Operand__OclAny = new ExecutorFragment(Types._Operand, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Operand__OclElement = new ExecutorFragment(Types._Operand, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Operand__Operand = new ExecutorFragment(Types._Operand, DevOpsTables.Types._Operand);

		private static final ExecutorFragment _OperatingSystem__IaaS = new ExecutorFragment(Types._OperatingSystem, DevOpsTables.Types._IaaS);
		private static final ExecutorFragment _OperatingSystem__OclAny = new ExecutorFragment(Types._OperatingSystem, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _OperatingSystem__OclElement = new ExecutorFragment(Types._OperatingSystem, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _OperatingSystem__OperatingSystem = new ExecutorFragment(Types._OperatingSystem, DevOpsTables.Types._OperatingSystem);
		private static final ExecutorFragment _OperatingSystem__Runner = new ExecutorFragment(Types._OperatingSystem, DevOpsTables.Types._Runner);

		private static final ExecutorFragment _PhoneHomeRunner__OclAny = new ExecutorFragment(Types._PhoneHomeRunner, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PhoneHomeRunner__OclElement = new ExecutorFragment(Types._PhoneHomeRunner, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PhoneHomeRunner__PhoneHomeRunner = new ExecutorFragment(Types._PhoneHomeRunner, DevOpsTables.Types._PhoneHomeRunner);
		private static final ExecutorFragment _PhoneHomeRunner__Runner = new ExecutorFragment(Types._PhoneHomeRunner, DevOpsTables.Types._Runner);
		private static final ExecutorFragment _PhoneHomeRunner__SelfHostedRunner = new ExecutorFragment(Types._PhoneHomeRunner, DevOpsTables.Types._SelfHostedRunner);

		private static final ExecutorFragment _Pipeline__OclAny = new ExecutorFragment(Types._Pipeline, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Pipeline__OclElement = new ExecutorFragment(Types._Pipeline, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Pipeline__Pipeline = new ExecutorFragment(Types._Pipeline, DevOpsTables.Types._Pipeline);

		private static final ExecutorFragment _Push__OclAny = new ExecutorFragment(Types._Push, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Push__OclElement = new ExecutorFragment(Types._Push, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Push__Push = new ExecutorFragment(Types._Push, DevOpsTables.Types._Push);
		private static final ExecutorFragment _Push__RepositoryEvent = new ExecutorFragment(Types._Push, DevOpsTables.Types._RepositoryEvent);
		private static final ExecutorFragment _Push__Trigger = new ExecutorFragment(Types._Push, DevOpsTables.Types._Trigger);

		private static final ExecutorFragment _RepositoryEvent__OclAny = new ExecutorFragment(Types._RepositoryEvent, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _RepositoryEvent__OclElement = new ExecutorFragment(Types._RepositoryEvent, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _RepositoryEvent__RepositoryEvent = new ExecutorFragment(Types._RepositoryEvent, DevOpsTables.Types._RepositoryEvent);
		private static final ExecutorFragment _RepositoryEvent__Trigger = new ExecutorFragment(Types._RepositoryEvent, DevOpsTables.Types._Trigger);

		private static final ExecutorFragment _Runner__OclAny = new ExecutorFragment(Types._Runner, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Runner__OclElement = new ExecutorFragment(Types._Runner, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Runner__Runner = new ExecutorFragment(Types._Runner, DevOpsTables.Types._Runner);

		private static final ExecutorFragment _SSHRunner__OclAny = new ExecutorFragment(Types._SSHRunner, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SSHRunner__OclElement = new ExecutorFragment(Types._SSHRunner, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SSHRunner__Runner = new ExecutorFragment(Types._SSHRunner, DevOpsTables.Types._Runner);
		private static final ExecutorFragment _SSHRunner__SSHRunner = new ExecutorFragment(Types._SSHRunner, DevOpsTables.Types._SSHRunner);
		private static final ExecutorFragment _SSHRunner__SelfHostedRunner = new ExecutorFragment(Types._SSHRunner, DevOpsTables.Types._SelfHostedRunner);

		private static final ExecutorFragment _SelfHostedRunner__OclAny = new ExecutorFragment(Types._SelfHostedRunner, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SelfHostedRunner__OclElement = new ExecutorFragment(Types._SelfHostedRunner, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SelfHostedRunner__Runner = new ExecutorFragment(Types._SelfHostedRunner, DevOpsTables.Types._Runner);
		private static final ExecutorFragment _SelfHostedRunner__SelfHostedRunner = new ExecutorFragment(Types._SelfHostedRunner, DevOpsTables.Types._SelfHostedRunner);

		private static final ExecutorFragment _Stage__OclAny = new ExecutorFragment(Types._Stage, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Stage__OclElement = new ExecutorFragment(Types._Stage, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Stage__Stage = new ExecutorFragment(Types._Stage, DevOpsTables.Types._Stage);

		private static final ExecutorFragment _Step__OclAny = new ExecutorFragment(Types._Step, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Step__OclElement = new ExecutorFragment(Types._Step, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Step__Step = new ExecutorFragment(Types._Step, DevOpsTables.Types._Step);

		private static final ExecutorFragment _StringToStringMapEntry__OclAny = new ExecutorFragment(Types._StringToStringMapEntry, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _StringToStringMapEntry__OclElement = new ExecutorFragment(Types._StringToStringMapEntry, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _StringToStringMapEntry__StringToStringMapEntry = new ExecutorFragment(Types._StringToStringMapEntry, DevOpsTables.Types._StringToStringMapEntry);

		private static final ExecutorFragment _Task__OclAny = new ExecutorFragment(Types._Task, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Task__OclElement = new ExecutorFragment(Types._Task, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Task__Task = new ExecutorFragment(Types._Task, DevOpsTables.Types._Task);

		private static final ExecutorFragment _Trigger__OclAny = new ExecutorFragment(Types._Trigger, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Trigger__OclElement = new ExecutorFragment(Types._Trigger, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Trigger__Trigger = new ExecutorFragment(Types._Trigger, DevOpsTables.Types._Trigger);

		private static final ExecutorFragment _UnaryConditional__Conditional = new ExecutorFragment(Types._UnaryConditional, DevOpsTables.Types._Conditional);
		private static final ExecutorFragment _UnaryConditional__OclAny = new ExecutorFragment(Types._UnaryConditional, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _UnaryConditional__OclElement = new ExecutorFragment(Types._UnaryConditional, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _UnaryConditional__Operand = new ExecutorFragment(Types._UnaryConditional, DevOpsTables.Types._Operand);
		private static final ExecutorFragment _UnaryConditional__UnaryConditional = new ExecutorFragment(Types._UnaryConditional, DevOpsTables.Types._UnaryConditional);

		private static final ExecutorFragment _WebHook__OclAny = new ExecutorFragment(Types._WebHook, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _WebHook__OclElement = new ExecutorFragment(Types._WebHook, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _WebHook__Trigger = new ExecutorFragment(Types._WebHook, DevOpsTables.Types._Trigger);
		private static final ExecutorFragment _WebHook__WebHook = new ExecutorFragment(Types._WebHook, DevOpsTables.Types._WebHook);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DevOpsTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DevOpsTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DevOpsTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}


		public static final ExecutorProperty _BinaryConditional__logicOperator = new EcoreExecutorProperty(DevOpsPackage.Literals.BINARY_CONDITIONAL__LOGIC_OPERATOR, Types._BinaryConditional, 0);
		public static final ExecutorProperty _BinaryConditional__operand = new EcoreExecutorProperty(DevOpsPackage.Literals.BINARY_CONDITIONAL__OPERAND, Types._BinaryConditional, 1);

		public static final ExecutorProperty _Conditional__Stage__conditional = new ExecutorPropertyWithImplementation("Stage", Types._Conditional, 0, new EcoreLibraryOppositeProperty(DevOpsPackage.Literals.STAGE__CONDITIONAL));
		public static final ExecutorProperty _Conditional__Step__conditional = new ExecutorPropertyWithImplementation("Step", Types._Conditional, 1, new EcoreLibraryOppositeProperty(DevOpsPackage.Literals.STEP__CONDITIONAL));
		public static final ExecutorProperty _Conditional__Task__conditional = new ExecutorPropertyWithImplementation("Task", Types._Conditional, 2, new EcoreLibraryOppositeProperty(DevOpsPackage.Literals.TASK__CONDITIONAL));

		public static final ExecutorProperty _ContainerEngine__arguments = new EcoreExecutorProperty(DevOpsPackage.Literals.CONTAINER_ENGINE__ARGUMENTS, Types._ContainerEngine, 0);
		public static final ExecutorProperty _ContainerEngine__command = new EcoreExecutorProperty(DevOpsPackage.Literals.CONTAINER_ENGINE__COMMAND, Types._ContainerEngine, 1);
		public static final ExecutorProperty _ContainerEngine__entryPoint = new EcoreExecutorProperty(DevOpsPackage.Literals.CONTAINER_ENGINE__ENTRY_POINT, Types._ContainerEngine, 2);
		public static final ExecutorProperty _ContainerEngine__image = new EcoreExecutorProperty(DevOpsPackage.Literals.CONTAINER_ENGINE__IMAGE, Types._ContainerEngine, 3);

		public static final ExecutorProperty _CronTrigger__hours = new EcoreExecutorProperty(DevOpsPackage.Literals.CRON_TRIGGER__HOURS, Types._CronTrigger, 0);
		public static final ExecutorProperty _CronTrigger__minutes = new EcoreExecutorProperty(DevOpsPackage.Literals.CRON_TRIGGER__MINUTES, Types._CronTrigger, 1);
		public static final ExecutorProperty _CronTrigger__seconds = new EcoreExecutorProperty(DevOpsPackage.Literals.CRON_TRIGGER__SECONDS, Types._CronTrigger, 2);

		public static final ExecutorProperty _Environment__artifacts = new EcoreExecutorProperty(DevOpsPackage.Literals.ENVIRONMENT__ARTIFACTS, Types._Environment, 0);
		public static final ExecutorProperty _Environment__secrets = new EcoreExecutorProperty(DevOpsPackage.Literals.ENVIRONMENT__SECRETS, Types._Environment, 1);
		public static final ExecutorProperty _Environment__variables = new EcoreExecutorProperty(DevOpsPackage.Literals.ENVIRONMENT__VARIABLES, Types._Environment, 2);
		public static final ExecutorProperty _Environment__Pipeline__environment = new ExecutorPropertyWithImplementation("Pipeline", Types._Environment, 3, new EcoreLibraryOppositeProperty(DevOpsPackage.Literals.PIPELINE__ENVIRONMENT));
		public static final ExecutorProperty _Environment__Task__environment = new ExecutorPropertyWithImplementation("Task", Types._Environment, 4, new EcoreLibraryOppositeProperty(DevOpsPackage.Literals.TASK__ENVIRONMENT));

		public static final ExecutorProperty _LogicOperator__BinaryConditional__logicOperator = new ExecutorPropertyWithImplementation("BinaryConditional", Types._LogicOperator, 0, new EcoreLibraryOppositeProperty(DevOpsPackage.Literals.BINARY_CONDITIONAL__LOGIC_OPERATOR));

		public static final ExecutorProperty _Operand__BinaryConditional__operand = new ExecutorPropertyWithImplementation("BinaryConditional", Types._Operand, 0, new EcoreLibraryOppositeProperty(DevOpsPackage.Literals.BINARY_CONDITIONAL__OPERAND));
		public static final ExecutorProperty _Operand__UnaryConditional__operand = new ExecutorPropertyWithImplementation("UnaryConditional", Types._Operand, 1, new EcoreLibraryOppositeProperty(DevOpsPackage.Literals.UNARY_CONDITIONAL__OPERAND));

		public static final ExecutorProperty _OperatingSystem__shell = new EcoreExecutorProperty(DevOpsPackage.Literals.OPERATING_SYSTEM__SHELL, Types._OperatingSystem, 0);

		public static final ExecutorProperty _PhoneHomeRunner__runnerToken = new EcoreExecutorProperty(DevOpsPackage.Literals.PHONE_HOME_RUNNER__RUNNER_TOKEN, Types._PhoneHomeRunner, 0);

		public static final ExecutorProperty _Pipeline__environment = new EcoreExecutorProperty(DevOpsPackage.Literals.PIPELINE__ENVIRONMENT, Types._Pipeline, 0);
		public static final ExecutorProperty _Pipeline__name = new EcoreExecutorProperty(DevOpsPackage.Literals.PIPELINE__NAME, Types._Pipeline, 1);
		public static final ExecutorProperty _Pipeline__runner = new EcoreExecutorProperty(DevOpsPackage.Literals.PIPELINE__RUNNER, Types._Pipeline, 2);
		public static final ExecutorProperty _Pipeline__stages = new EcoreExecutorProperty(DevOpsPackage.Literals.PIPELINE__STAGES, Types._Pipeline, 3);
		public static final ExecutorProperty _Pipeline__triggers = new EcoreExecutorProperty(DevOpsPackage.Literals.PIPELINE__TRIGGERS, Types._Pipeline, 4);

		public static final ExecutorProperty _RepositoryEvent__branch = new EcoreExecutorProperty(DevOpsPackage.Literals.REPOSITORY_EVENT__BRANCH, Types._RepositoryEvent, 0);
		public static final ExecutorProperty _RepositoryEvent__repository = new EcoreExecutorProperty(DevOpsPackage.Literals.REPOSITORY_EVENT__REPOSITORY, Types._RepositoryEvent, 1);

		public static final ExecutorProperty _Runner__Pipeline__runner = new ExecutorPropertyWithImplementation("Pipeline", Types._Runner, 0, new EcoreLibraryOppositeProperty(DevOpsPackage.Literals.PIPELINE__RUNNER));
		public static final ExecutorProperty _Runner__Task__runner = new ExecutorPropertyWithImplementation("Task", Types._Runner, 1, new EcoreLibraryOppositeProperty(DevOpsPackage.Literals.TASK__RUNNER));

		public static final ExecutorProperty _SSHRunner__sshCredentials = new EcoreExecutorProperty(DevOpsPackage.Literals.SSH_RUNNER__SSH_CREDENTIALS, Types._SSHRunner, 0);

		public static final ExecutorProperty _Stage__conditional = new EcoreExecutorProperty(DevOpsPackage.Literals.STAGE__CONDITIONAL, Types._Stage, 0);
		public static final ExecutorProperty _Stage__tasks = new EcoreExecutorProperty(DevOpsPackage.Literals.STAGE__TASKS, Types._Stage, 1);
		public static final ExecutorProperty _Stage__Pipeline__stages = new ExecutorPropertyWithImplementation("Pipeline", Types._Stage, 2, new EcoreLibraryOppositeProperty(DevOpsPackage.Literals.PIPELINE__STAGES));

		public static final ExecutorProperty _Step__cmd = new EcoreExecutorProperty(DevOpsPackage.Literals.STEP__CMD, Types._Step, 0);
		public static final ExecutorProperty _Step__conditional = new EcoreExecutorProperty(DevOpsPackage.Literals.STEP__CONDITIONAL, Types._Step, 1);
		public static final ExecutorProperty _Step__Task__step = new ExecutorPropertyWithImplementation("Task", Types._Step, 2, new EcoreLibraryOppositeProperty(DevOpsPackage.Literals.TASK__STEP));

		public static final ExecutorProperty _StringToStringMapEntry__key = new EcoreExecutorProperty(DevOpsPackage.Literals.STRING_TO_STRING_MAP_ENTRY__KEY, Types._StringToStringMapEntry, 0);
		public static final ExecutorProperty _StringToStringMapEntry__value = new EcoreExecutorProperty(DevOpsPackage.Literals.STRING_TO_STRING_MAP_ENTRY__VALUE, Types._StringToStringMapEntry, 1);

		public static final ExecutorProperty _Task__allowFailure = new EcoreExecutorProperty(DevOpsPackage.Literals.TASK__ALLOW_FAILURE, Types._Task, 0);
		public static final ExecutorProperty _Task__conditional = new EcoreExecutorProperty(DevOpsPackage.Literals.TASK__CONDITIONAL, Types._Task, 1);
		public static final ExecutorProperty _Task__environment = new EcoreExecutorProperty(DevOpsPackage.Literals.TASK__ENVIRONMENT, Types._Task, 2);
		public static final ExecutorProperty _Task__name = new EcoreExecutorProperty(DevOpsPackage.Literals.TASK__NAME, Types._Task, 3);
		public static final ExecutorProperty _Task__runner = new EcoreExecutorProperty(DevOpsPackage.Literals.TASK__RUNNER, Types._Task, 4);
		public static final ExecutorProperty _Task__step = new EcoreExecutorProperty(DevOpsPackage.Literals.TASK__STEP, Types._Task, 5);
		public static final ExecutorProperty _Task__taskImports = new EcoreExecutorProperty(DevOpsPackage.Literals.TASK__TASK_IMPORTS, Types._Task, 6);
		public static final ExecutorProperty _Task__Stage__tasks = new ExecutorPropertyWithImplementation("Stage", Types._Task, 7, new EcoreLibraryOppositeProperty(DevOpsPackage.Literals.STAGE__TASKS));
		public static final ExecutorProperty _Task__Task__taskImports = new ExecutorPropertyWithImplementation("Task", Types._Task, 8, new EcoreLibraryOppositeProperty(DevOpsPackage.Literals.TASK__TASK_IMPORTS));

		public static final ExecutorProperty _Trigger__Pipeline__triggers = new ExecutorPropertyWithImplementation("Pipeline", Types._Trigger, 0, new EcoreLibraryOppositeProperty(DevOpsPackage.Literals.PIPELINE__TRIGGERS));

		public static final ExecutorProperty _UnaryConditional__negated = new EcoreExecutorProperty(DevOpsPackage.Literals.UNARY_CONDITIONAL__NEGATED, Types._UnaryConditional, 0);
		public static final ExecutorProperty _UnaryConditional__operand = new EcoreExecutorProperty(DevOpsPackage.Literals.UNARY_CONDITIONAL__OPERAND, Types._UnaryConditional, 1);

		public static final ExecutorProperty _WebHook__body = new EcoreExecutorProperty(DevOpsPackage.Literals.WEB_HOOK__BODY, Types._WebHook, 0);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DevOpsTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _APITrigger =
			{
				Fragments._APITrigger__OclAny /* 0 */,
				Fragments._APITrigger__OclElement /* 1 */,
				Fragments._APITrigger__Trigger /* 2 */,
				Fragments._APITrigger__APITrigger /* 3 */
			};
		private static final int /*@NonNull*/ [] __APITrigger = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _BinaryConditional =
			{
				Fragments._BinaryConditional__OclAny /* 0 */,
				Fragments._BinaryConditional__OclElement /* 1 */,
				Fragments._BinaryConditional__Operand /* 2 */,
				Fragments._BinaryConditional__Conditional /* 3 */,
				Fragments._BinaryConditional__BinaryConditional /* 4 */
			};
		private static final int /*@NonNull*/ [] __BinaryConditional = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Conditional =
			{
				Fragments._Conditional__OclAny /* 0 */,
				Fragments._Conditional__OclElement /* 1 */,
				Fragments._Conditional__Operand /* 2 */,
				Fragments._Conditional__Conditional /* 3 */
			};
		private static final int /*@NonNull*/ [] __Conditional = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ContainerEngine =
			{
				Fragments._ContainerEngine__OclAny /* 0 */,
				Fragments._ContainerEngine__OclElement /* 1 */,
				Fragments._ContainerEngine__Runner /* 2 */,
				Fragments._ContainerEngine__IaaS /* 3 */,
				Fragments._ContainerEngine__ContainerEngine /* 4 */
			};
		private static final int /*@NonNull*/ [] __ContainerEngine = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CronTrigger =
			{
				Fragments._CronTrigger__OclAny /* 0 */,
				Fragments._CronTrigger__OclElement /* 1 */,
				Fragments._CronTrigger__Trigger /* 2 */,
				Fragments._CronTrigger__CronTrigger /* 3 */
			};
		private static final int /*@NonNull*/ [] __CronTrigger = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Environment =
			{
				Fragments._Environment__OclAny /* 0 */,
				Fragments._Environment__OclElement /* 1 */,
				Fragments._Environment__Environment /* 2 */
			};
		private static final int /*@NonNull*/ [] __Environment = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _IaaS =
			{
				Fragments._IaaS__OclAny /* 0 */,
				Fragments._IaaS__OclElement /* 1 */,
				Fragments._IaaS__Runner /* 2 */,
				Fragments._IaaS__IaaS /* 3 */
			};
		private static final int /*@NonNull*/ [] __IaaS = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _LogicOperator =
			{
				Fragments._LogicOperator__OclAny /* 0 */,
				Fragments._LogicOperator__OclElement /* 1 */,
				Fragments._LogicOperator__LogicOperator /* 2 */
			};
		private static final int /*@NonNull*/ [] __LogicOperator = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _MergeRequest =
			{
				Fragments._MergeRequest__OclAny /* 0 */,
				Fragments._MergeRequest__OclElement /* 1 */,
				Fragments._MergeRequest__Trigger /* 2 */,
				Fragments._MergeRequest__RepositoryEvent /* 3 */,
				Fragments._MergeRequest__MergeRequest /* 4 */
			};
		private static final int /*@NonNull*/ [] __MergeRequest = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Operand =
			{
				Fragments._Operand__OclAny /* 0 */,
				Fragments._Operand__OclElement /* 1 */,
				Fragments._Operand__Operand /* 2 */
			};
		private static final int /*@NonNull*/ [] __Operand = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _OperatingSystem =
			{
				Fragments._OperatingSystem__OclAny /* 0 */,
				Fragments._OperatingSystem__OclElement /* 1 */,
				Fragments._OperatingSystem__Runner /* 2 */,
				Fragments._OperatingSystem__IaaS /* 3 */,
				Fragments._OperatingSystem__OperatingSystem /* 4 */
			};
		private static final int /*@NonNull*/ [] __OperatingSystem = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PhoneHomeRunner =
			{
				Fragments._PhoneHomeRunner__OclAny /* 0 */,
				Fragments._PhoneHomeRunner__OclElement /* 1 */,
				Fragments._PhoneHomeRunner__Runner /* 2 */,
				Fragments._PhoneHomeRunner__SelfHostedRunner /* 3 */,
				Fragments._PhoneHomeRunner__PhoneHomeRunner /* 4 */
			};
		private static final int /*@NonNull*/ [] __PhoneHomeRunner = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Pipeline =
			{
				Fragments._Pipeline__OclAny /* 0 */,
				Fragments._Pipeline__OclElement /* 1 */,
				Fragments._Pipeline__Pipeline /* 2 */
			};
		private static final int /*@NonNull*/ [] __Pipeline = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Push =
			{
				Fragments._Push__OclAny /* 0 */,
				Fragments._Push__OclElement /* 1 */,
				Fragments._Push__Trigger /* 2 */,
				Fragments._Push__RepositoryEvent /* 3 */,
				Fragments._Push__Push /* 4 */
			};
		private static final int /*@NonNull*/ [] __Push = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _RepositoryEvent =
			{
				Fragments._RepositoryEvent__OclAny /* 0 */,
				Fragments._RepositoryEvent__OclElement /* 1 */,
				Fragments._RepositoryEvent__Trigger /* 2 */,
				Fragments._RepositoryEvent__RepositoryEvent /* 3 */
			};
		private static final int /*@NonNull*/ [] __RepositoryEvent = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Runner =
			{
				Fragments._Runner__OclAny /* 0 */,
				Fragments._Runner__OclElement /* 1 */,
				Fragments._Runner__Runner /* 2 */
			};
		private static final int /*@NonNull*/ [] __Runner = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SSHRunner =
			{
				Fragments._SSHRunner__OclAny /* 0 */,
				Fragments._SSHRunner__OclElement /* 1 */,
				Fragments._SSHRunner__Runner /* 2 */,
				Fragments._SSHRunner__SelfHostedRunner /* 3 */,
				Fragments._SSHRunner__SSHRunner /* 4 */
			};
		private static final int /*@NonNull*/ [] __SSHRunner = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SelfHostedRunner =
			{
				Fragments._SelfHostedRunner__OclAny /* 0 */,
				Fragments._SelfHostedRunner__OclElement /* 1 */,
				Fragments._SelfHostedRunner__Runner /* 2 */,
				Fragments._SelfHostedRunner__SelfHostedRunner /* 3 */
			};
		private static final int /*@NonNull*/ [] __SelfHostedRunner = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Stage =
			{
				Fragments._Stage__OclAny /* 0 */,
				Fragments._Stage__OclElement /* 1 */,
				Fragments._Stage__Stage /* 2 */
			};
		private static final int /*@NonNull*/ [] __Stage = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Step =
			{
				Fragments._Step__OclAny /* 0 */,
				Fragments._Step__OclElement /* 1 */,
				Fragments._Step__Step /* 2 */
			};
		private static final int /*@NonNull*/ [] __Step = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _StringToStringMapEntry =
			{
				Fragments._StringToStringMapEntry__OclAny /* 0 */,
				Fragments._StringToStringMapEntry__OclElement /* 1 */,
				Fragments._StringToStringMapEntry__StringToStringMapEntry /* 2 */
			};
		private static final int /*@NonNull*/ [] __StringToStringMapEntry = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Task =
			{
				Fragments._Task__OclAny /* 0 */,
				Fragments._Task__OclElement /* 1 */,
				Fragments._Task__Task /* 2 */
			};
		private static final int /*@NonNull*/ [] __Task = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Trigger =
			{
				Fragments._Trigger__OclAny /* 0 */,
				Fragments._Trigger__OclElement /* 1 */,
				Fragments._Trigger__Trigger /* 2 */
			};
		private static final int /*@NonNull*/ [] __Trigger = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _UnaryConditional =
			{
				Fragments._UnaryConditional__OclAny /* 0 */,
				Fragments._UnaryConditional__OclElement /* 1 */,
				Fragments._UnaryConditional__Operand /* 2 */,
				Fragments._UnaryConditional__Conditional /* 3 */,
				Fragments._UnaryConditional__UnaryConditional /* 4 */
			};
		private static final int /*@NonNull*/ [] __UnaryConditional = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _WebHook =
			{
				Fragments._WebHook__OclAny /* 0 */,
				Fragments._WebHook__OclElement /* 1 */,
				Fragments._WebHook__Trigger /* 2 */,
				Fragments._WebHook__WebHook /* 3 */
			};
		private static final int /*@NonNull*/ [] __WebHook = { 1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._APITrigger.initFragments(_APITrigger, __APITrigger);
			Types._BinaryConditional.initFragments(_BinaryConditional, __BinaryConditional);
			Types._Conditional.initFragments(_Conditional, __Conditional);
			Types._ContainerEngine.initFragments(_ContainerEngine, __ContainerEngine);
			Types._CronTrigger.initFragments(_CronTrigger, __CronTrigger);
			Types._Environment.initFragments(_Environment, __Environment);
			Types._IaaS.initFragments(_IaaS, __IaaS);
			Types._LogicOperator.initFragments(_LogicOperator, __LogicOperator);
			Types._MergeRequest.initFragments(_MergeRequest, __MergeRequest);
			Types._Operand.initFragments(_Operand, __Operand);
			Types._OperatingSystem.initFragments(_OperatingSystem, __OperatingSystem);
			Types._PhoneHomeRunner.initFragments(_PhoneHomeRunner, __PhoneHomeRunner);
			Types._Pipeline.initFragments(_Pipeline, __Pipeline);
			Types._Push.initFragments(_Push, __Push);
			Types._RepositoryEvent.initFragments(_RepositoryEvent, __RepositoryEvent);
			Types._Runner.initFragments(_Runner, __Runner);
			Types._SSHRunner.initFragments(_SSHRunner, __SSHRunner);
			Types._SelfHostedRunner.initFragments(_SelfHostedRunner, __SelfHostedRunner);
			Types._Stage.initFragments(_Stage, __Stage);
			Types._Step.initFragments(_Step, __Step);
			Types._StringToStringMapEntry.initFragments(_StringToStringMapEntry, __StringToStringMapEntry);
			Types._Task.initFragments(_Task, __Task);
			Types._Trigger.initFragments(_Trigger, __Trigger);
			Types._UnaryConditional.initFragments(_UnaryConditional, __UnaryConditional);
			Types._WebHook.initFragments(_WebHook, __WebHook);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DevOpsTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _APITrigger__APITrigger = {};
		private static final ExecutorOperation /*@NonNull*/ [] _APITrigger__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _APITrigger__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _APITrigger__Trigger = {};

		private static final ExecutorOperation /*@NonNull*/ [] _BinaryConditional__BinaryConditional = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BinaryConditional__Conditional = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BinaryConditional__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BinaryConditional__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BinaryConditional__Operand = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Conditional__Conditional = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Conditional__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Conditional__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Conditional__Operand = {};

		private static final ExecutorOperation /*@NonNull*/ [] _ContainerEngine__ContainerEngine = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ContainerEngine__IaaS = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ContainerEngine__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ContainerEngine__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ContainerEngine__Runner = {};

		private static final ExecutorOperation /*@NonNull*/ [] _CronTrigger__CronTrigger = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CronTrigger__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CronTrigger__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CronTrigger__Trigger = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Environment__Environment = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Environment__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Environment__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _IaaS__IaaS = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IaaS__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _IaaS__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _IaaS__Runner = {};

		private static final ExecutorOperation /*@NonNull*/ [] _LogicOperator__LogicOperator = {};
		private static final ExecutorOperation /*@NonNull*/ [] _LogicOperator__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LogicOperator__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _MergeRequest__MergeRequest = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MergeRequest__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MergeRequest__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MergeRequest__RepositoryEvent = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MergeRequest__Trigger = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Operand__Operand = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Operand__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Operand__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _OperatingSystem__OperatingSystem = {};
		private static final ExecutorOperation /*@NonNull*/ [] _OperatingSystem__IaaS = {};
		private static final ExecutorOperation /*@NonNull*/ [] _OperatingSystem__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _OperatingSystem__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _OperatingSystem__Runner = {};

		private static final ExecutorOperation /*@NonNull*/ [] _PhoneHomeRunner__PhoneHomeRunner = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PhoneHomeRunner__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PhoneHomeRunner__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PhoneHomeRunner__Runner = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PhoneHomeRunner__SelfHostedRunner = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Pipeline__Pipeline = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Pipeline__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Pipeline__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Push__Push = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Push__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Push__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Push__RepositoryEvent = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Push__Trigger = {};

		private static final ExecutorOperation /*@NonNull*/ [] _RepositoryEvent__RepositoryEvent = {};
		private static final ExecutorOperation /*@NonNull*/ [] _RepositoryEvent__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _RepositoryEvent__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _RepositoryEvent__Trigger = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Runner__Runner = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Runner__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Runner__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _SSHRunner__SSHRunner = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SSHRunner__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SSHRunner__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SSHRunner__Runner = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SSHRunner__SelfHostedRunner = {};

		private static final ExecutorOperation /*@NonNull*/ [] _SelfHostedRunner__SelfHostedRunner = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SelfHostedRunner__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SelfHostedRunner__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SelfHostedRunner__Runner = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Stage__Stage = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Stage__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Stage__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Step__Step = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Step__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Step__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _StringToStringMapEntry__StringToStringMapEntry = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StringToStringMapEntry__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StringToStringMapEntry__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Task__Task = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Task__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Task__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Trigger__Trigger = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Trigger__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Trigger__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _UnaryConditional__UnaryConditional = {};
		private static final ExecutorOperation /*@NonNull*/ [] _UnaryConditional__Conditional = {};
		private static final ExecutorOperation /*@NonNull*/ [] _UnaryConditional__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _UnaryConditional__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _UnaryConditional__Operand = {};

		private static final ExecutorOperation /*@NonNull*/ [] _WebHook__WebHook = {};
		private static final ExecutorOperation /*@NonNull*/ [] _WebHook__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _WebHook__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _WebHook__Trigger = {};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._APITrigger__APITrigger.initOperations(_APITrigger__APITrigger);
			Fragments._APITrigger__OclAny.initOperations(_APITrigger__OclAny);
			Fragments._APITrigger__OclElement.initOperations(_APITrigger__OclElement);
			Fragments._APITrigger__Trigger.initOperations(_APITrigger__Trigger);

			Fragments._BinaryConditional__BinaryConditional.initOperations(_BinaryConditional__BinaryConditional);
			Fragments._BinaryConditional__Conditional.initOperations(_BinaryConditional__Conditional);
			Fragments._BinaryConditional__OclAny.initOperations(_BinaryConditional__OclAny);
			Fragments._BinaryConditional__OclElement.initOperations(_BinaryConditional__OclElement);
			Fragments._BinaryConditional__Operand.initOperations(_BinaryConditional__Operand);

			Fragments._Conditional__Conditional.initOperations(_Conditional__Conditional);
			Fragments._Conditional__OclAny.initOperations(_Conditional__OclAny);
			Fragments._Conditional__OclElement.initOperations(_Conditional__OclElement);
			Fragments._Conditional__Operand.initOperations(_Conditional__Operand);

			Fragments._ContainerEngine__ContainerEngine.initOperations(_ContainerEngine__ContainerEngine);
			Fragments._ContainerEngine__IaaS.initOperations(_ContainerEngine__IaaS);
			Fragments._ContainerEngine__OclAny.initOperations(_ContainerEngine__OclAny);
			Fragments._ContainerEngine__OclElement.initOperations(_ContainerEngine__OclElement);
			Fragments._ContainerEngine__Runner.initOperations(_ContainerEngine__Runner);

			Fragments._CronTrigger__CronTrigger.initOperations(_CronTrigger__CronTrigger);
			Fragments._CronTrigger__OclAny.initOperations(_CronTrigger__OclAny);
			Fragments._CronTrigger__OclElement.initOperations(_CronTrigger__OclElement);
			Fragments._CronTrigger__Trigger.initOperations(_CronTrigger__Trigger);

			Fragments._Environment__Environment.initOperations(_Environment__Environment);
			Fragments._Environment__OclAny.initOperations(_Environment__OclAny);
			Fragments._Environment__OclElement.initOperations(_Environment__OclElement);

			Fragments._IaaS__IaaS.initOperations(_IaaS__IaaS);
			Fragments._IaaS__OclAny.initOperations(_IaaS__OclAny);
			Fragments._IaaS__OclElement.initOperations(_IaaS__OclElement);
			Fragments._IaaS__Runner.initOperations(_IaaS__Runner);

			Fragments._LogicOperator__LogicOperator.initOperations(_LogicOperator__LogicOperator);
			Fragments._LogicOperator__OclAny.initOperations(_LogicOperator__OclAny);
			Fragments._LogicOperator__OclElement.initOperations(_LogicOperator__OclElement);

			Fragments._MergeRequest__MergeRequest.initOperations(_MergeRequest__MergeRequest);
			Fragments._MergeRequest__OclAny.initOperations(_MergeRequest__OclAny);
			Fragments._MergeRequest__OclElement.initOperations(_MergeRequest__OclElement);
			Fragments._MergeRequest__RepositoryEvent.initOperations(_MergeRequest__RepositoryEvent);
			Fragments._MergeRequest__Trigger.initOperations(_MergeRequest__Trigger);

			Fragments._Operand__OclAny.initOperations(_Operand__OclAny);
			Fragments._Operand__OclElement.initOperations(_Operand__OclElement);
			Fragments._Operand__Operand.initOperations(_Operand__Operand);

			Fragments._OperatingSystem__IaaS.initOperations(_OperatingSystem__IaaS);
			Fragments._OperatingSystem__OclAny.initOperations(_OperatingSystem__OclAny);
			Fragments._OperatingSystem__OclElement.initOperations(_OperatingSystem__OclElement);
			Fragments._OperatingSystem__OperatingSystem.initOperations(_OperatingSystem__OperatingSystem);
			Fragments._OperatingSystem__Runner.initOperations(_OperatingSystem__Runner);

			Fragments._PhoneHomeRunner__OclAny.initOperations(_PhoneHomeRunner__OclAny);
			Fragments._PhoneHomeRunner__OclElement.initOperations(_PhoneHomeRunner__OclElement);
			Fragments._PhoneHomeRunner__PhoneHomeRunner.initOperations(_PhoneHomeRunner__PhoneHomeRunner);
			Fragments._PhoneHomeRunner__Runner.initOperations(_PhoneHomeRunner__Runner);
			Fragments._PhoneHomeRunner__SelfHostedRunner.initOperations(_PhoneHomeRunner__SelfHostedRunner);

			Fragments._Pipeline__OclAny.initOperations(_Pipeline__OclAny);
			Fragments._Pipeline__OclElement.initOperations(_Pipeline__OclElement);
			Fragments._Pipeline__Pipeline.initOperations(_Pipeline__Pipeline);

			Fragments._Push__OclAny.initOperations(_Push__OclAny);
			Fragments._Push__OclElement.initOperations(_Push__OclElement);
			Fragments._Push__Push.initOperations(_Push__Push);
			Fragments._Push__RepositoryEvent.initOperations(_Push__RepositoryEvent);
			Fragments._Push__Trigger.initOperations(_Push__Trigger);

			Fragments._RepositoryEvent__OclAny.initOperations(_RepositoryEvent__OclAny);
			Fragments._RepositoryEvent__OclElement.initOperations(_RepositoryEvent__OclElement);
			Fragments._RepositoryEvent__RepositoryEvent.initOperations(_RepositoryEvent__RepositoryEvent);
			Fragments._RepositoryEvent__Trigger.initOperations(_RepositoryEvent__Trigger);

			Fragments._Runner__OclAny.initOperations(_Runner__OclAny);
			Fragments._Runner__OclElement.initOperations(_Runner__OclElement);
			Fragments._Runner__Runner.initOperations(_Runner__Runner);

			Fragments._SSHRunner__OclAny.initOperations(_SSHRunner__OclAny);
			Fragments._SSHRunner__OclElement.initOperations(_SSHRunner__OclElement);
			Fragments._SSHRunner__Runner.initOperations(_SSHRunner__Runner);
			Fragments._SSHRunner__SSHRunner.initOperations(_SSHRunner__SSHRunner);
			Fragments._SSHRunner__SelfHostedRunner.initOperations(_SSHRunner__SelfHostedRunner);

			Fragments._SelfHostedRunner__OclAny.initOperations(_SelfHostedRunner__OclAny);
			Fragments._SelfHostedRunner__OclElement.initOperations(_SelfHostedRunner__OclElement);
			Fragments._SelfHostedRunner__Runner.initOperations(_SelfHostedRunner__Runner);
			Fragments._SelfHostedRunner__SelfHostedRunner.initOperations(_SelfHostedRunner__SelfHostedRunner);

			Fragments._Stage__OclAny.initOperations(_Stage__OclAny);
			Fragments._Stage__OclElement.initOperations(_Stage__OclElement);
			Fragments._Stage__Stage.initOperations(_Stage__Stage);

			Fragments._Step__OclAny.initOperations(_Step__OclAny);
			Fragments._Step__OclElement.initOperations(_Step__OclElement);
			Fragments._Step__Step.initOperations(_Step__Step);

			Fragments._StringToStringMapEntry__OclAny.initOperations(_StringToStringMapEntry__OclAny);
			Fragments._StringToStringMapEntry__OclElement.initOperations(_StringToStringMapEntry__OclElement);
			Fragments._StringToStringMapEntry__StringToStringMapEntry.initOperations(_StringToStringMapEntry__StringToStringMapEntry);

			Fragments._Task__OclAny.initOperations(_Task__OclAny);
			Fragments._Task__OclElement.initOperations(_Task__OclElement);
			Fragments._Task__Task.initOperations(_Task__Task);

			Fragments._Trigger__OclAny.initOperations(_Trigger__OclAny);
			Fragments._Trigger__OclElement.initOperations(_Trigger__OclElement);
			Fragments._Trigger__Trigger.initOperations(_Trigger__Trigger);

			Fragments._UnaryConditional__Conditional.initOperations(_UnaryConditional__Conditional);
			Fragments._UnaryConditional__OclAny.initOperations(_UnaryConditional__OclAny);
			Fragments._UnaryConditional__OclElement.initOperations(_UnaryConditional__OclElement);
			Fragments._UnaryConditional__Operand.initOperations(_UnaryConditional__Operand);
			Fragments._UnaryConditional__UnaryConditional.initOperations(_UnaryConditional__UnaryConditional);

			Fragments._WebHook__OclAny.initOperations(_WebHook__OclAny);
			Fragments._WebHook__OclElement.initOperations(_WebHook__OclElement);
			Fragments._WebHook__Trigger.initOperations(_WebHook__Trigger);
			Fragments._WebHook__WebHook.initOperations(_WebHook__WebHook);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DevOpsTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _APITrigger = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _BinaryConditional = {
			DevOpsTables.Properties._BinaryConditional__logicOperator,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DevOpsTables.Properties._BinaryConditional__operand
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Conditional = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ContainerEngine = {
			DevOpsTables.Properties._ContainerEngine__arguments,
			DevOpsTables.Properties._ContainerEngine__command,
			DevOpsTables.Properties._ContainerEngine__entryPoint,
			DevOpsTables.Properties._ContainerEngine__image,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CronTrigger = {
			DevOpsTables.Properties._CronTrigger__hours,
			DevOpsTables.Properties._CronTrigger__minutes,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DevOpsTables.Properties._CronTrigger__seconds
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Environment = {
			DevOpsTables.Properties._Environment__artifacts,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DevOpsTables.Properties._Environment__secrets,
			DevOpsTables.Properties._Environment__variables
		};

		private static final ExecutorProperty /*@NonNull*/ [] _IaaS = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _LogicOperator = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _MergeRequest = {
			DevOpsTables.Properties._RepositoryEvent__branch,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DevOpsTables.Properties._RepositoryEvent__repository
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Operand = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _OperatingSystem = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DevOpsTables.Properties._OperatingSystem__shell
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PhoneHomeRunner = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DevOpsTables.Properties._PhoneHomeRunner__runnerToken
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Pipeline = {
			DevOpsTables.Properties._Pipeline__environment,
			DevOpsTables.Properties._Pipeline__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DevOpsTables.Properties._Pipeline__runner,
			DevOpsTables.Properties._Pipeline__stages,
			DevOpsTables.Properties._Pipeline__triggers
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Push = {
			DevOpsTables.Properties._RepositoryEvent__branch,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DevOpsTables.Properties._RepositoryEvent__repository
		};

		private static final ExecutorProperty /*@NonNull*/ [] _RepositoryEvent = {
			DevOpsTables.Properties._RepositoryEvent__branch,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DevOpsTables.Properties._RepositoryEvent__repository
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Runner = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SSHRunner = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DevOpsTables.Properties._SSHRunner__sshCredentials
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SelfHostedRunner = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Stage = {
			DevOpsTables.Properties._Stage__conditional,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DevOpsTables.Properties._Stage__tasks
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Step = {
			DevOpsTables.Properties._Step__cmd,
			DevOpsTables.Properties._Step__conditional,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _StringToStringMapEntry = {
			DevOpsTables.Properties._StringToStringMapEntry__key,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DevOpsTables.Properties._StringToStringMapEntry__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Task = {
			DevOpsTables.Properties._Task__allowFailure,
			DevOpsTables.Properties._Task__conditional,
			DevOpsTables.Properties._Task__environment,
			DevOpsTables.Properties._Task__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DevOpsTables.Properties._Task__runner,
			DevOpsTables.Properties._Task__step,
			DevOpsTables.Properties._Task__taskImports
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Trigger = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _UnaryConditional = {
			DevOpsTables.Properties._UnaryConditional__negated,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DevOpsTables.Properties._UnaryConditional__operand
		};

		private static final ExecutorProperty /*@NonNull*/ [] _WebHook = {
			DevOpsTables.Properties._WebHook__body,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._APITrigger__APITrigger.initProperties(_APITrigger);
			Fragments._BinaryConditional__BinaryConditional.initProperties(_BinaryConditional);
			Fragments._Conditional__Conditional.initProperties(_Conditional);
			Fragments._ContainerEngine__ContainerEngine.initProperties(_ContainerEngine);
			Fragments._CronTrigger__CronTrigger.initProperties(_CronTrigger);
			Fragments._Environment__Environment.initProperties(_Environment);
			Fragments._IaaS__IaaS.initProperties(_IaaS);
			Fragments._LogicOperator__LogicOperator.initProperties(_LogicOperator);
			Fragments._MergeRequest__MergeRequest.initProperties(_MergeRequest);
			Fragments._Operand__Operand.initProperties(_Operand);
			Fragments._OperatingSystem__OperatingSystem.initProperties(_OperatingSystem);
			Fragments._PhoneHomeRunner__PhoneHomeRunner.initProperties(_PhoneHomeRunner);
			Fragments._Pipeline__Pipeline.initProperties(_Pipeline);
			Fragments._Push__Push.initProperties(_Push);
			Fragments._RepositoryEvent__RepositoryEvent.initProperties(_RepositoryEvent);
			Fragments._Runner__Runner.initProperties(_Runner);
			Fragments._SSHRunner__SSHRunner.initProperties(_SSHRunner);
			Fragments._SelfHostedRunner__SelfHostedRunner.initProperties(_SelfHostedRunner);
			Fragments._Stage__Stage.initProperties(_Stage);
			Fragments._Step__Step.initProperties(_Step);
			Fragments._StringToStringMapEntry__StringToStringMapEntry.initProperties(_StringToStringMapEntry);
			Fragments._Task__Task.initProperties(_Task);
			Fragments._Trigger__Trigger.initProperties(_Trigger);
			Fragments._UnaryConditional__UnaryConditional.initProperties(_UnaryConditional);
			Fragments._WebHook__WebHook.initProperties(_WebHook);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DevOpsTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DevOpsTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new DevOpsTables();
	}

	private DevOpsTables() {
		super(DevOpsPackage.eNS_URI);
	}

	/*
	 * The EClasses whose instances should be cached to support allInstances().
	 */
	private static final EClass allInstancesEClasses /*@NonNull*/ [] = {
		DevOpsPackage.Literals.PIPELINE
	};

	@Override
	public EClass /*@NonNull*/ [] basicGetAllInstancesClasses() {
		return allInstancesEClasses;
	}
}
