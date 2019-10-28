package 使用Spring缓存机制整合Redis;

public interface RoleService {
    public Role getRole(Long id);
    public Role insertRole(Role role);
    public Role  updateRole(Role role);

}
