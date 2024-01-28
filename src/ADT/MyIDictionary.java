package ADT;

import Controller.KeyNotFoundInDictionary;
import Controller.ToyLanguageException;

import java.util.Map;

public interface MyIDictionary<K,V> {
    void remove(K k) throws KeyNotFoundInDictionary;

    void put(K k, V v) throws ToyLanguageException;

    boolean isDefined(K k);
    void update(K key, V value) throws ToyLanguageException;


    V lookUp(K k) throws KeyNotFoundInDictionary;

    Map<K,V> getMap();
    MyIDictionary<K,V> deepCopy() throws ToyLanguageException;
}
