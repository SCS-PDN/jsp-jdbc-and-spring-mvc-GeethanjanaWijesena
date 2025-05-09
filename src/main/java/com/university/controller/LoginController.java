@Controller
public class LoginController {

    @Autowired
    LoginDAO loginDAO;

    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String login(@RequestParam String email, @RequestParam String password, HttpSession session, Model model) {
        if (loginDAO.validate(email, password)) {
            session.setAttribute("user", email);
            return "redirect:/courses";
        } else {
            model.addAttribute("error", "Invalid credentials");
            return "login";
        }
    }

    @RequestMapping("/login")
    public String showLoginPage() {
        return "login";
    }
}
