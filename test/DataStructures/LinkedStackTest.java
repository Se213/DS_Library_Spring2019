/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

import Exceptions.EmptyCollectionException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author seane
 */
public class LinkedStackTest {
    
    public LinkedStackTest() {
    }

    /**
     * Test of pop method, of class LinkedStack.
     */
    @Test
    public void testPop() throws Exception {
        LinkedStack<String> instance= new LinkedStack();
        try{
            String s = instance.pop();
            fail("Shouldn't get here");
        }catch(EmptyCollectionException e){
            System.out.println("Expected: empty collection");
            assertTrue("Caught exception", true);
        }
        instance.push("Hello");
        try{
            String s=instance.pop();
            assertTrue(instance.isEmpty());
        }catch(EmptyCollectionException e){
            System.out.println("Problemm: shouldn't see this");
            fail("Shouldn't see this error");
        }
    }

    /**
     * Test of push method, of class LinkedStack.
     */
    @Test
    public void testPush() throws EmptyCollectionException {
        LinkedStack<String> stack= new LinkedStack();
        assertTrue(stack.isEmpty());
        stack.push("Test");
        assertEquals(stack.size(), 1);
        stack.push("Top");
        assertEquals(stack.size(), 2);
        assertEquals(stack.peek(), "Top");
        
    }

    /**
     * Test of peek method, of class LinkedStack.
     */
    @Test
    public void testPeek() throws EmptyCollectionException {
        LinkedStack <String> instance= new LinkedStack();
        try{instance.peek();
        
        }catch(EmptyCollectionException e){
            assertTrue("caught exception", true);
        }
        instance.push("1");
        instance.push("2");
        instance.push("3");
        assertEquals(instance.size(), 3);
        try{
        instance.peek();
    }catch(EmptyCollectionException e){
            System.out.println("Empty Collection");
    }
        assertEquals(instance.size(), 3);
        assertEquals(instance.peek(), "3");
        instance.pop();
        assertEquals(instance.peek(), "2");
        instance.pop();
        assertEquals(instance.peek(), "1");
        
        
    }

    /**
     * Test of isEmpty method, of class LinkedStack.
     */
    @Test
    public void testIsEmpty() {
    }

    /**
     * Test of size method, of class LinkedStack.
     */
    @Test
    public void testSize() {
    }

    /**
     * Test of toString method, of class LinkedStack.
     */
    @Test
    public void testToString() {
    }
    
}
