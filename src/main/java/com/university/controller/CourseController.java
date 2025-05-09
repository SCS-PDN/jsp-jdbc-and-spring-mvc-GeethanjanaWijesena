@Controller
public class CourseController {

    @Autowired
    CourseDAO courseDAO;

    @RequestMapping("/courses")
    public String listCourses(Model model) {
        model.addAttribute("courses", courseDAO.getAllCourses());
        return "courses";
    }

    @PostMapping("/register")
    public String registerCourse(@RequestParam int courseId, HttpSession session) {
        String email = (String) session.getAttribute("user");
        courseDAO.registerStudent(email, courseId);
        return "redirect:/courses";
    }
}
