package toDoList.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import toDoList.dao.TaskDao;
import toDoList.entity.Task;

import java.util.List;

@Service
@Transactional
public class TaskService {

    private final TaskDao taskDao;

    @Autowired
    public TaskService(TaskDao taskDao) {
        this.taskDao = taskDao;
    }

    public List<Task> getAllTasks() {
        return taskDao.findAll();
    }

    public List<Task> getTasks(int page, int size) {
        return taskDao.findAll(page, size);
    }

    public Task getTaskById(int id) {
        return taskDao.findById(id);
    }

    public void saveTask(Task task) {
        taskDao.save(task);
    }

    public void updateTask(Task task) {
        taskDao.save(task);
    }

    public void deleteTask(int id) {
        taskDao.delete(id);
    }

    public long getTotalTasks() {
        return taskDao.count();
    }
}
