/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Faculty_Search;

/**
 *
 * @author admin
 */
public interface IFaculty_Search {
    List<Faculty_Search> getFaculty_Search(String name);
}
