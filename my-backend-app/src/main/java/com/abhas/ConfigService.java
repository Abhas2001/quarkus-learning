
package  com.abhas;

import java.nio.charset.StandardCharsets;

@ApplicationScoped
public class ConfigService{

    @Inject
    FakeStorageServer fakeStorage;

    public String getSystemConfigPath(String serviceKey, String moduleKey){
        return serviceKey+"/"+ moduleKey + "/config.yaml";
    }

    public String getClientConfigPath(String clientId, String key,String namespace){
        return clientId + "/config/" + namespace + "/" + key + "/config.yaml";
    }

    public void newConfig(String path, String content){

        byte[] bytear = content.getBytes(StandardCharsets.UTF_8);

        fakeStorage.put(path,bytear);
    }

    public String fetchConfig(String path){

        byte[] data = fakeStorage.get(path);
        if (data == null) {
            return null;
        }
        String newstr = new String(data,StandardCharsets.UTF_8);
        return newstr;
    }

    public void updateConfig(String path, String content) {
        fakeStorage.put(path, content.getBytes(StandardCharsets.UTF_8));
    }

    public void deleteConfig(String path){

        fakeStorage.delete(path);
    }
}