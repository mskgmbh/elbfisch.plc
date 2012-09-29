/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jpac.plc.s7.symaddr.node;

import org.jpac.plc.s7.symaddr.analysis.*;

@SuppressWarnings("nls")
public final class ATimeType extends PType
{
    private TTime _time_;

    public ATimeType()
    {
        // Constructor
    }

    public ATimeType(
        @SuppressWarnings("hiding") TTime _time_)
    {
        // Constructor
        setTime(_time_);

    }

    @Override
    public Object clone()
    {
        return new ATimeType(
            cloneNode(this._time_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATimeType(this);
    }

    public TTime getTime()
    {
        return this._time_;
    }

    public void setTime(TTime node)
    {
        if(this._time_ != null)
        {
            this._time_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._time_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._time_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._time_ == child)
        {
            this._time_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._time_ == oldChild)
        {
            setTime((TTime) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
