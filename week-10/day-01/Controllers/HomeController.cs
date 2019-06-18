using Microsoft.AspNetCore.Mvc;
using TodoWebApp.Services;
using TodoWebApp.Repository;
using TodoWebApp.Models;
using static System.Net.WebRequestMethods;

namespace TodoWebApp.Controllers
{
    public class HomeController : Controller
    {
        private ITodoService todoService;

        public HomeController(ITodoService todoService)
        {
            this.todoService = todoService;
        }

        [HttpGet("/")]
        public IActionResult Index()
        {
            return View(todoService.findAll());
        }

        [HttpGet("/todo/add")]
        public IActionResult Add()
        {
            return View();
        }

        [HttpPost("/todo/add")]
        public IActionResult Create(Todo newTodo)
        {
            todoService.Save(newTodo);
            return Redirect("/");
        }

        [HttpGet("/todo/edit/{id}")]
        public IActionResult Edit(int id)
        {
            Todo todo = todoService.findById(id);
            ViewData["todo"] = todo;
            return View(todo);
        }

        [HttpPost("/todo/edit/{id}")]
        public IActionResult Update(int id, Todo todo)
        {
            todo.TodoId = id;
            todoService.Update(todo);
            return Redirect("/");
        }

        [HttpPost("/todo/delete/{id}")]
        public IActionResult Delete(int id)
        {
            if (todoService.deleteById(id))
            {
                return Redirect("/");
            }
            return BadRequest();
        }
    }
}
