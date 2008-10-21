/* Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package tests.sql;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test suite that includes all tests for the Math project.
 */
public class AllTests {

    public static void main(String[] args) {
        junit.textui.TestRunner.run(AllTests.suite());
    }

    public static Test suite() {
        TestSuite suite = new TestSuite("All SQL test suites");
        // $JUnit-BEGIN$
        suite.addTest(org.apache.harmony.sql.tests.java.sql.AllTests.suite());
        suite.addTest(org.apache.harmony.sql.tests.javax.sql.AllTests.suite());
        suite.addTest(tests.java.sql.AllTests.suite());

        suite.addTestSuite(SQLite.JDBCDriverTest.class);
        suite.addTestSuite(tests.sql.ConnectionTest.class);
        suite.addTestSuite(tests.sql.PreparedStatementTest.class);
        suite.addTestSuite(tests.sql.ResultSetMetaDataTest.class);
        suite.addTestSuite(tests.sql.StatementTest.class);
        // $JUnit-END$
        return suite;
    }
}
