import java.util.Scanner;

public class SimplePrograms {
	// static int i;
	Scanner s=new Scanner(System.in);
private void SumOfOdds(){
	int count = 0;
	for(int i=0;i<1000;i++)
		{
		if(i%2!=0)
		{
			count++;
		}
		}
	System.out.println(count);}
public void SumOfEven()
{
	int count=0;
	for(int i=0;i<=1000;i++) {
		if(i%2==0)
		{
			count++;
		}
		}
	System.out.println(count);
}
private void PalindromeCheck(){
	String result="";
	//Scanner s=new Scanner(System.in);
	String word=s.nextLine();
	for(int i=word.length()-1;i>=0;i--)
	 result=result+word.charAt(i);
	if(word.equals(result))
		System.out.println("Palindrome");
	else
		System.out.println("Not a palindrome");	
}

private void RevString() {
	String reverse="";
	System.out.println("Enter your String to reverse:");
	//Scanner s=new Scanner(System.in);
	String input=s.nextLine();
	for(int i=input.length()-1;i>=0;i--)
		reverse=reverse+input.charAt(i);
	System.out.println("Reversed String is:" +reverse);
}
public void VowelsCount()
{
	String sentence;
	int Vcount = 0,Ccount = 0;
	System.out.println("Enter your string:");
	sentence=s.nextLine();
	String vowels="",consonants="";
	for(int i=0;i<sentence.length();i++)
	{
		char ch=sentence.charAt(i);
		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') 
		{
			vowels=vowels+sentence.charAt(i);
			Vcount++;}
		
		
		else {
			consonants=consonants+sentence.charAt(i);
			Ccount++;
		}	}
	System.out.println("Vowels:"+Vcount +vowels);
	System.out.println("Consonants:"+Ccount +consonants);
}

public void Sorting() {
	int i,j,temp;
	int[] input=new int[5];
	System.out.println("Enter your numbers:");
	for(i=0;i<=input.length-1;i++)
	{
		input[i]=s.nextInt();	
		}
	for(i=0;i<input.length-1;i++)
	{
		for(j=i+1;j<input.length;j++)
		{
			if(input[i]>input[j])
			{
			temp=input[i];
			input[i]=input[j];
			input[j]=temp; 
			}
	}
	}
		for(i=0;i<=input.length-1;i++)
		{
			System.out.println(input[i]);
	}
	}


public static void main(String[] args) {
	SimplePrograms s=new SimplePrograms();
	//s.SumOfOdds();
	//s.SumOfEven();
	//s.PalindromeCheck();
	//s.RevString();
	//s.VowelsCount();
	s.Sorting();
	
}
}
