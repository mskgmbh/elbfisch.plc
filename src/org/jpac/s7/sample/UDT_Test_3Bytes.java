/**
* PROJECT   : jpac sample project
* MODULE    : UDT_Test_3Bytes.java 
* VERSION   : $Revision$
* DATE      : $Date$
* PURPOSE   : implements the S7 data item UDT_Test_3Bytes
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
import org.jpac.plc.ByteRxTx;

public class UDT_Test_3Bytes extends LobRxTx{

    private ByteRxTx 		byte1;
    private ByteRxTx 		byte2;
    private ByteRxTx 		byte3;

    //constructor for standalone use
    public UDT_Test_3Bytes(Connection conn, Address address) throws IndexOutOfRangeException{
        super(conn, address, 0, null);
        setData(conn.generateDataObject(getSize()));
    }

    //constructor for use inside a structure
    public UDT_Test_3Bytes(Connection conn, Address address, int dataOffset, Data data) throws IndexOutOfRangeException{
        super(conn, address, dataOffset, data);
    }

    protected void assertIndexRange(int IndexNumber, int setFirstIndex, int setLastIndex, int actualIndex) throws IndexOutOfRangeException{
        if (actualIndex < setFirstIndex || actualIndex > setLastIndex)
            throw new IndexOutOfRangeException("expecting [" + setFirstIndex + ".." + setLastIndex + "] for index" + IndexNumber + ", found: " + actualIndex);
    }

    public static int getSize(){
        return 4;
    }


    @SuppressWarnings("empty-statement")
    public ByteRxTx getByte1() throws AddressException, IndexOutOfRangeException{
        if (byte1 == null){
            int byteOffset = getAddress().getByteIndex() + 0;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setSize(ByteRxTx.getSize());
            byte1 = new ByteRxTx(getConnection(), addr, byteOffset, getData());
        }
        return byte1;
    }

    @SuppressWarnings("empty-statement")
    public ByteRxTx getByte2() throws AddressException, IndexOutOfRangeException{
        if (byte2 == null){
            int byteOffset = getAddress().getByteIndex() + 1;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setSize(ByteRxTx.getSize());
            byte2 = new ByteRxTx(getConnection(), addr, byteOffset, getData());
        }
        return byte2;
    }

    @SuppressWarnings("empty-statement")
    public ByteRxTx getByte3() throws AddressException, IndexOutOfRangeException{
        if (byte3 == null){
            int byteOffset = getAddress().getByteIndex() + 2;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setSize(ByteRxTx.getSize());
            byte3 = new ByteRxTx(getConnection(), addr, byteOffset, getData());
        }
        return byte3;
    }
}