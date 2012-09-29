/**
* PROJECT   : jpac sample project
* MODULE    : DB42_LenTest.java 
* VERSION   : $Revision$
* DATE      : $Date$
* PURPOSE   : implements the S7 data item DB42_LenTest
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
import org.jpac.plc.DintRxTx;
import org.jpac.plc.ByteRxTx;
import org.jpac.plc.BitRxTx;
import org.jpac.plc.IntRxTx;

public class DB42_LenTest extends LobRxTx{

    private UDT_Test_Syntax 		UB_syntac;
    private UDT_Test_Array1D 		UBf1D1;
    private BitRxTx 		bi1;
    private UDT_Test_Array2D 		UBf2D1;
    private BitRxTx 		bi2;
    private DintRxTx 		d1;
    private DintRxTx 		d2;
    private BitRxTx 		bi3;
    private UDT_Test_Array1D 		UBf1D2;
    private UDT_Test_Array2D 		UBf2D2;
    private BitRxTx 		bi4;
    private IntRxTx 		i1;
    private UDT_Test_Array1D 		UBf1D3;
    private UDT_Test_Array2D 		UBf2D3;
    private BitRxTx 		bi5;
    private ByteRxTx 		by1;
    private ByteRxTx 		by2;
    private IntRxTx 		i2;
    private BitRxTx[] 		dBf1D1;
    private BitRxTx 		bi6;
    private BitRxTx[][] 		dBf2D1;
    private BitRxTx 		bi7;
    private BitRxTx[] 		dBf1D2;
    private BitRxTx[] 		dBf1D3;
    private ByteRxTx 		by3;
    private IntRxTx 		i3;
    private UDT_Test_3Bits 		U3Bits1;
    private BitRxTx 		bi8;
    private UDT_Test_3Bits 		U3Bits2;
    private UDT_Test_3Bits 		U3Bits3;
    private ByteRxTx 		by4;
    private IntRxTx 		i4;
    private UDT_Test_3Bytes 		U3Bytes1;
    private BitRxTx 		bi9;
    private UDT_Test_3Bytes 		U3Bytes2;
    private UDT_Test_3Bytes 		U3Bytes3;
    private ByteRxTx 		by5;
    private IntRxTx 		i5;
    private UDT_Test_3Bits 		U3Bits4;
    private UDT_Test_3Bytes 		U3Bytes4;
    private UDT_Test_3Bits 		U3Bits5;
    private DintRxTx 		d3;
    private ByteRxTx[][] 		dYf2D1;
    private DintRxTx 		d4;
    private ByteRxTx[][] 		dCf2D1;
    private DintRxTx 		d5;
    private BitRxTx[][] 		dBf2D2;
    private DintRxTx 		d6;
    private BitRxTx[][][] 		dBf3D1;
    private DintRxTx 		d7;

    //constructor for standalone use
    public DB42_LenTest(Connection conn, Address address) throws IndexOutOfRangeException{
        super(conn, address, 0, null);
        setData(conn.generateDataObject(getSize()));
    }

    //constructor for use inside a structure
    public DB42_LenTest(Connection conn, Address address, int dataOffset, Data data) throws IndexOutOfRangeException{
        super(conn, address, dataOffset, data);
    }

    protected void assertIndexRange(int IndexNumber, int setFirstIndex, int setLastIndex, int actualIndex) throws IndexOutOfRangeException{
        if (actualIndex < setFirstIndex || actualIndex > setLastIndex)
            throw new IndexOutOfRangeException("expecting [" + setFirstIndex + ".." + setLastIndex + "] for index" + IndexNumber + ", found: " + actualIndex);
    }

    public static int getSize(){
        return 5640;
    }


    @SuppressWarnings("empty-statement")
    public UDT_Test_Syntax getUB_syntac() throws AddressException, IndexOutOfRangeException{
        if (UB_syntac == null){
            int byteOffset = getAddress().getByteIndex() + 0;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setSize(UDT_Test_Syntax.getSize());
            UB_syntac = new UDT_Test_Syntax(getConnection(), addr, byteOffset, getData());
        }
        return UB_syntac;
    }

    @SuppressWarnings("empty-statement")
    public UDT_Test_Array1D getUBf1D1() throws AddressException, IndexOutOfRangeException{
        if (UBf1D1 == null){
            int byteOffset = getAddress().getByteIndex() + 5452;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setSize(UDT_Test_Array1D.getSize());
            UBf1D1 = new UDT_Test_Array1D(getConnection(), addr, byteOffset, getData());
        }
        return UBf1D1;
    }

    @SuppressWarnings("empty-statement")
    public BitRxTx getBi1() throws AddressException, IndexOutOfRangeException{
        if (bi1 == null){
            int byteOffset = getAddress().getByteIndex() + 5456;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setBitIndex(0);
            addr.setSize(BitRxTx.getSize());
            bi1 = new BitRxTx(getConnection(), addr, byteOffset, getData());
        }
        return bi1;
    }

    @SuppressWarnings("empty-statement")
    public UDT_Test_Array2D getUBf2D1() throws AddressException, IndexOutOfRangeException{
        if (UBf2D1 == null){
            int byteOffset = getAddress().getByteIndex() + 5458;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setSize(UDT_Test_Array2D.getSize());
            UBf2D1 = new UDT_Test_Array2D(getConnection(), addr, byteOffset, getData());
        }
        return UBf2D1;
    }

    @SuppressWarnings("empty-statement")
    public BitRxTx getBi2() throws AddressException, IndexOutOfRangeException{
        if (bi2 == null){
            int byteOffset = getAddress().getByteIndex() + 5462;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setBitIndex(0);
            addr.setSize(BitRxTx.getSize());
            bi2 = new BitRxTx(getConnection(), addr, byteOffset, getData());
        }
        return bi2;
    }

    @SuppressWarnings("empty-statement")
    public DintRxTx getD1() throws AddressException, IndexOutOfRangeException{
        if (d1 == null){
            int byteOffset = getAddress().getByteIndex() + 5464;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setSize(DintRxTx.getSize());
            d1 = new DintRxTx(getConnection(), addr, byteOffset, getData());
        }
        return d1;
    }

    @SuppressWarnings("empty-statement")
    public DintRxTx getD2() throws AddressException, IndexOutOfRangeException{
        if (d2 == null){
            int byteOffset = getAddress().getByteIndex() + 5468;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setSize(DintRxTx.getSize());
            d2 = new DintRxTx(getConnection(), addr, byteOffset, getData());
        }
        return d2;
    }

    @SuppressWarnings("empty-statement")
    public BitRxTx getBi3() throws AddressException, IndexOutOfRangeException{
        if (bi3 == null){
            int byteOffset = getAddress().getByteIndex() + 5472;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setBitIndex(0);
            addr.setSize(BitRxTx.getSize());
            bi3 = new BitRxTx(getConnection(), addr, byteOffset, getData());
        }
        return bi3;
    }

    @SuppressWarnings("empty-statement")
    public UDT_Test_Array1D getUBf1D2() throws AddressException, IndexOutOfRangeException{
        if (UBf1D2 == null){
            int byteOffset = getAddress().getByteIndex() + 5474;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setSize(UDT_Test_Array1D.getSize());
            UBf1D2 = new UDT_Test_Array1D(getConnection(), addr, byteOffset, getData());
        }
        return UBf1D2;
    }

    @SuppressWarnings("empty-statement")
    public UDT_Test_Array2D getUBf2D2() throws AddressException, IndexOutOfRangeException{
        if (UBf2D2 == null){
            int byteOffset = getAddress().getByteIndex() + 5478;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setSize(UDT_Test_Array2D.getSize());
            UBf2D2 = new UDT_Test_Array2D(getConnection(), addr, byteOffset, getData());
        }
        return UBf2D2;
    }

    @SuppressWarnings("empty-statement")
    public BitRxTx getBi4() throws AddressException, IndexOutOfRangeException{
        if (bi4 == null){
            int byteOffset = getAddress().getByteIndex() + 5482;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setBitIndex(0);
            addr.setSize(BitRxTx.getSize());
            bi4 = new BitRxTx(getConnection(), addr, byteOffset, getData());
        }
        return bi4;
    }

    @SuppressWarnings("empty-statement")
    public IntRxTx getI1() throws AddressException, IndexOutOfRangeException{
        if (i1 == null){
            int byteOffset = getAddress().getByteIndex() + 5484;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setSize(IntRxTx.getSize());
            i1 = new IntRxTx(getConnection(), addr, byteOffset, getData());
        }
        return i1;
    }

    @SuppressWarnings("empty-statement")
    public UDT_Test_Array1D getUBf1D3() throws AddressException, IndexOutOfRangeException{
        if (UBf1D3 == null){
            int byteOffset = getAddress().getByteIndex() + 5486;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setSize(UDT_Test_Array1D.getSize());
            UBf1D3 = new UDT_Test_Array1D(getConnection(), addr, byteOffset, getData());
        }
        return UBf1D3;
    }

    @SuppressWarnings("empty-statement")
    public UDT_Test_Array2D getUBf2D3() throws AddressException, IndexOutOfRangeException{
        if (UBf2D3 == null){
            int byteOffset = getAddress().getByteIndex() + 5490;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setSize(UDT_Test_Array2D.getSize());
            UBf2D3 = new UDT_Test_Array2D(getConnection(), addr, byteOffset, getData());
        }
        return UBf2D3;
    }

    @SuppressWarnings("empty-statement")
    public BitRxTx getBi5() throws AddressException, IndexOutOfRangeException{
        if (bi5 == null){
            int byteOffset = getAddress().getByteIndex() + 5494;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setBitIndex(0);
            addr.setSize(BitRxTx.getSize());
            bi5 = new BitRxTx(getConnection(), addr, byteOffset, getData());
        }
        return bi5;
    }

    @SuppressWarnings("empty-statement")
    public ByteRxTx getBy1() throws AddressException, IndexOutOfRangeException{
        if (by1 == null){
            int byteOffset = getAddress().getByteIndex() + 5495;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setSize(ByteRxTx.getSize());
            by1 = new ByteRxTx(getConnection(), addr, byteOffset, getData());
        }
        return by1;
    }

    @SuppressWarnings("empty-statement")
    public ByteRxTx getBy2() throws AddressException, IndexOutOfRangeException{
        if (by2 == null){
            int byteOffset = getAddress().getByteIndex() + 5496;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setSize(ByteRxTx.getSize());
            by2 = new ByteRxTx(getConnection(), addr, byteOffset, getData());
        }
        return by2;
    }

    @SuppressWarnings("empty-statement")
    public IntRxTx getI2() throws AddressException, IndexOutOfRangeException{
        if (i2 == null){
            int byteOffset = getAddress().getByteIndex() + 5498;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setSize(IntRxTx.getSize());
            i2 = new IntRxTx(getConnection(), addr, byteOffset, getData());
        }
        return i2;
    }

    @SuppressWarnings("empty-statement")
    public BitRxTx getDBf1D1(int index1) throws AddressException, IndexOutOfRangeException{

        assertIndexRange(1, 1, 21, index1);

        if (dBf1D1 == null){
            dBf1D1 = new BitRxTx[21];
        }
        //check, if the item already has been accessed
        if (dBf1D1[index1 - 1] == null){
            //if not, instantiate a new representation
            //and store it for subsequent uses
            int byteOffset = getAddress().getByteIndex() + 5500 + (index1 - 1) / 8 ;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setBitIndex((index1 - 1) % 8);
            addr.setSize(BitRxTx.getSize());
            dBf1D1[index1 - 1] = new BitRxTx(getConnection(), addr, byteOffset, getData());
        }
        return dBf1D1[index1 - 1];
    }

    @SuppressWarnings("empty-statement")
    public BitRxTx getBi6() throws AddressException, IndexOutOfRangeException{
        if (bi6 == null){
            int byteOffset = getAddress().getByteIndex() + 5504;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setBitIndex(0);
            addr.setSize(BitRxTx.getSize());
            bi6 = new BitRxTx(getConnection(), addr, byteOffset, getData());
        }
        return bi6;
    }

    @SuppressWarnings("empty-statement")
    public BitRxTx getDBf2D1(int index1 ,int index2) throws AddressException, IndexOutOfRangeException{

        assertIndexRange(1, 1, 3, index1);
        assertIndexRange(2, 1, 5, index2);

        if (dBf2D1 == null){
            dBf2D1 = new BitRxTx[3][5];
        }
        //check, if the item already has been accessed
        if (dBf2D1[index1 - 1][index2 - 1] == null){
            //if not, instantiate a new representation
            //and store it for subsequent uses
            int dimSize2 = 1;
            int byteOffset = getAddress().getByteIndex() + 5506 + (index1 - 1)*dimSize2 + (index2 - 1) / 8;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setBitIndex((index2 - 1) % 8);
            addr.setSize(BitRxTx.getSize());
            dBf2D1[index1 - 1][index2 - 1] = new BitRxTx(getConnection(), addr, byteOffset, getData());
        }
        return dBf2D1[index1 - 1][index2 - 1];
    }

    @SuppressWarnings("empty-statement")
    public BitRxTx getBi7() throws AddressException, IndexOutOfRangeException{
        if (bi7 == null){
            int byteOffset = getAddress().getByteIndex() + 5510;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setBitIndex(0);
            addr.setSize(BitRxTx.getSize());
            bi7 = new BitRxTx(getConnection(), addr, byteOffset, getData());
        }
        return bi7;
    }

    @SuppressWarnings("empty-statement")
    public BitRxTx getDBf1D2(int index1) throws AddressException, IndexOutOfRangeException{

        assertIndexRange(1, 1, 21, index1);

        if (dBf1D2 == null){
            dBf1D2 = new BitRxTx[21];
        }
        //check, if the item already has been accessed
        if (dBf1D2[index1 - 1] == null){
            //if not, instantiate a new representation
            //and store it for subsequent uses
            int byteOffset = getAddress().getByteIndex() + 5512 + (index1 - 1) / 8 ;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setBitIndex((index1 - 1) % 8);
            addr.setSize(BitRxTx.getSize());
            dBf1D2[index1 - 1] = new BitRxTx(getConnection(), addr, byteOffset, getData());
        }
        return dBf1D2[index1 - 1];
    }

    @SuppressWarnings("empty-statement")
    public BitRxTx getDBf1D3(int index1) throws AddressException, IndexOutOfRangeException{

        assertIndexRange(1, 1, 21, index1);

        if (dBf1D3 == null){
            dBf1D3 = new BitRxTx[21];
        }
        //check, if the item already has been accessed
        if (dBf1D3[index1 - 1] == null){
            //if not, instantiate a new representation
            //and store it for subsequent uses
            int byteOffset = getAddress().getByteIndex() + 5516 + (index1 - 1) / 8 ;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setBitIndex((index1 - 1) % 8);
            addr.setSize(BitRxTx.getSize());
            dBf1D3[index1 - 1] = new BitRxTx(getConnection(), addr, byteOffset, getData());
        }
        return dBf1D3[index1 - 1];
    }

    @SuppressWarnings("empty-statement")
    public ByteRxTx getBy3() throws AddressException, IndexOutOfRangeException{
        if (by3 == null){
            int byteOffset = getAddress().getByteIndex() + 5520;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setSize(ByteRxTx.getSize());
            by3 = new ByteRxTx(getConnection(), addr, byteOffset, getData());
        }
        return by3;
    }

    @SuppressWarnings("empty-statement")
    public IntRxTx getI3() throws AddressException, IndexOutOfRangeException{
        if (i3 == null){
            int byteOffset = getAddress().getByteIndex() + 5522;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setSize(IntRxTx.getSize());
            i3 = new IntRxTx(getConnection(), addr, byteOffset, getData());
        }
        return i3;
    }

    @SuppressWarnings("empty-statement")
    public UDT_Test_3Bits getU3Bits1() throws AddressException, IndexOutOfRangeException{
        if (U3Bits1 == null){
            int byteOffset = getAddress().getByteIndex() + 5524;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setSize(UDT_Test_3Bits.getSize());
            U3Bits1 = new UDT_Test_3Bits(getConnection(), addr, byteOffset, getData());
        }
        return U3Bits1;
    }

    @SuppressWarnings("empty-statement")
    public BitRxTx getBi8() throws AddressException, IndexOutOfRangeException{
        if (bi8 == null){
            int byteOffset = getAddress().getByteIndex() + 5526;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setBitIndex(0);
            addr.setSize(BitRxTx.getSize());
            bi8 = new BitRxTx(getConnection(), addr, byteOffset, getData());
        }
        return bi8;
    }

    @SuppressWarnings("empty-statement")
    public UDT_Test_3Bits getU3Bits2() throws AddressException, IndexOutOfRangeException{
        if (U3Bits2 == null){
            int byteOffset = getAddress().getByteIndex() + 5528;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setSize(UDT_Test_3Bits.getSize());
            U3Bits2 = new UDT_Test_3Bits(getConnection(), addr, byteOffset, getData());
        }
        return U3Bits2;
    }

    @SuppressWarnings("empty-statement")
    public UDT_Test_3Bits getU3Bits3() throws AddressException, IndexOutOfRangeException{
        if (U3Bits3 == null){
            int byteOffset = getAddress().getByteIndex() + 5530;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setSize(UDT_Test_3Bits.getSize());
            U3Bits3 = new UDT_Test_3Bits(getConnection(), addr, byteOffset, getData());
        }
        return U3Bits3;
    }

    @SuppressWarnings("empty-statement")
    public ByteRxTx getBy4() throws AddressException, IndexOutOfRangeException{
        if (by4 == null){
            int byteOffset = getAddress().getByteIndex() + 5532;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setSize(ByteRxTx.getSize());
            by4 = new ByteRxTx(getConnection(), addr, byteOffset, getData());
        }
        return by4;
    }

    @SuppressWarnings("empty-statement")
    public IntRxTx getI4() throws AddressException, IndexOutOfRangeException{
        if (i4 == null){
            int byteOffset = getAddress().getByteIndex() + 5534;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setSize(IntRxTx.getSize());
            i4 = new IntRxTx(getConnection(), addr, byteOffset, getData());
        }
        return i4;
    }

    @SuppressWarnings("empty-statement")
    public UDT_Test_3Bytes getU3Bytes1() throws AddressException, IndexOutOfRangeException{
        if (U3Bytes1 == null){
            int byteOffset = getAddress().getByteIndex() + 5536;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setSize(UDT_Test_3Bytes.getSize());
            U3Bytes1 = new UDT_Test_3Bytes(getConnection(), addr, byteOffset, getData());
        }
        return U3Bytes1;
    }

    @SuppressWarnings("empty-statement")
    public BitRxTx getBi9() throws AddressException, IndexOutOfRangeException{
        if (bi9 == null){
            int byteOffset = getAddress().getByteIndex() + 5540;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setBitIndex(0);
            addr.setSize(BitRxTx.getSize());
            bi9 = new BitRxTx(getConnection(), addr, byteOffset, getData());
        }
        return bi9;
    }

    @SuppressWarnings("empty-statement")
    public UDT_Test_3Bytes getU3Bytes2() throws AddressException, IndexOutOfRangeException{
        if (U3Bytes2 == null){
            int byteOffset = getAddress().getByteIndex() + 5542;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setSize(UDT_Test_3Bytes.getSize());
            U3Bytes2 = new UDT_Test_3Bytes(getConnection(), addr, byteOffset, getData());
        }
        return U3Bytes2;
    }

    @SuppressWarnings("empty-statement")
    public UDT_Test_3Bytes getU3Bytes3() throws AddressException, IndexOutOfRangeException{
        if (U3Bytes3 == null){
            int byteOffset = getAddress().getByteIndex() + 5546;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setSize(UDT_Test_3Bytes.getSize());
            U3Bytes3 = new UDT_Test_3Bytes(getConnection(), addr, byteOffset, getData());
        }
        return U3Bytes3;
    }

    @SuppressWarnings("empty-statement")
    public ByteRxTx getBy5() throws AddressException, IndexOutOfRangeException{
        if (by5 == null){
            int byteOffset = getAddress().getByteIndex() + 5550;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setSize(ByteRxTx.getSize());
            by5 = new ByteRxTx(getConnection(), addr, byteOffset, getData());
        }
        return by5;
    }

    @SuppressWarnings("empty-statement")
    public IntRxTx getI5() throws AddressException, IndexOutOfRangeException{
        if (i5 == null){
            int byteOffset = getAddress().getByteIndex() + 5552;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setSize(IntRxTx.getSize());
            i5 = new IntRxTx(getConnection(), addr, byteOffset, getData());
        }
        return i5;
    }

    @SuppressWarnings("empty-statement")
    public UDT_Test_3Bits getU3Bits4() throws AddressException, IndexOutOfRangeException{
        if (U3Bits4 == null){
            int byteOffset = getAddress().getByteIndex() + 5554;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setSize(UDT_Test_3Bits.getSize());
            U3Bits4 = new UDT_Test_3Bits(getConnection(), addr, byteOffset, getData());
        }
        return U3Bits4;
    }

    @SuppressWarnings("empty-statement")
    public UDT_Test_3Bytes getU3Bytes4() throws AddressException, IndexOutOfRangeException{
        if (U3Bytes4 == null){
            int byteOffset = getAddress().getByteIndex() + 5556;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setSize(UDT_Test_3Bytes.getSize());
            U3Bytes4 = new UDT_Test_3Bytes(getConnection(), addr, byteOffset, getData());
        }
        return U3Bytes4;
    }

    @SuppressWarnings("empty-statement")
    public UDT_Test_3Bits getU3Bits5() throws AddressException, IndexOutOfRangeException{
        if (U3Bits5 == null){
            int byteOffset = getAddress().getByteIndex() + 5560;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setSize(UDT_Test_3Bits.getSize());
            U3Bits5 = new UDT_Test_3Bits(getConnection(), addr, byteOffset, getData());
        }
        return U3Bits5;
    }

    @SuppressWarnings("empty-statement")
    public DintRxTx getD3() throws AddressException, IndexOutOfRangeException{
        if (d3 == null){
            int byteOffset = getAddress().getByteIndex() + 5562;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setSize(DintRxTx.getSize());
            d3 = new DintRxTx(getConnection(), addr, byteOffset, getData());
        }
        return d3;
    }

    @SuppressWarnings("empty-statement")
    public ByteRxTx getDYf2D1(int index1 ,int index2) throws AddressException, IndexOutOfRangeException{

        assertIndexRange(1, 1, 3, index1);
        assertIndexRange(2, 1, 5, index2);

        if (dYf2D1 == null){
            dYf2D1 = new ByteRxTx[3][5];
        }
        //check, if the item already has been accessed
        if (dYf2D1[index1 - 1][index2 - 1] == null){
            //if not, instantiate a new representation
            //and store it for subsequent uses
            int dimSize2 = 5;
            int byteOffset = getAddress().getByteIndex() + 5566 + ((index1 - 1)*dimSize2 + (index2 - 1)) * 1;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setSize(ByteRxTx.getSize());
            dYf2D1[index1 - 1][index2 - 1] = new ByteRxTx(getConnection(), addr, byteOffset, getData());
        }
        return dYf2D1[index1 - 1][index2 - 1];
    }

    @SuppressWarnings("empty-statement")
    public DintRxTx getD4() throws AddressException, IndexOutOfRangeException{
        if (d4 == null){
            int byteOffset = getAddress().getByteIndex() + 5582;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setSize(DintRxTx.getSize());
            d4 = new DintRxTx(getConnection(), addr, byteOffset, getData());
        }
        return d4;
    }

    @SuppressWarnings("empty-statement")
    public ByteRxTx getDCf2D1(int index1 ,int index2) throws AddressException, IndexOutOfRangeException{

        assertIndexRange(1, 1, 3, index1);
        assertIndexRange(2, 1, 5, index2);

        if (dCf2D1 == null){
            dCf2D1 = new ByteRxTx[3][5];
        }
        //check, if the item already has been accessed
        if (dCf2D1[index1 - 1][index2 - 1] == null){
            //if not, instantiate a new representation
            //and store it for subsequent uses
            int dimSize2 = 5;
            int byteOffset = getAddress().getByteIndex() + 5586 + ((index1 - 1)*dimSize2 + (index2 - 1)) * 1;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setSize(ByteRxTx.getSize());
            dCf2D1[index1 - 1][index2 - 1] = new ByteRxTx(getConnection(), addr, byteOffset, getData());
        }
        return dCf2D1[index1 - 1][index2 - 1];
    }

    @SuppressWarnings("empty-statement")
    public DintRxTx getD5() throws AddressException, IndexOutOfRangeException{
        if (d5 == null){
            int byteOffset = getAddress().getByteIndex() + 5602;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setSize(DintRxTx.getSize());
            d5 = new DintRxTx(getConnection(), addr, byteOffset, getData());
        }
        return d5;
    }

    @SuppressWarnings("empty-statement")
    public BitRxTx getDBf2D2(int index1 ,int index2) throws AddressException, IndexOutOfRangeException{

        assertIndexRange(1, 1, 3, index1);
        assertIndexRange(2, 1, 5, index2);

        if (dBf2D2 == null){
            dBf2D2 = new BitRxTx[3][5];
        }
        //check, if the item already has been accessed
        if (dBf2D2[index1 - 1][index2 - 1] == null){
            //if not, instantiate a new representation
            //and store it for subsequent uses
            int dimSize2 = 1;
            int byteOffset = getAddress().getByteIndex() + 5606 + (index1 - 1)*dimSize2 + (index2 - 1) / 8;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setBitIndex((index2 - 1) % 8);
            addr.setSize(BitRxTx.getSize());
            dBf2D2[index1 - 1][index2 - 1] = new BitRxTx(getConnection(), addr, byteOffset, getData());
        }
        return dBf2D2[index1 - 1][index2 - 1];
    }

    @SuppressWarnings("empty-statement")
    public DintRxTx getD6() throws AddressException, IndexOutOfRangeException{
        if (d6 == null){
            int byteOffset = getAddress().getByteIndex() + 5610;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setSize(DintRxTx.getSize());
            d6 = new DintRxTx(getConnection(), addr, byteOffset, getData());
        }
        return d6;
    }

    @SuppressWarnings("empty-statement")
    public BitRxTx getDBf3D1(int index1 ,int index2 ,int index3) throws AddressException, IndexOutOfRangeException{

        assertIndexRange(1, 1, 7, index1);
        assertIndexRange(2, 1, 3, index2);
        assertIndexRange(3, 1, 5, index3);

        if (dBf3D1 == null){
            dBf3D1 = new BitRxTx[7][3][5];
        }
        //check, if the item already has been accessed
        if (dBf3D1[index1 - 1][index2 - 1][index3 - 1] == null){
            //if not, instantiate a new representation
            //and store it for subsequent uses
            int dimSize3 = 1;
            int dimSize2 = dimSize3 * 3;
            int byteOffset = getAddress().getByteIndex() + 5614 + (index1 - 1)*dimSize2 + (index2 - 1)*dimSize3 + (index3 - 1) / 8;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setBitIndex((index3 - 1) % 8);
            addr.setSize(BitRxTx.getSize());
            dBf3D1[index1 - 1][index2 - 1][index3 - 1] = new BitRxTx(getConnection(), addr, byteOffset, getData());
        }
        return dBf3D1[index1 - 1][index2 - 1][index3 - 1];
    }

    @SuppressWarnings("empty-statement")
    public DintRxTx getD7() throws AddressException, IndexOutOfRangeException{
        if (d7 == null){
            int byteOffset = getAddress().getByteIndex() + 5636;
            Address addr = null;
            try{addr = (Address)getAddress().clone();}catch(CloneNotSupportedException exc){};
            addr.setByteIndex(byteOffset);
            addr.setSize(DintRxTx.getSize());
            d7 = new DintRxTx(getConnection(), addr, byteOffset, getData());
        }
        return d7;
    }
}