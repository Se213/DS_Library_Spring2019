/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

import Exceptions.NonComparableElementException;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author seane
 */
public class LinkedBinarySearchTreeTest {
    
    public LinkedBinarySearchTreeTest() {
    }

    /**
     * Test of addElement method, of class LinkedBinarySearchTree.
     */
    @Test
    public void testAddElement() throws Exception {
        LinkedBinarySearchTree<String> instance = new LinkedBinarySearchTree();
        assertTrue(instance.isEmpty());
        instance.addElement("hi");
        assertFalse(instance.isEmpty());
    }

    /**
     * Test of removeElement method, of class LinkedBinarySearchTree.
     */
    @Test
    public void testRemoveElement() throws Exception {
        LinkedBinarySearchTree<String> instance = new LinkedBinarySearchTree();
        assertTrue(instance.isEmpty());
        instance.addElement("hi");
        assertFalse(instance.isEmpty());
        instance.removeElement("hi");
        assertEquals(instance.size(), 0);
    }

    /**
     * Test of removeAllOccurrences method, of class LinkedBinarySearchTree.
     */
    @Test
    public void testRemoveAllOccurrences() throws Exception {
        LinkedBinarySearchTree<String> instance = new LinkedBinarySearchTree();
        assertTrue(instance.isEmpty());
        instance.addElement("test");
        assertFalse(instance.isEmpty());
        instance.addElement("Hi");
        instance.addElement("two");
        instance.addElement("two");
        instance.removeAllOccurrences("two");
        assertFalse(instance.contains("two"));
    }

    /**
     * Test of removeMin method, of class LinkedBinarySearchTree.
     */
    @Test
    public void testRemoveMin() throws Exception {
        LinkedBinarySearchTree<String> instance = new LinkedBinarySearchTree();
        instance.addElement("a");
        instance.addElement("b");
        assertEquals(instance.removeMin(), "a");
        assertEquals(instance.size(), 1);
    }

    /**
     * Test of findMin method, of class LinkedBinarySearchTree.
     */
    @Test
    public void testFindMin() throws Exception {
        LinkedBinarySearchTree<String> instance = new LinkedBinarySearchTree();
        instance.addElement("a");
        instance.addElement("b");
        assertEquals(instance.findMin(), "a");
    }

    /**
     * Test of removeMax method, of class LinkedBinarySearchTree.
     */
    @Test
    public void testRemoveMax() {
        System.out.println("removeMax");
        LinkedBinarySearchTree instance = new LinkedBinarySearchTree();
        Object expResult = null;
        Object result = instance.removeMax();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTreeAsList method, of class LinkedBinarySearchTree.
     */
    @Test
    public void testGetTreeAsList() {
        System.out.println("getTreeAsList");
        LinkedBinarySearchTree instance = new LinkedBinarySearchTree();
        ArrayList expResult = null;
        ArrayList result = instance.getTreeAsList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findMax method, of class LinkedBinarySearchTree.
     */
    @Test
    public void testFindMax() {
        System.out.println("findMax");
        LinkedBinarySearchTree instance = new LinkedBinarySearchTree();
        Object expResult = null;
        Object result = instance.findMax();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class LinkedBinarySearchTree.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        LinkedBinarySearchTree instance = new LinkedBinarySearchTree();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void testcontains() throws NonComparableElementException{
         LinkedBinarySearchTree<String> instance = new LinkedBinarySearchTree();
         instance.addElement("hi");
         instance.addElement("bye");
         assertTrue(instance.contains("hi"));
         assertFalse(instance.contains("sakdnasd"));
    }
    @Test
    public void testfind() throws Exception{
         LinkedBinarySearchTree<String> instance = new LinkedBinarySearchTree();
         instance.addElement("hi");
         instance.addElement("bye");
         assertEquals(instance.find("hi"),"hi");
    }
    @Test
    public void testnodeDepth() throws Exception{
         LinkedBinarySearchTree<String> instance = new LinkedBinarySearchTree();
         instance.addElement("hi");
         instance.addElement("bye");
         assertEquals(instance.nodeDepth("hi"),0);
         assertEquals(instance.nodeDepth("bye"),1);
    }
}
