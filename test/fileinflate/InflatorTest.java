package fileinflate;

import java.util.HashMap;
import junit.framework.TestCase;

/**
 * A test suite for Inflator class
 */
public class InflatorTest extends TestCase {

    public InflatorTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testExtractRepetitiveAtStart() {
        String template = "aaa #1 #2 #3 bbb next text";
        String[][] data = null;
        String[] placeholders = null;
        String start = "aaa";
        String end = "bbb";

        Inflator inflator = new Inflator(template, data, placeholders, start, end);
        assertEquals(inflator.extractRepetitive(), "aaa #1 #2 #3 bbb");

    }

    public void testExtractRepetitiveMiddle() {
        String template = "aaa #start# #1 #2 #3 #end# bbb";
        String[][] data = null;
        String[] placeholders = null;
        String start = "#start#";
        String end = "#end#";

        Inflator inflator = new Inflator(template, data, placeholders, start, end);
        assertEquals(inflator.extractRepetitive(), "#start# #1 #2 #3 #end#");

    }

    public void testExtractRepetitiveAtEnd() {
        String template = "beginning #start# #1 #2 #end#";
        String[][] data = null;
        String[] placeholders = null;
        String start = "#start#";
        String end = "#end#";

        Inflator inflator = new Inflator(template, data, placeholders, start, end);
        assertEquals(inflator.extractRepetitive(), "#start# #1 #2 #end#");
    }

    public void testExtractRepetitiveWholeString() {
        String template = "abcTextcba";
        String[][] data = null;
        String[] placeholders = null;
        String start = "abc";
        String end = "cba";

        Inflator inflator = new Inflator(template, data, placeholders, start, end);
        assertEquals(inflator.extractRepetitive(), "abcTextcba");
    }

    public void testExtractRepetitiveNullIfNoStart() {
        String template = "text end";
        String[][] data = null;
        String[] placeholders = null;
        String start = "abc";
        String end = "end";

        Inflator inflator = new Inflator(template, data, placeholders, start, end);
        assertNull(inflator.extractRepetitive());
    }

    public void testExtractRepetitiveNullIfNoEnd() {
        String template = "start text";
        String[][] data = null;
        String[] placeholders = null;
        String start = "start";
        String end = "end";

        Inflator inflator = new Inflator(template, data, placeholders, start, end);
        assertNull(inflator.extractRepetitive());
    }

    public void testReplacePlaceholdersSingle() {
        String template = null;
        String[][] data = null;
        String[] placeholders = new String[]{"a1", "a2", "a3"};
        String start = null;
        String end = null;

        HashMap<String, String> map = new HashMap();
        map.put("a1", "I");
        map.put("a3", "like");
        map.put("a2", "tea");

        Inflator inflator = new Inflator(template, data, placeholders, start, end);
        assertEquals(inflator.replacePlaceholders("a1 a3 a2", map), "I like tea");
    }

    public void testReplacePlaceholdersTriple() {
        String template = null;
        String[][] data = null;
        String[] placeholders = new String[]{"a1", "a2", "a3"};
        String start = null;
        String end = null;

        HashMap<String, String> map = new HashMap();
        map.put("a1", "first");
        map.put("a2", "second");
        map.put("a3", "third");

        Inflator inflator = new Inflator(template, data, placeholders, start, end);
        assertEquals(inflator.replacePlaceholders("a1 a1 a3 a2 a1", map), "first first third second first");
    }

}
