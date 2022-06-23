public class nestedswitchcase {
public static void main (String args[]) {
	
	char branch = 'c';
	int year = 3;
	
	switch (year)
	{
	case 1 :
		System.out.println("maths, english,physics");
		break;
	case 2:
		switch(branch)
		{
		case 'c':
			System.out.println("c programing");
			break;
		case 'm':
			System.out.println("mechanics");
			break;
		case 'e':
			System.out.println("degital electronics");
			break;
			
		}
		break;
	case 3:
		switch(branch)
		{
		case 'c':
			System.out.println("c programing");
			break;
		case 'm':
			System.out.println("physics");
			break;
		case 'e':
			System.out.println("architecture technology");
			break;
			default:
				System.out.println("invali");
		}
		break;
		case 4:
			switch(branch)
			{
			case 'c':
				System.out.println("python");
				break;
			case 'm':
				System.out.println("chemistry");
				break;
			case 'e':
				System.out.println("architecture");
				break;
			
				default:
					System.out.println("invalid");
			}
			break;
			}
			
		}
	

}
