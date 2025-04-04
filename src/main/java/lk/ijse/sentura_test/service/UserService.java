package lk.ijse.sentura_test.service;

import lk.ijse.sentura_test.config.WeavyConfig;
import lk.ijse.sentura_test.util.HttpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.IOException;

@Service
public class UserService {

    @Autowired
    private HttpUtil httpUtil;

    @Autowired
    private WeavyConfig weavyConfig;

    public String createUser(String userJson) throws IOException {
        return httpUtil.post(weavyConfig.getWeavyApiUrl(), userJson, weavyConfig.getWeavyApiToken());
    }

    public String listUsers() throws IOException {
        return httpUtil.get(weavyConfig.getWeavyApiUrl(), weavyConfig.getWeavyApiToken());
    }

    public String getUser(String userId) throws IOException {
        return httpUtil.get(weavyConfig.getWeavyApiUrl() + "/" + userId, weavyConfig.getWeavyApiToken());
    }

    public String updateUser(String userId, String userJson) throws IOException {
        return httpUtil.put(weavyConfig.getWeavyApiUrl() + "/" + userId, userJson, weavyConfig.getWeavyApiToken());
    }

    public String deleteUser(String userId) throws IOException {
        return httpUtil.delete(weavyConfig.getWeavyApiUrl() + "/" + userId, weavyConfig.getWeavyApiToken());
    }
}
