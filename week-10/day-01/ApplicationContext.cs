using Microsoft.EntityFrameworkCore;
using TodoWebApp.Models;

namespace TodoWebApp
{
    public class ApplicationContext : DbContext
    {
        public DbSet<Todo> Todos { get; set; }

        public ApplicationContext(DbContextOptions options) : base(options)
        {
        }
    }
}
