package com.spring.jdbc.assignment.SpringBootJdbcAssignment;

import com.spring.jdbc.assignment.SpringBootJdbcAssignment.Entity.Learner;
import com.spring.jdbc.assignment.SpringBootJdbcAssignment.Repository.LearnerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJdbcAssignmentApplication implements CommandLineRunner {

	@Autowired
	LearnerDao dao;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Showing all Learner");
		System.out.println(dao.getAllLearner());

		System.out.println("Showing Learner by Id");
		System.out.println(dao.getLearnerById(1804));

		System.out.println("Inserting a New Learner");
		System.out.println(dao.insertLearner(new Learner(1809, "Shubham", "Dubey", "shubham@gmail.com", "Password6", 1200)));

		System.out.println("Showing all Learner");
		System.out.println(dao.getAllLearner());

		System.out.println("Updating a Row");
		System.out.println(dao.updateLearner(new Learner(1805, "Gourav", "Jha", "gourav@gmail.com", "Password4", 1200)));

		System.out.println("Showing all Learner");
		System.out.println(dao.getAllLearner());

		System.out.println("Deleting a Row");
		System.out.println(dao.deleteLearner(1808));

		System.out.println("Showing all Learner");
		System.out.println(dao.getAllLearner());
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcAssignmentApplication.class, args);
	}

}
