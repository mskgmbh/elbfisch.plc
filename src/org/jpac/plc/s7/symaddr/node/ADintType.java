/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jpac.plc.s7.symaddr.node;

import org.jpac.plc.s7.symaddr.analysis.*;

@SuppressWarnings("nls")
public final class ADintType extends PType
{
    private TDint _dint_;

    public ADintType()
    {
        // Constructor
    }

    public ADintType(
        @SuppressWarnings("hiding") TDint _dint_)
    {
        // Constructor
        setDint(_dint_);

    }

    @Override
    public Object clone()
    {
        return new ADintType(
            cloneNode(this._dint_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADintType(this);
    }

    public TDint getDint()
    {
        return this._dint_;
    }

    public void setDint(TDint node)
    {
        if(this._dint_ != null)
        {
            this._dint_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._dint_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._dint_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._dint_ == child)
        {
            this._dint_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._dint_ == oldChild)
        {
            setDint((TDint) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}