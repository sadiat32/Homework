package homework4;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestPassFail {
    @Test
    public void math1 () {
        int a = 15;
        int b = 10;
        int actualTotal;
        int expectedTotal = 3;
        actualTotal = a-b;
        assertEquals(expectedTotal, actualTotal);
        System.out.println("Test 1 passed");
    }
    @Test
    public void math2 () {
        int c = 3;
        int d = 5;
        int actualTotal;
        int expectedTotal = 15;
        actualTotal = c*d;
        assertEquals(expectedTotal, actualTotal);
        System.out.println("Test 2 passed");
    }
    @Test
    public void map1() {
        HashMap<String, String> fruit = new HashMap<>();
        fruit.put("Mango", "Grape");
        assert fruit.containsValue("Grape"); // pass
        System.out.println("Test 3 passed");
    }
    @Test
    public void map2() {
        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("England", "London");
        assert capitalCities.containsValue("USA"); // pass
        System.out.println("Test 4 passed");
    }
    @Test
    public void array1(){
        List<String> lunch = new ArrayList();
        lunch.add("Hummus");
        assert lunch.contains("Hummus");
        System.out.println("Test 5 passed");

    }
    @Test
    public void array2(){
        List<Integer> num = new ArrayList();
        num.add(2);
        assert num.contains(6);
        System.out.println("Test 6 passed");

    }
    @Test
    public void array3(){
        List<Integer> num = new ArrayList();
        num.add(4);
        assert num.contains(4);
        System.out.println("Test 7 passed");

    }
    @Test
    public void string1(){
        String s = "Home";
        assert s.contains("Home");
        System.out.println("Test 8 passed");

    }
    @Test
    public void string2(){
        String s = "School";
        assert s.contains("Ball");
        System.out.println("Test 9 passed");

    }
    @Test
    public void string3(){
        String s = "Work";
        assert s.contains("Work");
        System.out.println("Test 10 passed");

    }

}
