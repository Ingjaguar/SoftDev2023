package com.example.proyecto.proyecto;

import com.example.proyecto.proyecto.controller.Employee;
import com.example.proyecto.proyecto.controller.Enterprise;
import com.example.proyecto.proyecto.controller.Movements;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoApplication.class, args);

		Enterprise empresa = new Enterprise();
		Employee empleado = new Employee();
		Movements movimiento = new Movements();

		empresa.setName("CocaCola");
		empresa.setNit("123456");
		empresa.setAddress("Calle 1#1-1");
		empresa.setPhone("654321");

		empleado.setName("Julian");
		empleado.setEmail("julian@mail.com");
		empleado.setRol("Administrador");
		empleado.setEnterprise("CocaCola");
		empleado.setProfile("JAG");

		movimiento.setConcept("Ingreso");
		movimiento.setAmount(100.0f);
		movimiento.setEmployee("Julian");
		movimiento.setEnterprise("CocaCola");

		System.out.println("Empresa:\n " + empresa);
		System.out.println("Empleado:\n " + empleado);
		System.out.println("Movimiento:\n " + movimiento);

	}

}
