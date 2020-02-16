package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    private User user;

    @BeforeEach
    void before(){
        this.user = new User(5, "florencia", "salcedo");
    }

    @Test
    void testUser(){
        this.user = new User(6, "Lola", "Ponce");
        assertEquals(6, this.user.getNumber());
        assertEquals("Lola Ponce", this.user.fullName());
    }

    @Test
    void testFullName(){
        String nombre = this.user.fullName();
        assertEquals("Florencia Salcedo", nombre);
    }

    @Test
    void testGetNumber(){
        int var = this.user.getNumber();
        assertEquals(5, var);
    }

    @Test
    void testInitials(){
        String var = this.user.initials();
        assertEquals("F.", var);
    }

    @Test
    void testGetFamilyName(){
        assertEquals("Salcedo", this.user.getFamilyName());
    }

    @Test
    void stestGetName(){
        assertEquals("Florencia", this.user.getName());
    }
}
