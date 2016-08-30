# nalini-java-training
##Chamber1
#Difference between logicaland(&&) and Bitwise(&) operator
The && performs short-circuting evalutation where as & does not

		Eg:int i=5;
			int j=7;
			int k=4;
			if(i>j && ++k==i){
				System.out.println("Mahesh");
			}
			System.out.printf("%d,%d,%d",i,j,k);
			o/p:5,7,4
			--
	
Short-circuting means in case of && if first condition(i>j) is false did not evaluate next expression thats why k did not 
increment.If first condition is true then it evaluates the seond one otherwise not.

The  & operator evaluate all the conditions and do the next;
		
			Eg:int i=5;
			int j=7;
			int k=4;
			if(i>j & ++k==i){
				System.out.println("Mahesh");
			}
			System.out.printf("%d,%d,%d",i,j,k);
			o/p:5,7,5
			---
		
##Difference between Logicalor(||) and bitwiseor(|)

	In case of logicalOr if the first condition is false then it evaluates the second one other wise not.
	Thats why logialOr also do short-circuit evaluations.
	
	Eg:int i=5;
		int j=7;
		int k=4;
		if(i<j || i==5 || ++k == i){
			System.out.println("lakshman");
		}
		System.out.printf("%d,%d,%d",i,j,k);
		o/p: lakshman
		----  5,7,4
		
		in case of bitwiseOr operator it evaluates all the conditions and go for the next step.
		
		Eg:int i=5;
		int j=7;
		int k=4;
		if(i<j | i==5 | ++k == i){
			System.out.println("lakshman");
		}
		System.out.printf("%d,%d,%d",i,j,k);
		o/p: lakshman
		----  5,7,5
