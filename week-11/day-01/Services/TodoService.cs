using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using TodoWebApp.Repository;
using TodoWebApp.Models;

namespace TodoWebApp.Services
{
    public class TodoService : ITodoService
    {
        private ITodoRepository<Todo> todoRepository;

        public TodoService(ITodoRepository<Todo> todoRepository)
        {
            this.todoRepository = todoRepository;
        }

        public Boolean deleteById(int id)
        {
            var todo = todoRepository.FindById(id);

            if (todo != null)
            {
                todoRepository.Delete(todo);
                return true;
            }
            return false;
        }

        public List<Todo> findAll()
        {
           return todoRepository.Todos.ToList();
        }

        public Todo findById(int id)
        {
            return todoRepository.FindById(id);
        }

        public void Save(Todo todo)
        {
            todoRepository.Add(todo);
        }

        public void Update(Todo todo)
        {
            Todo oldTodo = todoRepository.FindById((int) todo.TodoId);
            oldTodo.Name = todo.Name;
            oldTodo.Task = todo.Task;
            todoRepository.Update(oldTodo);
        }
    }
}
