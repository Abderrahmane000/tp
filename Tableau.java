package tp2;

import java.util.Random;

public abstract class Tableau {
	public Tableau(int l) {
		this.tab= new int[l];
		Random r = new Random();
		for(int i=0;i<l;i++) {
			tab[i] = r.nextInt(200);
		}
	}
	protected int tab[];
	protected int tabTrie[];
	
	public int[] getTabTrie() {
		return tabTrie;
	}
	public void setTabTrie(int[] tabTrie) {
		this.tabTrie = tabTrie;
	}
	public int[] getTab() {
		return tab;
	}
	public void setTab(int[] tab) {
		this.tab = tab;
	}
	public void afficher() {
		for(int i=0;i<tab.length;i++) {
			System.out.println(tab[i]);
		}
	}
	public void afficherTrie() {
		for(int i=0;i<tabTrie.length;i++) {
			System.out.println(tabTrie[i]);
		}
	}
	public int[] copie(int t[]) {
		for(int i=0;i<tab.length;i++) {
			tabTrie[i] = tab[i];
		}
		return tabTrie;
	}
	public abstract int[] triBulle(int t[]);
	public abstract int[] triInsertion(int t1[]);
	public abstract int[] triSelection(int t2[]);

}
