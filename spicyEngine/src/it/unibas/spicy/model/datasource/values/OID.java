/*
    Copyright (C) 2007-2011  Database Group - Universita' della Basilicata
    Giansalvatore Mecca - giansalvatore.mecca@unibas.it
    Salvatore Raunich - salrau@gmail.com

    This file is part of ++Spicy - a Schema Mapping and Data Exchange Tool
    
    ++Spicy is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    any later version.

    ++Spicy is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with ++Spicy.  If not, see <http://www.gnu.org/licenses/>.
 */
 
package it.unibas.spicy.model.datasource.values;

public class OID {
    
    private Object value;
    private String skolemString;
    
    public OID(Object value) {
        this.value = value;
    }
    
    public Object getValue() {
        return this.value;               
    }

    public String getSkolemString() {
        return skolemString;
    }

    public void setSkolemString(String skolemString) {
        this.skolemString = skolemString;
    }
    
    public String toString() {
        return this.value.toString();
    }
    
    public int hashCode() {
        return this.value.hashCode();
    }
    
    public boolean equals(Object o) {
        if (!(o instanceof OID)) {
            return false;
        }
        OID otherOid = (OID)o;
        return this.value.equals(otherOid.value);
    }
}