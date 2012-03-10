package chapter3;
/* Exercise 6: Modify the two test( ) methods in the previous two programs so that they take two extra arguments, 
 * begin and end, and so that testval is tested to see if it is within the range between (and including) begin and end.
 * 
 * static int result = 0;
 * static void test(int testval, int target) {
 *    if(testval > target)
 *    result = +1;
 *    else if(testval < target)
 *    result = -1;
 *    else
 *    result = 0;
 *    }
 * 
 * static int test(int testval, int target) {
 * 	  if(testval > target)
 * 	  return +1;
 *    else if(testval < target)
 *    return -1;
 *    else
 *    return 0;
 * }
 * 
 */
public class Exercise6 {
	static int result = 0;
	static void testVoid(int testval, int begin, int end) {
		if((testval > begin) && (testval < end))
		result = +1;
		else if((testval == begin) || (testval == end))
		result = 0;
		else
		result = -1; 
		}
	static int testReturn(int testval, int begin, int end) {
		if((testval > begin) && (testval < end))
		return +1;
		else if((testval == begin) || (testval == end))
		return 0;
		else
		return -1;
		}
}
