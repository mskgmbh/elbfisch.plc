/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jpac.plc.s7.symaddr.node;

import org.jpac.plc.s7.symaddr.analysis.*;

@SuppressWarnings("nls")
public final class AArraydecl extends PArraydecl
{
    private TArray _array_;
    private TLSquarebracket _lSquarebracket_;
    private PArraydimList _arraydimList_;
    private TRSquarebracket _rSquarebracket_;
    private TOf _of_;
    private PType _type_;

    public AArraydecl()
    {
        // Constructor
    }

    public AArraydecl(
        @SuppressWarnings("hiding") TArray _array_,
        @SuppressWarnings("hiding") TLSquarebracket _lSquarebracket_,
        @SuppressWarnings("hiding") PArraydimList _arraydimList_,
        @SuppressWarnings("hiding") TRSquarebracket _rSquarebracket_,
        @SuppressWarnings("hiding") TOf _of_,
        @SuppressWarnings("hiding") PType _type_)
    {
        // Constructor
        setArray(_array_);

        setLSquarebracket(_lSquarebracket_);

        setArraydimList(_arraydimList_);

        setRSquarebracket(_rSquarebracket_);

        setOf(_of_);

        setType(_type_);

    }

    @Override
    public Object clone()
    {
        return new AArraydecl(
            cloneNode(this._array_),
            cloneNode(this._lSquarebracket_),
            cloneNode(this._arraydimList_),
            cloneNode(this._rSquarebracket_),
            cloneNode(this._of_),
            cloneNode(this._type_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArraydecl(this);
    }

    public TArray getArray()
    {
        return this._array_;
    }

    public void setArray(TArray node)
    {
        if(this._array_ != null)
        {
            this._array_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._array_ = node;
    }

    public TLSquarebracket getLSquarebracket()
    {
        return this._lSquarebracket_;
    }

    public void setLSquarebracket(TLSquarebracket node)
    {
        if(this._lSquarebracket_ != null)
        {
            this._lSquarebracket_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lSquarebracket_ = node;
    }

    public PArraydimList getArraydimList()
    {
        return this._arraydimList_;
    }

    public void setArraydimList(PArraydimList node)
    {
        if(this._arraydimList_ != null)
        {
            this._arraydimList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._arraydimList_ = node;
    }

    public TRSquarebracket getRSquarebracket()
    {
        return this._rSquarebracket_;
    }

    public void setRSquarebracket(TRSquarebracket node)
    {
        if(this._rSquarebracket_ != null)
        {
            this._rSquarebracket_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rSquarebracket_ = node;
    }

    public TOf getOf()
    {
        return this._of_;
    }

    public void setOf(TOf node)
    {
        if(this._of_ != null)
        {
            this._of_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._of_ = node;
    }

    public PType getType()
    {
        return this._type_;
    }

    public void setType(PType node)
    {
        if(this._type_ != null)
        {
            this._type_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._type_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._array_)
            + toString(this._lSquarebracket_)
            + toString(this._arraydimList_)
            + toString(this._rSquarebracket_)
            + toString(this._of_)
            + toString(this._type_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._array_ == child)
        {
            this._array_ = null;
            return;
        }

        if(this._lSquarebracket_ == child)
        {
            this._lSquarebracket_ = null;
            return;
        }

        if(this._arraydimList_ == child)
        {
            this._arraydimList_ = null;
            return;
        }

        if(this._rSquarebracket_ == child)
        {
            this._rSquarebracket_ = null;
            return;
        }

        if(this._of_ == child)
        {
            this._of_ = null;
            return;
        }

        if(this._type_ == child)
        {
            this._type_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._array_ == oldChild)
        {
            setArray((TArray) newChild);
            return;
        }

        if(this._lSquarebracket_ == oldChild)
        {
            setLSquarebracket((TLSquarebracket) newChild);
            return;
        }

        if(this._arraydimList_ == oldChild)
        {
            setArraydimList((PArraydimList) newChild);
            return;
        }

        if(this._rSquarebracket_ == oldChild)
        {
            setRSquarebracket((TRSquarebracket) newChild);
            return;
        }

        if(this._of_ == oldChild)
        {
            setOf((TOf) newChild);
            return;
        }

        if(this._type_ == oldChild)
        {
            setType((PType) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
