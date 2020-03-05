/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author seane
 */
public class AMGraphTest {
    
    public AMGraphTest() {
    }

    /**
     * Test of addVertex method, of class AMGraph.
     */
    @Test
    public void testAddVertex() {
        AMGraph<String> instance = new AMGraph<String>(2);
        assertEquals(0 , instance.size());
        instance.addVertex("Bob");
        assertEquals(1 , instance.size());
        instance.addVertex("Alice");
        String[] verticies = new String[2];
        verticies[0] = "Bob";
        verticies[1] = "Alice";
        assertArrayEquals(verticies, instance.getVertices());
    }

    /**
     * Test of removeVertex method, of class AMGraph.
     */
    @Test
    public void testRemoveVertex() {
        AMGraph<String> instance = new AMGraph<String>(6);
        assertTrue(instance.size() == 0);
        instance.addVertex("Clara");
        assertTrue(instance.size() == 1);
        instance.removeVertex("Clara");
        assertTrue(instance.size() == 0);
        instance.addVertex("Clara");
        assertTrue(instance.size() == 1);
        instance.removeVertex("String");
        assertTrue(instance.size() == 1);
    }

    /**
     * Test of addEdge method, of class AMGraph.
     */
    @Test
    public void testAddEdge() {
        AMGraph<String> instance = new AMGraph<String>(6);
        instance.addVertex("String 1");
        instance.addVertex("String 2");
        instance.addEdge("String 1", "String 2");
        boolean[][] test = instance.getEdges();
        assertEquals(test[0][0], false);
        assertEquals(test[0][1], true);
    }

    /**
     * Test of removeEdge method, of class AMGraph.
     */
    @Test
    public void testRemoveEdge() {
        AMGraph<String> instance = new AMGraph<String>(6);
        instance.addVertex("String 1");
        instance.addVertex("String 2");
        instance.addEdge("String 1", "String 2");
        boolean[][] test = instance.getEdges();
        assertEquals(test[0][0], false);
        assertEquals(test[0][1], true);
        instance.removeEdge("String 1", "String 2");
        assertEquals(test[0][1], false);
    }

    /**
     * Test of depthFirstTraversal method, of class AMGraph.
     */
    @Test
    public void testDepthFirstTraversal() {
    }

    /**
     * Test of breadthFirstTraversal method, of class AMGraph.
     */
    @Test
    public void testBreadthFirstTraversal() {
    }

    /**
     * Test of isConnected method, of class AMGraph.
     */
    @Test
    public void testIsConnected() {
    }

    /**
     * Test of isEmpty method, of class AMGraph.
     */
    @Test
    public void testIsEmpty() {
        AMGraph<String> instance = new AMGraph<String>(6);
        assertTrue(instance.isEmpty());      
    }

    /**
     * Test of size method, of class AMGraph.
     */
    @Test
    public void testSize() {
        AMGraph<String> instance = new AMGraph<String>(6);
        assertEquals(instance.size() , 0);
    }

    /**
     * Test of toString method, of class AMGraph.
     */
    @Test
    public void testToString() {
    }

    /**
     * Test of getEdges method, of class AMGraph.
     */
    @Test
    public void testGetEdges() {
        AMGraph<String> instance = new AMGraph<String>(6);
        instance.addVertex("String 1");
        instance.addVertex("String 2");
        instance.addEdge("String 1", "String 2");
        boolean[][] test = instance.getEdges();
        assertEquals(test[0][0], false);
        assertEquals(test[0][1], true);
    }

    /**
     * Test of getVertices method, of class AMGraph.
     */
    @Test
    public void testGetVertices() {
        AMGraph<String> instance = new AMGraph<String>(6);
        assertTrue(instance.getVertices().length == 0);
        instance.addVertex("String 1");
        assertTrue(instance.getVertices().length == 1);
        instance.addVertex("String 2");
        assertTrue(instance.getVertices().length == 2);        
    }
    
}
