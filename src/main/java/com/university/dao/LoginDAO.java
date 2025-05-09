@Repository
public class LoginDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public boolean validate(String email, String password) {
        String sql = "SELECT COUNT(*) FROM student WHERE email=? AND password=?";
        int count = jdbcTemplate.queryForObject(sql, Integer.class, email, password);
        return count == 1;
    }
}
