package com.nendejan.swag.controllers;

import com.nendejan.swag.models.EmployeeCategory;
import com.nendejan.swag.models.data.EmployeeCategoryDao;
import com.nendejan.swag.models.data.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by nico on 7/1/2017.
 */
@Controller
@RequestMapping("employeeCategory")
public class EmployeeCategoryController {

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private EmployeeCategoryDao employeeCategoryDao;


    @RequestMapping(value="")
    public String index(Model model){
        model.addAttribute("categories", employeeCategoryDao.findAll());
        model.addAttribute("title", "Employee Categories");

        return "employeeCategory/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddCategoryForm(Model model) {

        model.addAttribute("title", " Add Category");
        model.addAttribute(new EmployeeCategory());
        return "employeeCategory/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddCategoryForm(Model model, @ModelAttribute @Valid EmployeeCategory employeeCategory, Errors errors){

        if (errors.hasErrors()) {
            model.addAttribute("title", "Add Category");
            return "employeeCategory/add";
        }

        employeeCategoryDao.save(employeeCategory);
        return "redirect:";
    }

}
