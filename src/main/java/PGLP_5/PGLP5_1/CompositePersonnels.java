package PGLP_5.PGLP5_1;

public class CompositePersonnels implements InterfacePersonnels, Serializable{
	
	/**
	 * a version d’un classe pour la sérialisation
	 */
	//private static final long serialVersionUID = 1L;
	private int IDgrp;
	public ArrayList<InterfacePersonnels> grpPerso=new ArrayList<InterfacePersonnels>();
	
	public ArrayList<InterfacePersonnels> gettab(){
		return (ArrayList<InterfacePersonnels>) Collections.unmodifiableList(this.grpPerso);
		
	}
	
	public CompositePersonnels(int IDgrp) {
		this.IDgrp=IDgrp;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("le Id du groupe est : "+this.IDgrp);
		for(InterfacePersonnels perso : grpPerso) {
			perso.print();
		}
	}
	
	public void add(InterfacePersonnels perso) {
		this.grpPerso.add(perso);
	}
	
	public void remove(Personnels perso) {
		this.grpPerso.remove(perso);
	}
	
	public String toString(){
		  String str = "\t je suis un composite ID ==>> " + this.IDgrp;
		  return str;
	}

}