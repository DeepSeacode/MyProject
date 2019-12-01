package stack

import scala.collection.mutable

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 *
 *
 * Example:
 *
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> Returns -3.
 * minStack.pop();
 * minStack.top();      --> Returns 0.
 * minStack.getMin();   --> Returns -2.
 */
class MinStack {

  /** initialize your data structure here.
   * ["MinStack","push","push","push","top","pop","getMin","pop","getMin","pop","push","top","getMin","push","top","getMin","pop","getMin"]
   * [[],[2147483646],[2147483646],[2147483647],[],[],[],[],[],[],[2147483647],[],[],[-2147483648],[],[],[],[]]
   * */

  var min = Int.MaxValue
  val stack = new mutable.Stack[Int]()
  def push(x: Int) {
    min = math.min(min,x)
    stack.push(x)
  }

  def pop() {
    val i = stack.pop
    if(stack.isEmpty)
      min = Int.MaxValue
    else if(i == min)
      min = stack.min
    else min = min

  }

  def top(): Int = {
    stack.top
  }

  def getMin(): Int = {
    min
  }

}
