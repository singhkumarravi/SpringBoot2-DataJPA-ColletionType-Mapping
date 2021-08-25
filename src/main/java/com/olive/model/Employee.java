package com.olive.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@Table(name="emp_tab_Parent")
@AllArgsConstructor
@RequiredArgsConstructor
public class Employee {
@Id
@Column(name="eid")
private Integer empId;
@Column(name="ename")
private String empName;
@Column(name="esal")
private double empSal;
@ElementCollection()
@CollectionTable(name="proj_tab",joinColumns = @JoinColumn(name="EFK"))
@OrderColumn(name="pos")
private List<String> eproj;
@ElementCollection
@CollectionTable(name="module_tab",joinColumns = @JoinColumn(name="EFK"))
private Set<String> module;
@ElementCollection
@CollectionTable(name="client_tab",joinColumns = @JoinColumn(name="EFK"))
@MapKeyColumn(name="Pos")
private Map<String,String> client;
}
