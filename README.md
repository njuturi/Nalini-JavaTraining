# nalini-java-training

##Chamber1 Topics

* [Operators](#operators)
* [BigIntegerClass](#bigintegerclass)
* [JUnit Test](#junit-testing)
	* [Junit TestCase Structure](#junit-test-case-structure)
	* [JUnit Asserts](#junit-asserts)
	* [BICEP](#bicep)
* [ZipprProject](#zippr-project)
	* [Latitude And Longitude Convertion to Degrees,Minutes and seconds](#latitude-and-longitude)
	* [Base32 Encoding Algoritham](#base32-encoding-algoritham)
	* [Base64 Encoding Algoritham](#base64-encoding-algoritham)

##Chamber2 Topics

* [String Metrics](#string-metrics)
	* [Levenshtein Distance](https://github.com/njuturi/nalini-java-training/wiki/Levenshtein-Distance)
	* [Jaccard Similarity Coefficient](https://github.com/njuturi/nalini-java-training/wiki/Jaccard-Coefficient)
	* [Manchers Largest Palindromic SubString](https://github.com/njuturi/nalini-java-training/wiki/Manchers-Largest-Palindromic-SubString)
	* [Longest Common Subsequence](https://github.com/njuturi/nalini-java-training/wiki/Longest-Common-Subsequence)
	* [Longest Common SubString](https://github.com/njuturi/nalini-java-training/wiki/Longest-Common-SubString)
	* [Longest Palindromic Sequence](https://github.com/njuturi/nalini-java-training/wiki/Longest-Palindromic-Sequence)

#Difference between logicaland(&&) and Bitwise(&) operator
#Operators

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
		
#bigIntegerclass
		
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
###Junit Test case structure

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
#BICEP
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

#### Error Conditions

First we need to identify expected exceptions and needs to be handled

#####Example

```java

@Test
	public void test() {
		try{
			FibonacciSequence.getFibonacciSeries(BigInteger.valueOf(-10));
			fail("This is not valid for negitive value");
		}catch(IllegalArgumentException e){
			assertTrue(true);
		}
	}
```

##Zippr Project
#Latitude And Longitude

####latitude and longitude convertions from decimal to degrees,minutes and seconds

#####Example Algoritham

```java

	public  String convertLatOrLongDecimalToDMS(double latnumber) {

		StringBuilder builder = new StringBuilder();

		if (latnumber < 0) {
			builder.append("W");
			latnumber = Math.abs(latnumber);
		} else {
			builder.append("E");
		}
		//in case of longitude this is the change only
		if (longNumber < 0) {
			builder.append("S");
			longNumber = Math.abs(latnumber);
		} else {
			builder.append("N");
		}

		double latSeconds = latnumber * 3600;
		int degrees = (int) latSeconds / 3600;
		double latMinutes = (latSeconds % 3600) / 60;
		latMinutes = Math.round(latMinutes * 100.0) / 100.0;
		latSeconds = latSeconds % 60;
		latSeconds = Math.round(latSeconds * 100.0) / 100.0;
		builder.append(degrees + "°" + latMinutes + "'" + latSeconds + "\"");

		System.out.println(builder.toString());

		return builder.toString();
	}
	
	O/P: latandlong.convertLatOrLongDecimalToDMS(-123.678)
		latitude : W123°40.68'40.8"
		longitude: S123°40.68'40.8

```

####Base32 Encoding Algoritham

Base32 charset and how we encode the bytes into Base32 char format

1.Divid the input bytes stream into blocks of 5 bytes.

2.Divid 40 bits of each 5-byte block into 8 groups of 5 bits.

3.Map each group of 5 bits to 1 printable character, based on the 5-bit value using the Base32 character set map.

```java
	base32code = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "23456789";
Input Data          A         B         C        D        E
Input Bits   01000001  01000010  01000011 01000100 01000101
Padding      01000001  01000010  01000011 01000100 01000101
                  \      |    \      |     |    \     \
Bit Groups   01000 00101 00001 00100 00110 10001 00010 00101
Mapping          I     F     B     E     G     R     C     F
Overriding       I     F     B     E     G     R     C     F	

```

####Base64 Encoding Algoritham

Base64 charset and how we encode the bytes into Base64 char format

1.Divid the input bytes stream into blocks of 3 bytes.

2.Divid 24 bits of each 3-byte block into 4 groups of 6 bits.

3.Map each group of 6 bits to 1 printable character, based on the 6-bit value using the Base64 character set map.

####Example

```java

base64code = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvwxyz" + "0123456789"+ "+/";

Input Data          A        B        C
Input Bits   01000001 01000010 01000011
                   \      \      \
Bit Groups   010000 010100 001001 000011
Mapping           Q      U      J      D

```
