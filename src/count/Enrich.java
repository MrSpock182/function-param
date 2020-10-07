package count;

@FunctionalInterface
public interface Enrich<T> {
    T action(T t1, T t2);
}
