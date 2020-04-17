/**
 * generated by Xtext 2.21.0
 */
package org.xtext.assingment2.mathinterpreter.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.assingment2.mathinterpreter.DefParenthesis;
import org.xtext.assingment2.mathinterpreter.DefineExpr;
import org.xtext.assingment2.mathinterpreter.Divide;
import org.xtext.assingment2.mathinterpreter.External;
import org.xtext.assingment2.mathinterpreter.Function;
import org.xtext.assingment2.mathinterpreter.MDExpression;
import org.xtext.assingment2.mathinterpreter.MathExpression;
import org.xtext.assingment2.mathinterpreter.MathinterpreterFactory;
import org.xtext.assingment2.mathinterpreter.MathinterpreterPackage;
import org.xtext.assingment2.mathinterpreter.Minus;
import org.xtext.assingment2.mathinterpreter.Model;
import org.xtext.assingment2.mathinterpreter.Multiply;
import org.xtext.assingment2.mathinterpreter.MultiplyDivide;
import org.xtext.assingment2.mathinterpreter.Negative;
import org.xtext.assingment2.mathinterpreter.PMExpression;
import org.xtext.assingment2.mathinterpreter.PMParenthesis;
import org.xtext.assingment2.mathinterpreter.Plus;
import org.xtext.assingment2.mathinterpreter.PlusMinus;
import org.xtext.assingment2.mathinterpreter.Positive;
import org.xtext.assingment2.mathinterpreter.Pow;
import org.xtext.assingment2.mathinterpreter.PowExpression;
import org.xtext.assingment2.mathinterpreter.Power;
import org.xtext.assingment2.mathinterpreter.Primary;
import org.xtext.assingment2.mathinterpreter.Variable;
import org.xtext.assingment2.mathinterpreter.VariableName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MathinterpreterPackageImpl extends EPackageImpl implements MathinterpreterPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mathExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass defineExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass externalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pmExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mdExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass powExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass powerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass plusMinusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiplyDivideEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primaryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass positiveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass negativeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pmParenthesisEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass defParenthesisEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass powEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass plusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass minusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiplyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass divideEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.assingment2.mathinterpreter.MathinterpreterPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MathinterpreterPackageImpl()
  {
    super(eNS_URI, MathinterpreterFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link MathinterpreterPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MathinterpreterPackage init()
  {
    if (isInited) return (MathinterpreterPackage)EPackage.Registry.INSTANCE.getEPackage(MathinterpreterPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredMathinterpreterPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    MathinterpreterPackageImpl theMathinterpreterPackage = registeredMathinterpreterPackage instanceof MathinterpreterPackageImpl ? (MathinterpreterPackageImpl)registeredMathinterpreterPackage : new MathinterpreterPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theMathinterpreterPackage.createPackageContents();

    // Initialize created meta-data
    theMathinterpreterPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMathinterpreterPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MathinterpreterPackage.eNS_URI, theMathinterpreterPackage);
    return theMathinterpreterPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getModel_Mathexpression()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMathExpression()
  {
    return mathExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMathExpression_Description()
  {
    return (EAttribute)mathExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMathExpression_Expression()
  {
    return (EReference)mathExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFunction()
  {
    return functionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDefineExpr()
  {
    return defineExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDefineExpr_Variables()
  {
    return (EReference)defineExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getVariable()
  {
    return variableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getVariable_Name()
  {
    return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getVariable_Expression()
  {
    return (EReference)variableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExternal()
  {
    return externalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getExternal_Name()
  {
    return (EAttribute)externalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExternal_Arguments()
  {
    return (EReference)externalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPMExpression()
  {
    return pmExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPMExpression_Left()
  {
    return (EReference)pmExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPMExpression_Operator()
  {
    return (EReference)pmExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPMExpression_Right()
  {
    return (EReference)pmExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMDExpression()
  {
    return mdExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPowExpression()
  {
    return powExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPower()
  {
    return powerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPlusMinus()
  {
    return plusMinusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMultiplyDivide()
  {
    return multiplyDivideEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPrimary()
  {
    return primaryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getVariableName()
  {
    return variableNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getVariableName_Name()
  {
    return (EAttribute)variableNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getNumber()
  {
    return numberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getNumber_Value()
  {
    return (EAttribute)numberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPositive()
  {
    return positiveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getNegative()
  {
    return negativeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPMParenthesis()
  {
    return pmParenthesisEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPMParenthesis_Expression()
  {
    return (EReference)pmParenthesisEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDefParenthesis()
  {
    return defParenthesisEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPow()
  {
    return powEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPlus()
  {
    return plusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMinus()
  {
    return minusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMultiply()
  {
    return multiplyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDivide()
  {
    return divideEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MathinterpreterFactory getMathinterpreterFactory()
  {
    return (MathinterpreterFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__MATHEXPRESSION);

    mathExpressionEClass = createEClass(MATH_EXPRESSION);
    createEAttribute(mathExpressionEClass, MATH_EXPRESSION__DESCRIPTION);
    createEReference(mathExpressionEClass, MATH_EXPRESSION__EXPRESSION);

    functionEClass = createEClass(FUNCTION);

    defineExprEClass = createEClass(DEFINE_EXPR);
    createEReference(defineExprEClass, DEFINE_EXPR__VARIABLES);

    variableEClass = createEClass(VARIABLE);
    createEAttribute(variableEClass, VARIABLE__NAME);
    createEReference(variableEClass, VARIABLE__EXPRESSION);

    externalEClass = createEClass(EXTERNAL);
    createEAttribute(externalEClass, EXTERNAL__NAME);
    createEReference(externalEClass, EXTERNAL__ARGUMENTS);

    pmExpressionEClass = createEClass(PM_EXPRESSION);
    createEReference(pmExpressionEClass, PM_EXPRESSION__LEFT);
    createEReference(pmExpressionEClass, PM_EXPRESSION__OPERATOR);
    createEReference(pmExpressionEClass, PM_EXPRESSION__RIGHT);

    mdExpressionEClass = createEClass(MD_EXPRESSION);

    powExpressionEClass = createEClass(POW_EXPRESSION);

    powerEClass = createEClass(POWER);

    plusMinusEClass = createEClass(PLUS_MINUS);

    multiplyDivideEClass = createEClass(MULTIPLY_DIVIDE);

    primaryEClass = createEClass(PRIMARY);

    variableNameEClass = createEClass(VARIABLE_NAME);
    createEAttribute(variableNameEClass, VARIABLE_NAME__NAME);

    numberEClass = createEClass(NUMBER);
    createEAttribute(numberEClass, NUMBER__VALUE);

    positiveEClass = createEClass(POSITIVE);

    negativeEClass = createEClass(NEGATIVE);

    pmParenthesisEClass = createEClass(PM_PARENTHESIS);
    createEReference(pmParenthesisEClass, PM_PARENTHESIS__EXPRESSION);

    defParenthesisEClass = createEClass(DEF_PARENTHESIS);

    powEClass = createEClass(POW);

    plusEClass = createEClass(PLUS);

    minusEClass = createEClass(MINUS);

    multiplyEClass = createEClass(MULTIPLY);

    divideEClass = createEClass(DIVIDE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    functionEClass.getESuperTypes().add(this.getMathExpression());
    defineExprEClass.getESuperTypes().add(this.getMathExpression());
    defineExprEClass.getESuperTypes().add(this.getDefParenthesis());
    externalEClass.getESuperTypes().add(this.getPrimary());
    mdExpressionEClass.getESuperTypes().add(this.getPMExpression());
    powExpressionEClass.getESuperTypes().add(this.getMDExpression());
    primaryEClass.getESuperTypes().add(this.getPowExpression());
    variableNameEClass.getESuperTypes().add(this.getPrimary());
    numberEClass.getESuperTypes().add(this.getPrimary());
    positiveEClass.getESuperTypes().add(this.getNumber());
    negativeEClass.getESuperTypes().add(this.getNumber());
    pmParenthesisEClass.getESuperTypes().add(this.getPrimary());
    defParenthesisEClass.getESuperTypes().add(this.getPrimary());
    powEClass.getESuperTypes().add(this.getPower());
    plusEClass.getESuperTypes().add(this.getPlusMinus());
    minusEClass.getESuperTypes().add(this.getPlusMinus());
    multiplyEClass.getESuperTypes().add(this.getMultiplyDivide());
    divideEClass.getESuperTypes().add(this.getMultiplyDivide());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Mathexpression(), this.getMathExpression(), null, "mathexpression", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mathExpressionEClass, MathExpression.class, "MathExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMathExpression_Description(), ecorePackage.getEString(), "description", null, 0, 1, MathExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMathExpression_Expression(), this.getPMExpression(), null, "expression", null, 0, 1, MathExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(defineExprEClass, DefineExpr.class, "DefineExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDefineExpr_Variables(), this.getVariable(), null, "variables", null, 0, -1, DefineExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariable_Expression(), this.getPMExpression(), null, "expression", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(externalEClass, External.class, "External", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExternal_Name(), ecorePackage.getEString(), "name", null, 0, 1, External.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExternal_Arguments(), this.getPrimary(), null, "arguments", null, 0, -1, External.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pmExpressionEClass, PMExpression.class, "PMExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPMExpression_Left(), this.getPMExpression(), null, "left", null, 0, 1, PMExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPMExpression_Operator(), ecorePackage.getEObject(), null, "operator", null, 0, 1, PMExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPMExpression_Right(), this.getMDExpression(), null, "right", null, 0, 1, PMExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mdExpressionEClass, MDExpression.class, "MDExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(powExpressionEClass, PowExpression.class, "PowExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(powerEClass, Power.class, "Power", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(plusMinusEClass, PlusMinus.class, "PlusMinus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(multiplyDivideEClass, MultiplyDivide.class, "MultiplyDivide", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(primaryEClass, Primary.class, "Primary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(variableNameEClass, VariableName.class, "VariableName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariableName_Name(), ecorePackage.getEString(), "name", null, 0, 1, VariableName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberEClass, org.xtext.assingment2.mathinterpreter.Number.class, "Number", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNumber_Value(), ecorePackage.getEInt(), "value", null, 0, 1, org.xtext.assingment2.mathinterpreter.Number.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(positiveEClass, Positive.class, "Positive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(negativeEClass, Negative.class, "Negative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(pmParenthesisEClass, PMParenthesis.class, "PMParenthesis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPMParenthesis_Expression(), this.getPMExpression(), null, "expression", null, 0, 1, PMParenthesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(defParenthesisEClass, DefParenthesis.class, "DefParenthesis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(powEClass, Pow.class, "Pow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(plusEClass, Plus.class, "Plus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(minusEClass, Minus.class, "Minus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(multiplyEClass, Multiply.class, "Multiply", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(divideEClass, Divide.class, "Divide", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //MathinterpreterPackageImpl
