// Generated from D:/LectureNotes-98/Compiler/8-ClassWorks/1399/AllahGholi/Project 1 Files/Compiler Refactoring Project/grammars\JavaParserLabeled.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaParserLabeled}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaParserLabeledVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(JavaParserLabeled.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(JavaParserLabeled.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(JavaParserLabeled.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(JavaParserLabeled.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(JavaParserLabeled.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceModifier(JavaParserLabeled.ClassOrInterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(JavaParserLabeled.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(JavaParserLabeled.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(JavaParserLabeled.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(JavaParserLabeled.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(JavaParserLabeled.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(JavaParserLabeled.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#enumConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstants(JavaParserLabeled.EnumConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(JavaParserLabeled.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(JavaParserLabeled.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(JavaParserLabeled.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(JavaParserLabeled.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(JavaParserLabeled.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classBodyDeclaration0}
	 * labeled alternative in {@link JavaParserLabeled#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration0(JavaParserLabeled.ClassBodyDeclaration0Context ctx);
	/**
	 * Visit a parse tree produced by the {@code classBodyDeclaration1}
	 * labeled alternative in {@link JavaParserLabeled#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration1(JavaParserLabeled.ClassBodyDeclaration1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code classBodyDeclaration2}
	 * labeled alternative in {@link JavaParserLabeled#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration2(JavaParserLabeled.ClassBodyDeclaration2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code memberDeclaration0}
	 * labeled alternative in {@link JavaParserLabeled#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration0(JavaParserLabeled.MemberDeclaration0Context ctx);
	/**
	 * Visit a parse tree produced by the {@code memberDeclaration1}
	 * labeled alternative in {@link JavaParserLabeled#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration1(JavaParserLabeled.MemberDeclaration1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code memberDeclaration2}
	 * labeled alternative in {@link JavaParserLabeled#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration2(JavaParserLabeled.MemberDeclaration2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code memberDeclaration3}
	 * labeled alternative in {@link JavaParserLabeled#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration3(JavaParserLabeled.MemberDeclaration3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code memberDeclaration4}
	 * labeled alternative in {@link JavaParserLabeled#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration4(JavaParserLabeled.MemberDeclaration4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code memberDeclaration5}
	 * labeled alternative in {@link JavaParserLabeled#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration5(JavaParserLabeled.MemberDeclaration5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code memberDeclaration6}
	 * labeled alternative in {@link JavaParserLabeled#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration6(JavaParserLabeled.MemberDeclaration6Context ctx);
	/**
	 * Visit a parse tree produced by the {@code memberDeclaration7}
	 * labeled alternative in {@link JavaParserLabeled#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration7(JavaParserLabeled.MemberDeclaration7Context ctx);
	/**
	 * Visit a parse tree produced by the {@code memberDeclaration8}
	 * labeled alternative in {@link JavaParserLabeled#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration8(JavaParserLabeled.MemberDeclaration8Context ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(JavaParserLabeled.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(JavaParserLabeled.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTypeOrVoid(JavaParserLabeled.TypeTypeOrVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericMethodDeclaration(JavaParserLabeled.GenericMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericConstructorDeclaration(JavaParserLabeled.GenericConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(JavaParserLabeled.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(JavaParserLabeled.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBodyDeclaration(JavaParserLabeled.InterfaceBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code interfaceMemberDeclaration0}
	 * labeled alternative in {@link JavaParserLabeled#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration0(JavaParserLabeled.InterfaceMemberDeclaration0Context ctx);
	/**
	 * Visit a parse tree produced by the {@code interfaceMemberDeclaration1}
	 * labeled alternative in {@link JavaParserLabeled#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration1(JavaParserLabeled.InterfaceMemberDeclaration1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code interfaceMemberDeclaration2}
	 * labeled alternative in {@link JavaParserLabeled#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration2(JavaParserLabeled.InterfaceMemberDeclaration2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code interfaceMemberDeclaration3}
	 * labeled alternative in {@link JavaParserLabeled#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration3(JavaParserLabeled.InterfaceMemberDeclaration3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code interfaceMemberDeclaration4}
	 * labeled alternative in {@link JavaParserLabeled#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration4(JavaParserLabeled.InterfaceMemberDeclaration4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code interfaceMemberDeclaration5}
	 * labeled alternative in {@link JavaParserLabeled#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration5(JavaParserLabeled.InterfaceMemberDeclaration5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code interfaceMemberDeclaration6}
	 * labeled alternative in {@link JavaParserLabeled#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration6(JavaParserLabeled.InterfaceMemberDeclaration6Context ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(JavaParserLabeled.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#constantDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclarator(JavaParserLabeled.ConstantDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(JavaParserLabeled.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(JavaParserLabeled.InterfaceMethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericInterfaceMethodDeclaration(JavaParserLabeled.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(JavaParserLabeled.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(JavaParserLabeled.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(JavaParserLabeled.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableInitializer0}
	 * labeled alternative in {@link JavaParserLabeled#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer0(JavaParserLabeled.VariableInitializer0Context ctx);
	/**
	 * Visit a parse tree produced by the {@code variableInitializer1}
	 * labeled alternative in {@link JavaParserLabeled#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer1(JavaParserLabeled.VariableInitializer1Context ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(JavaParserLabeled.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(JavaParserLabeled.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeArgument0}
	 * labeled alternative in {@link JavaParserLabeled#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument0(JavaParserLabeled.TypeArgument0Context ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(JavaParserLabeled.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(JavaParserLabeled.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formalParameterList0}
	 * labeled alternative in {@link JavaParserLabeled#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList0(JavaParserLabeled.FormalParameterList0Context ctx);
	/**
	 * Visit a parse tree produced by the {@code formalParameterList1}
	 * labeled alternative in {@link JavaParserLabeled#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList1(JavaParserLabeled.FormalParameterList1Context ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(JavaParserLabeled.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(JavaParserLabeled.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(JavaParserLabeled.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literal0}
	 * labeled alternative in {@link JavaParserLabeled#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral0(JavaParserLabeled.Literal0Context ctx);
	/**
	 * Visit a parse tree produced by the {@code literal1}
	 * labeled alternative in {@link JavaParserLabeled#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral1(JavaParserLabeled.Literal1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code literal2}
	 * labeled alternative in {@link JavaParserLabeled#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral2(JavaParserLabeled.Literal2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code literal3}
	 * labeled alternative in {@link JavaParserLabeled#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral3(JavaParserLabeled.Literal3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code literal4}
	 * labeled alternative in {@link JavaParserLabeled#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral4(JavaParserLabeled.Literal4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code literal5}
	 * labeled alternative in {@link JavaParserLabeled#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral5(JavaParserLabeled.Literal5Context ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(JavaParserLabeled.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(JavaParserLabeled.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#altAnnotationQualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAltAnnotationQualifiedName(JavaParserLabeled.AltAnnotationQualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(JavaParserLabeled.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#elementValuePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairs(JavaParserLabeled.ElementValuePairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(JavaParserLabeled.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elementValue0}
	 * labeled alternative in {@link JavaParserLabeled#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue0(JavaParserLabeled.ElementValue0Context ctx);
	/**
	 * Visit a parse tree produced by the {@code elementValue1}
	 * labeled alternative in {@link JavaParserLabeled#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue1(JavaParserLabeled.ElementValue1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code elementValue2}
	 * labeled alternative in {@link JavaParserLabeled#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue2(JavaParserLabeled.ElementValue2Context ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(JavaParserLabeled.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(JavaParserLabeled.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(JavaParserLabeled.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(JavaParserLabeled.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code annotationTypeElementRest0}
	 * labeled alternative in {@link JavaParserLabeled#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementRest0(JavaParserLabeled.AnnotationTypeElementRest0Context ctx);
	/**
	 * Visit a parse tree produced by the {@code annotationTypeElementRest1}
	 * labeled alternative in {@link JavaParserLabeled#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementRest1(JavaParserLabeled.AnnotationTypeElementRest1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code annotationTypeElementRest2}
	 * labeled alternative in {@link JavaParserLabeled#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementRest2(JavaParserLabeled.AnnotationTypeElementRest2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code annotationTypeElementRest3}
	 * labeled alternative in {@link JavaParserLabeled#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementRest3(JavaParserLabeled.AnnotationTypeElementRest3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code annotationTypeElementRest4}
	 * labeled alternative in {@link JavaParserLabeled#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementRest4(JavaParserLabeled.AnnotationTypeElementRest4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code annotationMethodOrConstantRest0}
	 * labeled alternative in {@link JavaParserLabeled#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodOrConstantRest0(JavaParserLabeled.AnnotationMethodOrConstantRest0Context ctx);
	/**
	 * Visit a parse tree produced by the {@code annotationMethodOrConstantRest1}
	 * labeled alternative in {@link JavaParserLabeled#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodOrConstantRest1(JavaParserLabeled.AnnotationMethodOrConstantRest1Context ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#annotationMethodRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodRest(JavaParserLabeled.AnnotationMethodRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#annotationConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationConstantRest(JavaParserLabeled.AnnotationConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(JavaParserLabeled.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JavaParserLabeled.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockStatement0}
	 * labeled alternative in {@link JavaParserLabeled#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement0(JavaParserLabeled.BlockStatement0Context ctx);
	/**
	 * Visit a parse tree produced by the {@code blockStatement1}
	 * labeled alternative in {@link JavaParserLabeled#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement1(JavaParserLabeled.BlockStatement1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code blockStatement2}
	 * labeled alternative in {@link JavaParserLabeled#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement2(JavaParserLabeled.BlockStatement2Context ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(JavaParserLabeled.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#localTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalTypeDeclaration(JavaParserLabeled.LocalTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statement0}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement0(JavaParserLabeled.Statement0Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statement1}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement1(JavaParserLabeled.Statement1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statement2}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement2(JavaParserLabeled.Statement2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statement3}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement3(JavaParserLabeled.Statement3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statement4}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement4(JavaParserLabeled.Statement4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statement5}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement5(JavaParserLabeled.Statement5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statement6}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement6(JavaParserLabeled.Statement6Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statement7}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement7(JavaParserLabeled.Statement7Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statement8}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement8(JavaParserLabeled.Statement8Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statement9}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement9(JavaParserLabeled.Statement9Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statement10}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement10(JavaParserLabeled.Statement10Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statement11}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement11(JavaParserLabeled.Statement11Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statement12}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement12(JavaParserLabeled.Statement12Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statement13}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement13(JavaParserLabeled.Statement13Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statement14}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement14(JavaParserLabeled.Statement14Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statement15}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement15(JavaParserLabeled.Statement15Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statement16}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement16(JavaParserLabeled.Statement16Context ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(JavaParserLabeled.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(JavaParserLabeled.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(JavaParserLabeled.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(JavaParserLabeled.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#resources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResources(JavaParserLabeled.ResourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(JavaParserLabeled.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(JavaParserLabeled.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(JavaParserLabeled.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forControl0}
	 * labeled alternative in {@link JavaParserLabeled#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl0(JavaParserLabeled.ForControl0Context ctx);
	/**
	 * Visit a parse tree produced by the {@code forControl1}
	 * labeled alternative in {@link JavaParserLabeled#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl1(JavaParserLabeled.ForControl1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code forInit0}
	 * labeled alternative in {@link JavaParserLabeled#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit0(JavaParserLabeled.ForInit0Context ctx);
	/**
	 * Visit a parse tree produced by the {@code forInit1}
	 * labeled alternative in {@link JavaParserLabeled#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit1(JavaParserLabeled.ForInit1Context ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(JavaParserLabeled.EnhancedForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(JavaParserLabeled.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(JavaParserLabeled.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodCall0}
	 * labeled alternative in {@link JavaParserLabeled#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall0(JavaParserLabeled.MethodCall0Context ctx);
	/**
	 * Visit a parse tree produced by the {@code methodCall1}
	 * labeled alternative in {@link JavaParserLabeled#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall1(JavaParserLabeled.MethodCall1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code methodCall2}
	 * labeled alternative in {@link JavaParserLabeled#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall2(JavaParserLabeled.MethodCall2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code expression8}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression8(JavaParserLabeled.Expression8Context ctx);
	/**
	 * Visit a parse tree produced by the {@code expression10}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression10(JavaParserLabeled.Expression10Context ctx);
	/**
	 * Visit a parse tree produced by the {@code expression9}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression9(JavaParserLabeled.Expression9Context ctx);
	/**
	 * Visit a parse tree produced by the {@code expression12}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression12(JavaParserLabeled.Expression12Context ctx);
	/**
	 * Visit a parse tree produced by the {@code expression11}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression11(JavaParserLabeled.Expression11Context ctx);
	/**
	 * Visit a parse tree produced by the {@code expression14}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression14(JavaParserLabeled.Expression14Context ctx);
	/**
	 * Visit a parse tree produced by the {@code expression13}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression13(JavaParserLabeled.Expression13Context ctx);
	/**
	 * Visit a parse tree produced by the {@code expression16}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression16(JavaParserLabeled.Expression16Context ctx);
	/**
	 * Visit a parse tree produced by the {@code expression15}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression15(JavaParserLabeled.Expression15Context ctx);
	/**
	 * Visit a parse tree produced by the {@code expression18}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression18(JavaParserLabeled.Expression18Context ctx);
	/**
	 * Visit a parse tree produced by the {@code expression17}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression17(JavaParserLabeled.Expression17Context ctx);
	/**
	 * Visit a parse tree produced by the {@code expression19}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression19(JavaParserLabeled.Expression19Context ctx);
	/**
	 * Visit a parse tree produced by the {@code expression6}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression6(JavaParserLabeled.Expression6Context ctx);
	/**
	 * Visit a parse tree produced by the {@code expression7}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression7(JavaParserLabeled.Expression7Context ctx);
	/**
	 * Visit a parse tree produced by the {@code expression4}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression4(JavaParserLabeled.Expression4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code expression5}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression5(JavaParserLabeled.Expression5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code expression2}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression2(JavaParserLabeled.Expression2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code expression3}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression3(JavaParserLabeled.Expression3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code expression0}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression0(JavaParserLabeled.Expression0Context ctx);
	/**
	 * Visit a parse tree produced by the {@code expression1}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression1(JavaParserLabeled.Expression1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code expression21}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression21(JavaParserLabeled.Expression21Context ctx);
	/**
	 * Visit a parse tree produced by the {@code expression20}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression20(JavaParserLabeled.Expression20Context ctx);
	/**
	 * Visit a parse tree produced by the {@code expression23}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression23(JavaParserLabeled.Expression23Context ctx);
	/**
	 * Visit a parse tree produced by the {@code expression22}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression22(JavaParserLabeled.Expression22Context ctx);
	/**
	 * Visit a parse tree produced by the {@code expression25}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression25(JavaParserLabeled.Expression25Context ctx);
	/**
	 * Visit a parse tree produced by the {@code expression24}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression24(JavaParserLabeled.Expression24Context ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(JavaParserLabeled.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lambdaParameters0}
	 * labeled alternative in {@link JavaParserLabeled#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters0(JavaParserLabeled.LambdaParameters0Context ctx);
	/**
	 * Visit a parse tree produced by the {@code lambdaParameters1}
	 * labeled alternative in {@link JavaParserLabeled#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters1(JavaParserLabeled.LambdaParameters1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code lambdaParameters2}
	 * labeled alternative in {@link JavaParserLabeled#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters2(JavaParserLabeled.LambdaParameters2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code lambdaBody0}
	 * labeled alternative in {@link JavaParserLabeled#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody0(JavaParserLabeled.LambdaBody0Context ctx);
	/**
	 * Visit a parse tree produced by the {@code lambdaBody1}
	 * labeled alternative in {@link JavaParserLabeled#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody1(JavaParserLabeled.LambdaBody1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primary0}
	 * labeled alternative in {@link JavaParserLabeled#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary0(JavaParserLabeled.Primary0Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primary1}
	 * labeled alternative in {@link JavaParserLabeled#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary1(JavaParserLabeled.Primary1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primary2}
	 * labeled alternative in {@link JavaParserLabeled#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary2(JavaParserLabeled.Primary2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primary3}
	 * labeled alternative in {@link JavaParserLabeled#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary3(JavaParserLabeled.Primary3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primary4}
	 * labeled alternative in {@link JavaParserLabeled#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary4(JavaParserLabeled.Primary4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primary5}
	 * labeled alternative in {@link JavaParserLabeled#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary5(JavaParserLabeled.Primary5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primary6}
	 * labeled alternative in {@link JavaParserLabeled#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary6(JavaParserLabeled.Primary6Context ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(JavaParserLabeled.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code creator0}
	 * labeled alternative in {@link JavaParserLabeled#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator0(JavaParserLabeled.Creator0Context ctx);
	/**
	 * Visit a parse tree produced by the {@code creator1}
	 * labeled alternative in {@link JavaParserLabeled#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator1(JavaParserLabeled.Creator1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code createdName0}
	 * labeled alternative in {@link JavaParserLabeled#createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedName0(JavaParserLabeled.CreatedName0Context ctx);
	/**
	 * Visit a parse tree produced by the {@code createdName1}
	 * labeled alternative in {@link JavaParserLabeled#createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedName1(JavaParserLabeled.CreatedName1Context ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#innerCreator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerCreator(JavaParserLabeled.InnerCreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(JavaParserLabeled.ArrayCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#classCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreatorRest(JavaParserLabeled.ClassCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocation(JavaParserLabeled.ExplicitGenericInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(JavaParserLabeled.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArgumentsOrDiamond(JavaParserLabeled.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArguments(JavaParserLabeled.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(JavaParserLabeled.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeType(JavaParserLabeled.TypeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(JavaParserLabeled.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(JavaParserLabeled.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code superSuffix0}
	 * labeled alternative in {@link JavaParserLabeled#superSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperSuffix0(JavaParserLabeled.SuperSuffix0Context ctx);
	/**
	 * Visit a parse tree produced by the {@code superSuffix1}
	 * labeled alternative in {@link JavaParserLabeled#superSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperSuffix1(JavaParserLabeled.SuperSuffix1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code explicitGenericInvocationSuffix0}
	 * labeled alternative in {@link JavaParserLabeled#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocationSuffix0(JavaParserLabeled.ExplicitGenericInvocationSuffix0Context ctx);
	/**
	 * Visit a parse tree produced by the {@code explicitGenericInvocationSuffix1}
	 * labeled alternative in {@link JavaParserLabeled#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocationSuffix1(JavaParserLabeled.ExplicitGenericInvocationSuffix1Context ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParserLabeled#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(JavaParserLabeled.ArgumentsContext ctx);
}