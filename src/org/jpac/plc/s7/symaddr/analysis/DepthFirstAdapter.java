/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jpac.plc.s7.symaddr.analysis;

import java.util.*;
import org.jpac.plc.s7.symaddr.node.*;

public class DepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getPDatatype().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inAVarDatatype(AVarDatatype node)
    {
        defaultIn(node);
    }

    public void outAVarDatatype(AVarDatatype node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarDatatype(AVarDatatype node)
    {
        inAVarDatatype(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAVarDatatype(node);
    }

    public void inAStructDatatype(AStructDatatype node)
    {
        defaultIn(node);
    }

    public void outAStructDatatype(AStructDatatype node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStructDatatype(AStructDatatype node)
    {
        inAStructDatatype(node);
        if(node.getStruct() != null)
        {
            node.getStruct().apply(this);
        }
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        outAStructDatatype(node);
    }

    public void inAVar(AVar node)
    {
        defaultIn(node);
    }

    public void outAVar(AVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVar(AVar node)
    {
        inAVar(node);
        if(node.getVarsym() != null)
        {
            node.getVarsym().apply(this);
        }
        if(node.getVariablesDefinitionList() != null)
        {
            node.getVariablesDefinitionList().apply(this);
        }
        outAVar(node);
    }

    public void inAStruct(AStruct node)
    {
        defaultIn(node);
    }

    public void outAStruct(AStruct node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStruct(AStruct node)
    {
        inAStruct(node);
        if(node.getStructsym() != null)
        {
            node.getStructsym().apply(this);
        }
        if(node.getVariablesDefinitionList() != null)
        {
            node.getVariablesDefinitionList().apply(this);
        }
        if(node.getStructendsym() != null)
        {
            node.getStructendsym().apply(this);
        }
        outAStruct(node);
    }

    public void inASingleVariablesDefinitionList(ASingleVariablesDefinitionList node)
    {
        defaultIn(node);
    }

    public void outASingleVariablesDefinitionList(ASingleVariablesDefinitionList node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASingleVariablesDefinitionList(ASingleVariablesDefinitionList node)
    {
        inASingleVariablesDefinitionList(node);
        if(node.getVariablesDefinition() != null)
        {
            node.getVariablesDefinition().apply(this);
        }
        outASingleVariablesDefinitionList(node);
    }

    public void inAMultipleVariablesDefinitionList(AMultipleVariablesDefinitionList node)
    {
        defaultIn(node);
    }

    public void outAMultipleVariablesDefinitionList(AMultipleVariablesDefinitionList node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultipleVariablesDefinitionList(AMultipleVariablesDefinitionList node)
    {
        inAMultipleVariablesDefinitionList(node);
        if(node.getVariablesDefinitionList() != null)
        {
            node.getVariablesDefinitionList().apply(this);
        }
        if(node.getVariablesDefinition() != null)
        {
            node.getVariablesDefinition().apply(this);
        }
        outAMultipleVariablesDefinitionList(node);
    }

    public void inAVariablesTypeAssignment(AVariablesTypeAssignment node)
    {
        defaultIn(node);
    }

    public void outAVariablesTypeAssignment(AVariablesTypeAssignment node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariablesTypeAssignment(AVariablesTypeAssignment node)
    {
        inAVariablesTypeAssignment(node);
        if(node.getIdentifierList() != null)
        {
            node.getIdentifierList().apply(this);
        }
        if(node.getColon() != null)
        {
            node.getColon().apply(this);
        }
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        outAVariablesTypeAssignment(node);
    }

    public void inAVariablesDefinition(AVariablesDefinition node)
    {
        defaultIn(node);
    }

    public void outAVariablesDefinition(AVariablesDefinition node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariablesDefinition(AVariablesDefinition node)
    {
        inAVariablesDefinition(node);
        if(node.getVariablesTypeAssignment() != null)
        {
            node.getVariablesTypeAssignment().apply(this);
        }
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        outAVariablesDefinition(node);
    }

    public void inASingleIdentifierList(ASingleIdentifierList node)
    {
        defaultIn(node);
    }

    public void outASingleIdentifierList(ASingleIdentifierList node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASingleIdentifierList(ASingleIdentifierList node)
    {
        inASingleIdentifierList(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outASingleIdentifierList(node);
    }

    public void inAMultipleIdentifierList(AMultipleIdentifierList node)
    {
        defaultIn(node);
    }

    public void outAMultipleIdentifierList(AMultipleIdentifierList node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultipleIdentifierList(AMultipleIdentifierList node)
    {
        inAMultipleIdentifierList(node);
        if(node.getIdentifierList() != null)
        {
            node.getIdentifierList().apply(this);
        }
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAMultipleIdentifierList(node);
    }

    public void inASignednumber(ASignednumber node)
    {
        defaultIn(node);
    }

    public void outASignednumber(ASignednumber node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASignednumber(ASignednumber node)
    {
        inASignednumber(node);
        {
            List<TSign> copy = new ArrayList<TSign>(node.getSign());
            for(TSign e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getNumber() != null)
        {
            node.getNumber().apply(this);
        }
        outASignednumber(node);
    }

    public void inAArraydim(AArraydim node)
    {
        defaultIn(node);
    }

    public void outAArraydim(AArraydim node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArraydim(AArraydim node)
    {
        inAArraydim(node);
        if(node.getFirstindex() != null)
        {
            node.getFirstindex().apply(this);
        }
        if(node.getDotdot() != null)
        {
            node.getDotdot().apply(this);
        }
        if(node.getLastindex() != null)
        {
            node.getLastindex().apply(this);
        }
        outAArraydim(node);
    }

    public void inAAdditionalarraydim(AAdditionalarraydim node)
    {
        defaultIn(node);
    }

    public void outAAdditionalarraydim(AAdditionalarraydim node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAdditionalarraydim(AAdditionalarraydim node)
    {
        inAAdditionalarraydim(node);
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        if(node.getArraydim() != null)
        {
            node.getArraydim().apply(this);
        }
        outAAdditionalarraydim(node);
    }

    public void inASingleArraydimList(ASingleArraydimList node)
    {
        defaultIn(node);
    }

    public void outASingleArraydimList(ASingleArraydimList node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASingleArraydimList(ASingleArraydimList node)
    {
        inASingleArraydimList(node);
        if(node.getArraydim() != null)
        {
            node.getArraydim().apply(this);
        }
        outASingleArraydimList(node);
    }

    public void inAMultipleArraydimList(AMultipleArraydimList node)
    {
        defaultIn(node);
    }

    public void outAMultipleArraydimList(AMultipleArraydimList node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultipleArraydimList(AMultipleArraydimList node)
    {
        inAMultipleArraydimList(node);
        if(node.getArraydimList() != null)
        {
            node.getArraydimList().apply(this);
        }
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        if(node.getArraydim() != null)
        {
            node.getArraydim().apply(this);
        }
        outAMultipleArraydimList(node);
    }

    public void inAArraydecl(AArraydecl node)
    {
        defaultIn(node);
    }

    public void outAArraydecl(AArraydecl node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArraydecl(AArraydecl node)
    {
        inAArraydecl(node);
        if(node.getArray() != null)
        {
            node.getArray().apply(this);
        }
        if(node.getLSquarebracket() != null)
        {
            node.getLSquarebracket().apply(this);
        }
        if(node.getArraydimList() != null)
        {
            node.getArraydimList().apply(this);
        }
        if(node.getRSquarebracket() != null)
        {
            node.getRSquarebracket().apply(this);
        }
        if(node.getOf() != null)
        {
            node.getOf().apply(this);
        }
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        outAArraydecl(node);
    }

    public void inAStringdecl(AStringdecl node)
    {
        defaultIn(node);
    }

    public void outAStringdecl(AStringdecl node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStringdecl(AStringdecl node)
    {
        inAStringdecl(node);
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        if(node.getLSquarebracket() != null)
        {
            node.getLSquarebracket().apply(this);
        }
        if(node.getNumber() != null)
        {
            node.getNumber().apply(this);
        }
        if(node.getRSquarebracket() != null)
        {
            node.getRSquarebracket().apply(this);
        }
        outAStringdecl(node);
    }

    public void inABoolType(ABoolType node)
    {
        defaultIn(node);
    }

    public void outABoolType(ABoolType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABoolType(ABoolType node)
    {
        inABoolType(node);
        if(node.getBool() != null)
        {
            node.getBool().apply(this);
        }
        outABoolType(node);
    }

    public void inAByteType(AByteType node)
    {
        defaultIn(node);
    }

    public void outAByteType(AByteType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAByteType(AByteType node)
    {
        inAByteType(node);
        if(node.getByte() != null)
        {
            node.getByte().apply(this);
        }
        outAByteType(node);
    }

    public void inACharType(ACharType node)
    {
        defaultIn(node);
    }

    public void outACharType(ACharType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACharType(ACharType node)
    {
        inACharType(node);
        if(node.getChar() != null)
        {
            node.getChar().apply(this);
        }
        outACharType(node);
    }

    public void inAWordType(AWordType node)
    {
        defaultIn(node);
    }

    public void outAWordType(AWordType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAWordType(AWordType node)
    {
        inAWordType(node);
        if(node.getWord() != null)
        {
            node.getWord().apply(this);
        }
        outAWordType(node);
    }

    public void inADwordType(ADwordType node)
    {
        defaultIn(node);
    }

    public void outADwordType(ADwordType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADwordType(ADwordType node)
    {
        inADwordType(node);
        if(node.getDword() != null)
        {
            node.getDword().apply(this);
        }
        outADwordType(node);
    }

    public void inAIntType(AIntType node)
    {
        defaultIn(node);
    }

    public void outAIntType(AIntType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntType(AIntType node)
    {
        inAIntType(node);
        if(node.getInt() != null)
        {
            node.getInt().apply(this);
        }
        outAIntType(node);
    }

    public void inADintType(ADintType node)
    {
        defaultIn(node);
    }

    public void outADintType(ADintType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADintType(ADintType node)
    {
        inADintType(node);
        if(node.getDint() != null)
        {
            node.getDint().apply(this);
        }
        outADintType(node);
    }

    public void inARealType(ARealType node)
    {
        defaultIn(node);
    }

    public void outARealType(ARealType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARealType(ARealType node)
    {
        inARealType(node);
        if(node.getReal() != null)
        {
            node.getReal().apply(this);
        }
        outARealType(node);
    }

    public void inAStringType(AStringType node)
    {
        defaultIn(node);
    }

    public void outAStringType(AStringType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStringType(AStringType node)
    {
        inAStringType(node);
        if(node.getStringdecl() != null)
        {
            node.getStringdecl().apply(this);
        }
        outAStringType(node);
    }

    public void inAUdtType(AUdtType node)
    {
        defaultIn(node);
    }

    public void outAUdtType(AUdtType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAUdtType(AUdtType node)
    {
        inAUdtType(node);
        if(node.getUdt() != null)
        {
            node.getUdt().apply(this);
        }
        if(node.getNumber() != null)
        {
            node.getNumber().apply(this);
        }
        outAUdtType(node);
    }

    public void inAS5timeType(AS5timeType node)
    {
        defaultIn(node);
    }

    public void outAS5timeType(AS5timeType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAS5timeType(AS5timeType node)
    {
        inAS5timeType(node);
        if(node.getS5time() != null)
        {
            node.getS5time().apply(this);
        }
        outAS5timeType(node);
    }

    public void inATimeType(ATimeType node)
    {
        defaultIn(node);
    }

    public void outATimeType(ATimeType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATimeType(ATimeType node)
    {
        inATimeType(node);
        if(node.getTime() != null)
        {
            node.getTime().apply(this);
        }
        outATimeType(node);
    }

    public void inATimeofdayType(ATimeofdayType node)
    {
        defaultIn(node);
    }

    public void outATimeofdayType(ATimeofdayType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATimeofdayType(ATimeofdayType node)
    {
        inATimeofdayType(node);
        if(node.getTimeofday() != null)
        {
            node.getTimeofday().apply(this);
        }
        outATimeofdayType(node);
    }

    public void inADateType(ADateType node)
    {
        defaultIn(node);
    }

    public void outADateType(ADateType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADateType(ADateType node)
    {
        inADateType(node);
        if(node.getDate() != null)
        {
            node.getDate().apply(this);
        }
        outADateType(node);
    }

    public void inADateandtimeType(ADateandtimeType node)
    {
        defaultIn(node);
    }

    public void outADateandtimeType(ADateandtimeType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADateandtimeType(ADateandtimeType node)
    {
        inADateandtimeType(node);
        if(node.getDateandtime() != null)
        {
            node.getDateandtime().apply(this);
        }
        outADateandtimeType(node);
    }

    public void inAArrayType(AArrayType node)
    {
        defaultIn(node);
    }

    public void outAArrayType(AArrayType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArrayType(AArrayType node)
    {
        inAArrayType(node);
        if(node.getArraydecl() != null)
        {
            node.getArraydecl().apply(this);
        }
        outAArrayType(node);
    }

    public void inAStructType(AStructType node)
    {
        defaultIn(node);
    }

    public void outAStructType(AStructType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStructType(AStructType node)
    {
        inAStructType(node);
        if(node.getStruct() != null)
        {
            node.getStruct().apply(this);
        }
        outAStructType(node);
    }
}
