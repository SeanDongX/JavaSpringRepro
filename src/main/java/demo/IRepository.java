package demo;

import java.util.List;

public interface IRepository<T> {
	void create(T t);
	T get(int id);
	List<T> get();
	void update(T t);
	void Delete(T t);
}
