package za.co.shinysneakers.service;

public interface IService<T,ID> {
    T create(T t);
    T read(Integer id);
    T update(T t);
    boolean delete(Integer id);
}
