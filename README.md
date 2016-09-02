# nalini-java-training
##Chamber1
#Difference between logicaland(&&) and Bitwise(&) operator
The && performs short-circuting evalutation where as & does not


```java
		Eg:int i=5;
			int j=7;
			int k=4;
			if(i>j && ++k==i){
				System.out.println("Mahesh");
			}
			System.out.printf("%d,%d,%d",i,j,k);
			o/p:5,7,4
			--
```
	
Short-circuting means in case of && if first condition(i>j) is false did not evaluate next expression thats why k did not 
increment.If first condition is true then it evaluates the seond one otherwise not.

The  & operator evaluate all the conditions and do the next;
		
```java
			Eg:int i=5;
			int j=7;
			int k=4;
			if(i>j & ++k==i){
				System.out.println("Mahesh");
			}
			System.out.printf("%d,%d,%d",i,j,k);
			o/p:5,7,5
			---
```		
##Difference between Logicalor(||) and bitwiseor(|)

	In case of logicalOr(||) if the first condition is false then it evaluates the second one other wise not.
	Thats why logialOr also do short-circuit evaluations.

```java	
	Eg:int i=5;
		int j=7;
		int k=4;
		if(i<j || i==5 || ++k == i){
			System.out.println("lakshman");
		}
		System.out.printf("%d,%d,%d",i,j,k);
		o/p: lakshman
		----  5,7,4
```		
		in case of bitwiseOr(|) operator it evaluates all the conditions and go for the next step.
``` java		
		Eg:int i=5;
		int j=7;
		int k=4;
		if(i<j | i==5 | ++k == i){
			System.out.println("lakshman");
		}
		System.out.printf("%d,%d,%d",i,j,k);
		o/p: lakshman
		----  5,7,5
```		
#leftshift(<<) operator and Rightshift(>>) operator
This << operator is used to move the bits to leftside and >> operator is used toshift the bits to right side.
```java		
		Eg: int i=10;
		System.out.println(i<<2)
		o/p: 40
		---
		System.out.println(i>>2)
		o/p: 2
		---
```
#####Explanation:

		i: 	0000 1010--- 10
		i<<2:   0010 1000---  40
		i>>2:   0000 0010 --- 2
		
##java.math.BigInteger class
The BigInteger allocates the memory as much as it.

For example if we use "long" datatype to store factorial number result will store upto 30! after that will give negitive number, means it stores any big number factorial result.

####Example
```java
		public class Factorail {
	
			public static void main(String a[]){
				System.out.println(factorial(28));
			}
	
			public static long factorial(long number) {
				long result = 1;

				while (number !=1) {
					result = result*number;
					number--;

				}
				return result;
				}
				
			}
			o/p:-5968160532966932480
			actual: 304888344611713860501504000000
```
			
	The same program  with BigInteger class by using this class methods

#####Using BigInteger

```java		
		public class Factorail {

			public static void main(String a[]) {
				System.out.println(factorial(BigInteger.valueOf(28)));
			}

			public static String factorial(BigInteger number) {
				BigInteger result = BigInteger.ONE;

				if (number.equals(BigInteger.ZERO)) {
					return "0";
				} else if (number.compareTo(BigInteger.ZERO) == 1) {
					{
						while (number.compareTo(BigInteger.ONE) != 0) {
						result = result.multiply(number);
						number = number.subtract(BigInteger.ONE);

					}
				return result.toString();
			}
			} else {
				return "Please Enter Positive Values";
			}
		}
	}
	
	O/P: 304888344611713860501504000000
```

#JUNIT Testing
###Junit Test case structre

```java
	import org.junit.After;
	import org.junit.Before;
	import org.junit.Test;
	public class JunitTestStructure{
	
		@Before
		public void setUp() throws Exception {
		//This method calls for every test before start the test
		}
		
		@Test
		public void test() {
		//this is the method used to test our code
		//these can be any number with different methodname
		}

		@After
		public void tearDown() throws Exception {
		//this method call for every test just after finish the test
		}

	
	}
	
```
##JUnit Asserts
1.assertEquals([Stringmessage],expected,actual)
		expected-- our expected result
		actual-- the result from our code execution.
#####Example:
```java
	assertEquals("Results expected and actual both are same",6,Factorail.factorial(BigInteger.valueof(3));
```
2.fail(String message)
	fails the test immediately with the message.This is mainly used to handle expected exceptions.
#####Example:
```java
	@Test
	public void testFactorial2() {
		try{
		FactorialNumber.factorial(BigInteger.valueOf(-10));
		fail("-ve number is not Valid Value");
		}catch(IllegalArgumentException e){
			assertTrue(true);
		}
		
	}
```
3.assertEquals([Stringmessage],expected,actual,tolerance)
	Used to how accurate the result on cae of decimal point.
	
```java
	@Test
	public void testSquareRoot1() {
		assertEquals("the Possible value is:",1111.11070555548,SquareRoot.squareRoot(1234567),0.001);
	}
```
##what to test: The Right-BICEP

1. Right : Are the results right
2. B : Boundary Conditions
3. I: Inverse relations
4. C:cross check results
5. E: Error Conditions
6. P:Performence charecteristics
	
#### Are the results right

Need to check the results are expected results or not

Example: 
```java
 	@Test
	public void testFactorial() {
		BigInteger a = new BigInteger("5");
		assertEquals("120",FactorialNumber.factorial(a));
		
	}
```
#### Boundary Conditions

Need to cross check with all possible negitive conditions

#####Example: 

``` java
   @Test
	public void decimalToHexTest() {
		obj =new HexToDecimal();
		BigInteger a = new BigInteger("9223372036854775807");
		assertEquals("7fffffffffffffff",obj.decimalToHex(a));
	}
	
	@Test
	public void testTriangle4() {
		try{
		 FindTriangle.getTriangle(-40.2, -60.3, -70.8);
		 fail("The arguments are invalid");
		}catch(IllegalArgumentException e){
			assertTrue(true);
		}
	}
```

#### Inverse Relations

Some times the methods calculate square roots 	by squaring the result testing that those are nearly close or not.

#####Example

```java

	@Test
	public void testSquareRootUsingInverse() 
	{ 
	double x = SquareRoot.squareRoot(4); 
	assertEquals(4.0, x * x, 0.0001);
	}

```

#### Cross check using other means

calculate the results with our method next calculate the same with some library methods.
compare if both are same or not

#####Example

```java

@Test
	public void testDecimalToBinary1() {
		obj = new NumberConvertions();
		assertEquals(Integer.toBinaryString(5),obj.decimalToBinary(new BigInteger("5")).toString());
	}
	
```


