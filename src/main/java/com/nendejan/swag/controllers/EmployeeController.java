package com.nendejan.swag.controllers;

import com.nendejan.swag.models.Employee;
import com.nendejan.swag.models.data.DayDao;
import com.nendejan.swag.models.data.EmployeeDao;
import com.nendejan.swag.models.data.ScheduleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by nico on 6/30/2017.
 */

@Controller
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private ScheduleDao scheduleDao;

    @Autowired
    private DayDao dayDao;

    @RequestMapping(value="")
    public String index(Model model) {

        model.addAttribute("employees", employeeDao.findAll());
        model.addAttribute("title", "Employee List");

        return "employee/index";
    }

    @RequestMapping(value="add", method= RequestMethod.GET)
    public String displayAddEmployeeForm(Model model){

        model.addAttribute("title", "Add Employee");
        model.addAttribute(new Employee());

        //TODO Stopped here.
        return "employee/add";
    }






}
