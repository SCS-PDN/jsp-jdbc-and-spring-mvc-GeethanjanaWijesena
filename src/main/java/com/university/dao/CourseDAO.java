@Repository
public class CourseDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Course> getAllCourses() {
        String sql = "SELECT * FROM course";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Course.class));
    }

    public void registerStudent(String email, int courseId) {
        String sql = "INSERT INTO registration (student_id, course_id, date) VALUES ((SELECT id FROM student WHERE email = ?), ?, NOW())";
        jdbcTemplate.update(sql, email, courseId);
    }
}
