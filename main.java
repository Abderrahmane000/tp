package tp2;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Size For ALL Your Tables : ");
		int n = input.nextInt();
		TableauIter t1 = new TableauIter(n) ;
		TableauIter t2 = new TableauIter(n) ;
		TableauIter t3 = new TableauIter(n) ;
		int test [] = new int[n];
		System.out.println("*****triBulle*****");
		for(int j=0;j<n;j++) {
			System.out.println("Enter The Table Element n:"+j+" ");
			test[j] = input.nextInt();
		}
		t1.setTab(test);
		t1.setTabTrie(t1.triBulle(t1.getTab()));
		t1.afficherTrie();
		System.out.println("*****triInsertion*****");
		for(int j=0;j<n;j++) {
			System.out.println("Enter The Table Element n:"+j+" ");
			test[j] = input.nextInt();
		}
		t2.setTab(test);
		t2.setTabTrie(t2.triInsertion(t2.getTab()));
		t2.afficherTrie();
		System.out.println("**********triSelection*********");
		for(int j=0;j<n;j++) {
			System.out.println("Enter The Table Element n:"+j+" ");
			test[j] = input.nextInt();
		}
		t3.setTab(test);
		t3.setTabTrie(t3.triInsertion(t3.getTab()));
		t3.afficherTrie();
		System.out.println("*****triBulleRecursive*****");
		TableauRec r1 = new TableauRec(n);
		r1.setTabTrie(r1.triBulle(r1.getTab()));
		r1.afficherTrie();
		System.out.println("*****triInsertionRecursive*****");
		r1.setTabTrie(r1.triInsertion(r1.getTab()));
		r1.afficherTrie();
		System.out.println("*****triSelectionRecursive*****");
		r1.setTabTrie(r1.triSelection(r1.getTab()));
		r1.afficherTrie();
		input.close();
	}

}
