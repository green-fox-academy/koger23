using System;
using System.ComponentModel.DataAnnotations;

namespace TodoWebApp.Models
{
    public class Todo
    {
        [Key]
        public long TodoId { get; set; }
        public String Name { get; set; }
        public String Task { get; set; }

        public Todo()
        {
        }
    }
}
