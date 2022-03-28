package id;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class input {

    private input cek;
    
    @BeforeEach
    public void setUp(){
        cek = new input();
    }

    @Test
    @DisplayName("Input >= 0")
    public void testInputlebih0() {
        assertEquals("true", cek.input(0));
    }
    
    @Test
    @DisplayName("Input < 0")
    public void testInputkurang0() {
        assertEquals("false", cek.input(-1));
    }

}
