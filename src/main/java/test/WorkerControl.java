package test;

import com.google.gson.Gson;
import dataBase.Workers;
import mapper.WorkersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Worker {
    @Autowired
    private WorkersMapper workerMapper;

    @GetMapping("/workers")
    public String getUsers() {
        Gson gson=new Gson();
        List<Workers> users=workerMapper.selectList(null);
        String json=gson.toJson(users);
        return json;
    }
}
