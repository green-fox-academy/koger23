using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using TodoWebApp.Models;

namespace TodoWebApp.Services
{
    public interface ITodoService
    {
        List<Todo> findAll();

        void Save(Todo todo);

        Todo findById(int id);

        Boolean deleteById(int id);

        void Update(Todo todo);

    }
}
