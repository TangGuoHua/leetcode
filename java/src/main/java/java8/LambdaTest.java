package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

public class LambdaTest {
	public static void main(String[] args) {

		Stack<Character> stack = new Stack<>();
		stack.push('a');
		stack.push('b');
		stack.push('c');

		String rst = stack.stream().map(opt-> ""+opt).collect(Collectors.joining());
		System.out.println(rst);

	}
	
}

class Invoice {
	double amount = 0.0;

}
