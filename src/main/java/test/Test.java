import dataBase.Workers;
import mapper.WorkersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Test {
    @Autowired
    private static WorkersMapper workersMapper;
    public static void main(String[] args) {

        List<Workers> workers=workersMapper.selectList(null);
        for(int i=0;i<workers.size();i++){
            System.out.println(workers.get(i).getWorker_name());
        }
    }

}
