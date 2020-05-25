/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.swr.entities;

/**
 *
 * @author moham
 */
public class User {

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.idu;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (this.idu != other.idu) {
            return false;
        }
        return true;
    }
    private int idu;
    private String nom;
    private String prenom;
    private String username;
    private String roles;
    private String dateins;
    private String country;
    private String mail;
    private String pwd;
    private String tel;
    private int randoom;
    private String image;

    public void setImage(String image) {
        this.image = image;
    }

    public User(int idu, String nom, String prenom, String country, String mail, String pwd, String tel,String username,String roles,String dateins) {
        this.idu = idu;
        this.nom = nom;
        this.prenom = prenom;
        this.country = country;
        this.mail = mail;
        this.pwd = pwd;
        this.tel = tel;
        this.username = username;
        this.roles = roles;
        this.dateins = dateins;
    }
    public User(String nom, String prenom, String country, String mail, String pwd, String tel,String username,String roles,String dateins,String image) {
        this.idu = idu;
        this.nom = nom;
        this.prenom = prenom;
        this.country = country;
        this.mail = mail;
        this.pwd = pwd;
        this.tel = tel;
        this.username = username;
        this.roles = roles;
        this.dateins = dateins;
    this.image = image;
    }
    public User(String nom, String prenom, String country, String mail, String pwd, String tel,String username,String roles,String dateins,int randoom,String image) {
        this.idu = idu;
        this.nom = nom;
        this.prenom = prenom;
        this.country = country;
        this.mail = mail;
        this.pwd = pwd;
        this.tel = tel;
        this.username = username;
        this.roles = roles;
        this.dateins = dateins;
        this.randoom = randoom;
        this.image = image;
    }
    public User(String nom, String prenom, String country, String mail, String pwd, String tel,String username,String roles,String image) {
        this.idu = idu;
        this.nom = nom;
        this.prenom = prenom;
        this.country = country;
        this.mail = mail;
        this.pwd = pwd;
        this.tel = tel;
        this.username = username;
        this.roles = roles;
        this.image = image;
        
        
        
    }
    public User(String nom, String prenom, String country, String mail, String pwd, String tel,String username) {
        this.idu = idu;
        this.nom = nom;
        this.prenom = prenom;
        this.country = country;
        this.mail = mail;
        this.pwd = pwd;
        this.tel = tel;
        this.username = username;
        
        
    }
    public User(String nom, String prenom, String country,String pwd, String tel, String image) {
        this.idu = idu;
        this.nom = nom;
        this.prenom = prenom;
        this.country = country;
        this.pwd = pwd;
        this.tel = tel;
        this.image = image;
        
        
        
    }
        public User(int idu, String nom, String prenom) {
        this.idu = idu;
        this.nom = nom;
        this.prenom = prenom;
    }

    public User() {
        
    }
    

    public int getIdu() {
        return idu;
    }

    public void setId(int idu) {
        this.idu = idu;
    }

    public String getNom() {
        return nom;
    }
    public String getImage() {
        return image;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getRoles() {
        return roles;
    }
    
    public String getDateins() {
        return dateins;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCountry() {
        return country;
    }
    public String getMail() {
        return mail;
    }
    public String getPwd() {
        return pwd;
    }
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "User{" + "idu=" + idu + ", nom=" + nom + ", prenom=" + prenom + ", username=" + username + ", roles=" + roles + ", dateins=" + dateins + ", country=" + country + ", mail=" + mail + ", pwd=" + pwd + ", tel=" + tel + ", randoom=" + randoom + ", image=" + image + '}';
    }

   
    
}