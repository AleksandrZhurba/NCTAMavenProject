package ua.edu.sumdu.ta.zhurba.pr6.tests;

import org.junit.Before;
import ua.edu.sumdu.ta.zhurba.pr6.*;

public class ArrayTaskListTest extends TaskListTest {
    @Before 
    public void createTaskList() {
        tasks = new ArrayTaskList();
    }
}

