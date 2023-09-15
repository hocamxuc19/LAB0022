/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author PC
 */
public class Fresher extends Candidate{
    private String graduationDate;
    private String graduationRank;

    public Fresher() {
        super();
    }

    public Fresher(String id, String firstName, String lastName, int birthday, String address, String phone, String mail, int type,String graduationDate, String graduationRank) {
        super(id, firstName, lastName, birthday, address, phone, mail, type);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }
}
