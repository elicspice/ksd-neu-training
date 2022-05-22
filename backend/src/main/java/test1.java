import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class test1 {
    public static void main(String[] args) {
        String pass="admin";
        BCryptPasswordEncoder en=new BCryptPasswordEncoder();
        final String pas= en.encode(pass);
        System.out.println(pas);
        final  String passHash="$2a$04$VVq0qDUIYovu7.xbPo9P0ODeFTGzkVEm4VMLNEBsLYBcjUsWj0tBO";
        final  String paaa="$2a$10$NaPfhtpgQhCNTMm/Bxzzh.yNloqUS7Mx.l2gkSG18Djo4tbg3TRUG";

        final boolean matches = en.matches(pass, paaa);
        System.out.println(matches);
    }
}
