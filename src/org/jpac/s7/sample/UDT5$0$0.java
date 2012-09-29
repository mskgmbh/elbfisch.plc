/**
* PROJECT   : jpac sample project
* MODULE    : UDT5$0$0.java 
* VERSION   : $Revision$
* DATE      : $Date$
* PURPOSE   : implements the S7 data item UDT5$0$0
* REMARKS   : this code was automatically generated by the struct generator
*             of the jPAC S7 communication library
* LOG       : $Log$
*
* The jPac S7 communication library is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* The jPac S7 communication library is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with the jPac S7 communication library. If not, see <http://www.gnu.org/licenses/>.
*
*/

package org.jpac.s7.sample;

import org.jpac.IndexOutOfRangeException;
import org.jpac.plc.AddressException;
import org.jpac.plc.Connection;
import org.jpac.plc.Address;
import org.jpac.plc.Data;
import org.jpac.plc.LobRxTx;
import org.jpac.plc.BitRxTx;
import org.jpac.plc.IntRxTx;

public class UDT5$0$0 extends LobRxTx{

    private IntRxTx 		field1;
    private IntRxTx 		field2;
    private IntRxTx 		field3;
    private BitRxTx 		field4;

    //constructor for standalone use
    public UDT5$0$0(Connection conn, Address address) throws IndexOutOfRangeException{
        super(conn, address, 0, null);
        setData(conn.generateDataObject(getSize()));
    }

    //constructor for use inside a structure
    public UDT5$0$0(Connection conn, Address address, int dataOffset, Data data) throws IndexOutOfRangeException{
        super(conn, address, dataOffset, data);
    }

    protected void assertIndexRange(int IndexNumber, int setFirstIndex, int setLastIndex, int actualIndex) throws IndexOutOfRangeException{
        if (actualIndex < setFirstIndex || actualIndex > setLastIndex)
            throw new IndexOutOfRangeException("expecting [" + setFirstIndex + ".." + setLastIndex + "] for index" + IndexNumber + ", found: " + actualIndex);
    }

    public static int getSize(){
        return 8;
    }


    @SuppressWarnings("empty-statement")
    public IntRxTx getField1() throws AddressException, IndexOutOfRangeException{
        if (field1 == null){
            int byteOffset = getAddress().getByteIndex() + 0;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setSize(IntRxTx.getSize());
            field1 = new IntRxTx(getConnection(), addr, byteOffset, getData());
        }
        return field1;
    }

    @SuppressWarnings("empty-statement")
    public IntRxTx getField2() throws AddressException, IndexOutOfRangeException{
        if (field2 == null){
            int byteOffset = getAddress().getByteIndex() + 2;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setSize(IntRxTx.getSize());
            field2 = new IntRxTx(getConnection(), addr, byteOffset, getData());
        }
        return field2;
    }

    @SuppressWarnings("empty-statement")
    public IntRxTx getField3() throws AddressException, IndexOutOfRangeException{
        if (field3 == null){
            int byteOffset = getAddress().getByteIndex() + 4;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setSize(IntRxTx.getSize());
            field3 = new IntRxTx(getConnection(), addr, byteOffset, getData());
        }
        return field3;
    }

    @SuppressWarnings("empty-statement")
    public BitRxTx getField4() throws AddressException, IndexOutOfRangeException{
        if (field4 == null){
            int byteOffset = getAddress().getByteIndex() + 6;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setBitIndex(0);
            addr.setSize(BitRxTx.getSize());
            field4 = new BitRxTx(getConnection(), addr, byteOffset, getData());
        }
        return field4;
    }
}
