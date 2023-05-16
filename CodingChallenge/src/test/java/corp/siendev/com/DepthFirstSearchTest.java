/**
 * @author Iurii Golubnichenko
 *
 * Test cases for Depth First Search algo.
 */
package corp.siendev.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DepthFirstSearchTest {
    private static DepthFirstSearch.Node node;
    private static final List<String> expectedResult = new ArrayList<>(Arrays.asList("A","B","E","F","C","G","H","D"));

    @BeforeAll
    public static void init() {
        node = new DepthFirstSearch.Node("A");
        node.addChild("B")
                .addChild("C")
                .addChild("D");
        node.children.get(0).addChild("E").addChild("F");
        node.children.get(1).addChild("G").addChild("H");
    }

    @Test
    public void depthFirstSearchAlgoTest() {
        List<String> listOfNames = new ArrayList<>();
        List<String> result = node.depthFirstSearchAlgo(listOfNames);
        Assertions.assertArrayEquals(result.toArray(), expectedResult.toArray());
    }
}
