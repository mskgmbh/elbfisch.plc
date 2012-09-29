/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jpac.plc.s7.symaddr.node;

import org.jpac.plc.s7.symaddr.analysis.*;

@SuppressWarnings("nls")
public final class Start extends Node
{
    private PDatatype _pDatatype_;
    private EOF _eof_;

    public Start()
    {
        // Empty body
    }

    public Start(
        @SuppressWarnings("hiding") PDatatype _pDatatype_,
        @SuppressWarnings("hiding") EOF _eof_)
    {
        setPDatatype(_pDatatype_);
        setEOF(_eof_);
    }

    @Override
    public Object clone()
    {
        return new Start(
            cloneNode(this._pDatatype_),
            cloneNode(this._eof_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseStart(this);
    }

    public PDatatype getPDatatype()
    {
        return this._pDatatype_;
    }

    public void setPDatatype(PDatatype node)
    {
        if(this._pDatatype_ != null)
        {
            this._pDatatype_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pDatatype_ = node;
    }

    public EOF getEOF()
    {
        return this._eof_;
    }

    public void setEOF(EOF node)
    {
        if(this._eof_ != null)
        {
            this._eof_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._eof_ = node;
    }

    @Override
    void removeChild(Node child)
    {
        if(this._pDatatype_ == child)
        {
            this._pDatatype_ = null;
            return;
        }

        if(this._eof_ == child)
        {
            this._eof_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(Node oldChild, Node newChild)
    {
        if(this._pDatatype_ == oldChild)
        {
            setPDatatype((PDatatype) newChild);
            return;
        }

        if(this._eof_ == oldChild)
        {
            setEOF((EOF) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    public String toString()
    {
        return "" +
            toString(this._pDatatype_) +
            toString(this._eof_);
    }
}
