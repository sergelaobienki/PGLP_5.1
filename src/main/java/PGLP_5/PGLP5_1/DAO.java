package PGLP_5.PGLP5_1;

public abstract class DAO<T> implements Serializable{
	
	public abstract T create(T obj);
	public abstract T find(String id);
	public abstract T update( T obj);
	public abstract void delete (T obj);

}