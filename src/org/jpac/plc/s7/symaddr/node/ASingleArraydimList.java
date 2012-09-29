/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jpac.plc.s7.symaddr.node;

import org.jpac.plc.s7.symaddr.analysis.*;

@SuppressWarnings("nls")
public final class ASingleArraydimList extends PArraydimList
{
    private PArraydim _arraydim_;

    public ASingleArraydimList()
    {
        // Constructor
    }

    public ASingleArraydimList(
        @SuppressWarnings("hiding") PArraydim _arraydim_)
    {
        // Constructor
        setArraydim(_arraydim_);

    }

    @Override
    public Object clone()
    {
        return new ASingleArraydimList(
            cloneNode(this._arraydim_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASingleArraydimList(this);
    }

    public PArraydim getArraydim()
    {
        return this._arraydim_;
    }

    public void setArraydim(PArraydim node)
    {
        if(this._arraydim_ != null)
        {
            this._arraydim_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._arraydim_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._arraydim_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._arraydim_ == child)
        {
            this._arraydim_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._arraydim_ == oldChild)
        {
            setArraydim((PArraydim) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
