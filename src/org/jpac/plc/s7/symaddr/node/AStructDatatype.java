/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jpac.plc.s7.symaddr.node;

import org.jpac.plc.s7.symaddr.analysis.*;

@SuppressWarnings("nls")
public final class AStructDatatype extends PDatatype
{
    private PStruct _struct_;
    private TSemicolon _semicolon_;

    public AStructDatatype()
    {
        // Constructor
    }

    public AStructDatatype(
        @SuppressWarnings("hiding") PStruct _struct_,
        @SuppressWarnings("hiding") TSemicolon _semicolon_)
    {
        // Constructor
        setStruct(_struct_);

        setSemicolon(_semicolon_);

    }

    @Override
    public Object clone()
    {
        return new AStructDatatype(
            cloneNode(this._struct_),
            cloneNode(this._semicolon_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAStructDatatype(this);
    }

    public PStruct getStruct()
    {
        return this._struct_;
    }

    public void setStruct(PStruct node)
    {
        if(this._struct_ != null)
        {
            this._struct_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._struct_ = node;
    }

    public TSemicolon getSemicolon()
    {
        return this._semicolon_;
    }

    public void setSemicolon(TSemicolon node)
    {
        if(this._semicolon_ != null)
        {
            this._semicolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._semicolon_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._struct_)
            + toString(this._semicolon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._struct_ == child)
        {
            this._struct_ = null;
            return;
        }

        if(this._semicolon_ == child)
        {
            this._semicolon_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._struct_ == oldChild)
        {
            setStruct((PStruct) newChild);
            return;
        }

        if(this._semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}