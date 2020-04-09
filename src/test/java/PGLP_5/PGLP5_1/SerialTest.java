package PGLP_5.PGLP5_1;

public class SerialTest {
	Personnels persoSave;
	Personnels persoGet;
	
	ObjectOutputStream oos;
    ObjectInputStream ois;
	
	@Before
	  public void setup() {
		
		persoSave= new Personnels
				.Builder("Derra", "Abdoul", 2).build();
		
		oos = null;
		
		
		
	}

	@Test
	public void test() {
		
		/******* sauvegarde de l'objet ******/

	    try {
	    	
	        FileOutputStream fichier = new FileOutputStream("personne.save");
	        oos = new ObjectOutputStream(fichier);
	        oos.writeObject(persoSave);
	        oos.flush();
	    } catch (java.io.IOException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	          if (oos != null) {
	            oos.flush();
	            oos.close();
	          }
	        } catch (IOException ex) {
	          ex.printStackTrace();
	        }
	      }
	    
	    /********* recuperationde de l'objet *******/
	    
		try {
	        FileInputStream fichier = new FileInputStream("personne.save");
	        ois = new ObjectInputStream(fichier);
	        persoGet = (Personnels) ois.readObject();
	        persoGet.print();
	      } catch (final java.io.IOException e) {
	        e.printStackTrace();
	      } catch (final ClassNotFoundException e) {
	        e.printStackTrace();
	      } finally {
	        try {
	          if (ois != null) {
	            ois.close();
	          }
	        } catch (final IOException ex) {
	          ex.printStackTrace();
	        }
	      }
		
	}

}

