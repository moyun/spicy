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
 
package it.unibas.spicy.test.query.sql.selfjoin;

import it.unibas.spicy.test.References;
import it.unibas.spicy.test.query.SQLQueryTest;
import java.io.File;
import java.io.InputStreamReader;

public class SQLQueryKidsChildrenSimple extends SQLQueryTest {

    protected void setUp() throws Exception {
        String mappingTaskFile = new File(this.getClass().getResource(References.kidsPresentsChildrenDBSimpleSelfJoin).toURI()).getAbsolutePath();
        mappingTask = daoMappingTask.loadMappingTask(mappingTaskFile);
        initFixture();
    }

    public void testScript() throws Exception {
        // this method override the method in SQLQueryTest
        // no tests are executed for this scenario
    }

    protected void initFileReferences() {
        sourceSQLScriptReader = new InputStreamReader(this.getClass().getResourceAsStream(References.kidsPresentsSimpleSQLScriptSchema));
        sourceInstanceSQLScriptReader = new InputStreamReader(this.getClass().getResourceAsStream(References.kidsPresentsSimpleSQLScriptInstance));
        targetSQLScriptReader = new InputStreamReader(this.getClass().getResourceAsStream(References.childrenDBSimpleSQLScriptSchema));
//        expectedInstanceFile = this.getClass().getResource(References.kidsPresentsSelfJoinExpectedInstance).getPath();
    }
}
