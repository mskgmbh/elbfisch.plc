/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jpac.plc.s7.symaddr.node;

import java.util.*;
import org.jpac.plc.s7.symaddr.analysis.*;

@SuppressWarnings("nls")
public final class ASignednumber extends PSignednumber
{
    private final LinkedList<TSign> _sign_ = new LinkedList<TSign>();
    private TNumber _number_;

    public ASignednumber()
    {
        // Constructor
    }

    public ASignednumber(
        @SuppressWarnings("hiding") List<TSign> _sign_,
        @SuppressWarnings("hiding") TNumber _number_)
    {
        // Constructor
        setSign(_sign_);

        setNumber(_number_);

    }

    @Override
    public Object clone()
    {
        return new ASignednumber(
            cloneList(this._sign_),
            cloneNode(this._number_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASignednumber(this);
    }

    public LinkedList<TSign> getSign()
    {
        return this._sign_;
    }

    public void setSign(List<TSign> list)
    {
        this._sign_.clear();
        this._sign_.addAll(list);
        for(TSign e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
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
            + toString(this._sign_)
            + toString(this._number_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._sign_.remove(child))
        {
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
        for(ListIterator<TSign> i = this._sign_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((TSign) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._number_ == oldChild)
        {
            setNumber((TNumber) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}