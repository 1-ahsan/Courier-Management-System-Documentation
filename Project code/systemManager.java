

public class SystemManager extends User {
    private String role;
    private String permission;

    public SystemManager(int id, String name, String email, String userName, String password, String role, String permission) {
        super(id, name, email, userName, password);
        this.role = role;
        this.permission = permission;
    }

    public String getRole() { 
        
     }
    public void setRole(String role) { 
        
    }

    public String getPermission() { 
        
     }
    public void setPermission(String permission) { 
        
    }
}