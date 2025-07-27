
package com.abhas;

import java.util.Map;
import java.util.HashMap;


@ApplicationScoped
public class FakeStorageServer{

Map<String, byte[]> storage =  new HashMap<>();

public void put(String path,byte[] content){
      storage.put(path,content);
}

    public byte[] get(String path){
     return storage.get(path);
    }


    public void delete(String path){
     storage.remove(path);
    }
}