/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hanna
 */
public class LinkedListTest {
    
    public LinkedListTest() {
        
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /*@Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    @Test
    public void next() {
        //Set up
        LinkedList<Integer> calvin = new LinkedList();
        LinkedList<Integer> add = new LinkedList();
        add.data = 12;
        calvin.data = 5;
         
        calvin.append(add);
        Integer expected = 12;
        
        ILinkedList<Integer> temp = calvin.next();
        assertEquals(expected, temp.get());
        
    }

    @Test
    public void last() {
        LinkedList<Integer> calvin = new LinkedList();
        LinkedList<Integer> add = new LinkedList();
        LinkedList<Integer> add2 = new LinkedList();
        add2.set(23);
        add.set(12);
        calvin.set(5);
        calvin.setNext(add);
        calvin.insert(add2);
        
        
        LinkedList<Integer> temp = new LinkedList();
        temp.data = 12;
        
        Integer expected = 12;
        ILinkedList<Integer> temp2 = calvin.last();
        assertEquals(expected, temp2.get());
    }

    @Test
    public void after() {
        LinkedList<Integer> calvin = new LinkedList();
        LinkedList<Integer> add = new LinkedList();
        LinkedList<Integer> add2 = new LinkedList();
        LinkedList<Integer> add3 = new LinkedList();
        add3.set(14);
        calvin.set(5);
        add2.set(23);
        add.set(12);
        
        calvin.setNext(add);
        calvin.append(add2);
        calvin.append(add3);
        
        //List = 14, 23, 5, 12
        
        ILinkedList<Integer> temp = calvin.after(2);
        
        
        assertEquals(add2.get(), temp.get());
        
    }
    

    @Test
    public void detach() {
        LinkedList<Integer> calvin = new LinkedList();
        LinkedList<Integer> add = new LinkedList();
        
        add.set(12);
        calvin.set(5);
        calvin.setNext(add);
        
        ILinkedList<Integer> temp = calvin.detach();
        
        assertEquals(temp.get(), add.get());
        
    }

    @Test
    public void get() {
        LinkedList<Integer> calvin = new LinkedList();
        calvin.data = 5;
        Integer temp = 5;
        
        assertEquals(calvin.get(), temp);
        
    }

    @Test
    public void set() {
        LinkedList<Integer> calvin = new LinkedList();
        
        calvin.set(5);
        Integer temp = 5;
        
        assertEquals(calvin.get(), temp);
    }

    @Test
    public void setNext() {
        LinkedList<Integer> calvin = new LinkedList();
        LinkedList<Integer> add = new LinkedList();

        add.data = 12;
        calvin.data = 5;
        
        calvin.setNext(add);
        
        
        assertEquals(calvin.next().get(), add.get());
    }

    @Test
    public void append() {
        LinkedList<Integer> calvin = new LinkedList();
        LinkedList<Integer> add = new LinkedList();
        LinkedList<Integer> add2 = new LinkedList();
        LinkedList<Integer> add3 = new LinkedList<>();
        add3.data = 29;
        add2.data = 23;
        add.data = 12;
        calvin.data = 5;
        
        calvin.insert(add);
        calvin.insert(add2);
        
        calvin.append(add3);
        
        Integer expected = 29;
        
        assertEquals(expected, calvin.last().get());
    }

    @Test
    public void insert() {
        LinkedList<Integer> calvin = new LinkedList();
        LinkedList<Integer> add = new LinkedList();
        add.data = 12;
        calvin.data = 5;
        
        calvin.insert(add);
        
        Integer expected = 5;
        
        assertEquals(expected, calvin.get());
        
    }
    
}
