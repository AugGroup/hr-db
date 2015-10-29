/**
 *
 * @author natechanok
 * @date Apr 27, 2015
 */

package com.aug.hrdb.services;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import org.hibernate.JDBCException;
import org.springframework.dao.DataIntegrityViolationException;

import com.aug.hrdb.dto.DivisionDto;
import com.aug.hrdb.dto.EmployeeDto;
import com.aug.hrdb.dto.JoblevelDto;
import com.aug.hrdb.entities.Employee;



public interface EmployeeService {
	
	public void create(Employee employee);
	public void update(Employee employee);
	public void delete(Employee employee);
	public Employee findById(Integer Id);
	public List<Employee> findAll();
	public void deleteById(Integer id);
	public List<Employee> findByCriteria(Employee employee);
	public Employee searhEmpIdtoAddress(); 	//find last id of employee
	public EmployeeDto findEmployeeByEmployeeIdWithSetToDto(Integer id); 
	//public Employee createEmployeeAndReturnId(EmployeeDto allEmployeeDto,String employeeCode) throws JDBCException;
	public Employee updateEmployeeAndReturnId(EmployeeDto allEmployeeDto,String employeeCode,String img) throws DataIntegrityViolationException;
	public void deleteEmployeeByHibernate(Employee employee);
	public Employee findAndinitializeOfficial(Integer id);
	public List<Employee> findAimRelateWithEmployee(Integer id);
	public Employee findOfficial(Integer id);
	//public Employee findEmployeeCode(Integer locationId);
	public String generateEmployeeCode(EmployeeDto employeeDto);
	
	public String generateEmployeeCodeFixData(String location);
	
	public List<DivisionDto> checkTag(String tag);
	public List<JoblevelDto> checkTagDivision(String tag);
	
}
