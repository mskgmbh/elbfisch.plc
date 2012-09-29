/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jpac.plc.s7.symaddr.node;

import org.jpac.plc.s7.symaddr.analysis.*;

@SuppressWarnings("nls")
public final class AMultipleIdentifierList extends PIdentifierList
{
    private PIdentifierList _identifierList_;
    private TComma _comma_;
    private TIdentifier _identifier_;

    public AMultipleIdentifierList()
    {
        // Constructor
    }

    public AMultipleIdentifierList(
        @SuppressWarnings("hiding") PIdentifierList _identifierList_,
        @SuppressWarnings("hiding") TComma _comma_,
        @SuppressWarnings("hiding") TIdentifier _identifier_)
    {
        // Constructor
        setIdentifierList(_identifierList_);

        setComma(_comma_);

        setIdentifier(_identifier_);

    }

    @Override
    public Object clone()
    {
        return new AMultipleIdentifierList(
            cloneNode(this._identifierList_),
            cloneNode(this._comma_),
            cloneNode(this._identifier_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMultipleIdentifierList(this);
    }

    public PIdentifierList getIdentifierList()
    {
        return this._identifierList_;
    }

    public void setIdentifierList(PIdentifierList node)
    {
        if(this._identifierList_ != null)
        {
            this._identifierList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identifierList_ = node;
    }

    public TComma getComma()
    {
        return this._comma_;
    }

    public void setComma(TComma node)
    {
        if(this._comma_ != null)
        {
            this._comma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comma_ = node;
    }

    public TIdentifier getIdentifier()
    {
        return this._identifier_;
    }

    public void setIdentifier(TIdentifier node)
    {
        if(this._identifier_ != null)
        {
            this._identifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identifier_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._identifierList_)
            + toString(this._comma_)
            + toString(this._identifier_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._identifierList_ == child)
        {
            this._identifierList_ = null;
            return;
        }

        if(this._comma_ == child)
        {
            this._comma_ = null;
            return;
        }

        if(this._identifier_ == child)
        {
            this._identifier_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._identifierList_ == oldChild)
        {
            setIdentifierList((PIdentifierList) newChild);
            return;
        }

        if(this._comma_ == oldChild)
        {
            setComma((TComma) newChild);
            return;
        }

        if(this._identifier_ == oldChild)
        {
            setIdentifier((TIdentifier) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
