/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import java.util.Random;

/**
 * Logica de los personajes
 *
 * @author Edgar andres Delgado Castellano
 * @author Diego Miguel Moreno Duran
 * @version 1.0
 * @since 28/11/17
 */


public class Personaje {
    
    /**
 *
 * @author SALAAL
 */

private Random rand = new Random(2);
private String nombre;
    //Estado actual del Personaje
    private int salud;
    //Estado actual del Personaje
    private int fisico;
    //Estado actual del Personaje
    private int special;
    //Estado actual del Personaje
    private int rapido;
    
    private int hp;

    
    //Estado actual del Personaje
    private int cSalud;
    //Estado actual del Personaje
    private int cFisico;
    //Estado actual del Personaje
    private int cSpecial;
    //Estado actual del Personaje
    private int cRapido;
    private int cHp;

    /**
     * Crea un nuevo Personaje
     * @param nombre del personaje
     * @param hp puntos de vida maximos del personaje
     * @param fisico puntos de ataque maximos del personaje
     * @param special puntos de specialensa maximos del personaje
     * @param rapido puntos de velocidad maximos del personaje
     * @param salud puntos de la salud inicial del personaje
     */
    public Personaje(String nombre, int salud, int fisico, int special, int rapido, int hp) {
        this.nombre = nombre;
        this.hp = hp;
        this.fisico = fisico;
        this.special = special;
        this.rapido = rapido;
	this.salud=salud;
        this.cFisico = fisico;
        this.cHp = hp;
        this.cSpecial = special;
        this.cRapido = rapido;
	this.cSalud =salud;
    }
    
    /**
     * @return el nombre del personaje
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre Establecemos el nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return vida del personaje
     */
    public int getHp() {
        return hp;
    }

    /**
     * @param hp fijamos la vida
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     * @return Ataque fisico
     */
    public int getFisico() {
        return fisico;
    }
    

    /**
     * 
     * @param fisico Fijamos el ataque fisico del personaje
     */
    public void setFisico(int fisico) {
        this.fisico = fisico;
    }

    /**
     * @return Ataque especial
     */
    public int getSpecial() {
        return special;
    }

    /**
     * @param special Establecemos el ataque especial
     */
    public void setSpecial(int special) {
        this.special = special;
    }

    /**
     * @return Rapidez del personaje
     */
    public int getRapido() {
        return rapido;
    }

    /**
     * @param rapido establecemos la rapidez del personaje
     */
    public void setRapido(int rapido) {
        this.rapido = rapido;
    }

    /**
     * @return Vida actual del personaje
     */
    public int getcHp() {
        return cHp;
    }

    /**
     * @param cHp establecemos la viad actual 
     */
    public void setcHp(int cHp) {
        this.cHp = cHp;
    }

    /**
     * @return Ataque fisico  actual
     */
    public int getcFisico() {
        return cFisico;
    }

    /**
     * @param cFisico se estabelce el ataque fisico actual
     */
    public void setcFisico(int cFisico) {
        this.cFisico = cFisico;
    }

    /**
     * @return Ataque especial actual
     */
    public int getcSpecial() {
        return cSpecial;
    }

    /**
     * @param cSpecial se establece el ataque especial actual
     */
    public void setcSpecial(int cSpecial) {
        this.cSpecial = cSpecial;
    }

    /**
     * @return Rapidez actual 
     */
    public int getcRapido() {
        return cRapido;
    }

    /**
     * @param cRapido Se establecen la rapidez actual del personaje
     */
    public void setcRapido(int cRapido) {
        this.cRapido = cRapido;
    }

    /**
     * @return Salud y/o daño inicial del personaje
     */
    public int getSalud() {
        return salud;
    }

    /**
     * @param salud the salud to set
     */
    public void setSalud(int salud) {
        this.salud = salud;
    }

    /**
     * @return the cSalud
     */
    public int getcSalud() {
        return cSalud;
    }

    /**
     * @param cSalud the cSalud to set
     */
    public void setcSalud(int cSalud) {
        this.cSalud = cSalud;
    }
    
    /**
     * Determianos el ataque fisico
     * @return Indice de ataque propiciado por el personaje
     */
    //ataques de los jugadores//
    //metodo para  ejecutar el ataque fisico//
    public int ataque_fisico() {
        int aleatorio = rand.nextInt(2);

        return rapido * fisico * aleatorio;
    }

    
    /**
     * Determinamos el ataque especial de los personajes
     * @return Indice de ataque especial propiciado por el persionaje
     */
    //Metodo para ejecutar el ataque especial//
    public int ataque_especial() {
        if (hp > 0) {
            hp--;
            return rapido * special;
        } else {
            return 0;
        }
    }
    
    /**
     * Se obtiene el daño
     * @param salud Daño recibido al / los afectados
     */

    //daño obtenido//
    public void daño(int salud) {
        this.salud -= salud;

    }
}
