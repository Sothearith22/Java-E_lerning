package oop_lerning;

public class User {
    private int id;
    private String username;
    private String email;
    private String password;

    public void setId(int id) {
        this.id = id;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public void setEmail(String email){
        this.email =email;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public int getId(){
        return id;
    }
    public String getUsername(){
        return username;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public static void main(String[] args) {
        //create new object
        User objUser = new User();
        objUser.setId(1);
        objUser.setUsername("admin");
        objUser.setEmail("admin@gmail.com");
        objUser.setPassword("admin12");
        //method get from user
        System.out.println("ID : " + objUser.getId());
        System.out.println("UserName : " + objUser.getUsername());
        System.out.println("Email : " + objUser.getEmail());
        System.out.println("Password : " + objUser.getPassword());
    }
}
