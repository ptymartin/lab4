import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlaceFull() {
    int[] input1 = {1, 2, 3};
    ArrayExamples.reverseInPlace(input1);
    int[] expected = {3, 2, 1};

    assertArrayEquals(expected, input1);
  }

  @Test
  public void testReversedFull() {
    int[] input1 = {1, 2, 3};
    int[] expected = {3, 2, 1};

    int[] result = ArrayExamples.reversed(input1);
    
    assertArrayEquals(expected, result);
  }
}
