// Generated from D:/LectureNotes-98/Compiler/8-ClassWorks/1399/AllahGholi/Project 1 Files/Compiler Refactoring Project/grammars\JavaParserLabeled.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaParserLabeled}.
 */
public interface JavaParserLabeledListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(JavaParserLabeled.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(JavaParserLabeled.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(JavaParserLabeled.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(JavaParserLabeled.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(JavaParserLabeled.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(JavaParserLabeled.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(JavaParserLabeled.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(JavaParserLabeled.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(JavaParserLabeled.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(JavaParserLabeled.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(JavaParserLabeled.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(JavaParserLabeled.ClassOrInterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(JavaParserLabeled.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(JavaParserLabeled.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(JavaParserLabeled.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(JavaParserLabeled.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(JavaParserLabeled.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(JavaParserLabeled.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(JavaParserLabeled.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(JavaParserLabeled.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(JavaParserLabeled.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(JavaParserLabeled.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(JavaParserLabeled.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(JavaParserLabeled.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(JavaParserLabeled.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(JavaParserLabeled.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(JavaParserLabeled.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(JavaParserLabeled.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(JavaParserLabeled.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(JavaParserLabeled.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(JavaParserLabeled.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(JavaParserLabeled.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(JavaParserLabeled.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(JavaParserLabeled.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(JavaParserLabeled.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(JavaParserLabeled.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classBodyDeclaration0}
	 * labeled alternative in {@link JavaParserLabeled#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration0(JavaParserLabeled.ClassBodyDeclaration0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code classBodyDeclaration0}
	 * labeled alternative in {@link JavaParserLabeled#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration0(JavaParserLabeled.ClassBodyDeclaration0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code classBodyDeclaration1}
	 * labeled alternative in {@link JavaParserLabeled#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration1(JavaParserLabeled.ClassBodyDeclaration1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code classBodyDeclaration1}
	 * labeled alternative in {@link JavaParserLabeled#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration1(JavaParserLabeled.ClassBodyDeclaration1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code classBodyDeclaration2}
	 * labeled alternative in {@link JavaParserLabeled#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration2(JavaParserLabeled.ClassBodyDeclaration2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code classBodyDeclaration2}
	 * labeled alternative in {@link JavaParserLabeled#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration2(JavaParserLabeled.ClassBodyDeclaration2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code memberDeclaration0}
	 * labeled alternative in {@link JavaParserLabeled#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration0(JavaParserLabeled.MemberDeclaration0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code memberDeclaration0}
	 * labeled alternative in {@link JavaParserLabeled#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration0(JavaParserLabeled.MemberDeclaration0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code memberDeclaration1}
	 * labeled alternative in {@link JavaParserLabeled#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration1(JavaParserLabeled.MemberDeclaration1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code memberDeclaration1}
	 * labeled alternative in {@link JavaParserLabeled#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration1(JavaParserLabeled.MemberDeclaration1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code memberDeclaration2}
	 * labeled alternative in {@link JavaParserLabeled#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration2(JavaParserLabeled.MemberDeclaration2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code memberDeclaration2}
	 * labeled alternative in {@link JavaParserLabeled#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration2(JavaParserLabeled.MemberDeclaration2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code memberDeclaration3}
	 * labeled alternative in {@link JavaParserLabeled#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration3(JavaParserLabeled.MemberDeclaration3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code memberDeclaration3}
	 * labeled alternative in {@link JavaParserLabeled#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration3(JavaParserLabeled.MemberDeclaration3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code memberDeclaration4}
	 * labeled alternative in {@link JavaParserLabeled#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration4(JavaParserLabeled.MemberDeclaration4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code memberDeclaration4}
	 * labeled alternative in {@link JavaParserLabeled#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration4(JavaParserLabeled.MemberDeclaration4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code memberDeclaration5}
	 * labeled alternative in {@link JavaParserLabeled#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration5(JavaParserLabeled.MemberDeclaration5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code memberDeclaration5}
	 * labeled alternative in {@link JavaParserLabeled#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration5(JavaParserLabeled.MemberDeclaration5Context ctx);
	/**
	 * Enter a parse tree produced by the {@code memberDeclaration6}
	 * labeled alternative in {@link JavaParserLabeled#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration6(JavaParserLabeled.MemberDeclaration6Context ctx);
	/**
	 * Exit a parse tree produced by the {@code memberDeclaration6}
	 * labeled alternative in {@link JavaParserLabeled#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration6(JavaParserLabeled.MemberDeclaration6Context ctx);
	/**
	 * Enter a parse tree produced by the {@code memberDeclaration7}
	 * labeled alternative in {@link JavaParserLabeled#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration7(JavaParserLabeled.MemberDeclaration7Context ctx);
	/**
	 * Exit a parse tree produced by the {@code memberDeclaration7}
	 * labeled alternative in {@link JavaParserLabeled#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration7(JavaParserLabeled.MemberDeclaration7Context ctx);
	/**
	 * Enter a parse tree produced by the {@code memberDeclaration8}
	 * labeled alternative in {@link JavaParserLabeled#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration8(JavaParserLabeled.MemberDeclaration8Context ctx);
	/**
	 * Exit a parse tree produced by the {@code memberDeclaration8}
	 * labeled alternative in {@link JavaParserLabeled#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration8(JavaParserLabeled.MemberDeclaration8Context ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(JavaParserLabeled.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(JavaParserLabeled.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(JavaParserLabeled.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(JavaParserLabeled.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeTypeOrVoid(JavaParserLabeled.TypeTypeOrVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeTypeOrVoid(JavaParserLabeled.TypeTypeOrVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(JavaParserLabeled.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(JavaParserLabeled.GenericMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorDeclaration(JavaParserLabeled.GenericConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorDeclaration(JavaParserLabeled.GenericConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(JavaParserLabeled.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(JavaParserLabeled.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(JavaParserLabeled.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(JavaParserLabeled.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(JavaParserLabeled.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(JavaParserLabeled.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code interfaceMemberDeclaration0}
	 * labeled alternative in {@link JavaParserLabeled#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration0(JavaParserLabeled.InterfaceMemberDeclaration0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code interfaceMemberDeclaration0}
	 * labeled alternative in {@link JavaParserLabeled#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration0(JavaParserLabeled.InterfaceMemberDeclaration0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code interfaceMemberDeclaration1}
	 * labeled alternative in {@link JavaParserLabeled#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration1(JavaParserLabeled.InterfaceMemberDeclaration1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code interfaceMemberDeclaration1}
	 * labeled alternative in {@link JavaParserLabeled#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration1(JavaParserLabeled.InterfaceMemberDeclaration1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code interfaceMemberDeclaration2}
	 * labeled alternative in {@link JavaParserLabeled#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration2(JavaParserLabeled.InterfaceMemberDeclaration2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code interfaceMemberDeclaration2}
	 * labeled alternative in {@link JavaParserLabeled#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration2(JavaParserLabeled.InterfaceMemberDeclaration2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code interfaceMemberDeclaration3}
	 * labeled alternative in {@link JavaParserLabeled#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration3(JavaParserLabeled.InterfaceMemberDeclaration3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code interfaceMemberDeclaration3}
	 * labeled alternative in {@link JavaParserLabeled#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration3(JavaParserLabeled.InterfaceMemberDeclaration3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code interfaceMemberDeclaration4}
	 * labeled alternative in {@link JavaParserLabeled#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration4(JavaParserLabeled.InterfaceMemberDeclaration4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code interfaceMemberDeclaration4}
	 * labeled alternative in {@link JavaParserLabeled#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration4(JavaParserLabeled.InterfaceMemberDeclaration4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code interfaceMemberDeclaration5}
	 * labeled alternative in {@link JavaParserLabeled#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration5(JavaParserLabeled.InterfaceMemberDeclaration5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code interfaceMemberDeclaration5}
	 * labeled alternative in {@link JavaParserLabeled#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration5(JavaParserLabeled.InterfaceMemberDeclaration5Context ctx);
	/**
	 * Enter a parse tree produced by the {@code interfaceMemberDeclaration6}
	 * labeled alternative in {@link JavaParserLabeled#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration6(JavaParserLabeled.InterfaceMemberDeclaration6Context ctx);
	/**
	 * Exit a parse tree produced by the {@code interfaceMemberDeclaration6}
	 * labeled alternative in {@link JavaParserLabeled#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration6(JavaParserLabeled.InterfaceMemberDeclaration6Context ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(JavaParserLabeled.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(JavaParserLabeled.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(JavaParserLabeled.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(JavaParserLabeled.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(JavaParserLabeled.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(JavaParserLabeled.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(JavaParserLabeled.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(JavaParserLabeled.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceMethodDeclaration(JavaParserLabeled.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceMethodDeclaration(JavaParserLabeled.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(JavaParserLabeled.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(JavaParserLabeled.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(JavaParserLabeled.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(JavaParserLabeled.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(JavaParserLabeled.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(JavaParserLabeled.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableInitializer0}
	 * labeled alternative in {@link JavaParserLabeled#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer0(JavaParserLabeled.VariableInitializer0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code variableInitializer0}
	 * labeled alternative in {@link JavaParserLabeled#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer0(JavaParserLabeled.VariableInitializer0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code variableInitializer1}
	 * labeled alternative in {@link JavaParserLabeled#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer1(JavaParserLabeled.VariableInitializer1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code variableInitializer1}
	 * labeled alternative in {@link JavaParserLabeled#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer1(JavaParserLabeled.VariableInitializer1Context ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(JavaParserLabeled.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(JavaParserLabeled.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(JavaParserLabeled.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(JavaParserLabeled.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeArgument0}
	 * labeled alternative in {@link JavaParserLabeled#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument0(JavaParserLabeled.TypeArgument0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code typeArgument0}
	 * labeled alternative in {@link JavaParserLabeled#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument0(JavaParserLabeled.TypeArgument0Context ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(JavaParserLabeled.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(JavaParserLabeled.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(JavaParserLabeled.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(JavaParserLabeled.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formalParameterList0}
	 * labeled alternative in {@link JavaParserLabeled#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList0(JavaParserLabeled.FormalParameterList0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code formalParameterList0}
	 * labeled alternative in {@link JavaParserLabeled#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList0(JavaParserLabeled.FormalParameterList0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code formalParameterList1}
	 * labeled alternative in {@link JavaParserLabeled#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList1(JavaParserLabeled.FormalParameterList1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code formalParameterList1}
	 * labeled alternative in {@link JavaParserLabeled#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList1(JavaParserLabeled.FormalParameterList1Context ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(JavaParserLabeled.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(JavaParserLabeled.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(JavaParserLabeled.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(JavaParserLabeled.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(JavaParserLabeled.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(JavaParserLabeled.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literal0}
	 * labeled alternative in {@link JavaParserLabeled#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral0(JavaParserLabeled.Literal0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code literal0}
	 * labeled alternative in {@link JavaParserLabeled#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral0(JavaParserLabeled.Literal0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code literal1}
	 * labeled alternative in {@link JavaParserLabeled#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral1(JavaParserLabeled.Literal1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code literal1}
	 * labeled alternative in {@link JavaParserLabeled#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral1(JavaParserLabeled.Literal1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code literal2}
	 * labeled alternative in {@link JavaParserLabeled#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral2(JavaParserLabeled.Literal2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code literal2}
	 * labeled alternative in {@link JavaParserLabeled#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral2(JavaParserLabeled.Literal2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code literal3}
	 * labeled alternative in {@link JavaParserLabeled#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral3(JavaParserLabeled.Literal3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code literal3}
	 * labeled alternative in {@link JavaParserLabeled#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral3(JavaParserLabeled.Literal3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code literal4}
	 * labeled alternative in {@link JavaParserLabeled#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral4(JavaParserLabeled.Literal4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code literal4}
	 * labeled alternative in {@link JavaParserLabeled#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral4(JavaParserLabeled.Literal4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code literal5}
	 * labeled alternative in {@link JavaParserLabeled#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral5(JavaParserLabeled.Literal5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code literal5}
	 * labeled alternative in {@link JavaParserLabeled#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral5(JavaParserLabeled.Literal5Context ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(JavaParserLabeled.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(JavaParserLabeled.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(JavaParserLabeled.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(JavaParserLabeled.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#altAnnotationQualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterAltAnnotationQualifiedName(JavaParserLabeled.AltAnnotationQualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#altAnnotationQualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitAltAnnotationQualifiedName(JavaParserLabeled.AltAnnotationQualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(JavaParserLabeled.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(JavaParserLabeled.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(JavaParserLabeled.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(JavaParserLabeled.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(JavaParserLabeled.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(JavaParserLabeled.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementValue0}
	 * labeled alternative in {@link JavaParserLabeled#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue0(JavaParserLabeled.ElementValue0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code elementValue0}
	 * labeled alternative in {@link JavaParserLabeled#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue0(JavaParserLabeled.ElementValue0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code elementValue1}
	 * labeled alternative in {@link JavaParserLabeled#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue1(JavaParserLabeled.ElementValue1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code elementValue1}
	 * labeled alternative in {@link JavaParserLabeled#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue1(JavaParserLabeled.ElementValue1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code elementValue2}
	 * labeled alternative in {@link JavaParserLabeled#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue2(JavaParserLabeled.ElementValue2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code elementValue2}
	 * labeled alternative in {@link JavaParserLabeled#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue2(JavaParserLabeled.ElementValue2Context ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(JavaParserLabeled.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(JavaParserLabeled.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(JavaParserLabeled.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(JavaParserLabeled.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(JavaParserLabeled.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(JavaParserLabeled.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(JavaParserLabeled.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(JavaParserLabeled.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code annotationTypeElementRest0}
	 * labeled alternative in {@link JavaParserLabeled#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest0(JavaParserLabeled.AnnotationTypeElementRest0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code annotationTypeElementRest0}
	 * labeled alternative in {@link JavaParserLabeled#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest0(JavaParserLabeled.AnnotationTypeElementRest0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code annotationTypeElementRest1}
	 * labeled alternative in {@link JavaParserLabeled#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest1(JavaParserLabeled.AnnotationTypeElementRest1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code annotationTypeElementRest1}
	 * labeled alternative in {@link JavaParserLabeled#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest1(JavaParserLabeled.AnnotationTypeElementRest1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code annotationTypeElementRest2}
	 * labeled alternative in {@link JavaParserLabeled#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest2(JavaParserLabeled.AnnotationTypeElementRest2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code annotationTypeElementRest2}
	 * labeled alternative in {@link JavaParserLabeled#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest2(JavaParserLabeled.AnnotationTypeElementRest2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code annotationTypeElementRest3}
	 * labeled alternative in {@link JavaParserLabeled#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest3(JavaParserLabeled.AnnotationTypeElementRest3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code annotationTypeElementRest3}
	 * labeled alternative in {@link JavaParserLabeled#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest3(JavaParserLabeled.AnnotationTypeElementRest3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code annotationTypeElementRest4}
	 * labeled alternative in {@link JavaParserLabeled#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest4(JavaParserLabeled.AnnotationTypeElementRest4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code annotationTypeElementRest4}
	 * labeled alternative in {@link JavaParserLabeled#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest4(JavaParserLabeled.AnnotationTypeElementRest4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code annotationMethodOrConstantRest0}
	 * labeled alternative in {@link JavaParserLabeled#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodOrConstantRest0(JavaParserLabeled.AnnotationMethodOrConstantRest0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code annotationMethodOrConstantRest0}
	 * labeled alternative in {@link JavaParserLabeled#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodOrConstantRest0(JavaParserLabeled.AnnotationMethodOrConstantRest0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code annotationMethodOrConstantRest1}
	 * labeled alternative in {@link JavaParserLabeled#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodOrConstantRest1(JavaParserLabeled.AnnotationMethodOrConstantRest1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code annotationMethodOrConstantRest1}
	 * labeled alternative in {@link JavaParserLabeled#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodOrConstantRest1(JavaParserLabeled.AnnotationMethodOrConstantRest1Context ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodRest(JavaParserLabeled.AnnotationMethodRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodRest(JavaParserLabeled.AnnotationMethodRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationConstantRest(JavaParserLabeled.AnnotationConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationConstantRest(JavaParserLabeled.AnnotationConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(JavaParserLabeled.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(JavaParserLabeled.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JavaParserLabeled.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JavaParserLabeled.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockStatement0}
	 * labeled alternative in {@link JavaParserLabeled#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement0(JavaParserLabeled.BlockStatement0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code blockStatement0}
	 * labeled alternative in {@link JavaParserLabeled#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement0(JavaParserLabeled.BlockStatement0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code blockStatement1}
	 * labeled alternative in {@link JavaParserLabeled#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement1(JavaParserLabeled.BlockStatement1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code blockStatement1}
	 * labeled alternative in {@link JavaParserLabeled#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement1(JavaParserLabeled.BlockStatement1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code blockStatement2}
	 * labeled alternative in {@link JavaParserLabeled#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement2(JavaParserLabeled.BlockStatement2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code blockStatement2}
	 * labeled alternative in {@link JavaParserLabeled#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement2(JavaParserLabeled.BlockStatement2Context ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(JavaParserLabeled.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(JavaParserLabeled.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalTypeDeclaration(JavaParserLabeled.LocalTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalTypeDeclaration(JavaParserLabeled.LocalTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statement0}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement0(JavaParserLabeled.Statement0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code statement0}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement0(JavaParserLabeled.Statement0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code statement1}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement1(JavaParserLabeled.Statement1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code statement1}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement1(JavaParserLabeled.Statement1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code statement2}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement2(JavaParserLabeled.Statement2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code statement2}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement2(JavaParserLabeled.Statement2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code statement3}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement3(JavaParserLabeled.Statement3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code statement3}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement3(JavaParserLabeled.Statement3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code statement4}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement4(JavaParserLabeled.Statement4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code statement4}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement4(JavaParserLabeled.Statement4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code statement5}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement5(JavaParserLabeled.Statement5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code statement5}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement5(JavaParserLabeled.Statement5Context ctx);
	/**
	 * Enter a parse tree produced by the {@code statement6}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement6(JavaParserLabeled.Statement6Context ctx);
	/**
	 * Exit a parse tree produced by the {@code statement6}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement6(JavaParserLabeled.Statement6Context ctx);
	/**
	 * Enter a parse tree produced by the {@code statement7}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement7(JavaParserLabeled.Statement7Context ctx);
	/**
	 * Exit a parse tree produced by the {@code statement7}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement7(JavaParserLabeled.Statement7Context ctx);
	/**
	 * Enter a parse tree produced by the {@code statement8}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement8(JavaParserLabeled.Statement8Context ctx);
	/**
	 * Exit a parse tree produced by the {@code statement8}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement8(JavaParserLabeled.Statement8Context ctx);
	/**
	 * Enter a parse tree produced by the {@code statement9}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement9(JavaParserLabeled.Statement9Context ctx);
	/**
	 * Exit a parse tree produced by the {@code statement9}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement9(JavaParserLabeled.Statement9Context ctx);
	/**
	 * Enter a parse tree produced by the {@code statement10}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement10(JavaParserLabeled.Statement10Context ctx);
	/**
	 * Exit a parse tree produced by the {@code statement10}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement10(JavaParserLabeled.Statement10Context ctx);
	/**
	 * Enter a parse tree produced by the {@code statement11}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement11(JavaParserLabeled.Statement11Context ctx);
	/**
	 * Exit a parse tree produced by the {@code statement11}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement11(JavaParserLabeled.Statement11Context ctx);
	/**
	 * Enter a parse tree produced by the {@code statement12}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement12(JavaParserLabeled.Statement12Context ctx);
	/**
	 * Exit a parse tree produced by the {@code statement12}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement12(JavaParserLabeled.Statement12Context ctx);
	/**
	 * Enter a parse tree produced by the {@code statement13}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement13(JavaParserLabeled.Statement13Context ctx);
	/**
	 * Exit a parse tree produced by the {@code statement13}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement13(JavaParserLabeled.Statement13Context ctx);
	/**
	 * Enter a parse tree produced by the {@code statement14}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement14(JavaParserLabeled.Statement14Context ctx);
	/**
	 * Exit a parse tree produced by the {@code statement14}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement14(JavaParserLabeled.Statement14Context ctx);
	/**
	 * Enter a parse tree produced by the {@code statement15}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement15(JavaParserLabeled.Statement15Context ctx);
	/**
	 * Exit a parse tree produced by the {@code statement15}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement15(JavaParserLabeled.Statement15Context ctx);
	/**
	 * Enter a parse tree produced by the {@code statement16}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement16(JavaParserLabeled.Statement16Context ctx);
	/**
	 * Exit a parse tree produced by the {@code statement16}
	 * labeled alternative in {@link JavaParserLabeled#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement16(JavaParserLabeled.Statement16Context ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(JavaParserLabeled.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(JavaParserLabeled.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(JavaParserLabeled.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(JavaParserLabeled.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(JavaParserLabeled.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(JavaParserLabeled.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(JavaParserLabeled.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(JavaParserLabeled.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(JavaParserLabeled.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(JavaParserLabeled.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(JavaParserLabeled.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(JavaParserLabeled.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(JavaParserLabeled.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(JavaParserLabeled.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(JavaParserLabeled.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(JavaParserLabeled.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forControl0}
	 * labeled alternative in {@link JavaParserLabeled#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl0(JavaParserLabeled.ForControl0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code forControl0}
	 * labeled alternative in {@link JavaParserLabeled#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl0(JavaParserLabeled.ForControl0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code forControl1}
	 * labeled alternative in {@link JavaParserLabeled#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl1(JavaParserLabeled.ForControl1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code forControl1}
	 * labeled alternative in {@link JavaParserLabeled#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl1(JavaParserLabeled.ForControl1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code forInit0}
	 * labeled alternative in {@link JavaParserLabeled#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit0(JavaParserLabeled.ForInit0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code forInit0}
	 * labeled alternative in {@link JavaParserLabeled#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit0(JavaParserLabeled.ForInit0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code forInit1}
	 * labeled alternative in {@link JavaParserLabeled#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit1(JavaParserLabeled.ForInit1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code forInit1}
	 * labeled alternative in {@link JavaParserLabeled#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit1(JavaParserLabeled.ForInit1Context ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(JavaParserLabeled.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(JavaParserLabeled.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(JavaParserLabeled.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(JavaParserLabeled.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(JavaParserLabeled.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(JavaParserLabeled.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodCall0}
	 * labeled alternative in {@link JavaParserLabeled#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall0(JavaParserLabeled.MethodCall0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code methodCall0}
	 * labeled alternative in {@link JavaParserLabeled#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall0(JavaParserLabeled.MethodCall0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code methodCall1}
	 * labeled alternative in {@link JavaParserLabeled#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall1(JavaParserLabeled.MethodCall1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code methodCall1}
	 * labeled alternative in {@link JavaParserLabeled#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall1(JavaParserLabeled.MethodCall1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code methodCall2}
	 * labeled alternative in {@link JavaParserLabeled#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall2(JavaParserLabeled.MethodCall2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code methodCall2}
	 * labeled alternative in {@link JavaParserLabeled#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall2(JavaParserLabeled.MethodCall2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expression8}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression8(JavaParserLabeled.Expression8Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expression8}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression8(JavaParserLabeled.Expression8Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expression10}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression10(JavaParserLabeled.Expression10Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expression10}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression10(JavaParserLabeled.Expression10Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expression9}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression9(JavaParserLabeled.Expression9Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expression9}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression9(JavaParserLabeled.Expression9Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expression12}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression12(JavaParserLabeled.Expression12Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expression12}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression12(JavaParserLabeled.Expression12Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expression11}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression11(JavaParserLabeled.Expression11Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expression11}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression11(JavaParserLabeled.Expression11Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expression14}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression14(JavaParserLabeled.Expression14Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expression14}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression14(JavaParserLabeled.Expression14Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expression13}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression13(JavaParserLabeled.Expression13Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expression13}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression13(JavaParserLabeled.Expression13Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expression16}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression16(JavaParserLabeled.Expression16Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expression16}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression16(JavaParserLabeled.Expression16Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expression15}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression15(JavaParserLabeled.Expression15Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expression15}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression15(JavaParserLabeled.Expression15Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expression18}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression18(JavaParserLabeled.Expression18Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expression18}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression18(JavaParserLabeled.Expression18Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expression17}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression17(JavaParserLabeled.Expression17Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expression17}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression17(JavaParserLabeled.Expression17Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expression19}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression19(JavaParserLabeled.Expression19Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expression19}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression19(JavaParserLabeled.Expression19Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expression6}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression6(JavaParserLabeled.Expression6Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expression6}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression6(JavaParserLabeled.Expression6Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expression7}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression7(JavaParserLabeled.Expression7Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expression7}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression7(JavaParserLabeled.Expression7Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expression4}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression4(JavaParserLabeled.Expression4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expression4}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression4(JavaParserLabeled.Expression4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expression5}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression5(JavaParserLabeled.Expression5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expression5}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression5(JavaParserLabeled.Expression5Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expression2}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression2(JavaParserLabeled.Expression2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expression2}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression2(JavaParserLabeled.Expression2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expression3}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression3(JavaParserLabeled.Expression3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expression3}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression3(JavaParserLabeled.Expression3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expression0}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression0(JavaParserLabeled.Expression0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expression0}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression0(JavaParserLabeled.Expression0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expression1}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression1(JavaParserLabeled.Expression1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expression1}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression1(JavaParserLabeled.Expression1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expression21}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression21(JavaParserLabeled.Expression21Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expression21}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression21(JavaParserLabeled.Expression21Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expression20}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression20(JavaParserLabeled.Expression20Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expression20}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression20(JavaParserLabeled.Expression20Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expression23}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression23(JavaParserLabeled.Expression23Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expression23}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression23(JavaParserLabeled.Expression23Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expression22}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression22(JavaParserLabeled.Expression22Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expression22}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression22(JavaParserLabeled.Expression22Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expression25}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression25(JavaParserLabeled.Expression25Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expression25}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression25(JavaParserLabeled.Expression25Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expression24}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression24(JavaParserLabeled.Expression24Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expression24}
	 * labeled alternative in {@link JavaParserLabeled#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression24(JavaParserLabeled.Expression24Context ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(JavaParserLabeled.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(JavaParserLabeled.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lambdaParameters0}
	 * labeled alternative in {@link JavaParserLabeled#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters0(JavaParserLabeled.LambdaParameters0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code lambdaParameters0}
	 * labeled alternative in {@link JavaParserLabeled#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters0(JavaParserLabeled.LambdaParameters0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code lambdaParameters1}
	 * labeled alternative in {@link JavaParserLabeled#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters1(JavaParserLabeled.LambdaParameters1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code lambdaParameters1}
	 * labeled alternative in {@link JavaParserLabeled#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters1(JavaParserLabeled.LambdaParameters1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code lambdaParameters2}
	 * labeled alternative in {@link JavaParserLabeled#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters2(JavaParserLabeled.LambdaParameters2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code lambdaParameters2}
	 * labeled alternative in {@link JavaParserLabeled#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters2(JavaParserLabeled.LambdaParameters2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code lambdaBody0}
	 * labeled alternative in {@link JavaParserLabeled#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody0(JavaParserLabeled.LambdaBody0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code lambdaBody0}
	 * labeled alternative in {@link JavaParserLabeled#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody0(JavaParserLabeled.LambdaBody0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code lambdaBody1}
	 * labeled alternative in {@link JavaParserLabeled#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody1(JavaParserLabeled.LambdaBody1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code lambdaBody1}
	 * labeled alternative in {@link JavaParserLabeled#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody1(JavaParserLabeled.LambdaBody1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code primary0}
	 * labeled alternative in {@link JavaParserLabeled#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary0(JavaParserLabeled.Primary0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code primary0}
	 * labeled alternative in {@link JavaParserLabeled#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary0(JavaParserLabeled.Primary0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code primary1}
	 * labeled alternative in {@link JavaParserLabeled#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary1(JavaParserLabeled.Primary1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code primary1}
	 * labeled alternative in {@link JavaParserLabeled#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary1(JavaParserLabeled.Primary1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code primary2}
	 * labeled alternative in {@link JavaParserLabeled#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary2(JavaParserLabeled.Primary2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code primary2}
	 * labeled alternative in {@link JavaParserLabeled#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary2(JavaParserLabeled.Primary2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code primary3}
	 * labeled alternative in {@link JavaParserLabeled#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary3(JavaParserLabeled.Primary3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code primary3}
	 * labeled alternative in {@link JavaParserLabeled#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary3(JavaParserLabeled.Primary3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code primary4}
	 * labeled alternative in {@link JavaParserLabeled#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary4(JavaParserLabeled.Primary4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code primary4}
	 * labeled alternative in {@link JavaParserLabeled#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary4(JavaParserLabeled.Primary4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code primary5}
	 * labeled alternative in {@link JavaParserLabeled#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary5(JavaParserLabeled.Primary5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code primary5}
	 * labeled alternative in {@link JavaParserLabeled#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary5(JavaParserLabeled.Primary5Context ctx);
	/**
	 * Enter a parse tree produced by the {@code primary6}
	 * labeled alternative in {@link JavaParserLabeled#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary6(JavaParserLabeled.Primary6Context ctx);
	/**
	 * Exit a parse tree produced by the {@code primary6}
	 * labeled alternative in {@link JavaParserLabeled#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary6(JavaParserLabeled.Primary6Context ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(JavaParserLabeled.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(JavaParserLabeled.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code creator0}
	 * labeled alternative in {@link JavaParserLabeled#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator0(JavaParserLabeled.Creator0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code creator0}
	 * labeled alternative in {@link JavaParserLabeled#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator0(JavaParserLabeled.Creator0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code creator1}
	 * labeled alternative in {@link JavaParserLabeled#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator1(JavaParserLabeled.Creator1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code creator1}
	 * labeled alternative in {@link JavaParserLabeled#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator1(JavaParserLabeled.Creator1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code createdName0}
	 * labeled alternative in {@link JavaParserLabeled#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName0(JavaParserLabeled.CreatedName0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code createdName0}
	 * labeled alternative in {@link JavaParserLabeled#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName0(JavaParserLabeled.CreatedName0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code createdName1}
	 * labeled alternative in {@link JavaParserLabeled#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName1(JavaParserLabeled.CreatedName1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code createdName1}
	 * labeled alternative in {@link JavaParserLabeled#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName1(JavaParserLabeled.CreatedName1Context ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(JavaParserLabeled.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(JavaParserLabeled.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(JavaParserLabeled.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(JavaParserLabeled.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(JavaParserLabeled.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(JavaParserLabeled.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(JavaParserLabeled.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(JavaParserLabeled.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(JavaParserLabeled.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(JavaParserLabeled.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(JavaParserLabeled.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(JavaParserLabeled.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(JavaParserLabeled.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(JavaParserLabeled.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(JavaParserLabeled.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(JavaParserLabeled.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(JavaParserLabeled.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(JavaParserLabeled.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(JavaParserLabeled.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(JavaParserLabeled.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(JavaParserLabeled.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(JavaParserLabeled.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code superSuffix0}
	 * labeled alternative in {@link JavaParserLabeled#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix0(JavaParserLabeled.SuperSuffix0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code superSuffix0}
	 * labeled alternative in {@link JavaParserLabeled#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix0(JavaParserLabeled.SuperSuffix0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code superSuffix1}
	 * labeled alternative in {@link JavaParserLabeled#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix1(JavaParserLabeled.SuperSuffix1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code superSuffix1}
	 * labeled alternative in {@link JavaParserLabeled#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix1(JavaParserLabeled.SuperSuffix1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code explicitGenericInvocationSuffix0}
	 * labeled alternative in {@link JavaParserLabeled#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix0(JavaParserLabeled.ExplicitGenericInvocationSuffix0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code explicitGenericInvocationSuffix0}
	 * labeled alternative in {@link JavaParserLabeled#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix0(JavaParserLabeled.ExplicitGenericInvocationSuffix0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code explicitGenericInvocationSuffix1}
	 * labeled alternative in {@link JavaParserLabeled#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix1(JavaParserLabeled.ExplicitGenericInvocationSuffix1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code explicitGenericInvocationSuffix1}
	 * labeled alternative in {@link JavaParserLabeled#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix1(JavaParserLabeled.ExplicitGenericInvocationSuffix1Context ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserLabeled#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(JavaParserLabeled.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserLabeled#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(JavaParserLabeled.ArgumentsContext ctx);
}