import java.util.*;

public class VotingMachine {
	static Scanner input = new Scanner(System.in);
	static ArrayList<String> names = new ArrayList<String>();
	static ArrayList<Integer> voteCount = new ArrayList<Integer>();

	public static void main(String[] args) {
		int choice = 0;
		do {
			System.out.println("\n1. Add Candidate");
			System.out.println("2. Cast Vote");
			System.out.println("3. View results");
			System.out.println("4. Exit");
			System.out.print("\nEnter your choice: ");
			choice = input.nextInt();
			input.nextLine();
			
			switch (choice) {
			case 1:
				System.out.println("Candidate name:");
				String name = input.nextLine();
				voteCount.add(0);
				addCandidate(name);
				break;
			case 2:
				System.out.println("List of candidates:");
				for (int i = 0; i < names.size(); i++) {
					System.out.println((i+1)+". "+names.get(i));
				}
				System.out.println("\nEnter candidate name to cast vote:");
				String cast = input.nextLine();
				castVote(cast);
				break;
			case 3:
				printResults();
				break;
			case 4:
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
		} while (choice != 4);
	}

	public static void addCandidate(String name) {
		names.add(name);
	}

	public static void castVote(String name) {
		boolean flag = false;
		int index  = 0;
		for (int i = 0; i < names.size(); i++) {
			if(names.get(i).equals(name)) {
				flag = true;
				index = i;
				break;
			}	
		}
		
		if (flag) {
			int vote = voteCount.get(index);
			voteCount.add(index, vote+1);
		} else {
			System.out.println("Enter valid candidate name.");
		}
	}

	public static void printResults() {
		System.out.println("\nResult: ");
		for (int i = 0; i < names.size(); i++) {
			System.out.println((i+1)+". "+names.get(i)+" ; Vote: "+voteCount.get(i));
		}
	}
}