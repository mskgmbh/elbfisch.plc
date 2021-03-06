/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jpac.plc.s7.symaddr.node;

import org.jpac.plc.s7.symaddr.analysis.*;

@SuppressWarnings("nls")
public final class TDateandtime extends Token
{
    public TDateandtime(String text)
    {
        setText(text);
    }

    public TDateandtime(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TDateandtime(getText(), getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTDateandtime(this);
    }
}
