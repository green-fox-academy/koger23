using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using TodoWebApp.Models;

namespace TodoWebApp.Repository
{
    public class TodoRepository : ITodoRepository<Todo>
    {
        private readonly ApplicationContext _context;

        public TodoRepository(ApplicationContext context)
        {
            _context = context;
        }

        public IEnumerable<Todo> Todos => _context.Todos.ToList();

        public void Add(Todo entity)
        {
            _context.Add(entity);
            _context.SaveChanges();
        }

        public void Delete(Todo entity)
        {
            _context.Remove(entity);
            _context.SaveChanges();
        }

        public List<Todo> findAll()
        {
            return _context.Todos.ToList();
        }

        public Todo FindById(int Id)
        {
            return _context.Todos.SingleOrDefault(todo => todo.TodoId == Id);
        }

        public void Update(Todo entity)
        {
            _context.Update(entity);
            _context.SaveChanges();
        }
    }
}
