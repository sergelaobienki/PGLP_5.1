package PGLP_5.PGLP5_1;

import java.io.Serializable;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class AfficheGroupe implements Serializable{
	/**
	 * la version d’un classe pour la sérialisation 
	 */
//	private static final long serialVersionUID = 1L;
	public ArrayList<InterfacePersonnels> grp=new ArrayList<InterfacePersonnels>();
	
	public AfficheGroupe (InterfacePersonnels root) {
		this.grp.add(root);
	}
	
	/**
	 * 
	 * @author root
	 *
	 */
	private class groupIterator implements Iterator{
		int index=0;
		
		
		public groupIterator() {
			int verifier=0;
			while(verifier<grp.size()) {
				if(grp.get(verifier) instanceof CompositePersonnels) {
					CompositePersonnels test=(CompositePersonnels)grp.get(verifier);
					int i=0;
					
					while(i<test.grpPerso.size()) {
						grp.add(test.grpPerso.get(i));
						
						i++;
					}
					
				
				}
				verifier++;
			}
		}
		
		/**
		 * verifirie s'il y'a des elements dans l'arr
		 */
		public boolean HasNext() {
			if(index<grp.size())
				return true;
			// TODO Auto-generated method stub
			return false;
		}

		public InterfacePersonnels Next() {
			if(this.HasNext()) {
				index++;
				return grp.get(index-1);
			}
				
			return null;
		}
		
		
		
	}
	
	public groupIterator getIterator() {
		return new groupIterator();
		
	}


}