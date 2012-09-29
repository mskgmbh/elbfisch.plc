/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jpac.plc.s7.symaddr.node;

import org.jpac.plc.s7.symaddr.analysis.*;

@SuppressWarnings("nls")
public final class AUdtType extends PType
{
    private TUdt _udt_;
    private TNumber _number_;

    public AUdtType()
    {
        // Constructor
    }

    public AUdtType(
        @SuppressWarnings("hiding") TUdt _udt_,
        @SuppressWarnings("hiding") TNumber _number_)
    {
        // Constructor
        setUdt(_udt_);

        setNumber(_number_);

    }

    @Override
    public Object clone()
    {
        return new AUdtType(
            cloneNode(this._udt_),
            cloneNode(this._number_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAUdtType(this);
    }

    public TUdt getUdt()
    {
        return this._udt_;
    }

    public void setUdt(TUdt node)
    {
        if(this._udt_ != null)
        {
            this._udt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._udt_ = node;
    }

    public TNumber getNumber()
    {
        return this._number_;
    }

    public void setNumber(TNumber node)
    {
        if(this._number_ != null)
        {
            this._number_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._number_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._udt_)
            + toString(this._number_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._udt_ == child)
        {
            this._udt_ = null;
            return;
        }

        if(this._number_ == child)
        {
            this._number_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._udt_ == oldChild)
        {
            setUdt((TUdt) newChild);
            return;
        }

        if(this._number_ == oldChild)
        {
            setNumber((TNumber) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
