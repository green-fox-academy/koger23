using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using TodoWebApp.Models;

namespace TodoWebApp.Repository
{
    public interface ITodoRepository<T> where T : Todo
    {
        IEnumerable<T> Todos { get; }
        void Add(T entity);
        void Delete(T entity);
        void Update(T entity);
        T FindById(int Id);
        List<Todo> findAll();
    }
}
