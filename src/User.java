/*
Create User class which implements UserInterface with parameters:
- String id;
- String name;
- String surname;
- String login;
- String password;
Create default and parameter constructors
Create getters and setters
Boolean checkLoginPassword(String login, String password);
 */

public class User implements UserInterface{
    private String id;
    private String name;
    private String surname;
    private String login;
    private String password;

    public User (){}
    public User(String id, String name, String surname, String login, String password){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.password = password;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public String getLogin(){
        return login;
    }

    public String getPassword(){
        return password;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public void setPassword(String password){
        this.password = password;
    }

    @Override
    public String getUserData(){
        return id+" "+name+" "+surname+" "+login+" "+password;
    }

    public boolean checkLoginPassword(String login, String password) {
        if(login == this.login && password == this.password) {
            return true;
        }
        return false;
    }
}

