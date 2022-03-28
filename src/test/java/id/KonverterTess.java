package id; 
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import tugas.Konversi;
import tugas.Masukan;


class KonverterTest {

    public Konversi converter;
    public input cek;
    public int masukan;
    
    @BeforeEach
    public void setUp(){
        converter = new Konversi();
        cek = new input();
    }

    @Test
    @DisplayName("Konversi kilogram ke Ton berhasil")
    void testkgToTonSuccess() {
        assertEquals("true", cek.input(masukan));
        assertEquals((masukan * 1000), converter.kgToTon(masukan));
    }

    @Test
    @DisplayName("Konversi kilogram ke Kwintal berhasil")
    void testkgToKwintalSuccess() {
        assertEquals("true", cek.input(masukan));
        assertEquals((masukan * 100), converter.kgToKwintal(masukan));
    }
    @Test
    @DisplayName("Konversi kilogram ke Gram berhasil")
    void testkgToGramSuccess() {
        assertEquals("true", cek.input(masukan));
        assertEquals((masukan / 1000), converter.kgToGram(masukan));
    }
    
    @Test
    @DisplayName("Masukan tidak valid")
    void testMasukanTidakValid() {
    	input cek = mock(input.class);
        when(cek.input(masukan)).thenReturn("false");
        
        assertEquals("false", cek.input(masukan));
    }
    
    @Test
    @DisplayName("Masukan valid")
    void testMasukanValid() {
    	input cek = mock(input.class);
        when(cek.input(masukan)).thenReturn("true");
        
        assertEquals("true", cek.input(masukan));
    }

    @Test
    @DisplayName("Konversi kilogram ke Ton gagal")
    void testkgToTonFail() {
        assertEquals("false", cek.input(masukan=-1));
        assertEquals(0, converter.kgToTon(masukan));
    }
    
    @Test
    @DisplayName("Konversi kilogram ke Kwintal gagal")
    void testkgToKwintalFail() {
        assertEquals("false", cek.input(masukan=-1));
        assertEquals(0, converter.kgToKwintal(masukan));
    }
    
    @Test
    @DisplayName("Konversi kilogram ke Gram gagal")
    void testkgToGramFail() {
        assertEquals("false", cek.input(masukan=-1));
        assertEquals(0, converter.kgToGram(masukan));
    }
}
