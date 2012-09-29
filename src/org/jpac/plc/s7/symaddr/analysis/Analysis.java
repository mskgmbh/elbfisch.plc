/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jpac.plc.s7.symaddr.analysis;

import org.jpac.plc.s7.symaddr.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAVarDatatype(AVarDatatype node);
    void caseAStructDatatype(AStructDatatype node);
    void caseAVar(AVar node);
    void caseAStruct(AStruct node);
    void caseASingleVariablesDefinitionList(ASingleVariablesDefinitionList node);
    void caseAMultipleVariablesDefinitionList(AMultipleVariablesDefinitionList node);
    void caseAVariablesTypeAssignment(AVariablesTypeAssignment node);
    void caseAVariablesDefinition(AVariablesDefinition node);
    void caseASingleIdentifierList(ASingleIdentifierList node);
    void caseAMultipleIdentifierList(AMultipleIdentifierList node);
    void caseASignednumber(ASignednumber node);
    void caseAArraydim(AArraydim node);
    void caseAAdditionalarraydim(AAdditionalarraydim node);
    void caseASingleArraydimList(ASingleArraydimList node);
    void caseAMultipleArraydimList(AMultipleArraydimList node);
    void caseAArraydecl(AArraydecl node);
    void caseAStringdecl(AStringdecl node);
    void caseABoolType(ABoolType node);
    void caseAByteType(AByteType node);
    void caseACharType(ACharType node);
    void caseAWordType(AWordType node);
    void caseADwordType(ADwordType node);
    void caseAIntType(AIntType node);
    void caseADintType(ADintType node);
    void caseARealType(ARealType node);
    void caseAStringType(AStringType node);
    void caseAUdtType(AUdtType node);
    void caseAS5timeType(AS5timeType node);
    void caseATimeType(ATimeType node);
    void caseATimeofdayType(ATimeofdayType node);
    void caseADateType(ADateType node);
    void caseADateandtimeType(ADateandtimeType node);
    void caseAArrayType(AArrayType node);
    void caseAStructType(AStructType node);

    void caseTStructsym(TStructsym node);
    void caseTStructendsym(TStructendsym node);
    void caseTVarsym(TVarsym node);
    void caseTBool(TBool node);
    void caseTByte(TByte node);
    void caseTChar(TChar node);
    void caseTWord(TWord node);
    void caseTDword(TDword node);
    void caseTInt(TInt node);
    void caseTDint(TDint node);
    void caseTReal(TReal node);
    void caseTString(TString node);
    void caseTUdt(TUdt node);
    void caseTS5time(TS5time node);
    void caseTTime(TTime node);
    void caseTTimeofday(TTimeofday node);
    void caseTDate(TDate node);
    void caseTDateandtime(TDateandtime node);
    void caseTArray(TArray node);
    void caseTOf(TOf node);
    void caseTComma(TComma node);
    void caseTColon(TColon node);
    void caseTSemicolon(TSemicolon node);
    void caseTDot(TDot node);
    void caseTDotdot(TDotdot node);
    void caseTLParen(TLParen node);
    void caseTRParen(TRParen node);
    void caseTLSquarebracket(TLSquarebracket node);
    void caseTRSquarebracket(TRSquarebracket node);
    void caseTIdentifier(TIdentifier node);
    void caseTSign(TSign node);
    void caseTNumber(TNumber node);
    void caseTTraditionalComment(TTraditionalComment node);
    void caseTDocumentationComment(TDocumentationComment node);
    void caseTEndOfLineComment(TEndOfLineComment node);
    void caseTIntialization(TIntialization node);
    void caseTBlanks(TBlanks node);
    void caseEOF(EOF node);
}
