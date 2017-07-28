package dtos;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by pablo on 12/06/2016.
 */
public class UserDto {

    @NotBlank(message = "error.user.name.notBlank")
    @Length(max = 50, message = "error.user.name.length")
    private String name;

    @NotBlank(message = "error.user.email.notEmpty")
    @Length(max = 50, message = "error.user.email.length")
    @Email(message = "error.user.email.notEmail")
    private String email;

    @NotBlank(message = "error.user.password.notEmpty")
    @Length(max = 50, message = "error.user.password.length")
    private String password;

    //hola

    @NotBlank(message = "error.user.telephone.notBlank")
    @Length(max=20, message = "error.user.telephone.length" )
    private String telephone;

    public UserDto(String name, String mail, String pass, String telephone){
        this.name = name;
        this.email = mail;
        this.password = pass;
        this.telephone = telephone;
    }



    public UserDto(){}

    public String getName() {
        return name;
    }

    public String getTelephone() { return telephone;    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
