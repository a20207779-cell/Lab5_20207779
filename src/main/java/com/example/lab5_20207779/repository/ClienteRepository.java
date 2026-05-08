package com.example.Lab5_20207779.repository;


import com.example.Lab5_20207779.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    @Query(value = "select r.regionDescription as regiondescription, count(e.employeeid) as cantidadempleados " +
            "FROM region r\n" +
            "inner join territories t on (r.regionid = t.regionid)\n" +
            "inner join employeeterritories et on (t.territoryid = et.territoryid)\n" +
            "inner join employees e on (e.employeeid = et.employeeid)\n" +
            "group by r.regionid\n", nativeQuery = true)

